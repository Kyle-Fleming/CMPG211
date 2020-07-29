public class Person
{
	private String id;
	private String name;
	private String email;
	
	public Person()
	{
		this("00000000", "", "");
	}
	
	public Person(String inputID, String inputName, String inputEmail)
	{
		setId(inputID);
		setName(inputName);
		setEmail(inputEmail);
	}
	
	public void setId(String inputID)
	{
		String num;
		int sum, mod;
		
		sum=0;
		for(int i =0; i<8; i++)
		{
			sum+= (inputID.charAt(i)-'0')*(8-i);
		}
		mod = sum %11;
		if (mod == 0)
		{
			System.out.printf("---Number %s is valid---\n", inputID);
			this.id = inputID;
			
		}
		else
		{
			throw new InvalidIdException("invalid ID");
		}
		
	}
	
	public void setName(String input)
	{
		this.name = input;
	}
	
	public void setEmail(String input)
	{
		this.email = input;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String toString()
	{
		return "Person ID: " + getId() + ", Name: " + getName() + ", eMail: " + getEmail() + "\n";
	}
	
	public static void main(String [] args)
	{
		try
		{
			Person s1 = new Person("53456785", "Clever Clive", "clever.clive@gmail.com");
			System.out.println("s1: " + s1);	
			
			
		}
		catch(InvalidIdException e)
		{
			System.out.println("Invalid ID, cannot create this person: ");
		}
		catch(StringIndexOutOfBoundsException err)
		{
			System.out.println("ID is not the correct length, cannot create this person.");
		}
		
		
		System.out.println("::Attempt to create person 2::");
		try
		{
			Person pp = new Person("53467585", "Prof Piet", "prof.piet@gmail.com");
			System.out.println("pp: " + pp);	
			
			
		}
		catch(InvalidIdException e)
		{
			System.out.println("Invalid ID, cannot create this person: ");
		}
		catch(StringIndexOutOfBoundsException err)
		{
			System.out.println("ID is not the correct length, cannot create this person.");
		}
		
	}
}