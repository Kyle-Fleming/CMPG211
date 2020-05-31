public abstract class Thing implements Calculable
{
	private String color;
	
	public Thing()
	{
		this("");
	}
	
	public Thing(String color)
	{
		setColor(color);
	}
	
	//getmethods
	public String getColor()
	{
		return this.color;
	}
	//setmethods
	
	public void setColor(String colVar)
	{
		this.color = colVar;
	}
	
	//toString method
	
	public String toString()
	{
		return "I ama a "+ getColor() + " thing";
	}
	
	public abstract double calculateArea();
	
	public static void main(String[] args)
	{
		
	}
}