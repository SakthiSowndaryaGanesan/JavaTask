package Java_Basic;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter A value : ");
		int a=obj.nextInt();
		
		System.out.println("Enter B value: ");
		int b=obj.nextInt();
		
        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        
        System.out.println("Subtraction: " + (a - b));
        
        System.out.println("Multiplication: " + (a * b));
        
        System.out.println("Division: " + (a / b));
        
        System.out.println("Modulus: " + (a % b));
        
     // Relational Operators
        System.out.println("a > b: " + (a > b));
        
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        
        System.out.println("x || y: " + (x || y));
        
        System.out.println("!x: " + (!x));

	}

}
