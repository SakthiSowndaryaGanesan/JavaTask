package Conditional_Statements;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
/*		System.out.println("Enter a number : ");
		
		int num =obj.nextInt();
		
		//Simple If
		if(num>=0) {     
			System.out.println("Number is Positive");
		}                       */
		
		//If Else
		
		System.out.println("Enter your age : ");
		int age=obj.nextInt();
		System.out.println("Enter your name : ");
    	String name=obj.next();
    	
    	if(age>=18) {
    		System.out.println("Hi "+name +"! Hope you are doing great. You are eligible to VOTE. ");
    	}
    	else {
    		System.out.println("Hi "+name+"! Hope you are doing great. You are NOT eligible to VOTE");
    	}
	}

}
