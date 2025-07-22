package Java_Basic;
import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age=obj.nextInt();
		
        boolean IsAdult = age >= 18;

        System.out.println("Is adult? " + IsAdult);

        if (IsAdult) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You are too young to vote.");
        }

        // Combining boolean expressions
        boolean hasID = true;
        if (true && hasID) {
            System.out.println("You are eligible to enter.");
        }
    }
}




