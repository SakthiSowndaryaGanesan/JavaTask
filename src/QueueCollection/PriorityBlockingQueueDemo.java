package QueueCollection;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {

		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
		
	  //Adding elements
		
		queue.put(12);
		queue.put(7);
		queue.put(10);
		queue.put(6);
		queue.put(4);
		queue.put(5);
		
		System.out.println(queue);
		
		//Low elements will be the head as priority queue.
		
		while(!queue.isEmpty()) {
			System.out.println("Polled : " + queue.take());
		}
	}

}
