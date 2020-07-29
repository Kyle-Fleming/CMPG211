public class Person implements Comparable<Person>
{
	
	private String id;
	private Name name;
	private String email;
	private Address address;

	//constructors
	
	public Person()
	{
		this("00000000", "", "", new Address());
	}
	
	public Person(String id, String name, String email, Address address)
	{
		setId(id);
		setName(name);
		setEmail(email);
		setAddress(address);
	}
	
	//set methods
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setName(String newName)
	{
		name = new Name(newName);
	}
	
	public void setAddress(Address newAddress)
	{
		address = newAddress;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	
	
	//get methods
	
	public String getId()
	{
		return id;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public Address getAddress()
	{
		return address;
	}
	//toString and main methods
	
	public String toString()
	{
		return "Person ID: " + getId() + " Name: " + getName().getFullName() + " Email: " + getEmail();
	}
	
	public int compareTo(Person other)
	{
		String thisField = getName().getSurname() + getName().getFirstName();
		String otherField = other.getName().getSurname() + other.getName().getFirstName() ;
		
		return thisField.compareTo(otherField);
	}
	
	public static void main(String[] args)
	{
		
		Address a1 =  new Address("My Res,University Town");
		Person s1 =  new Person("53456785", "Clever,C,Clive", "clever.clive@gmail.com", a1);
		System.out.println("S1: " + s1);
		System.out.println("Name of s1: " + s1.getName());
		System.out.println("Address of s1: " + s1.getAddress().getAddress());
		
		Address a2 = new Address("CS Dept,University place");
		Person pp = new Person("53476585", "Prof,,Piet", "prof.piet@gmail.com", a2);
		System.out.println("pp: " + pp.toString());
		System.out.println("Name of pp: " + pp.getName().getFullName());
		System.out.println("and Address: " + pp.getAddress());
		
		
	}
}