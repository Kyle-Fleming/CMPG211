public class Person
{
  private String id;
  private String name;
  private String email;

//00000000
  public Person()
  {
    this("", "", "");
  }

  public Person(String id, String name, String email)
  {
    setId(id);
    setName(name);
    setEmail(email);
  }

  /**returns id of the Student
  @return id;
  */
  public String getId()
  {
    return id;
  }
  /**returns Name of the Student
  @return Name;
  */
  public String getName()
  {
    return name;
  }
  /**returns Email of the Student
  @return Email;
  */
  public String getEmail()
  {
    return email;
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

  public String toString()
  {
    return "ID: " + getId() + " \nName: " + getName() + " \nEmail: " + getEmail();
  }

  public static void main(String[] args)
  {
    Person sTest = new Person();
    System.out.println("Default student class: ");
    System.out.println(sTest.toString());
    Person s1 = new Person("30279445","Kyle Fleming","kyle@gmail");
    System.out.println("\n\nCompleted student class:\n");
    System.out.println(s1.toString());

  }
}
