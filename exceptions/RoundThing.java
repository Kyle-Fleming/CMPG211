import java.util.Scanner;
class RoundThing extends Thing
{
  private int radius;

  public RoundThing() throws InvalidRadiusException
  {
    this("", 1);
  }

  public RoundThing(String colour, int radius) throws InvalidRadiusException
  {
    super(colour);
    setRadius(radius);
  }

  public void setRadius(int rad) throws InvalidRadiusException
  {
    if(rad > 0)
    {
      this.radius = rad;
    }
    else
    {
      throw new InvalidRadiusException("Radius " + rad + " is less than 0");
    }

  }

  public int getRadius()
  {
    return radius;
  }

  public String toString()
  {
    return "I am a " + getColour()  + " thing with radius " + getRadius();
  }

  public String tellAboutYourSelf()
  {
    return "I am a " + getColour()  + " thing with radius " + getRadius() + "and I can roll, WEEE";

  }
  public static void main(String[] args) throws InvalidRadiusException
  {
	boolean finish = false;
    RoundThing rt1 = new RoundThing();
    Scanner input = new Scanner(System.in);

	while(!finish)
    {
      try
      {

        System.out.println("Please enter color: ");
        String color = input.nextLine();

        System.out.println("Please input radius greater than 0: ");
        int radius = input.nextInt();
        input.nextLine();

        rt1 = new RoundThing(color, radius);
        System.out.println(rt1.toString());
		finish = true;

      }
      catch (InvalidRadiusException ex)
      {
        System.out.println(ex);
        finish = false;
      }
    }


  }
}
