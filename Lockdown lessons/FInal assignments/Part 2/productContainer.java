import java.util.Arrays;

public class productContainer
{
	private Product[] container;
	private int capacity;
	private int numberOfThings;
	
	public productContainer()
	{
		this(25);
	}
	public productContainer(int capacity)
	{
		container = new Product[capacity];
		setCapacity(capacity);
		setNumberOfThings(0);
	}
	//set methods
	private void setCapacity(int cap)
	{
		capacity = cap;
	}
	private void setNumberOfThings(int num)
	{
		numberOfThings = num;
	}
	
	//get methods
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public int getNumberOfProducts()
	{
		return numberOfThings;
	}
	
	//container stuff
	
	public boolean isFull()
	{
		return getNumberOfProducts() == getCapacity();
	}
	
	public void addThing(Product newThing)
	{
		if(isFull())
		{
			grow();
		}
		container[numberOfThings] = newThing;
		setNumberOfThings(numberOfThings + 1);
	}
	
	public Product getThing(int index)
	{
		return container[index];
	}
	
	public void sort()
	{
		trim();
		Arrays.sort(container);
	}
	
	public void trim()
	{
		
		Product[] temp = new Product[getNumberOfProducts()];
		for(int i =0; i<getNumberOfProducts(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfProducts());
	}
	
	public void grow()
	{
		
		Product[] temp = new Product[getNumberOfProducts()*2];
		for(int i =0; i<getNumberOfProducts(); i++)
		{
			temp[i] = container[i];
		}
		container = temp;
		setCapacity(getNumberOfProducts()*2);
	}
	
}