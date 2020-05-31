/**
@author Kyle fleming
*/
import java.util.Date;
import java.util.ArrayList;

public abstract class Account implements Interest
{
  private String name;
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  //ArrayList variable declaration
  private ArrayList<transaction> transactions = new ArrayList<transaction>();
  
  //public abstract int calculateInterest(int rate);
  
  public Account()
  {
    setID(0);
    setBalance(0);
    setAnnualInterestRate(0);
  }

  public Account(String name,int id, double balance, double annualInterestRate)
  {
    setName(name);
    setID(id);
    setBalance(balance);
    setAnnualInterestRate(annualInterestRate);
    dateCreated = new Date();
  }
  public String getName()
  {
      return name;
  }

  /**Returns the ID of the Account
   * @return id
   */
  public int getID()
  {
      return id;
  }
  /**Returns the name of the Account
   * @return name
   */
  public double getBalance()
  {
      return balance;
  }
  /**Returns the email of the Account
   * @return email
   */
  public double getAnnualInterestRate()
  {
      return annualInterestRate;
  }
  public double getMonthlyInterest()
  {
    return (balance * (annualInterestRate/12));
  }
  public double getMonthlyInterestRate()
  {
    return (annualInterestRate/12);
  }

  public Date getDateCreated()
  {
    return dateCreated;
  }
  public void setName(String fullName)
  {
    name = fullName;
  }

  /**Sets the ID of the Account
   * @param id
   */
  public void setID(int n)
  {
      id = n;
  }
  /**Sets the name of the Account
   * @param name
   */
  public void setBalance(double n)
  {
      balance = n;
  }
  /**Sets the email of the Account
   * @param email
   */
  public void setAnnualInterestRate(double n)
  {
      annualInterestRate = n;
  }
  /**
  * @param getTransactions is an ArrayList
  */
  public ArrayList<transaction> getTransactions()
  {
    return transactions;
  }
  public void withdraw(double amount)
  {
    setBalance(getBalance() - amount);
    transactions.add(new transaction('W', amount, getBalance()));
  }

  public void deposit(double amount)
  {
    setBalance(getBalance() + amount);
    transactions.add(new transaction('D', amount, getBalance()));

  }

  public String toString()
  {
    return "Name: " + getName() + "\nID: " + getID() + "\nBalance: " + getBalance() + "\nInterest rate per annum: " + getAnnualInterestRate() + "\nDate Created: "+getDateCreated();

  }

  public static void main(String[] args)
  {
	/*
    Account a1 = new Account("Daa", 25555, 250.00, 0.22);
    System.out.println(a1.toString());
    a1.deposit(50);
    a1.withdraw(500);
    a1.deposit(50000);
    System.out.println("Balance = " + a1.getBalance() + "\n\n");
    ArrayList<transaction> tList = a1.getTransactions();
    for(int i = 0 ; i < tList.size(); i++)
    {
      System.out.println(tList.get(i) + "\n");
    }
    System.out.println("\n\nFormatted output\n\n");
    for(int i = 0; i < tList.size(); i++)
    {
      transaction tFormatList = tList.get(i);
      //System out date, withdrawl amount, new balance;
      if(tFormatList.getType() == 'W' || tFormatList.getType() =='w')
      {
          System.out.println("Date: " + tFormatList.getDateCreated() + " Withdrawl - " + tFormatList.getAmount() + " New Balance: " + tFormatList.getBalance());
      }
      if(tFormatList.getType() == 'D')
      {
        System.out.println("Date: " + tFormatList.getDateCreated() + " Deposit + " + tFormatList.getAmount() + " New Balance: " + tFormatList.getBalance());
      }

    }
	*/
  }



}
