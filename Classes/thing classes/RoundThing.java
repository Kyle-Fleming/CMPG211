public class RoundThing extends Thing
{
	private int radius;
	
	public RoundThing()
	{
		this("", 1);
		
	}
	
	public RoundThing(String ColVar, int radVar)
	{
		super(ColVar);
		setRadius(radVar);
		
	}
	
	public int getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(int radVar)
	{
		this.radius = radVar;
	}
	
	public String toString()
	{
		return "I am a " + getColor() + " Round thing with radius: " + getRadius();
	}
	public double calculateArea()
	{
		return Math.PI* (Math.pow(getRadius(), 2));
	}
	
	public double calculateCircumfrence()
	{
		return Math.round(2 * Math.PI * getRadius() * 100)/100.0;
	}
	public static void main(String[] args)
	{
		RoundThing r = new RoundThing("Purple", 45);
		
		System.out.println(r.toString());
		
	}
}