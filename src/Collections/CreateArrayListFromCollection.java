package Collections;

import java.util.ArrayList;
import java.util.List;

//Create an array list from another collection using the ArrayList(Collection c)Constructor

//Add all elements from the collection to the new ArrayList using the addAll() method.

public class CreateArrayListFromCollection {

	public static void main(String[] args) {
		
		List<Integer> primenum = new ArrayList<>();
		
		primenum.add(2);
		primenum.add(3);
		primenum.add(5);
		primenum.add(7);
		primenum.add(11);
		
		List<Integer> primenum2=new ArrayList<>(primenum); //Mentioned the previous obj to this array constructor to add.
		
		List<Integer>primenum3=new ArrayList<>(); //created another array
		
		primenum3.add(13);
		primenum3.add(17);
		primenum3.add(19);
		primenum3.add(23);
		primenum3.add(29);
		
		primenum2.addAll(primenum3); //Called the 2nd array and added the 3rd array details in argument.
		
		System.out.println(primenum2); //Printed overall array1+array3 in array2



		

		
		

	}

}
