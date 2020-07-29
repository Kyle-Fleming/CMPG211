public class TestClasses2
{  
   public static void main(String[] args)
   {
      Gamer pg1 = new ProGamer("8460725","James Ford",12,56);
      Gamer pg2 = new ProGamer("9526","Jonathan Harker",8,34);
      Gamer pg3 = new ProGamer("910929","Hawkey Pierce",13,65);
      Gamer pg4 = new ProGamer("930815","Mina Harker",11,45);
      Gamer pg5 = new ProGamer("860428","Ilsa Lund",18,75);
      Gamer pg6 = new ProGamer("9a90515","Allan Quatermain",4,25);
      Gamer ag1 = new AmGamer("021206","Tom Sawyer",2);
      Gamer ag2 = new AmGamer("921116","Frank N Furter",3);
      Gamer ag3 = new AmGamer("951211","Rick Blaine",3);
      Gamer ag4 = new AmGamer("040725","John Locke",1);
      Gamer ag5 = new AmGamer("990412","Dorian Gray",2);
      Gamer ag6 = new AmGamer("080517","Maxwell Klinger",1);
      
      int proFee = 500;
      int amFee = 250;
      System.out.printf("\n\n\nProfessional gamers\nCode       ID number  Name                  Years  Rank  Registration fee  Discount\n");
      System.out.println(pg1+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg1.calculateDiscount(proFee));
      System.out.println(pg2+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg2.calculateDiscount(proFee));
      System.out.println(pg3+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg3.calculateDiscount(proFee));
      System.out.println(pg4+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg4.calculateDiscount(proFee));
      System.out.println(pg5+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg5.calculateDiscount(proFee));
      System.out.println(pg6+"    R "+(proFee-pg1.calculateDiscount(proFee))+"             R "+pg6.calculateDiscount(proFee));
      System.out.printf("\nAmateur gamers\nCode       ID number  Name                  Category  Registration fee  Discount\n");
      System.out.println(ag1+"         R "+(amFee-ag1.calculateDiscount(amFee))+"             R "+ag1.calculateDiscount(amFee));
      System.out.println(ag2+"         R "+(amFee-ag2.calculateDiscount(amFee))+"             R "+ag2.calculateDiscount(amFee));
      System.out.println(ag3+"         R "+(amFee-ag3.calculateDiscount(amFee))+"             R "+ag3.calculateDiscount(amFee));
      System.out.println(ag4+"         R "+(amFee-ag4.calculateDiscount(amFee))+"             R "+ag4.calculateDiscount(amFee));
      System.out.println(ag5+"         R "+(amFee-ag5.calculateDiscount(amFee))+"             R "+ag5.calculateDiscount(amFee));
      System.out.println(ag6+"         R "+(amFee-ag6.calculateDiscount(amFee))+"             R "+ag6.calculateDiscount(amFee));
      System.out.println("\n\n\n\n");
   }   
}