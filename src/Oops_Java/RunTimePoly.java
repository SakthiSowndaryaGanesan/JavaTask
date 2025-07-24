package Oops_Java;
import java.util.Scanner;

//Parent class
class Doctor{
	void treat() {
		System.out.println("General treatement is provided.");
	}
}

//child 1 
class Dentist extends Doctor{
	void treat() {
		System.out.println("Dentist provides dental care and oral treatment.");
	}
}

//Child 2
class Surgeon extends Doctor{
	void treat() {
		System.out.println("Surgeon performs surgical operations.");
	}
}

//Child 3
class Pediatrician extends Doctor{
	void treat() {
		System.out.println("Pediatrician treats children and infants.");
	}
}

public class RunTimePoly {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		Doctor dc = null;
		
		System.out.println("Enter type of doctor (Dentist/Surgeon/Pediatrician)");
		
		String input=sc.nextLine();
		
		if(input.equalsIgnoreCase("Dentist")) {
			
		    dc=new Dentist();
		}
		else if(input.equalsIgnoreCase("Surgeon")) {
			 dc=new Surgeon ();
		}
		else if(input.equalsIgnoreCase("Pediatrician")) {
			dc=new Pediatrician();
		}
		else {
			System.out.println("Invalid doctor type.");
		}
		
		System.out.println("Treatment Info : ");
		dc.treat();	
	}

}
