import java.util.Random;

public class AmGamer extends Gamer
{
    int category;

    //constructors
    public AmGamer()
    {
        this("", "", 0);
    }

     public AmGamer(String id, String name, int category)
    {
       super(id, name);
       setCategory(category);
    }

    //set methods
    public void setCategory(int cat)
    {
        this.category = cat;
    }

    //get methods
    public int getCategory()
    {
        return category;
    }

    public String getCode()
    {
        Random idRand= new Random();
        int tempAge = calculateAge();
        
        return "A" + String.format("%02d", idRand.nextInt(99)) + String.format("%02d", tempAge) + "-" + category;
    }

    //calculations, toString and main
    public double calculateDiscount(int rate)
    {
        if (calculateAge() <= 18)
        {
            return rate*0.25;
        }
        else
            return 0;
    }

    public int calculateAge()
    {
        int age = 1;
        String year = getID().substring(0, 2);
        int yearActual = Integer.parseInt(String.valueOf(year));
    
        if(yearActual < 20);
        {
            age = 2020 - (2000 + yearActual); 
        }
        if(yearActual > 20)
        {
            age = 2020 - (1900 + yearActual);
        }
        return age;
    }

    public String toString()
    {
		String namePad = String.format("%-22s", getName());
        String catPad = String.format("%-10s", getCategory());
        
        return getCode() + "       " + getID() + "  " +namePad + catPad;
    }

    public static void main(String[] args)
    {
        Gamer ag1 = new AmGamer("021206","Tom Sawyer",2);
        Gamer ag2 = new AmGamer("921116","Frank N Furter",3);
        Gamer ag3 = new AmGamer("951211","Rick Blaine",3);
        Gamer ag4 = new AmGamer("040725","John Locke",1);
        Gamer ag5 = new AmGamer("990412","Dorian Gray",2);
        Gamer ag6 = new AmGamer("080517","Maxwell Klinger",1);
        
        int amFee = 250;

        System.out.printf("\nAmateur gamers\nCode       ID number  Name                  Category  Registration fee  Discount\n");
        System.out.println(ag1+"         R "+(amFee-ag1.calculateDiscount(amFee))+"             R "+ag1.calculateDiscount(amFee));
        System.out.println(ag2+"         R "+(amFee-ag2.calculateDiscount(amFee))+"             R "+ag2.calculateDiscount(amFee));
        System.out.println(ag3+"         R "+(amFee-ag3.calculateDiscount(amFee))+"             R "+ag3.calculateDiscount(amFee));
        System.out.println(ag4+"         R "+(amFee-ag4.calculateDiscount(amFee))+"             R "+ag4.calculateDiscount(amFee));
        System.out.println(ag5+"         R "+(amFee-ag5.calculateDiscount(amFee))+"             R "+ag5.calculateDiscount(amFee));
        System.out.println(ag6+"         R "+(amFee-ag6.calculateDiscount(amFee))+"             R "+ag6.calculateDiscount(amFee));
        System.out.println("\n\n\n\n");
    }

}