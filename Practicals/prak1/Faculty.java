public class Faculty
{
  private String id;
  private String name;
  private String email;
  private String rank;
  private String office;

  public Faculty()
  {
    this("", "", "", "", "");
  }
  public Faculty(String id, String name, String email, String rank, String office)
  {
    setId(id);
    setName(name);
    setEmail(email);
    setRank(rank);
    setOffice(office);

  }
  public String getOffice()
  {
    return office;
  }
  public String getId()
  {
    return id;
  }
  public String getName()
  {
    return name;
  }
  public String getEmail()
  {
    return email;
  }
  public String getRank()
  {
    return rank;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public void setEmail(String email)
  {
    this.email = email;
  }
  public void setRank(String rank)
  {
    this.rank = rank;
  }
  public void setOffice(String office)
  {
	this.office  = office;
  }

  public String toString()
  {
    return "ID: " + getId() + " \nName: " + getName() + " \nEmail: " + getEmail() + " \nRank: " + getRank() + " \nOffice: " + getOffice();
  }

  public static void main(String[] args)
  {
    System.out.println("This is a default class");
    Faculty fac11 = new Faculty();
    System.out.println(fac11.toString());
    Faculty Faculty1 = new Faculty("30279445","Gavin","gg@gmail","Senior", "g1 201");
    System.out.println("\n\n-----------These are the completed faculty details: -----------\n\n");
    System.out.println(Faculty1.toString());

  }
}
