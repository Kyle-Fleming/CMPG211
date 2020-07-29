public class rectangularThing
{
	private int length;
	private int width;
	
	//constructors
	
	public rectangularThing()
	{
		this("", "", 0, 0);
	}
	
	public rectangularThing(String color, String id, int length, int width)
	{
		setLength(length);
		setWidth(width);
		setColor(color);
		setId(id);
		
		String[] idParts = id1.split(",");
		if(idParts.length==2)
		{
			
			if(Integer.parseInt(idParts[1])<1000 && Integer.parseInt(idParts[1])>0)
			{
				char id = idParts[0].charAt(0);
				setId(id, idParts[1]);
				
				if(id=='R')
				{
					
					setColor(color);
				}
			}
			
			
		}
		else
		{
			System.out.println("Invalid thing");
		}
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
	public Thing getColor()
	{
		return color;
	}
	
	//toString and main methods
	
	public String toString()
	{
		return "I am a " + getColor().getColor()+ " rectangular thing with: \nwidth: " + getWidth() + "\nLength: " + getLength() +"\nID: " getId().getID(); 
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