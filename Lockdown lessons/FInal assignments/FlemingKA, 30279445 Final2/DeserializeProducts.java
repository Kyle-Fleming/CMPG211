import java.io.*;

public class DeserializeProducts
{
	
	private static ObjectInputStream input;
	private static productContainer productList;
	
	public static void openInputFile()
	{
		try
		{
			input = new ObjectInputStream(new FileInputStream("products.ser"));
		}
		
		catch(IOException ioE)
		{
			System.out.println("Cannot open input file");
			System.exit(1);
		}
	}
	
	public static void closeInputFile()
	{
		try
		{
			input.close();
		}
		
		catch(IOException ioE)
		{
			System.out.println("Cannot close input file");
			System.exit(1);
		}
	}
	
	public static void readFromFile()
	{
		productList =  new productContainer();
		Product inputProduct;
		
		try
		{
			while(true)
			{
				inputProduct = (Product)input.readObject();
				productList.addThing(inputProduct);
			}
		}
		
		catch(EOFException eofE)
		{
			System.out.println("End of file reached");
		}
		catch(IOException ioE)
		{
			System.out.println("Error reading objects from file");
		}
		catch(ClassNotFoundException cnfE)
		{
			System.out.println("cnfE" + cnfE);
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointer" + e);
        }
		
	}
	
	public static void application()
	{
       

		System.out.println("Cost of each product");
		
		
		
        int totalPrice = 0;
        int price = 0, totalWeight = 0;
        String barcode, name;

		for(int i=0; i<productList.getNumberOfProducts(); i++)
		{
           

			if(productList.getThing(i) instanceof WeightBasedProduct)
			{
				price = ((WeightBasedProduct)productList.getThing(i)).calculateTotalCost(15);
				
				totalPrice += price;
                barcode = ((WeightBasedProduct)productList.getThing(i)).getBarcodeNumber();
                name = ((WeightBasedProduct)productList.getThing(i)).getName();
                
                System.out.println("Barcode: " + barcode + ": " + name + ": R" + (double)price/100);
                totalWeight += ((WeightBasedProduct)productList.getThing(i)).getWeight();
                
            }
            else if(productList.getThing(i) instanceof ItemBasedProduct)
			{
				price = ((ItemBasedProduct)productList.getThing(i)).calculateTotalCost(15);
				totalPrice += price;
                barcode = ((ItemBasedProduct)productList.getThing(i)).getBarcodeNumber();
                name = ((ItemBasedProduct)productList.getThing(i)).getName();
                
				System.out.println("Barcode: " + barcode + ": " + name + ": R" + (double)price/100);
            }
            
            else
                System.out.println("Invalid object");
        }
        
        System.out.println("Total cost of products: R" + (double)totalPrice/100 + "\n");
        System.out.println("Total weight of weight-based products: " + totalWeight + "grams");
        
	}
	
	public static void main(String[] args)
	{
		openInputFile();
		readFromFile();
		closeInputFile();
		application();
	}
}