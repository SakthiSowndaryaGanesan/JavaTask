package Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	private static final List UNMODIFIABLE_LIST = new ArrayList<>(Arrays.asList("hello")); 
	
	public static void main(String[] args) { 	
		
			UNMODIFIABLE_LIST.add("world");
		
	  System.out.println((UNMODIFIABLE_LIST));
	}

}
