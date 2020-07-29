public class rectangularThing extends Thing
{
	private int length;
	private int width;
	
	//constructors
	
	public rectangularThing()
	{
		this("", 0, 0);
	}
	
	public rectangularThing(String color, int length, int width)
	{
		super(color, 'R');
		setLength(length);
		setWidth(width);
		
	}
	
	
	//setMethods
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	//getMethods
	
	public int getWidth()
	{
		return width;
	}
	
	public int getLength()
	{
		return length;
	}
	
	
	//toString and main methods
	
	public String toString()
	{
		return "I am a " + super.getColor()+ " rectangular thing with: \nwidth: " + getWidth() + "\nLength: " + getLength() +"\nID: " + getId(); 
	}
	
	public static void main(String[] args)
	{
		rectangularThing r1 = new rectangularThing();
		System.out.println();
		
		rectangularThing r2 = new rectangularThing();
		System.out.println();
		
		rectangularThing r3 = new rectangularThing();
		System.out.println();
	}
}