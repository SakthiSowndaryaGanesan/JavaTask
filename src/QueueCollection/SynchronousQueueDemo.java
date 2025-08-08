package QueueCollection;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

	public static void main(String[] args) {
		
		SynchronousQueue <String> queue = new SynchronousQueue <>();
		
		Thread producer = new Thread (new Runnable() {

			@Override
			public void run() {
				
				try {
					String msg="Hello";
					System.out.println("Producer trying to put the element");
					queue.put(msg);
					System.out.println("Message Delivered.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
	}) ;
		
		//Consumer Thread
		
		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				
				try {
					System.out.println("Taking the message.");
					String received = queue.take();
					System.out.println("Delivered content: "+received);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		//Start the thered
		
		producer.start();
		consumer.start();
						
	}

}
