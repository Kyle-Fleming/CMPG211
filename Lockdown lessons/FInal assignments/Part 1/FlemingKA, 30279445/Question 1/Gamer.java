import java.util.Random;

abstract class Gamer implements Calculable
{
    String id, name;
    
    
    public Gamer()
    {
        this("", "");
    }

    public Gamer(String id, String name)
    {
        setID(id);
        setName(name);
    }

    public void setID(String ID)
    {
        this.id = ID;
    }

    public void setName(String nm)
    {
        this.name = nm;
    }

   public String getID()
   {
       return id;
   }

   public String getName()
   {
       return name;
   }
   public abstract int calculateAge();

}