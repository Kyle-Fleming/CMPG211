import java.util.Date;

public abstract class Account
{
	private String id;
	private double balance;
	//private double intrestrate;
	private Date datecreated;
	private String name;
	
	//DEFAULT CONSTRUCTOR
	
	public Account()
	{
		this("0",0, 0.0, "");
	}

	//OVERLOADED CONSTRUCTOR

/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		

		*/

	public Account(String id, double balance, double interest, String nm)
	{
		setid(id);
		setbalance(balance);
		//setName(name);
	}

	
	//SET METHODS
	
	public void setid(String nid)
	{
		id = nid;
	}
	public void setbalance(double nbal)
	{
		balance = nbal;
	}

	//WE ARE USING AN ABSTRACT METHOD TO CALCULATE THE INTEREST WITHIN ANY GIVEN ACCOUNT
	/*public void setInterest(double annual)
	{
		this.intrestrate = annual;
	}*/

	public void setName(String name)
	{
		this.name = name;
	}
	
	//GET METHODS
	
	public String getid()
	{
		return this.id;
	}
	public double getbalance()
	{
		return this.balance;
	}
	
	public String getdate()
	{
		datecreated = new Date();
		return this.datecreated.toString();
	}
	public String getName()
	{
		return name;
	}
	
	//TOSTRING METHOD
	
	public String toString()
	{
		return ("Id:" + getid() + "\nBalance: " + getbalance()  + "\nDate: " + getdate() + "\nName: " + getName());
	}
	
	//WITHDRAW & DEPOSIT
	
	public void withdraw(double takeMoney)
	{
		balance -= takeMoney;
	}
	public void deposit(double inputMoney)
	{
		balance += inputMoney;
	}
	
	//ABSTRACT METHOD
	
	public abstract double calculateInterest(double rate);
	
	
}