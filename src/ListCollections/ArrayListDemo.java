package ListCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Created arraylist object
		
		List<String> fruits=new ArrayList <>(); //array constructor.Initial capacity 10. 
		
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add(null); // Allows null value
		
		System.out.println(fruits);
		System.out.println((fruits.add("Apple")));
		System.out.println((fruits.add("Jack")));

		System.out.println(fruits);
//		fruits.clear();
		System.out.println(fruits);
		
		System.out.println("----------------");
		Iterator it = fruits.iterator();
		
		while (it.hasNext()) {
 System.out.println(it.hasNext());			
		}
	}

}
