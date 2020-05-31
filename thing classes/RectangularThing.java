public class RectangularThing extends Thing
{
	private int length;
	private int width;
	
	public RectangularThing()
	{
		this("", 1, 1);
		
	}
	
	public RectangularThing(String ColVar, int lenVar, int widthVar)
	{
		super(ColVar);
		setlength(lenVar);
		setWidth(widthVar);
		
	}
	
	public int getlength()
	{
		return this.length;
	}
	public int getWidth()
	{
		return this.width;
	}
	
	public void setlength(int lenVar)
	{
		this.length = lenVar;
	}
	
	public void setWidth(int widthVar)
	{
		this.width = widthVar;
	}
	
	public String toString()
	{
		return "I am a " + getColor() + " Rectangular thing with length: " + getlength() + " and width " + getWidth();
	}
	public double calculateArea()
	{
		return (getWidth()*getWidth());
	}
	public double calculateCircumfrence()
	{
		return (getWidth()*2) + (getlength()*2);
	}
	public static void main(String[] args)
	{
		RectangularThing r = new RectangularThing("Brown", 10, 5);
		
		System.out.println(r.toString());
		
	}
}