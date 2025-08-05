package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet <String> tset = new TreeSet<>();
		
		tset.add("23");
		tset.add("Sakthi");
		tset.add("Sowndaraya");
		tset.add("10");
		tset.add("49");
		tset.add("Sakthi");
		tset.add("54");
		
		System.out.println(tset); // Same sorted output.
		
		tset.remove("10"); //Element removed.
		
		Iterator <String> it = tset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " , ");
		}
		System.out.println("\n");
		
		System.out.println(tset.first());
		System.out.println(tset.last());
		System.out.println(tset.pollFirst());
		System.out.println(tset.pollLast());
		System.out.println(tset.isEmpty());
		System.out.println(tset.headSet("54"));
		System.out.println(tset.tailSet("Sakthi"));
     	//System.out.println(tset.subSet("Sakthi","49"));


		
		

	}

}
