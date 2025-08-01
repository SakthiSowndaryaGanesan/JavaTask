package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearch {

	public static void main(String[] args) {

		LinkedList<String> program=new LinkedList<>();
		
		program.add("C");
		program.add("C++");
		program.add("Core Java");
		program.add("Spring Framework");
		program.add("C#");
		program.add("C#");
		program.add(".Net");
		
		boolean result=program.contains("C"); //Checking
		System.out.println("Result :"+result);
		
		//Find the index of the elements
		int index =program.indexOf("Core Java");
		System.out.println("Index : "+index);
		
		//Last occurrence of an element in the list.
		int lastindex=program.lastIndexOf("C#"); //Getting the occurrence
		System.out.println(lastindex); 
		
		//Iterator , forEach , forEach advanced loop , simple for loop
		
	Iterator<String> iterator = program.iterator();
	while (iterator.hasNext()) {
		String prg = (String) iterator.next();
		System.out.println(prg);
	}
	
	//ForEach
	program.forEach((element)->{System.out.println(element);});
	
	//forEach Advanced loop
	for (String str : program) {System.out.println(str);}
	
	
	
	
}
}
