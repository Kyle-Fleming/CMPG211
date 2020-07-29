import java.util.Arrays;

public class StuffContainer2
{
	private Thing[] container;
	private int capacity;
	private int numberOfThings;
	
	public StuffContainer2()
	{
		this(5);
	}
	public StuffContainer2(int capacity)
	{
		container = new Thing[capacity];
		setCapacity(capacity);
		setNumberOfThings(0);
	}
	//set methods
	private void setCapacity(int cap)
	{
		capacity = cap;
	}
	private void setNumberOfThings(int num)
	{
		numberOfThings = num;
	}
	
	//get methods
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public int getNumberOfThings()
	{
		return numberOfThings;
	}
	
	//container stuff
	
	public boolean isFull()
	{
		return getNumberOfThings() == getCapacity();
	}
	
	public void addThing(Thing newThing)
	{
		if(isFull())
		{
			grow();
		}
		container[numberOfThings] = newThing;
		setNumberOfThings(numberOfThings + 1);
	}
	
	public Thing getThing(int index)
	{
		return container[index];
	}
	
	public void sort()
	{
		trim();
		Arrays.sort(container);
	}
	
	public void trim()
	{
		System.out.println("SHRINKING CONTAINER TO NUMBER OF ITEMS CONTAINED");
		Thing[] temp = new Thing[getNumberOfThings()];
		for(int i =0; i<getNumberOfThings(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfThings());
	}
	
	public void grow()
	{
		System.out.println("INCREASING CAPACITY OF CONTAINER");
		Thing[] temp = new Thing[getNumberOfThings()*2];
		for(int i =0; i<getNumberOfThings(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfThings()*2);
	}
	
	public static void main(String[] args)
	{
		StuffContainer2 myStuff = new StuffContainer2(10);
		System.out.println("Capacity of myStuff: " + myStuff.getCapacity());
		System.out.println("Number of Things in myStuff: " + myStuff.getNumberOfThings());
		
		Thing disk = new RoundThing("Blue", 10);
		myStuff.addThing(disk);
		
		Thing square = new SquareThing("Red", 8);
		myStuff.addThing(square);
		
		Thing block = new rectangularThing("Green", 10, 3);
		myStuff.addThing(block);
		
		Thing d2 = new RoundThing("Yellow", 2);
		myStuff.addThing(d2);
		
		for(int i = 0; i < myStuff.getNumberOfThings(); i++)
		{
			System.out.println(myStuff.getThing(i));
		}
	}
}