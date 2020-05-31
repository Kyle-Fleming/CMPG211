/**
@author Kyle fleming
*/
public class Savings extends Account
{
  public Savings(String name, int id, double balance, double annualInterestRate)
  {
    super(name, id, balance, annualInterestRate);
  }
  
  public int calculateInterest(int rate)
  {
	if(getMinBal() < getBalance())
	{
		return 0;
	}
	
	else
	{
		return getBalance() * (rate / 100);
	}
  }
  
  public String toString()
  {
    return super.toString();
  }
  public void drawings(double amountNeeded)
  {
    if(amountNeeded > super.getBalance())
    {
      super.setBalance(super.getBalance());
      System.out.println("Invalid amounts");
    }
    if(amountNeeded < super.getBalance())
    {
      super.setBalance(super.getBalance() - amountNeeded);
    }
  }

  public static void main(String[] args)
  {
    Savings s1 = new Savings("Joe", 555555, 555, 0.22);
    System.out.println(s1.toString());

    s1.drawings(5000000);
    System.out.println("\n\nWITHDRAWL \n" + s1.toString());

    s1.deposit(50000);
    System.out.println("\n\nDEPOSIT \n" + s1.toString());

  }
}
