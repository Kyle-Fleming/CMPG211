import java.util.Date;

public class transaction
{
  private Date dateCreated;
  private char type;
  private double amount;
  private double balance;



  public transaction(char type, double amount, double balance)
  {
    this.type = type;
    this.amount = amount;
    this.balance = balance;
    dateCreated = new Date();
  }

  public Date getDateCreated()
  {
    return dateCreated;
  }
  public char getType()
  {
    return type;
  }
  public double getAmount()
  {
    return amount;
  }
  public double getBalance()
  {
    return balance;
  }
  public String toString()
  {
    return "Type: " + getType() + "\nAmount: " + getAmount() + "\nBalance: " + getBalance() + "\nDate: " + getDateCreated();
  }

  //time for an arraylist

  public static void main(String[] args)
  {
  }
}
