public class TestStuff
{
	public static void main(String[] args)
	{
		Thing squircle = new RoundThing("Blue", 10);
		Thing blockBoi = new SquareThing("Green", 2);
		Thing longBoi = new RectangularThing("Purple", 7, 4);
		
		System.out.println(squircle.toString() + "\nI have an area of: " + squircle.calculateArea() + "\nAnd a circumfrence of: " + squircle.calculateCircumfrence());
		System.out.println(blockBoi.toString() + "\nI have an area of: " + blockBoi.calculateArea());
		System.out.println(longBoi.toString() + "\nI have an area of: " + longBoi.calculateArea());
	}
}