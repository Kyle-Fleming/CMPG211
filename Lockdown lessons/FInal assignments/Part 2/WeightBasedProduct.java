//FlemingKA 30279445

public class WeightBasedProduct extends Product
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int weight;

   public WeightBasedProduct()
   {
      this("000000000000", "", 0, 0);
   }

   public WeightBasedProduct(String no, String nm, int up, int we)
   {
      super(no, nm, up);
      setWeight(we);
   }

  
   
   public void setWeight(int we)
   {
       this.weight = we;
   }

   

   public int getWeight()
   {
       return weight;
   }

   public String getRecord()
   {
      return "Barcode "+getBarcodeNumber()+" is "+getName()+", unit price "+getUnitPrice()+"c/Kg" + " ,weight "+getWeight() + " grams";
   }

   public int calculateTotalCost(int tax)
   {
      
      return  (int)(getUnitPrice() * (getWeight()/1000.0)) + calculateTax(tax);      
   }

  

   public int calculateTax(int taxRate)
   {
       return (int)(getUnitPrice() * (getWeight()/1000.0) * TAXRATE/100); 
   }

   public int compareTo(Product other)
   {
        String thisField = getBarcodeNumber().charAt(0) + getName() + getWeight();
        String otherField;

        if(other instanceof WeightBasedProduct)
        {
            otherField = other.getBarcodeNumber().charAt(0)+ other.getName() + ((WeightBasedProduct)other).getWeight();
        }
        else
            otherField = other.getBarcodeNumber().charAt(0) + other.getName();

        return thisField.compareTo(otherField);
   }

   public static void main(String[] args)
   {
      WeightBasedProduct i1 = new WeightBasedProduct("245134342474","Bananas",4300,450);
      System.out.println(i1.getRecord());
   }
}