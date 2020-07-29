public class RoundThing extends Thing
{
	private int radius;
	
	public RoundThing()
	{
		this("", "", 1);
		
	}
	
	public RoundThing(String ColVar, String idVal, int radVar)
	{
		super(ColVar, idVal);
		setRadius(radVar);
		
	}
	//get methods
	public int getRadius()
	{
		return this.radius;
	}
	
	
	//set methods
	public void setRadius(int radVar)
	{
		this.radius = radVar;
	}
	//toString, calculate & main methods.
	public String toString()
	{
		return "I am a " + getColor() + " Round thing with radius: " + getRadius() + " With ID: " + super.getId().getID();
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
		RoundThing r = new RoundThing("Purple", "S,555", 45);
		
		System.out.println(r.toString());
		
	}
}