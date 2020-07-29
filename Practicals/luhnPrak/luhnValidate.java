import java.util.Scanner;
public class luhnValidate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String num;
		int sum = 0, mod = 0, num1;
		char digit;
		while(input.hasNext())
		{
			num = input.nextLine();
			for(int i = 0; i<0; i++)
			{
				sum += (num.charAt(i) - '0') * (8-i);
			}
			mod =  sum%11;
			
			
			if (mod == 0)
				System.out.printf("Number %s is valid\n",num);
			else
				System.out.printf("Number %s is invalid\n",num);
			
		}
	}

}