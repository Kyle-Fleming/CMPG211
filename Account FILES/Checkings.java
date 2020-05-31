public class Checkings extends Account
{
	/**
	 *
	 */
	private static final long serialVersionUID = 4878018351173204012L;
	public double OverDraft;
	public double with;
	public double alfa;
	
	
	
	public Checkings(String id, double balance, double interestRate, String name, double over)
	{
		super(id, balance, interestRate, name);
		this.setOverDraft(over);
	
	}

	public Checkings()
	{
		/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
		this("0", 0, 0.0, "", 0.0);
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
		
		if((super.getbalance()-with) >= this.getOverDraft())
		{
			System.out.println("******************Withdrawl approved, please collect funds******************");
			super.setbalance(super.getbalance() - with);
		}
		
		else
		{
			throw new invalidBalance("****************************Insufficient funds****************************");
		}
	}

	// implemented abstract class
	public double calculateInterest()
	{
		if(super.getbalance() > 0)
		{
			return super.getbalance() * super.getInterestRate()/100;
		}
		else
		{
			
			return 0;
		}
	}

	
	public String toString()
	{
		return (super.toString() +"\nOverdraft limit: " + this.getOverDraft() + "\n\n");
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
		//test case 1
		Checkings check = new Checkings("1234567890", 20000, 3.2, "Johannes von Struwig", -200);
		System.out.println("\n\n\n\nTEST ACCOUNT 2\n\n\n\n");
		System.out.println(check.toString());


		try
		{
			check.setInterest(25.8);
			check.withdraw(520000);
		}
		catch(invalidBalance e)
		{
			System.out.println(e);
		}

		System.out.println("\n\n\n\nTEST ACCOUNT 2\n\n\n\n");
		System.out.println(check.toString());
		System.out.println("\n\n\n\nTEST ACCOUNT 2\n\n\n\n");

		//test case 2
		Checkings check2 = new Checkings("3216549870", 325, 3.2, "Viktor balishnikoff", -200);
		System.out.println("\n\n\n\nTEST ACCOUNT 2\n\n\n\n");
		System.out.println(check2.toString());
		System.out.println("\n\n\n\nTEST ACCOUNT 2\n\n\n\n");


		try
		{
			check.withdraw(20060);
			System.out.println("Successful withdrawl.");
		}
		catch(invalidBalance e)
		{
			System.out.println(e);
		}

			
		System.out.println(check2.toString());
	}
}