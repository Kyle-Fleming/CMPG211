public class Student
{
  private String id;
  
  private String name;
  
  private String email;
  
  private String status;

  public Student()
  {
    this("", "", "", "");
  }
  
  public Student(String id, String name, String email, String status)
  {
    setId(id);
    setName(name);
    setEmail(email);
    setStatus(status);

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
  public String getStatus()
  {
    return status;
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

  public void setStatus(String status)
  {
    this.status = status;
  }
  public String toString()
  {
    return "ID: " + getId() + " \nName: " + getName() + " \nEmail: " + getEmail() + " \nStatus: " + getStatus();
  }

  public static void main(String[] args)
  {
    Student sTest = new Student();
    System.out.println("Default student class: ");
    System.out.println(sTest.toString());
    Student s1 = new Student("30279445","Kyle Fleming","kyle@gmail.com","Undergrad");
    System.out.println("\n\nCompleted student class:\n");
    System.out.println(s1.toString());

  }
}
