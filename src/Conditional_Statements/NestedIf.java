package Conditional_Statements;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter A value : ");
		int a=obj.nextInt();
		
		System.out.println("Enter B Value : ");
		int b=obj.nextInt();
		
		System.out.println("Enter C Value : ");
		int c=obj.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is big");
			}
		}
		else if(b>c) {
			if(b>a) {
				System.out.println("B is big");
			}
		}
		else {
			System.out.println("C is big");
		}
	}

}
