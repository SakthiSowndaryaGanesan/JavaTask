package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeArrayList {
	
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public EmployeeArrayList(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//getter setter
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getSalary() {return salary;}
	public void setSalary(double salary) {this.salary = salary;}
	
	
//Sorting we can use sort and implementing comparator.
	public static class MySort implements Comparator<EmployeeArrayList>{

		@Override
		public int compare(EmployeeArrayList o1, EmployeeArrayList o2) {
			return (int)(o1.getSalary() - o2.getSalary()); //Ascending order
			
			//For decending order o2.getSalary()-o1.getSalary()
		}
		
	}

	public static void main(String[] args) {

		List<EmployeeArrayList> emp=new ArrayList<EmployeeArrayList>();
		emp.add(new EmployeeArrayList(10, "Sakthi", 23, 30000));
		emp.add(new EmployeeArrayList(10, "Sowndarya", 22, 20000));
		emp.add(new EmployeeArrayList(10, "Vishnu", 24, 50000));
		emp.add(new EmployeeArrayList(10, "Shruti", 22, 28000));
		emp.add(new EmployeeArrayList(10, "Ram", 25, 27500));
		
		Collections.sort(emp, new MySort()); //Ascending Order
		
		// Display sorted list
				for (EmployeeArrayList e : emp) {
					System.out.println(e.getName() + " - " + e.getSalary());
				}
	}

}
