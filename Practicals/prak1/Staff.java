public class Staff
{
  private String id;
  private String name;
  private String email;
  private String title;
  private String office;

  public Staff()
  {
    this("", "", "", "", "");
  }
  public Staff(String id, String name, String email, String title, String office)
  {
    setId(id);
    setName(name);
    setEmail(email);
    settitle(title);
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
  public String gettitle()
  {
    return title;
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
  public void settitle(String title)
  {
    this.title = title;
  }
  public void setOffice(String office)
  {
    this.office  = office;
  }

  public String toString()
  {
    return "ID: " + getId() + "\nName: " + getName() + " \nEmail: " + getEmail() + " \ntitle: " + gettitle() + "\nOffice: " + getOffice();
  }

  public static void main(String[] args)
  {
    Staff sf1 =  new Staff();
    System.out.println("This is a default Staff class: \n");
    System.out.println(sf1.toString());
    Staff Staff1 = new Staff("25079343","David Bowie","bowiemail@gmail","SysAdmin", "g7 k01");
    System.out.println("\n\nThis is a Completed Staff class: \n");

    System.out.println(Staff1.toString());

  }
}
