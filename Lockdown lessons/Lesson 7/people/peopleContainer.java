import java.util.Arrays;

public class UniversityApplication
{
	private Person[] container
	public PeopleContainer()
	{
		this(5);
	}
	
	public PeopleContainer(int capacity)
	{
		container = new ArrayList<Person>(capacity);
	}
	
	public int getNumberOfPeople()
	{
		return container.size();
	}
	
	public void addPerson(Person newPerson)
	{
		container.add(Person);
	}
	
	public Person getPerson(int index)
	{
		return container.get(index);
	}
	
	public void sort()
	{
		Collections.sort(container);
	}
	
	public static void main(String [] args)
	{
		PeopleContainer myFriends = new PeopleContainer(10);
		Address a1 =  new Address("My Res,University Town");
		Person s1 = new Person("53456785", "Clever,C,Clive", "clever.clive@gmail.com", a1)
		myFriends.addPerson(s1);
		
		
		Address a2 = new Address("CS Dept,University place");
		Person pp = new Person("53476585", "Prof,,Piet", "prof.piet@gmail.com", a2);
		myFriends.addPerson(pp);
	
	
	}
}