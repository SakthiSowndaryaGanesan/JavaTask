package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(50);
		
		Collections.sort(list); //Ascending order. Needs to import the collection package.
		System.out.println(list);
		
		Collections.reverse(list); //Descending order to reverse.
		System.out.println(list);
		
	System.out.println((Collections.max(list))); //Max list element.
		

	}

}
