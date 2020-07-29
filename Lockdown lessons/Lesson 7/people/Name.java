public class Name
{
	
	private String firstName;
	private String initials;
	private String surname;
	
	public Name()
	{
		this("");
	}
	
	public Name(String newName)
	{
		String[] nameParts = newName.split(",");
		if(nameParts.length==3)
		{
			setFirstName(nameParts[0]);
			setInitials(nameParts[1]);
			setSurname(nameParts[2]);
		}
		
		else
		{
			setFirstName("");
			setInitials("");
			setSurname("");
		}
	}
	
	//setMethods
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public void setInitials(String initials)
	{
		this.initials = initials;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	
	
	//getMethods
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getInitials()
	{
		return initials;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getFullName()
	{
		return getFirstName() + " " + getInitials() + " " + getSurname();
	}
	
	//toString and main
	
	public String toString()
	{
		return getFullName();
	}
	
	public static void main(String[] args)
	{
		Name billy = new Name("Wiliam,WH, Bonney");
		System.out.println("Billy = " + billy.getFullName());
		
		Name jd = new Name("John,,Doe");
		System.out.println("jd = " + jd.getFullName());
		
		Name none = new Name();
		System.out.println("None = " + none.getFullName());
	}
	
}