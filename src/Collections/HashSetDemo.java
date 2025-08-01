package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	//It is not contains duplicate value
	private static void duplicateValue() {
		
		Set<String> st=new HashSet<>();
		st.add("Element 1");
		st.add("Element 1");
		//System.out.println(st);
		System.out.println(st.toString()); //toString will be used to represent the string output
	}
	
	//can contain only one null value
	private static void nullvaluedemo() {
		Set<String> st=new HashSet<>();
		st.add(null);
		st.add(null);
		st.add(null);
		System.out.println(st.toString()); //Only one null
	}
	
	//It is unordered collection
	private static void unordereddemo() {
		Set<String> st=new HashSet<>();
		
		st.add("Element1");
		st.add("Element3");
		st.add("Element5");
		st.add("Element4");
		st.add("Element2");
		st.add("Element7");
		st.add("Element6");

		System.out.println(st); //Values are mixed 
	}
	
	public static void main(String[] args) {
		
		HashSetDemo hash=new HashSetDemo();
		hash.duplicateValue();  //Only one printed
		
		hash.nullvaluedemo();
		
		hash.unordereddemo();
		

	}

}
