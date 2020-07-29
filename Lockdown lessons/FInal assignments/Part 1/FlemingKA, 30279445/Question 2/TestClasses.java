import java.util.Scanner;
import java.io.*;

public class TestClasses
{  
   private static Scanner input;
   public static void main(String[] args)
   {
      
         input = new Scanner(System.in);
         input.useDelimiter("[*\\n\\r]");
         Gamer[] gamerList = new Gamer[20];
         int numGamers = 0;
         int proFee = 500;
         int amFee = 250;
         char type;
         String id, name;
         int years, rank, cat;
         try
      {
         while (input.hasNext())
         {
            type = input.next().charAt(0);
            id = input.next();
            name = input.next();
            if (type == 'A')
            {
               cat = input.nextInt();
               gamerList[numGamers++] = new AmGamer(id,name,cat);
            }
            else if (type == 'P')
            {
               years = input.nextInt();
               rank = input.nextInt();
               gamerList[numGamers++] = new ProGamer(id,name,years,rank);
            }
            else
            {
               System.out.println("Invalid input");
            }
         }
      

        
      } 
      
		catch(StringIndexOutOfBoundsException err)
		{
			System.out.println(err);
      }
      catch(InvalidIdException e)
		{
			System.out.println("Invalid ID, cannot create this gamer: " + e);
      }
      
      System.out.printf("\n\n\nProfessional gamers\nCode       ID number  Name                  Years  Rank  Registration fee  Discount\n");
      for (int i =0; i < numGamers; i++)
         if (gamerList[i] instanceof ProGamer)
            System.out.println(gamerList[i]+"    R "+(proFee-gamerList[i].calculateDiscount(proFee))+"             R "+gamerList[i].calculateDiscount(proFee));
         
      System.out.printf("\nAmateur gamers\nCode       ID number  Name                  Category  Registration fee  Discount\n");
      for (int i =0; i < numGamers; i++)
         if (gamerList[i] instanceof AmGamer)
            System.out.println(gamerList[i]+"         R "+(amFee-gamerList[i].calculateDiscount(amFee))+"             R "+gamerList[i].calculateDiscount(amFee));

      
   }   
}
