package Java_Basic;

public class ScopeOfVariable {
	
	static String name="Sakthi"; //Global
	int age=23; //Global
	
	public void print_name() {
		String name="Vishnu";   //Local variable
		System.out.println("Local variable: "+name);
	}
	public void sample_function() {
		System.out.println(name); //Global Variable
		System.out.println(age);//Global Variable
	}

	public static void main(String[] args) {

		//Local,global,Static or cls variable
		
		ScopeOfVariable ss =new ScopeOfVariable();
		
		System.out.println(name); //We can't call the global variable without obj. If it is mentioned as a static then no need to create a obj.
		System.out.println("My age is : " + ss.age); //Created a obj for global variable so we can use that in main function.
		
		ss.print_name();
		ss.sample_function();
		
	}

}
