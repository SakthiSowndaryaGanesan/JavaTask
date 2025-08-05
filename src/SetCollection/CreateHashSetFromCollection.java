package SetCollection;

import java.util.HashSet;
import java.util.Set;

//Create a HashSet from another collection using the Hashset(collection c) constructor
//Add all the elements from a collection to the HashSet using the addAll() method.

public class CreateHashSetFromCollection {

	public static void main(String[] args) {
		
		//first five even number.
		
		Set<Integer> firstEvenNum = new HashSet<>();
		
		firstEvenNum.add(2);
		firstEvenNum.add(4);
		firstEvenNum.add(6);
		firstEvenNum.add(8);
		firstEvenNum.add(10);
		System.out.println(firstEvenNum);
		
		Set<Integer> tenEvenNum =new HashSet<>(firstEvenNum);
		
		Set<Integer> nextEvenNum=new HashSet<>();
		nextEvenNum.add(12);
		nextEvenNum.add(14);
		nextEvenNum.add(16);
		nextEvenNum.add(18);
		nextEvenNum.add(20);
		
//addAll method to add the elements
		
		tenEvenNum.addAll(nextEvenNum); //Adding 
		System.out.println(tenEvenNum);


		
	}

}
