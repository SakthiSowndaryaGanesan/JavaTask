package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorHashSet {

	public static void main(String[] args) {

		Set<String> subject =new HashSet<>();
		
		subject.add("Tamil");
		subject.add("English");
		subject.add("Maths");
		subject.add("EVS");
		subject.add("Biology");
		
		//forEach also called us enhanced for loop
		for (String str : subject) {
			System.out.println(str);
		}
		
		//Basic loop with iterator
		for (Iterator iterator = subject.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			
			System.out.println(str);
		}
		
		Iterator <String> it=subject.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			
			System.out.println("While iterator : "+ str);
		}
		
		//JDK 8 forEach () method with lambda
		subject.forEach(str -> System.out.println("Lambda : " + str));
		
		//JDK 8 streaming + forEach() + Lambda expression
		subject.stream().filter(sub -> !"Tamil".equals(sub))
		.forEach(sub -> System.out.println(sub));
		
	}

}
