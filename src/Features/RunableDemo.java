package Features;

class Intro implements Runnable{ // Activity 1
	
	 public void run() {
		
		for(int i=0;i<=100;i++){
		System.out.println("Hello");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	}
}

class Intro2 implements Runnable	{ //Activity 2
	 public void run() {
		
		for(int i=100;i<=200;i++){
		System.out.println("Hi");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class RunableDemo {

	public static void main(String[] args) {
		
		
		
//		Runnable obj=new Intro(); // Refference of the interface and object of the class.
//		Runnable obj1=new Intro2();
		
		Thread t1=new Thread(new Intro()); //Runnable thread we need work with the Thread method because directly start will not work.
		Thread t2=new Thread(new Intro2()); //Constructor
		
		
		t1.start();
		t2.start();
	}
}


