import java.util.Scanner;

public class peopleApplication
{
	public static void main(String[] args)
	{
		UniversityPopulation myFriends = new UniversityPopulation(10);
		
		Scanner input = new Scanner(System.in);
		String id, name, email, addressVar;
		
		while (input.hasNext())
		{
			id = input.next();
			name = input.next();
			email = input.next();
			
			addressVar = input.nextLine();
			Address address = new Address(addressVar);
			
			myFriends.addPerson(new Person(id, name, email, address));
		}
		System.out.println("\nBefore sorting");
		System.out.println();
		System.out.println("Capacity of container: " + myFriends.getCapacity());
		System.out.println("Number of Things in container: " + myFriends.getNumberOfPeople());
		
		for(int i=0; i<myFriends.getNumberOfPeople(); i++)
		{
			System.out.println(myFriends.getPerson(i));
		}
		
		myFriends.sort();
		System.out.println("\nAfter sorting");
		System.out.println("Capacity of container: " + myFriends.getCapacity());
		System.out.println("Number of Things in container: " + myFriends.getNumberOfPeople());
		
		
		for(int i=0; i<myFriends.getNumberOfPeople(); i++)
		{
			System.out.println(myFriends.getPerson(i));
		}
		
	}
}