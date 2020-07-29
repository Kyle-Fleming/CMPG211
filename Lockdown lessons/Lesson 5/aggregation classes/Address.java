public class Address
{
	
	private String addressLine1;
	private String addressLine2;
	
	//constructors
	
	public Address()
	{
		this("");
	}
	
	public Address(String newAddress)
	{
		String[] addressLines = newAddress.split(",");
		
		if(addressLines.length == 2)
		{
			setAddressLine1(addressLines[0]);
			setAddressLine2(addressLines[1]);
		}
		
		else
		{
			setAddressLine1("");
			setAddressLine2("");
		}
	}
	
	//getmethods
	
	public String getAddressLine1()
	{
		return addressLine1;
	}
	
	public String getAddressLine2()
	{
		return addressLine2;
	}
	
	//setmethods
	
	public void setAddressLine1(String aLine1)
	{
		addressLine1 = aLine1;
	}
	
	
	public void setAddressLine2(String aLine2)
	{
		addressLine2 = aLine2;
	}
	//tostring and main methods
	
	public String getAddress()
	{
		return getAddressLine1() + "\n" + getAddressLine2() + "\n";
	}
	
	public String toString()
	{
		return getAddressLine1() + ", " + getAddressLine2();
	}
	
	public static void main(String[] args)
	{
		Address myAddress = new Address("CS Dept,ThisUni");
		System.out.println("myAddress: " + myAddress);
		
		Address none = new Address();
		System.out.println("none: " + none.getAddress());
	}
}