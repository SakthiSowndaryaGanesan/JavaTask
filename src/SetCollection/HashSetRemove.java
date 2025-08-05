package SetCollection;

import java.util.HashSet;
import java.util.Set;

//remove() , removeAll(), clear()
public class HashSetRemove {

	public static void main(String[] args) {
		
		Set<Integer> num=new HashSet<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		
		//Using remove()
		
		num.remove(3); //Not index value. element 3 is removed here.
		System.out.println(num);
		
		//Remove all()
		
		Set<Integer> evenNumList = new HashSet<>();
		evenNumList.add(2);
		evenNumList.add(4);
		evenNumList.add(6);
		evenNumList.add(8);
		
		num.removeAll(evenNumList);
		System.out.println("Remove All : "+num);

		//clear() method
		num.clear();
		System.out.println("Cleared : "+num);
	}

}
