package Java17Features;

sealed class Office permits Employee,Manager {
	
	String ename;
	int eid;
	void employeeDetails(String ename , int eid) {
		
		this.ename=ename;
		this.eid=eid;
		System.out.println("Employee name is : " +ename);
		System.out.println("Employee ID is : " +eid);
	}
}

non-sealed class Employee extends Office{
	
}

final class Manager extends Office{
	
}



public class SealedclassDemo {

	public static void main(String[] args) {
		
		Office of = new Employee();
		Office of1 = new Manager();
		
		of.employeeDetails("Sakthi", 123450);
		of1.employeeDetails("Prabha", 67890);


		
	}

}
