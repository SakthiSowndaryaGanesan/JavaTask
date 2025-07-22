package Conditional_Statements;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
	Scanner obj=new Scanner (System.in);
	
/*	System.out.println("Enter a number to find the day : ");
	
	int day=obj.nextInt();

		switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
        	System.out.println("Wednesday");
        	break;
        case 5:
        	System.out.println("Thursday");
        	break;
        case 6:
        	System.out.println("Friday");
        	break;
        case 7:
        	System.out.println("Saturday");
        	break;
        default:
        	System.out.println("Sorry ! A week has 7 days only.");
        	break;                 */
	
	System.out.println("Enter the 2 values to purform calculation: "); //Mini calculator
	
	int a=obj.nextInt();
	int b=obj.nextInt();
	
	System.out.println("Enter the operator to perform calculation : + , - , * , / , % ");
	
	char op=obj.next().charAt(0);
	
	switch(op) {
	case '+' :
		System.out.println("The + of 2 values is : " + a+b);
		break;
	case '-' :
		System.out.println("The - of 2 values is : " + (a-b));
		break;
	case '*' :
		System.out.println("The * of 2 values is : " + a*b);
		break;
	case '/' :
		System.out.println("The / of 2 values is : " + a/b);
		break;
	case '%' :
		System.out.println("The % of 2 values is : " + a%b);
		break;
	default:
		System.out.println("No such operator");
	    break;
	
	
	

		}
	}
}
