//30279445, Kyle Fleming
public class ThingID
{
	private char type;
	private String seqNo;
	
	//constructors
	public ThingID()
	{
		this('~',"000");
	}
	public ThingID(char type, String seqNo)
	{
		setSeqNo(seqNo);
		setType(type);
	}
	public ThingID(String newID)
	{
		char type = newID.charAt(0);
		String seq = newID.substring(1);
		setType(type);
		setSeqNo(seq);
	}
	
	//getMethods
	public char getType()
	{
		return type;
	}
	public String getSeqNo()
	{
		return seqNo;
	}
	
	public String getID()
	{
		return getType() + getSeqNo();
	}
	
	//setMethods
	
	public void setType(char type)
	{
		this.type = type;
	}
	
	public void setSeqNo(String seqNo)
	{
		this.seqNo = seqNo;
	}
	
	//toString and main methods
	
	public String toString()
	{
		return "Type " + getType() + " SeqNo: " +getSeqNo(); 
	}
	
	public static void main(String[] args)
	{
		ThingID t1 = new ThingID('c', "001");
		System.out.println(t1);
		System.out.println("t1 ID: " + t1.getID());
	}
}