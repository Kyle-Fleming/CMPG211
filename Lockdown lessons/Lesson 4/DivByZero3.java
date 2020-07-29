 import java.util.Scanner;
 public class DivByZero3
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int dividend;
         int divisor;
         int quotient;
         try
         {
 //            System.out.print("Input a value for the dividend: ");
             dividend = input.nextInt();
 //            System.out.print("\nInput a value for the divisor: ");
             divisor = input.nextInt();
             quotient = dividend / divisor;
             System.out.println("The quotient = " + quotient);
         }
         catch(ArithmeticException ae)
         {
             System.out.println("You cannot divide by zero! This will lead to an exception being thrown and your program terminating!");
             System.out.println("The following exception was thrown:\n"+ae);
         }
         catch(Exception e)
         {
             System.out.println("For some reason the following exception was thrown:\n"+e);
         }
         finally
         {
             System.out.println("And we do our finally block when we are done with the rest");
         }
         System.out.println("The program terminated normally");
     }
 }
