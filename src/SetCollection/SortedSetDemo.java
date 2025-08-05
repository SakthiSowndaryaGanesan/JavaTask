package SetCollection;

import java.util.SortedSet;
import java.util.TreeSet;

//Internally all the elements will be sorted. 
public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet <Integer> sset=new TreeSet<>();
		
		sset.add(19);
		sset.add(9);
		sset.add(5);
		sset.add(10);
		sset.add(50);
		sset.add(19); //No duplicate
System.out.println(sset); //Sorted output.
System.out.println(sset.first());//First element
System.out.println(sset.last());//Last element

System.out.println(sset.headSet(19)); //Before 19 all the elements will be printed
System.out.println(sset.tailSet(10)); //After 10 all the elements will be printed including the element

System.out.println(sset.subSet(9, 50)); // 9 to 50 will be printed including the first element 9.


	}

}
