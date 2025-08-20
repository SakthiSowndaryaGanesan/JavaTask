package PracticePrograms;


class thread1 extends Thread {
	
	public int count=0;
	
	public void run(){
	
	for(int i=1;i<=100;i++) {
		count ++;
		}
	}	
}

class thread2 extends Thread {
	public int count =0;
	public void run() {
	for(int i=101;i<=200;i++) {
		count ++;
	}
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) {
		
		thread1 th1 = new thread1();
		

		thread1 t1=new thread1();
		thread2 t2=new thread2();
		
		t1.start();
		t2.start();
	//	t1.start(); // we can't call the same thread with same obj. Instead if we wnat to use can creadte a diffrent obj.
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count from t1: " + t1.count);
		System.out.println("Count from t2: " + t2.count);

	}

}
