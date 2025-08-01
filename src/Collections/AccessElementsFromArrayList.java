package Collections;

import java.util.ArrayList;
import java.util.List;

//isEmpty() , size() , get() , set()

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		
		List<String> language =new ArrayList<>();
		
		System.out.println("Is the language lisy empty ? " +language.isEmpty()); //True 
		
		language.add("Tamil");
		language.add("English");
		language.add("Kannada");
		language.add("Telugu");
		language.add("Hindi");
		System.out.println("Is the language lisy empty ? " +language.isEmpty()); //False
		System.out.println("Size :" +language.size()); //Size
		
		//Retrieve elements
		String Oldestlanguage = language.get(0); //In particular index
		System.out.println(Oldestlanguage);
		
		//Modify the given at given index
		
		language.set(1, "Spanish");
		System.out.println(language);
		
	System.out.println((language.contains("English"))); //checking the details
		
		



		
	}

}
