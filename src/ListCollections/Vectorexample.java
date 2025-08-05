package ListCollections;

import java.util.Vector;

public class Vectorexample {

	public static void main(String[] args) {

		Vector v=new Vector<>();
		
		v.add(20);
		v.addElement(30);
		v.add(40);
		v.add(50);
		v.add("Sakthi");
		System.out.println(v);
		
		v.remove(3); //3rd index removed
		System.out.println(v);
	
		System.out.println("Capacity : " + v.capacity()); //To know the capacity. In array which is not available.
		v.add("Hi");
		v.add("Hello");
		v.add(true);
		v.add(null);
		v.add(90);
		v.add(100);
		v.add(12);
		System.out.println(v);
		System.out.println("Capacity : " + v.capacity()); //Now capacity was changed to 20.
		
		
		
		
		


		
		
	
	}

}
