package SetCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {

		LinkedHashSet <Integer> num = new LinkedHashSet<>();
		
		//Adding
		num.add(2);
		num.add(4);
		num.add(6);
		System.out.print("The num : ");
		
		num.remove(0); //No index access. only element access.
		System.out.print("The num : ");

		
		Iterator <Integer> it= num.iterator();
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			
			System.out.print(integer +",");
		}

		
	}

}
