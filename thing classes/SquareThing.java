public class SquareThing extends Thing
{
	private int length;
	
	public SquareThing()
	{
		this("", 1);
		
	}
	
	public SquareThing(String ColVar, int lenVar)
	{
		super(ColVar);
		setlength(lenVar);
		
	}
	
	public int getlength()
	{
		return this.length;
	}
	
	public void setlength(int lenVar)
	{
		this.length = lenVar;
	}
	
	public String toString()
	{
		return "I am a " + getColor() + " Square thing with length: " + getlength();
	}
	
	public double calculateArea()
	{
		return (getlength()*getlength());
	}
	public double calculateCircumfrence()
	{
		return getlength()*4;
	}
	public static void main(String[] args)
	{
		SquareThing r = new SquareThing("Green", 10);
		
		System.out.println(r.toString());
		
	}
}