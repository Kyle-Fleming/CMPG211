public class SquareThing extends Thing
{
	private int length;
	
	//constructors
	
	public SquareThing()
	{
		this("", 1);
	}
	
	public SquareThing(String color, int length)
	{
		super(color, 'S');
		setLength(length);
		
	}
	
	
	//setMethods
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	
	
	//getMethods
	
	
	
	public int getLength()
	{
		return length;
	}
	
	
	//toString and main methods
	
	public String toString()
	{
		return "I am a " + super.getColor() + " Square thing with:" + "\nLength: " + getLength() +"\nID: " + getId(); 
	}
	
	public static void main(String[] args)
	{
		/*
		SquareThing block = new SquareThing("Green", 10);
		System.out.println(block);
	*/	
	}
}