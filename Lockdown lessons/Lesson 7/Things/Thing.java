import java.io.Serializable;
public class Thing implements Serializable, Comparable<Thing>
{
	
	private ThingID id;
	private String color;
	private static int counter;
	
	//constructors
	
	public Thing()
	{
		this("", '~');
	}
	public Thing(String color, char type )
	{
		setColor(color);
		setId(type, String.format("%03d", getNextCounter()));
	}
	
	//setMethods
	
	public void setId(char type, String seqNo)
	{
		id = new ThingID(type, seqNo);
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	//getMethods
	
	public ThingID getId()
	{
		return id;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public static int getNextCounter()
	{
		counter++;
		return getCounter();
	}
	
	public static int getCounter()
	{
		return counter;
	}
	
	public int compareTo(Thing other)
	{
		String thisField = getColor() + id.getSeqNo();
		String otherField = other.getColor() + other.id.getSeqNo();
		
		return thisField.compareTo(otherField);
	}
	
	//toString and main methods
	
	public String toString()
	{
		return "I am a " + getColor() + " thing with ID: " + getId().getID();
	}
	
	public static void main(String[] args)
	{/*
		Thing t1 = new Thing("Red", "C,101");
		System.out.println(t1);
		
		Thing t3 = new Thing("Blue", "R,100");
		System.out.println(t3);
		
		Thing t2 = new Thing("Black", "C,010");
		System.out.println(t2);
			*/
	}
}