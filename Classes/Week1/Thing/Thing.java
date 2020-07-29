import java.util.Scanner;

public class Thing
{
	public static void main(String args[])
	{
		System.out.print("Hello World\n\n\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String FirstName = input.nextInt();
		System.out.println("Welcome to cmpg211 " + FirstName);
		System.out.printf("I hope you will enjoy it, %s", FirstName);
	}
}