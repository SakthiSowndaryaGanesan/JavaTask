package Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class EmpDetails{
	private int age;
	private String name;
	private String department;
	private double salary;
	

	public EmpDetails(int age, String name, String department, double salary) {
		this.age = age;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}



	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		List<EmpDetails> empList = new ArrayList<>(Arrays.asList(
				
				new EmpDetails(39, "Sakthi", "IT",30000.0),
				new EmpDetails(30, "Surya", "IT",40000.0),
				new EmpDetails(25, "Sundar", "Finance",50000.0),
				new EmpDetails(20, "kavya", "HR",39000.0),
				new EmpDetails(29, "Kannan", "Sales",90000.0)
				));
		
		//
//		Iterator<EmpDetails> iterator = empList.iterator();
//		
//		while (iterator.hasNext()) {
//
//			System.out.println(iterator.next().getName());
//		}
		
		empList.stream().filter(Employee -> Employee.getName().startsWith("S"))
		.forEach(Employee->System.out.println(Employee.getName()));
		
		System.out.println("----------------");
		
		empList.stream().filter(Employee->(Employee.getSalary()>=40000)).forEach(Employee1->System.out.println(Employee1.getName()));

		System.out.println("-------------------");
		
		empList.stream().sorted(Comparator.comparing(EmpDetails::getAge)).forEach(e->System.out.println(e.getName() +" : "+ e.getAge()));

		
		System.out.println("Reversed order : ");
		
		empList.stream().sorted(Comparator.comparing(EmpDetails::getAge).reversed()).forEach(e->System.out.println(e.getName() +" : "+ e.getAge()));
		
		System.out.println("------------------");
		
	long total =empList.stream().filter(Employee->Employee.getDepartment().equals("IT")).count();
	System.out.println(total);
	
	System.out.println("-----------------------");
	
	boolean avail= empList.stream().anyMatch(employee->employee.getDepartment().equals("Sales"));
	System.out.println(avail);
	
	empList.stream().filter(Employee -> Employee.getDepartment().equals("Sales")).forEach(e->System.out.println(e.getName() + " with Salary " + e.getSalary()));
	System.out.println("-------------");
	
	Optional <EmpDetails> minSalary =empList.stream().min(Comparator.comparing(EmpDetails::getSalary));
	System.out.println("Minimum Salary : " + minSalary.get().getName() + " - " + minSalary.get().getSalary());
	
	Optional<EmpDetails> maxSalary = empList.stream().max(Comparator.comparing(EmpDetails::getSalary));
	System.out.println("Max salary : " +maxSalary.get().getName() + " - " + maxSalary.get().getSalary() );
	
	empList.stream().filter(Employee -> Employee.getDepartment()
			.equals("IT")).sorted(Comparator.comparing(EmpDetails::getSalary).reversed())
	.forEach(e->System.out.println(e.getName() + " - " +e.getDepartment()+ " - "+e.getSalary()));
	
	

	
	
	
	
	
	
	
	
	
	
	
	}

}
