package Features;


class Demo{
	
	public void show()throws ClassNotFoundException {
		
		Class.forName("Calc");
	}
}
public class Throws {
	
	static {
		System.out.println("Class Loaded");
	}

	public static void main(String[] args){

		Demo obj=new Demo();
		
		try {
			obj.show();
		}
		catch (ClassNotFoundException e) 
		{
			
			System.out.println("Class not found"+e);
		//	e.printStackTrace(); //It prints the entire stack. Which is useful for the debugging the application
		}
	}

}
