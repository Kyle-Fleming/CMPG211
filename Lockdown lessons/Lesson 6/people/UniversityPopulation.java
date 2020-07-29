import java.util.Arrays;

public class UniversityPopulation
{
	private Person[] container;
	private int capacity;
	private int numberOfPeople;
	
	public UniversityPopulation()
	{
		this(5);
	}
	
	public UniversityPopulation(int capacity)
	{
		container = new Person[capacity];
		setCapacity(capacity);
		setNumberOfPeople(0);
		
	}
	
	//set methods
	private void setCapacity(int cap)
	{
		capacity = cap;
	}

	private void setNumberOfPeople(int num)
	{
		numberOfPeople = num;
	}
	
	//get methods
	
	public int getCapacity()
	{
		return capacity;
	}
	public int getNumberOfPeople()
	{
		return numberOfPeople;
	}
	//container stuff
	
	public boolean isFull()
	{
		return getNumberOfPeople() == getCapacity();
	}
	
	public void addPerson(Person newPerson)
	{
		if(isFull())
		{
			grow();
		}
		container[numberOfPeople] = newPerson;
		setNumberOfPeople(numberOfPeople + 1);
	}
	
	public Person getPerson(int index)
	{
		return container[index];
	}
	
	public void sort()
	{
		trim();
		Arrays.sort(container);
	}
	public void grow()
	{
		System.out.println("INCREASING CAPACITY OF CONTAINER");
		Person[] temp = new Person[getNumberOfPeople()*2];
		for(int i =0; i<getNumberOfPeople(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfPeople()*2);
	}
	public void trim()
	{
		System.out.println("SHRINKING CONTAINER TO NUMBER OF ITEMS CONTAINED");
		Person[] temp = new Person[getNumberOfPeople()];
		for(int i =0; i<getNumberOfPeople(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfPeople());
	}
	
	public static void main(String [] args)
	{
		UniversityPopulation myFriends = new UniversityPopulation(10);
		Address a1 =  new Address("My Res,University Town");
		Person s1 = new Person("53456785", "Clever,C,Clive", "clever.clive@gmail.com", a1);
		myFriends.addPerson(s1);
		
		
		Address a2 = new Address("CS Dept,University place");
		Person pp = new Person("53476585", "Prof,,Piet", "prof.piet@gmail.com", a2);
		myFriends.addPerson(pp);
	
	
	}
}