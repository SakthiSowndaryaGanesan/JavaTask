package QueueCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.add(4);
		pq.add(5);
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(6);
		pq.add(0);
		pq.add(9);
System.out.println(pq);  //Min heap.
//System.out.println(pq.peek()); //Head element. Not removed
//System.out.println(pq.poll()); //remove the head element also printed
//System.out.println(pq);  //After removing no 1 here. 
//System.out.println(pq.remove(2));
		
	Iterator<Integer> it=	pq.iterator();
	while (it.hasNext()) {
		System.out.println(pq.poll());
	}



		
	}

}
