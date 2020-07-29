public class divZero
{
	public static void main(String[] args)
	{
		double A, B, C;
		//trying A = 123 then A = 0 then A = -123
		A = 123;
	
		B = 0;
		
		//if A = 123 then c = infinity
		//if A = 0 then c = NaN
		//if A = -123 then c = -infinity
		C = A/B;
		
		
		System.out.println("C = " + C);
		
		// this is the IEEE 756 - 1985 standard
		//this is a standard for floating point numbers in computers
	}
}