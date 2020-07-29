//FlemingKA 30279445

import java.io.*;
import java.util.*;

public class productApplication
{
    
    private Product productList[];
    public static final int maxProducts = 25;
    private int numberOfProducts;

    static ObjectOutputStream output;

    public static void openOutput()
    {
        try
        {
            output = new ObjectOutputStream(new FileOutputStream("products.ser"));

        }

        catch(IOException e)
        {
            System.out.println("Cannot open output file.");
        }
    }

    public static void closeOutput()
    {
        try
        {
            output.close();

        }

        catch(IOException e)
        {
            System.out.println("Cannot close output file.");
        }
    }

    public void addProduct(Product newProduct)
    {
        productList[productList.length] = newProduct;
    }

    public Product getProduct(int index)
    {
        return productList[index];
    }

    public int getNumberOfProducts()
    {
        return productList.length;
    }

    public static void main(String[] args) 
    {
        Product productList[] = new Product[maxProducts];
        int count = 0;
        try 
        {
            Scanner input = new Scanner(new FileReader("productdata.txt"));
            String line, barcode, name, manufacturer;
            int unitPrice, weight;
            char productCode;

            while(input.hasNext())
            {
                line = input.nextLine();
                String[] fields = line.split("#");
                
                barcode = fields[0];
                productCode = barcode.charAt(0);
                name = fields[1];

                if(productCode == '1')
                {
                    manufacturer= fields[2];
                    unitPrice = Integer.parseInt(fields[3]);
                    productList[count] = new ItemBasedProduct(barcode, name, unitPrice, manufacturer);

                    count++;
                }

                else if (productCode == '2')
                {
                    unitPrice = Integer.parseInt(fields[2]);
                    weight = Integer.parseInt(fields[3]);
                    productList[count] = new WeightBasedProduct(barcode, name, unitPrice, weight);

                    count ++;
                }

                else
                    System.out.println("Invalid input: " + line);
            }

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Error: " + e);
        }



        Product[] tempList = Arrays.copyOf(productList, count);
        
        Arrays.sort(tempList);
        
        for(int i = 0; i<tempList.length; i++)
        {
            System.out.println(tempList[i].getRecord());
        }

        openOutput();

        try 
        {
            for(int i =0; i<count; i++)
            {
                output.writeObject(productList[i]);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e);
        }

        closeOutput();
    }
}