/**
@author Kyle fleming
*/
public class chequing extends Account
{
  private double overdraftLimit;
  

  public chequing(String name, int id, double balance, double annualInterestRate, double overdraftLimit)
  {
    super(name, id, balance, annualInterestRate);
    setLimit(overdraftLimit);
  }

  public double getLimit()
  {
    return overdraftLimit;
  }

  public void setLimit(double lim)
  {
    overdraftLimit = lim;
  }

  public String toString()
  {
    return super.toString() + "\nOverdraft limit: " + getLimit();
  }
  public void withDraw(double amnt)
  {
    if(amnt > overdraftLimit)
    {
      super.setBalance(super.getBalance());
    }
    if(amnt < overdraftLimit)
    {
      super.setBalance(super.getBalance() - amnt);
    }
  }
  
  //ABSTRACT METHOD
  
  public double calculateInterest(int rate)
  {
	  
  }
  
  
  
  public static void main (String [] args)
  {
    chequing c1 = new chequing("Kyle FLeming",321654, 256.22, 0.12, 60000);
    System.out.println(c1.toString());
    c1.withDraw(67000);
    System.out.println(c1.toString());
    c1.deposit(1000);
    System.out.println(c1.toString());

  }

}
