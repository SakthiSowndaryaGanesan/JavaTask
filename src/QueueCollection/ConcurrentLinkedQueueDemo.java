package QueueCollection;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Producer Runnable without lambda
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    queue.offer(i);
                }
            }
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(producer);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Queue size (approximate): " + queue.size());
    }
}
		