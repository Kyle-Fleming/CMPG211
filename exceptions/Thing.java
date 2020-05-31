public class Thing
{
  private String colour;
  public static int numberOfThings = 0;

  public Thing(String col)
  {
    setColour(col);
    setNumberOfThings();
  }
  public void setColour(String col)
  {
    colour = col;
  }
  public String getColour()
  {
    return colour;
  }
  public static int getNumberOfThings()
  {
    return numberOfThings;
  }
  public static void setNumberOfThings()
  {
    numberOfThings++;
  }
}
