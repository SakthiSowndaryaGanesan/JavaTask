package Oops_Java;
import java.util.Scanner;

// It has 5 types - Single level , multi level ,Multiple , Hierarchical and hybrid.

//Single and multi level inheritance example. We can create a object for the child class and access the parent class. No need to create a object for all the class.

class Person{  // parent class
	String name;
	int age;
	
	 void PersonDetails() { // the memory will be allocated
		
		Scanner sc = new Scanner(System.in); //Instead of giving Scanner in each method we can use Scanner and obj in the method -- () 
		
		System.out.println("Enter your Name : ");
		name=sc.next();
		
		System.out.println("Enter your Age : ");
		age=sc.nextInt();
		 
	}
	
	void DisplayDetails() {
		System.out.println("Name : " +name);
		System.out.println("Age : "+age);
	}	
}

class Student extends Person{
	
	int rollnumber;
	String grade;
	
	void StudentDetails() {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter your Rollnumber : ");
		rollnumber=sc.nextInt();
		
		System.out.println("Enter your Grade : ");
		grade=sc.next();
		
	}
	
	void DisplayStudent() {
		
		System.out.println("Roll Number : " +rollnumber);
		System.out.println("Grade : " + grade);
	}
	
}

class School extends Student{
	
	String Sname;
	char section;
	void SchoolDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the School Name : " );
		Sname=sc.nextLine();
		
		System.out.println("Enter your Section: ");
		section=sc.next().charAt(0);
	}
	
	void Displayschool() {
		
		System.out.println("School Name: " +Sname);
		System.out.println("Section : "+section);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		School s=new School(); //Created a obj for the child class only but we can access all the class in this program.
		

		s.PersonDetails();
		s.StudentDetails();
		s.SchoolDetails();
		
		System.out.println("--------------Student Details--------------");

		s.DisplayDetails();
		s.DisplayStudent();
		s.Displayschool();
		

	}

}
