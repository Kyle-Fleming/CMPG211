public class Savings extends Account
{
	private double minBalance;
	
	/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
	public Savings()
	{
		this("0",0,0, "", 0);
	}
	public Savings(String id, double balance, double interest, String name, double minBalance)
	{
		super(id, balance, interest, name);
		setMinBalance(this.minBalance);
	}
	
	//SET METHODS

	public void setMinBalance(double min)
	{
		this.minBalance = min;
	}
	
	//GET METHODS

	public double getMinBalance()
	{
		return this.minBalance;
	}
	public void withdraw(double OverDraft)
	{
		super.setbalance(super.getbalance() - OverDraft);
		if(super.getbalance() < 0)
		{
			System.out.println("Insuficiend funds");
			
		}else
		{
			System.out.println("Sucsess");
		}
	}
	
	//TOSTRING METHOD
	
	public String toString()
	{
		return (super.toString() + "\nBalance: " + super.getbalance() + "\nAvailable funds: " + (super.getbalance() - this.getMinBalance()));
	}
	
	//IMPLEMENT ABSTRACT
	
	public double calculateInterest(double rate)
	{
		if(this.getMinBalance() < super.getbalance())
		{
			return 0;
		}
	
		else
		{
			return super.getbalance() * (rate / 100);
		}
	}
	
	public static void main(String[] args)
	{
		//TEST CASE
		/*
		Savings sav = new Savings("1",20000, -200);
		sav.setOverDraft(1000000);
		sav.withdraw(sav.getOverDraft());
		System.out.println(sav.toString());
		*/
	}
}