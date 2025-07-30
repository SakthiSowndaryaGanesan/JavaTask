package Features;

class Greetings extends Thread{ // Activity 1
	
	public void run() {
		
		for(int i=0;i<=100;i++){
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	}
}

class Greetings2 extends Thread	{ //Activity 2
	public void run() {
		
		for(int i=0;i<=100;i++){
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		Greetings obj=new Greetings();
		Greetings2 obj1=new Greetings2();
		
		obj1.setPriority(Thread.MAX_PRIORITY);
	
		
		obj.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		obj1.start(); //Will receive a mixed output which means two methods are running parallel.
	}
}


