package QueueCollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> bq=new ArrayBlockingQueue<>(3);
		
		bq.put(12);
		bq.put(45);
		bq.put(67);
		
		bq.take();
		bq.take();
		bq.put(89);
		bq.put(39); // First in first out. Throws exception when the que is full
		System.out.println(bq);
	//	bq.clear();
	//	bq.take();  //Unable to take when queue is empty. Throws exception
		
		
		bq.poll(); //retrieves and removes head.
		System.out.println(bq.size());
		
		System.out.println(bq);
		
		
	}

}
