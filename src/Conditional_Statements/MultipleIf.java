package Conditional_Statements;
import java.util.Scanner;

public class MultipleIf {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);

   /*     // Input marks
        System.out.print("Enter marks in Math: ");
        int math = obj.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = obj.nextInt();

        System.out.print("Enter marks in English: ");
        int english = obj.nextInt();

        // Calculate average
        double average = (math + science + english) / 3.0;

        // Multiple if statements
        if (math < 35) {
            System.out.println("You failed in Math.");
        if (science < 35)
            System.out.println("You failed in Science.");
        if (english < 35)
            System.out.println("You failed in English.");
        }
else {System.out.println("You Passed.");
	}

        obj.close();          */
		
		//Login authentication system.
		//Predefined username and password 
		String correctUsername="Sakthi";
		String correctPassword="12345";
		
		//Input from the user
		System.out.println("Enter User Name: ");
		String username=obj.next();
		
		System.out.println("Enter the Password: ");
		String password=obj.next();
		
		//Nested if for the login Verification
		
		if(username.equals(correctUsername)) {
			if(password.equals(correctPassword)) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Incorrct Password");
			}
		}
		else {
			System.out.println("Username not Found");
		}
		
		//Multiple if statement for the account verification 
		
		if(!username.equals(correctUsername))
		{
			System.out.println("Please Register your account");
		}
		if(username.equals(correctUsername)&&!password.equals(correctPassword)) {
			System.out.println("Reset your Password if forgetten");
		}
		obj.close();
	}
}


