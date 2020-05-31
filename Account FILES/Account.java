import java.util.*;
import java.io.*;

public abstract class Account implements Serializable, Comparable<Account>
{
	/**
	 *
	 */
	private static final long serialVersionUID = 4800958755775509708L;
	private String id;
	private double balance;
	private double interestRate;
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
		setInterest(interest);
		setName(nm);
	}

	// SET METHODS

	public void setInterest(double intRate)
	{
		interestRate = intRate;
	}
	public void setid(String nid) 
	{
		id = nid;
	}

	public void setbalance(double nbal) 
	{
		balance = nbal;
	}

	// WE ARE USING AN ABSTRACT METHOD TO CALCULATE THE INTEREST WITHIN ANY GIVEN
	// ACCOUNT

	public void setName(String accName) 
	{
		name = accName;
	}

	// GET METHODS

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
		return this.name;
	}

	public double getInterestRate()
	{
		return interestRate;
	}

	// TOSTRING METHOD

	public String toString() {
		return ("Id:" + getid() + "\nBalance: " + getbalance() + "\nDate: " + getdate() + "\nName: " + getName() + "\nInterest accrued: " + calculateInterest() + "\nInterest rate: " + getInterestRate());
	}

	// WITHDRAW & DEPOSIT

	public void withdraw(final double takeMoney)
	{
		balance -= takeMoney;
	}

	public void deposit(final double inputMoney)
	{
		balance += inputMoney;
	}
	
	//ABSTRACT METHOD
	
	public abstract double calculateInterest();


	//COMPARETO

	public int compareTo(Account other)
	{
		if(this.getbalance() > other.getbalance())
		{
			return 1;
		}
		else if(this.getbalance() < other.getbalance())
		{
			return -1;
		}

		else
		{
			return 0;
		}

	}
	
	
}