package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayList {

	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C" , "Java" , "Python" , "C++");
		
		//Basic for loop
		for (int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		
		//Enhanced for each Loop
		for(String c:courses) {
			System.out.print(c + " ");
		}
		
		//Basic loop with iterator
		for(Iterator i=courses.iterator();i.hasNext();) {
			String course=(String)i.next();
		System.out.println(course);	
		}
		
		//iterator with while loop
		Iterator i=courses.iterator();
		while (	i.hasNext()) {
			String course = (String) i.next();
			System.out.println(course);
		}

		//Java 8 Stream + Lambda example
		courses.stream().forEach(course -> System.out.println(course));
		
		//Java 8 forEach + Lambda
		courses.forEach((course) ->System.out.println(course));
		
	}

}
