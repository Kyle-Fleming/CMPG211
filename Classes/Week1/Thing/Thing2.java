import java.util.Scanner;

public class Thing2
{
	public static void main(String[] args)
	{
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int val = inputReader.nextInt();
		
		
		System.out.print("The value is: " + val + "\n");
		
		System.out.print("The square of the value is: " + Math.pow(val, 2) + "\n");
		
		System.out.print("The square root of the value is: " + Math.sqrt(val) + "\n");
		System.out.println("In other words the square root is: " + Math.pow(val, 0.5));
		
	}
}