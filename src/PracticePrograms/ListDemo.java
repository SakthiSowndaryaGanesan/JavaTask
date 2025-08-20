package PracticePrograms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int age;
	int marks;
	LocalDate dob;
	String department;

	
	public Student(String name, int age, int marks, LocalDate dob, String department) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.dob = dob;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", dob=" + dob + ", department="
				+ department + "]";
	}
}

public class ListDemo {


	public static void main(String[] args) {
		
		List<Student> stds=new ArrayList<>(Arrays.asList(
				new Student("Sakthi",23,98,LocalDate.of(2002, 8, 26),"IT"),
				new Student("Surya",22,90,LocalDate.of(2002, 9, 29),"ECE"),
				new Student("Kavya",22,79,LocalDate.of(2003, 4, 6),"CSE"),
				new Student("Ram",20,87,LocalDate.of(2003, 8, 6),"MECH"),
				new Student("Sita",24,60,LocalDate.of(2000, 3, 9),"IT"),
				new Student("Guru",23,78,LocalDate.of(2002, 8, 26),"ECE")

				));
		
		Student stdsadd =new Student("Priya", 23, 87, LocalDate.of(2002, 9, 15), "IT");

		stds.add(stdsadd);
		
//		for (Student student : stds) {
//			System.out.println(student.name +" "+ student.department);
//		}
		
//		Iterator it= stds.iterator();
//		
//		while (it.hasNext()) {
//			
//			Student sc= (Student)it.next();[
//			
		//	System.out.println(sc.name + "  "+ sc.marks);
		//	System.out.println(sc);
			
			
	 stds.stream().filter((e -> e.name.startsWith("K") && e.marks>70) )
	.forEach(e-> System.out.println( e.name + e.marks));
	 
	Integer avg = stds.stream()
	 .map(std -> std.marks).reduce(0,(a,b) -> a+b);
	
	System.out.println(avg / 6);
	
	List<Integer> demo = stds.stream().filter(e -> e.age>23).map(e ->e.marks/2).collect(Collectors.toList());
	
	System.out.println(demo);
	
	long count = stds.stream().filter(e -> (e.name.startsWith("S") && e.department.equals("IT")) ).count();	
	System.out.println(count);
	
	stds.stream().filter(e -> e.name.equals("Surya")).forEach(e -> System.out.println(e.dob + " "+e.name));
	
	}
}

