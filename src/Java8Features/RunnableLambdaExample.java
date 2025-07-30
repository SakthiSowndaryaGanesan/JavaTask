package Java8Features;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
System.out.println("Run method called");
	}
	
}

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		Thread t=new Thread(new ThreadDemo());
		t.start();
		
		Runnable runnable=()->{
			System.out.println("Run method is calling using lambda");
		};
		
		Thread threadlambda = new Thread(runnable); //Instance of thread
		threadlambda.start();
	}

}
