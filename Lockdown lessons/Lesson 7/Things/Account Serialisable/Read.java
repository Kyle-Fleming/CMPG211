import java.io.*;


public class Read 
{

    static ObjectInputStream input;

    public static void open()
    {
        try {
            input = new ObjectInputStream(new FileInputStream("accountArrays.ser"));
        } catch (Exception e) {
            System.out.println("Cannot open file: " + e);
        }
    }

    public static void close()
    {
        try {
            input.close();

        } catch (Exception e) {
            System.out.println("Cannot close file: " + e);
        }
    }

    public static void main(String[] args) 
    {
        open();
        Account someAcc1;
    
        try 
        {
            while(true)
            {
                
                someAcc1 = (Account)input.readObject();

                
                if(someAcc1 instanceof Savings)
                {
                    System.out.println("#########   This is a savings account #########");
                    System.out.println(someAcc1);
                }
                if(someAcc1 instanceof Checkings)
                {
                    System.out.println("@@@@@@@@@   This is a cheque account @@@@@@@@@@");
                    System.out.println(someAcc1);
                }
            }
            
            
        } catch (EOFException e) {
            System.out.println("End of file read, task complete.");
        }
        catch(IOException e)
        {
            System.out.println("Error reading file: " + e);

        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Problem with classes..."  + e);
        }
        
        catch(Exception e)
        {
            System.out.println("###This indicates a BIG error###    " + e);
        }
        close();
    }
}