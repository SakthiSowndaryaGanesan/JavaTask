package Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentDetails {
	
	private String name;
	private int age;
	private int total;
	
	StudentDetails(String name,int age,int total){
		this.name=name;
		this.age=age;
		this.total=total;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + ", total=" + total + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}


	public static void main(String[] args) {
		
		List<StudentDetails> stdDetails=new ArrayList<>(Arrays.asList(
				
				new StudentDetails("Sakthi" ,23 , 90),
				new StudentDetails("Surya" ,22 , 92),
				new StudentDetails("Kavya" ,23 , 98),
				new StudentDetails("Prabha" ,24 , 88),
				new StudentDetails("Sundar" ,25 , 85),
				new StudentDetails("Hari" ,21, 91) ));
		
		stdDetails.stream()
		.filter(student -> student.getName().startsWith("S"))
		.sorted(Comparator.comparing(StudentDetails::getTotal).reversed())
		.forEach(students -> System.out.println(students.getName() + " - " + students.getTotal()));
		
		Optional<StudentDetails> max =stdDetails.stream()
				.max(Comparator.comparing(StudentDetails::getTotal));
		
		System.out.println("Highest Total : " + max.get().getName());
		
		stdDetails.stream()
		.map(student -> student.getTotal()*2)
		.sorted(Comparator.reverseOrder())
		.limit(2)
		.skip(1)
		.forEach(a -> System.out.println(a));
		
		}

}
