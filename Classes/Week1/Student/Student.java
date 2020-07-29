public class Student
{
  /**
   * @author Kye Fleming
   @version 0.9
  */
  //Data field: value id of the Student
  private String id;
  //Data field: Name of the Student
  private String name;
  //Data field: Email of the student
  private String email;
  //Data field: Status of the student
  private String status;

  public Student()
  {
    this("", "", "", "");
  }
  /** constructs student object with specified id, name, email and status
  @param id of the student
  @param Name of the student
  @param Email of the student
  @param Status of the student
  */
  public Student(String id, String name, String email, String status)
  {
    setId(id);
    setName(name);
    setEmail(email);
    setStatus(status);

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
  /**returns status of the Student
  @return Status;
  */
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
  /**returns concatenated string of the Student
  */
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
