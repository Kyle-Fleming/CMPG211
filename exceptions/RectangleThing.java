import java.util.Scanner;
class RectangleThing extends Thing
{
  private int Length;
  private int breadth;

  public RectangleThing() throws InvalidLengthException
  {
    this("", 2, 1);
  }

  public RectangleThing(String colour, int len, int width) throws InvalidLengthException
  {
    super(colour);
    setLength(len);
    setBreadth(width);
  }

  public void setLength(int len) throws InvalidLengthException

  {
    if(len > 0)
    {
      this.Length = len;
    }
    else
    {
      throw new InvalidLengthException("Length " + len + " is invalid must be Greater than 0");
    }

  }
  public void setBreadth(int width) throws InvalidLengthException

  {
    if(width > 0 && width < getLength())
    {
        breadth = width;
    }
    else
    {
      throw new InvalidLengthException("Length " + width + " is invalid must be Greater than 0 and less than " + getLength());
    }

  }

  public int getLength()
  {
    return Length;
  }
  public int getbreadth()
  {
    return breadth;
  }

  public String toString()
  {
    return "I am a " + getColour()  + " rectangular thing with Length " + getLength() + " and width " + getbreadth();
  }
  public static void main(String[] args) throws InvalidLengthException
  {
    boolean finish = false;
    RectangleThing rt1 = new RectangleThing();
    Scanner input = new Scanner(System.in);

    while(!finish)
    {
      try
      {

        System.out.println("Please enter color: ");
        String color = input.nextLine();

        System.out.println("Please input Length of rectangle > 0: ");
        int Length = input.nextInt();
        input.nextLine();

        System.out.println("Please input width of rectangle >0 and greater than length:  ");
        int breadth = input.nextInt();
        input.nextLine();

        rt1 = new RectangleThing(color, Length, breadth);
        System.out.println(rt1.toString());
        finish = true;

      }
      catch (InvalidLengthException ex)
      {
        System.out.println(ex);
        finish = false;
      }
    }


  }
}
