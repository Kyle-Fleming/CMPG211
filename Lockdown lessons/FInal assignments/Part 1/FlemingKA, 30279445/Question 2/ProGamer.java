public class ProGamer extends Gamer
{
    int years, rank;
    

    public ProGamer()
    {
        this("", "", 0, 0);
    }

    public ProGamer(String id, String name, int years, int rank)
    {
        super(id, name);
        setYears(years);
        setRank(rank);
    }

    //set methods
    public void setYears(int ye)
    {
        this.years = ye;
    }

    public void setRank(int R)
    {
        this.rank = R;
    }

    //get methods
    public int getYears()
    {
        return years;
    }

    public int getRank()
    {
        return rank;
    }

    //calculations, toString and main methods
    public double calculateDiscount(int rate)
    {
        double discount = 0;
        if(getYears() < 10)
        {
            discount = (rate * (0.05 * getYears()));

        }
        else if(getYears() > 9)
        {
            discount = rate * 0.5;
        }
        return discount;

    }
    public int calculateAge()
    {
        int age = 1;
        String year = getID().substring(0, 2);
        int yearActual = Integer.parseInt(String.valueOf(year));
    
        if(yearActual < 20);
        {
            age = 2020 - (2000 + yearActual); 
        }
        if(yearActual > 20)
        {
            age = 2020 - (1900 + yearActual);
        }
        return age;
    }
    public String getCode()
    {
        int yrs = getYears();
        return "P"+ getRank() + calculateAge() + "-" + String.format("%02d", yrs) ;
    }
    public String toString()
    {
        String namePad = String.format("%-22s", getName());
        String yearPad = String.format("%-7s", getYears());
        return getCode() +"       " + getID() + "  "+namePad + yearPad + " " + getRank();
    }

    public static void main(String[] args)
    {
        Gamer pg1 = new ProGamer("840725","James Ford",12,56);
        Gamer pg2 = new ProGamer("950826","Jonathan Harker",8,34);
        Gamer pg3 = new ProGamer("910929","Hawkey Pierce",13,65);
        Gamer pg4 = new ProGamer("930815","Mina Harker",11,45);
        Gamer pg5 = new ProGamer("860428","Ilsa Lund",18,75);
        Gamer pg6 = new ProGamer("990515","Allan Quatermain",4,25);

        int proFee = 500;
        System.out.printf("\n\n\nProfessional gamers\nCode       ID number  Name                  Years  Rank  Registration fee  Discount\n");
        System.out.println(pg1+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg1.calculateDiscount(proFee));
        System.out.println(pg2+"    R "+(proFee-pg2.calculateDiscount(proFee))+"             R "+pg2.calculateDiscount(proFee));
        System.out.println(pg3+"    R "+(proFee-pg3.calculateDiscount(proFee))+"             R "+pg3.calculateDiscount(proFee));
        System.out.println(pg4+"    R "+(proFee-pg4.calculateDiscount(proFee))+"             R "+pg4.calculateDiscount(proFee));
        System.out.println(pg5+"    R "+(proFee-pg5.calculateDiscount(proFee))+"             R "+pg5.calculateDiscount(proFee));
        System.out.println(pg6+"    R "+(proFee-pg6.calculateDiscount(proFee))+"             R "+pg6.calculateDiscount(proFee));
    }

    
}