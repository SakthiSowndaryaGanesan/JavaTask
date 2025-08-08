package MapCollection;

import java.util.HashMap;

class student{
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return   name +" " + marks ;
	}
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String ,student> studentsMarks = new HashMap<>(); 
		
		studentsMarks.put("Sakthi", new student("Sakthi",89));
		studentsMarks.put("Prabha", new student("Prabha",80));
		studentsMarks.put("Kavya", new student("Kavya",91));
		studentsMarks.put("Sundar", new student("Sundar",87));
		studentsMarks.put("Siva", new student("Siva",78));
		
		//System.out.println("HashMap Contents : "+ studentsMarks);
		for(String s : studentsMarks.keySet()) {
		System.out.println(s);
		}
		//System.out.println(studentsMarks.get("Prabha"));

		
		
		

	}

}
