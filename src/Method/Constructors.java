package Method;

/* class Box{
	
	int length;
	int breadth;
	int height;
	
	 Box (int l,int b,int h) {
		length =l;
		breadth=b;
		height=h;		
	}
	 
	int volume() {
		return length*breadth*height;			
	}
}
public class Constructors{
	public static void main(String args[]) {
		Box blackBox=new Box(2, 3, 3);
		
         int vol= blackBox.volume();
		
		System.out.println("Volume : " + vol);
		
	//	blackBox.setdim(12, 13, 14); this step not needed. if we are using constructor.
		
	}
}                */

  class Student{
	
	String Name;
	int rollno;
	int marks[];
	
	//Constructor - Class and method name will be same , No return type.
	public Student(String Name,int rollno,int marks[]) {
		this.Name=Name;  //this key word will refers to get the value in the current class.
		this.rollno=rollno;
		this.marks=marks;
	}
	
	//Method to calculate the total marks
	
	public int markstotal() {
		int total=0;
		
		for(int mark:marks) {
			total = total+ mark;
		}
		return total;
	}
	
	//To display the method
	
	public void display() {
		
		System.out.println("Name : " + Name);
		System.out.println("Roll no : "+ rollno);
		System.out.println("Marks:");
		for(int mark:marks) {
			System.out.print(mark+" ");
		}
		System.out.println("\nTotal marks: "+markstotal());
		System.out.println("----------------------------");
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		int[] marks1 = {85, 90, 78};
        int[] marks2 = {88, 76, 92};
        int[] marks3 = {80, 70, 85};

        Student student1 = new Student("Sakthi", 101, marks1);
        Student student2 = new Student("Sowndarya", 102, marks2);
        Student student3 = new Student("Veera", 103, marks3);

        student1.display();
        student2.display();
        student3.display();

	}

}  
