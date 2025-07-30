package Method;

class Staff{
	public void staff_count() {
		System.out.println("There are 6 staff in scholl");
	}

	class Student{
		public void student_count(){
			System.out.println("There are 200 students");
		}
	}
	
	class Demo{
		public void demo_function() {
			System.out.println("This is demo function");
		}
	}
		
		static class Demo2{
			public void demo_fun() {
				System.out.println("This is demo2 for static inner class");
			}
		}
	}


public class NestedClass { //Main class. This will be work down to top.

public static void main(String[] args) {

	Staff sf=new Staff();    //This is the parent class so we can create the obj for staff
	sf.staff_count();  
	
	Staff.Student std=sf.new Student(); //Inner class so we need to access this with the parent class obj
	std.student_count();  
	
	Staff.Demo dd= sf.new Demo(); //Staff inside demo so, Staff.Demo. We can access the child class with the parent class obj.
	dd.demo_function();
	
	Staff.Demo2 d2= new Staff.Demo2(); //If the inner class is static we can use this method to access the class.
	d2.demo_fun();
}

}
