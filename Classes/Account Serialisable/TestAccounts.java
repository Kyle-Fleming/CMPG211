import java.util.*;
import java.io.*;


public class TestAccounts
{
	private static final int MAX_ACCOUNT_NO = 5;

	//DECLARATION

	static ObjectOutputStream output;

	//open serialised object!!!!!!!!!!!!!!
	public static void open()
	{
		try 
		{
			output = new ObjectOutputStream(new FileOutputStream("accountArrays.ser"));
		} 
		catch (IOException e) 
		{
			System.out.println("************************************************Cannot Open file*******************************************************");
		}

	}

	//close serialised object!!!!!!!!!!!!!!
	public static void close()
	{
		try 
		{
			output.close();
		}
		catch (Exception e) 
		{
			System.out.println("########################Cannot close file: " + e);
		}
	}



	public static void main(String[] args) 
	{
		open();
		/*
		 * 1st: String account ID
		 * 
		 * 2nd: Double account balance
		 * 
		 * 3rd: Double Interest rate
		 * 
		 * 4th: String account holder name
		 * 
		 * 5th: Double Overdraft limit
		 * 
		 */
		Account[] myAccounts = new Account[MAX_ACCOUNT_NO];
		myAccounts[0] = new Checkings("1234567890", -82000, 1.4, "Jason Todd", -2100);
		myAccounts[1] = new Checkings("3216549870", 7500, 8.9, "Maria Condie", -500000);
		myAccounts[2] = new Checkings("9638527840", 1000, 0.2, "Batman", -7850);

		/*
		 * 1st: String account ID
		 * 
		 * 2nd: Double account balance
		 * 
		 * 3rd: Double Interest rate
		 * 
		 * 4th: String account holder name
		 * 
		 * 5th: Double Overdraft limit
		 * 
		 */
		myAccounts[3] = new Savings("2581473690", 550, 15.8, "Dick Grayson", 500);
		myAccounts[4] = new Savings("9517534560", 6423, 7.8, "Robert Tyson", 500);

		// Unsorted data
		System.out.println("*******************************Unordered balance accounts*******************************");
		for (int i = 0; i < MAX_ACCOUNT_NO; i++) {
			System.out.println(myAccounts[i].toString());
		}
		System.out.println("*********************************************************************************************");

		Arrays.sort(myAccounts);
		System.out.println("*******************************Sorted by balance accounts*******************************");
		for (int i = 0; i < MAX_ACCOUNT_NO; i++) {
			System.out.println(myAccounts[i].toString());
		}
		System.out.println("*********************************************************************************************");

		for(int i =0; i<MAX_ACCOUNT_NO; i++)
		{
			try {
				output.writeObject(myAccounts[i]);
			} catch (Exception e) {
				System.out.println("There was a problem writing this object: " + e);
			}
		}
		close();
	}
}