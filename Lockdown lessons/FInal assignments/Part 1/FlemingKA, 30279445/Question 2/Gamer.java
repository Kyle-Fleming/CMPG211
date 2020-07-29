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

    public void setID(String ID) throws InvalidIdException
    { 
        if (ID.contains("[a-zA-Z]+") == false)
        {
            if(ID.length() ==6)
            {
                this.id = ID;
            }
            else
                throw new InvalidIdException("ID value: " + ID + " is not the correct length, can only be 6 digits");
        }
        

        else
            throw new InvalidIdException("ID value: " + ID + " is not the correct format, can only contain digits");
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