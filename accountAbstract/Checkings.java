public class Checkings extends Account
{
	public double OverDraft;
	public double with;
	public double alfa;
	
	public Checkings()
	{
		/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
		this("0",0,0.0, "", 0.0);
	}
	
	public Checkings(String id, double balance, double interestRate, String name, double over)
	{
		super(id, balance, interestRate, name);
		setOverDraft(over);
	
	}
	
	public void setOverDraft(double over)
	{
		this.OverDraft = over;
	}
	
	public double getOverDraft()
	{
		return OverDraft;
	}
	
	public void withdraw(double with)
	{
		super.setbalance(super.getbalance() - with);
		if(super.getbalance() < this.getOverDraft())
		{
			System.out.println("Insuficiend funds");
			super.setbalance(super.getbalance() + with);
		}else
		{
			System.out.println("******************Withdrawl approved, please collect funds******************");
		}
	}
	public double calculateInterest(double RATE)
	{
		if(super.getbalance() < getOverDraft())
		{
			alfa = (super.getbalance()*RATE/100);
			alfa = alfa * 2;
			return alfa;
		}
		else if(super.getbalance() < 0)
		{
			alfa = (super.getbalance() * 4 * RATE/100);
			return alfa;
		}
		else
		{
			alfa = (super.getbalance() * RATE/100);
			return alfa;
		}
	}

	
	public String toString()
	{
		return (super.toString() + "\nBalance: " + super.getbalance() + "\nOverdraft: " + getOverDraft() + "\nAccount holder name: " + getName());
	}

	/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
		public static void main(String[] args)
	{

		Checkings check = new Checkings("1",20000,3.2, "Johannes von Struwig", -200);
		check.setOverDraft(-50);
		check.withdraw(20060);
		System.out.println(check);
	}
}