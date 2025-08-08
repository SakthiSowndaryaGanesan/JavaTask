package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	String name;
	double salary;
	String department;
	
	Employee(String name , String department ,double salary){
		
		this.name=name;
		this.department=department;
		this.salary=salary;		
	}
	
	public String toString() {
        return name + " - $" + salary;
    }
}
public class StreamEmpDemo {

	public static void main(String[] args) {
		
		List <Employee> employees=Arrays.asList(
				new Employee("Sakthi","IT",40000),
				new Employee("Senthil","IT",45000),
				new Employee("Veera","Finance",50000),
				new Employee("Vicky","HR",30000),
				new Employee("pooja","HR",30000),
				new Employee("Prabha","IT",40000)
				);
		
		//Using Foreach method to print the all the emp name
		System.out.println("All employees : ");
		employees.stream()
		.forEach(e->System.out.println(e.name));

		
		long itcount=employees.stream()
				.filter(e->e.department.equals("IT"))
				.count();
		System.out.println("IT department employees count : " +itcount);
		
		boolean allabove30 =employees.stream()
				.allMatch(e->e.salary>=30000);
		System.out.println("Employees abouve 30000 ? "+ allabove30);
		
		boolean nosales =employees.stream().noneMatch(e->e.department.equals("Sales"));
		System.out.println("Any employees from sales : " +nosales);
		
		List<String> hrnames =employees.stream()
				.filter(e->e.department.equals("HR"))
				.map(e->e.name)
				.collect(Collectors.toList());
		System.out.println(hrnames);
		
		Optional<Employee> maxsalary=employees.stream()
				.max(Comparator.comparingDouble(e->e.salary));
		
		if(maxsalary.isPresent()) {
			System.out.println("High salaried person : "+ maxsalary.get());
		}
		else {
			System.out.println("List is empty.");
		}
				
		
	}

}
