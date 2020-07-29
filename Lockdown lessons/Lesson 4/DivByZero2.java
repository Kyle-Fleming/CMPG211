 import java.util.Scanner;
 public class DivByZero2
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int dividend;
         int divisor;
         int quotient;
 //        System.out.print("Input a value for the dividend: ");
         dividend = input.nextInt();
 //        System.out.print("\nInput a value for the divisor: ");
         divisor = input.nextInt();
         quotient = dividend / divisor;
         System.out.println("The quotient = " + quotient);
     }
 }
