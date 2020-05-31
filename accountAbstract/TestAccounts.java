public class TestAccounts
{
	public static void main(String[] args) 
	{

		/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
		Account c1 = new Checkings("1111111111", -1000, 1.4, "Jason Todd", -2100);
		Account c2 = new Checkings("2222222222", -1250000, 2.7, "Maria Condie", -500000);
		Account c3 = new Checkings("3333333333", 1000, 8.9, "Batman", -7850);

			/*
		1st: String account ID

		2nd: Double account balance
		
		3rd: Double Interest rate
		
		4th: String account holder name
		 
		5th: Double Overdraft limit

		*/
		Account s1 = new Savings("4444444444", 10000, 7.8, "Dick Grayson",500);
		Account s2 = new Savings("5555555555", 100, 15.8, "Robert Tyson",500);


		System.out.println(c1+" with interest: "+c1.calculateInterest(10) );
		System.out.println(c2+" with interest: "+c2.calculateInterest(10) );
		System.out.println(c3+" with interest: "+c3.calculateInterest(10) );
		System.out.println(s1+" with interest: "+s1.calculateInterest(10) );
		System.out.println(s2+" with interest: "+s2.calculateInterest(10) );		
	}
}