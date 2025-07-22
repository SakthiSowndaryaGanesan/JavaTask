package Conditional_Statements;
import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		
		
	Scanner obj=new Scanner(System.in);
	
/*	System.out.println("Enter Your mark : ");
	
	int marks =obj.nextInt();  
//If else if ladder
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
	}       */
	
	
	System.out.println("Enter the channel number : ");
	int ch=obj.nextInt();
	
	if(ch==1)
	{
		System.out.println("SUN TV");
	}
	else if(ch==2){
		System.out.println("VIJAY TV");
	}
	else if(ch==3) {
		System.out.println("STAR SPORTS");
	}
	else if(ch==4) {
		System.out.println("ZEE TV");
	}
	else if(ch==5) {
		System.out.println("DISCOVERY");
	}
	else {
		System.out.println("Sorry! No such channel found");
	}
	
	System.out.println("Thank you !");

	}
}
