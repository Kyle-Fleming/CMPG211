import java.util.Scanner;
public class LuhnCalculateLast
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String num7, num8;
		int sum;
		int mod;
		int last;
		while (input.hasNext())
		{
			sum = 0;
			num7 = input.nextLine();
			for (int i =0; i <7; i++)
			{
				sum += (num7.charAt(i) - '0') * (8-i);
			}
			mod = sum % 11;
			if(mod == 0)
			{
				num8 = num7 + mod;
			}
			else
			{
				last = 11 - mod;
				num8 = num7 + last;
			}
			System.out.printf("Number = %s\n", num8);
		}
	}
}