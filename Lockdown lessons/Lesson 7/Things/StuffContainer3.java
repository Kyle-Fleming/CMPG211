import java.util.*;

public class StuffContainer3
{
	private ArrayList<Thing> container;
	
	public StuffContainer3()
	{
		this(3);
	}
	
	public StuffContainer3(int capacity)
	{
		container = new ArrayList<Thing>(capacity);
	}
	
	public int getNumberOfThings()
	{
		return container.size();
		
	}
	
	public void addThing(Thing newThing)
	{
		container.add(newThing);
	}
	
	public Thing getThing(int index)
	{
		return container.get(index);
	}
	
	public void sort()
	{
		Collections.sort(container);
	}
	
	public static void main(String []args)
	{
		StuffContainer3 myStuff = new StuffContainer3(10);
		
		Thing disk = new RoundThing("Red", 10);
		myStuff.addThing(disk);
		
		Thing square = new SquareThing("Blue", 8);
		myStuff.addThing(square);
		
		Thing block = new rectangularThing("yellow", 10, 3);
		myStuff.addThing(block);
		
		Thing d2 = new RoundThing("Yellow", 2);
		myStuff.addThing(d2);
		
		for(int i = 0; i< myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
	}
}