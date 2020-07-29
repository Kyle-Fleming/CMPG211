//FlemingKA 30279445
public class ItemBasedProduct extends Product
{

   /**
    *
    */
   private static final long serialVersionUID = 1L;
   private String manufacturer;

   public ItemBasedProduct()
   {
      this("000000000000","",0,"");
   }

   public ItemBasedProduct(String no, String nm, int up, String man)
   {
      super(no, nm, up);
      setManufacturer(man);
   }

   public void setManufacturer(String man)
   {
      manufacturer = man;
   }

   public String getManufacturer()
   {
      return manufacturer;
   }

   public int calculateTotalCost(int tax)
   {
      return getUnitPrice() + calculateTax(getUnitPrice(), tax);      
   }

   public String getRecord()
   {
      return "Barcode "+getBarcodeNumber()+" is "+getName()+" from "+getManufacturer()+", unit price "+getUnitPrice()+"c";
   }

   public int compareTo(Product other)
   {
       String thisField = getBarcodeNumber().charAt(0) + getName();
       String otherField;
       char otherProductCode = other.getBarcodeNumber().charAt(0);
       if(otherProductCode == '2')
       {
           otherField = otherProductCode + other.getName() + ((WeightBasedProduct)other).getWeight();
       }
       else
        otherField = otherProductCode + other.getName();
      return thisField.compareTo(otherField);
   }

   public static void main(String[] args)
   {
      ItemBasedProduct i1 = new ItemBasedProduct("167832345047","Tuna",1500,"I&J");
      System.out.println(i1.getRecord());
   }
}