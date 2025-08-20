package PracticePrograms;



class runnable1 implements Runnable{
	
	public  void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class runnable2 implements Runnable{
	public  void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {

		Runnable obj=new runnable1();
		Runnable obj1= new runnable2();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();
		
	}

}
