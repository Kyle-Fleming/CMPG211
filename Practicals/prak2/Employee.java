public class Employee extends Person

{
  /**
   * @author Kye Fleming
   @version 0.9
  */
  //Data field: office of the Employee
  private String office;

  public Employee()
  {
    this("", "", "", "");
  }
  /** constructs Employee object
  @param office of the Employee
  */
  public Employee(String id, String name, String email, String rank)
  {
    super(id, name, email, rank);

  }
  /**returns id of the Employee
  @return office;
  */
  public String getOffice()
  {
    return office;
  }
    /**sets office to parameter this.office
    @param office of the staff
    */
    public void setOffice(String office)
    {
      this.office  = office;
    }

  public String toString()
  {
    return "\nOffice: " + getOffice();
  }

  public static void main(String[] args)
  {
    System.out.println("This is a default class");
    Employee fac11 = new Employee();
    System.out.println(fac11.toString());
    Employee Employee1 = new Employee("g1 201");
    System.out.println("\n\n-----------These are the completed Employee details: -----------\n\n");
    System.out.println(Employee1.toString());

  }
}
