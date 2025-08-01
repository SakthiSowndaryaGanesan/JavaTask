package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyInWriteArrayListDemo {

	public static void main(String[] args) {

		List<String> list=new CopyOnWriteArrayList<>(); //If normal ArrayList used means there will be an error Concurrent modification.
		
		list.add("one");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		Iterator <String>iterator=list.iterator();
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
			
			if (str.equals("One")) {
				list.remove("One");
			}
			if(str.equals("Two")) {
				list.add("Four");
			}
		}
		System.out.println(list);
		}
	}


