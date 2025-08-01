package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		
		//Allows to add duplicate elements 
		list.add("Element 1");
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 2");
		System.out.println(list.getFirst());
		System.out.println(list.contains("Element 3"));
		
		//Allows to add null values 
		list.add(null);
		list.add(null);
		//System.out.println(list);
		
		//Insertion order - don't change the value
		list.add("Element 3");
		list.add("Element 1");
		System.out.println(list);
		
		
		//Access list elements
		System.out.println((list.get(0)));

	}

}
