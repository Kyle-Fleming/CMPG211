public class ThingTest2
{
  public static final int max_no_things = 3;

  public static void main(String[] args)
  {
      Thing[] stuff = new Thing[max_no_things];
      stuff[0] = new RoundThing("Blue", 4);
      stuff[1] = new SquareThing("Purple", 5);
      stuff[2] = new RectangleThing("Red", 7, 3);
      for(int i = 0; i < max_no_things; i++)
      {
        System.out.println(stuff[i].getColour());
      }
  }
}
