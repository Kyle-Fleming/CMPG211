public class Staff 
{
  //Data field: value id of the Staff

  private String id;
  //Data field: value name of the Staff

  private String name;
  //Data field: value email of the Staff

  private String email;
  //Data field: value title of the Staff

  private String title;
  //Data field: value office of the Staff

  private String office;

  public Staff()
  {
    this("", "", "", "", "");
  }
  /** constructs Staff object with specified id, name, email and status
  @param id of the Staff
  @param Name of the Staff
  @param Email of the Staff
  @param title of the Staff
  @param office of the staff
  */
  public Staff(String id, String name, String email, String title, String office)
  {
    setId(id);
    setName(name);
    setEmail(email);
    settitle(title);
    setOffice(office);

  }
/**returns office of the staff
@return office;
*/
  public String getOffice()
  {
    return office;
  }
  /**returns id of the Staff
  @return id;
  */
  public String getId()
  {
    return id;
  }
  /**returns Name of the Staff
  @return name;
  */
  public String getName()
  {
    return name;
  }
  /**returns Email of the Staff
  @return email;
  */
  public String getEmail()
  {
    return email;
  }
  /** returns title of the staff
@return title;
  */
  public String gettitle()
  {
    return title;
  }



/**sets id to parameter this.id
@param id of the staff
*/
  public void setId(String id)
  {
    this.id = id;
  }
  /**sets name to parameter this.id
  @param name of the staff
  */
  public void setName(String name)
  {
    this.name = name;
  }
  /**sets email to parameter this.id
  @param email of the staff
  */
  public void setEmail(String email)
  {
    this.email = email;
  }
  /**sets title to parameter this.id
  @param title of the staff
  */
  public void settitle(String title)
  {
    this.title = title;
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
