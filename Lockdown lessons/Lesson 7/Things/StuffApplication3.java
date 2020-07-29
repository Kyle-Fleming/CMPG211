import java.util.Scanner;

public class StuffApplication3
{
	public static void main(String [] args)
	{
		StuffContainer3 myStuff = new StuffContainer3(5);
		
		Scanner input = new Scanner(System.in);
		char type;
		String color;
		int radius, length, width;
		
		while(input.hasNext())
		{
			System.out.print("Thing type (C, S, R): ");
			type = input.next().charAt(0);
			System.out.print("Color of thing: ");
			color = input.next();
			if(type == 'C')
			{
				System.out.print("Radius: ");
				radius = input.nextInt();
				myStuff.addThing(new RoundThing(color, radius));
			}
			else if(type == 'S')
			{
				System.out.print("Length: ");
				length = input.nextInt();
				myStuff.addThing(new SquareThing(color, length));
			}
			else if(type == 'R')
			{
				System.out.print("Length: ");
				length = input.nextInt();
				System.out.print("Width: ");
				width = input.nextInt();
				myStuff.addThing(new rectangularThing(color, length, width));
			}
			
			else
			{
				System.out.println("Invalid input");
			}
		}
		
		for(int i = 0; i< myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
		myStuff.sort();
		System.out.println("\nAnd After sorting\n");
		
		for(int i = 0; i< myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
		
	}
}