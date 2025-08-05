package SetCollection;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		
		//Create a HashSet using the Hashset() Constructor
		//Add new elements to it using the add() method
		
		Set<String> empName=new HashSet<>();
		//Hashset is unordered collection
		empName.add("Sakthi");
		empName.add("Sowndarya");
		empName.add("Navin");
		empName.add("Prabha");
		empName.add("Kavya");
		empName.add("Sundar");
		
		System.out.println(empName);

		//Adding duplicate element
		empName.add("Sakthi");
		System.out.println(empName); //This will replace the existing one and duplicate not added.
		
		
	}

}
