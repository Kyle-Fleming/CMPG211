import java.util.Scanner;

public class LuhnValidate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String num;
		int sum, mod;
		while(input.hasNext())
		{
			num=input.nextLine();
			sum=0;
			for(int i =0; i<8; i++)
			{
				sum+= (num.charAt(i)-'0')*(8-i);
			}
			mod = sum %11;
			if (mod == 0)
			{
				System.out.printf("Number %s is valid\n", num);
				
			}
			else
			{
				System.out.printf("Number %s is invalidvalid\n", num);

			}
		}
	}
}