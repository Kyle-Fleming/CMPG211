public class Thing
{
	
	private ThingID id;
	private String color;
	
	//constructors
	
	public Thing()
	{
		this("", "");
	}
	public Thing(String color, String id1 )
	{
		String[] idParts = id1.split(",");
		if(idParts.length==2)
		{
			
			if(Integer.parseInt(idParts[1])<1000 && Integer.parseInt(idParts[1])>0)
			{
				char id = idParts[0].charAt(0);
				setId(id, idParts[1]);
				if(id == 'C')
				{
					
					setColor(color);
				}
				if(id == 'S')
				{
					
					setColor(color);
				}
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
	
	//toString and main methods
	
	public String toString()
	{
		return "I am a " + getColor() + " thing with ID: " + getId().getID();
	}
	
	public static void main(String[] args)
	{
		Thing t1 = new Thing("Red", "C,101");
		System.out.println(t1);
		
		Thing t3 = new Thing("Blue", "R,100");
		System.out.println(t3);
		
		Thing t2 = new Thing("Black", "C,010");
		System.out.println(t2);
			
	}
}