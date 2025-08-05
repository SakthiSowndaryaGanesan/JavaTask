package QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(3);
		dq.addFirst(2);
		dq.addLast(4);
		dq.offerFirst(1);  //We can add and delete from the both side.
		dq.add(5);
		dq.addFirst(0);
		
		System.out.println("Added elements : " + dq); 
		
		//Remove
		
		System.out.println("First Element : " + dq.pollFirst()); //Poll, pollFirst will display and then remove.
		System.out.println(dq); //0 removed
		
		System.out.println("Last elemet : " + dq.pollLast());
		System.out.println(dq); //5 removed
		
		System.out.println(dq.peekFirst()); //Display the element
		System.out.println(dq);
		
		System.out.println(dq.peekLast()); //Display Last
		System.out.println(dq); 

	}

}
