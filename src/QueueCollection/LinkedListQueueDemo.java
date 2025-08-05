package QueueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		
		Queue <Integer> que1=new LinkedList<>();
		
		que1.add(32);
		que1.offer(67);
		que1.add(21); //Offer and add will do the same thing which is adding the details.
		que1.add(22);
		que1.offer(9);
		System.out.println("Queue content is: "+que1);
         //que1.clear();
		System.out.println(que1.isEmpty());
	//	que1.clear(); //Nosuchelementexception
		System.out.println(que1.element()); //First Element, Head of the queue. Throws an exception if the queue is empty.
		System.out.println(que1.size()); //0 - 4
		System.out.println(que1.peek()); // first element to print. If it's empty Null will be output
		System.out.println(que1.poll()); // Removing the First element
		System.out.println(que1.remove()); // Throws exception if queue is empty.

		
		
	}

}
