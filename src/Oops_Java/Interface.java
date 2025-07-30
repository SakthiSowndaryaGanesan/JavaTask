package Oops_Java;

interface A{ //Interface is not a class and we can't create an obj for that
	
	int age=22; //The variable in the interface is static and final.
	
	String area="Salem";
	
	void show(); //every method in the interface is abstract class.
	
	void config();
}

interface X{
	
	void run();
}

interface Y extends X{
	
}

//class b is concrete class so we can create an obj for this to access the interface
class B implements A, Y { // Used implements keyword for the 

	@Override
	public void show() {
System.out.println("Show the details.");		
	}

	@Override
	public void config() {
System.out.println("We can config the detials");		
	}

	@Override
	public void run() {
System.out.println("I can run.");		
	}
}

public class Interface {

	public static void main(String[] args) {

		A obj=new B();
		
		obj.show();
		obj.config();
		
		System.out.println("My age is : "+ obj.age); //By using the obj we can use the variable.
		System.out.println("My city is : "+obj.area);
		
		// obj.run();  //This gives error using another interface obj we can't access the different interface.
		
		X obj1=new B();  //Here we created a new obj for the another interface using the same concrete class.
		obj1.run();
	}

}
