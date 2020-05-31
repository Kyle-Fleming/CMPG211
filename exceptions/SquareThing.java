import java.util.Scanner;
class SquareThing extends Thing
{
  private int Length;

  public SquareThing() throws InvalidLengthException
  {
    this("", 1);
  }

  public SquareThing(String colour, int len) throws InvalidLengthException
  {
    super(colour);
    setLength(len);

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

  public int getLength()
  {
    return Length;
  }

  public String toString()
  {
    return "I am a " + getColour()  + " square thing with Length " + getLength();
  }
  public static void main(String[] args) throws InvalidLengthException
  {
    boolean finish = false;
    SquareThing rt1 = new SquareThing();
    Scanner input = new Scanner(System.in);

    while(!finish)
    {
      try
      {

        System.out.println("Please enter color: ");
        String color = input.nextLine();

        System.out.println("Please input Length of sides > 0: ");
        int Length = input.nextInt();
        input.nextLine();

        rt1 = new SquareThing(color, Length);
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
