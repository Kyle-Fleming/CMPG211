public class Faculty 
{
  /**
   * @author Kye Fleming
   @version 0.9
  */
  //Data field: value id of the Faculty
  private String id;
  //Data field: Name of the Faculty
  private String name;
  //Data field: Email of the Faculty
  private String email;
  //Data field: rank of the Faculty
  private String rank;
  //Data field: office of the Faculty
  private String office;

  public Faculty()
  {
    this("", "", "", "", "");
  }
  /** constructs faculty object with specified id, name, email and status
  @param id of the faculty
  @param name of the faculty
  @param email of the faculty
  @param rank of the faculty
  @param office of the Faculty
  */
  public Faculty(String id, String name, String email, String rank, String office)
  {
    setId(id);
    setName(name);
    setEmail(email);
    setRank(rank);
    setOffice(office);

  }
  /**returns id of the faculty
  @return office;
  */
  public String getOffice()
  {
    return office;
  }
  /**returns id of the faculty
  @return id;
  */
  public String getId()
  {
    return id;
  }
  /**returns Name of the faculty
  @return Name;
  */
  public String getName()
  {
    return name;
  }
  /**returns Email of the faculty
  @return email;
  */
  public String getEmail()
  {
    return email;
  }
  /**returns rank of the faculty
  @return rank;
  */
  public String getRank()
  {
    return rank;
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
    /**sets rank to parameter this.id
    @param rank of the facutly
    */
    public void setRank(String rank)
    {
      this.rank = rank;
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
