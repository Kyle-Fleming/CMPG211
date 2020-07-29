import java.util.Scanner;

public class StuffApplication2 extends StuffContainer2
{
	//read and write serialised objects in this class
	
	//open and close files
	
	//main method to call the above mentioned methods
	public static void main(String[] args)
	{
		StuffContainer2 myStuff = new StuffContainer2(5);
		
		Scanner input = new Scanner(System.in);
		
		char type;
		String color;
		int radius, length, width;
		
		while(input.hasNext())
		{
			type = input.next().charAt(0);
			color = input.next();
			
			if(type == 'C')
			{
				radius = input.nextInt();
				myStuff.addThing(new RoundThing(color, radius));
			}
			if(type == 'S')
			{
				length = input.nextInt();
				myStuff.addThing(new SquareThing(color, length));
			}
			if(type == 'R')
			{
				length = input.nextInt();
				width = input.nextInt();
				myStuff.addThing(new rectangularThing(color, length, width));
			}
			
			else
			{
				System.out.println("Invalid input");
			}
		}
		
		System.out.println("\nBefore sorting");
		System.out.println();
		System.out.println("Capacity of container: " + myStuff.getCapacity());
		System.out.println("Number of Things in container: " + myStuff.getNumberOfThings());
		
		for(int i=0; i<myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
		
		myStuff.sort();
		System.out.println("\nAfter sorting");
		System.out.println("Capacity of container: " + myStuff.getCapacity());
		System.out.println("Number of Things in container: " + myStuff.getNumberOfThings());
		
		
		for(int i=0; i<myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
	}
}