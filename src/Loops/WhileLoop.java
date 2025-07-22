package Loops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
	
/*		System.out.println("Enter a number : "); //Find the nearest num divisible by 10.
		int n=obj.nextInt();
		
		while(n>=0) {
			if(n%10==0) {
				System.out.println(n);
				break;   //If the break was not mentioned the loop will work continually till 0. 
			}
			n--;    */
		
		double sum = 0.0, n;

        System.out.println("Enter numbers to add. Enter a negative number to stop:");


        while (true) {
            n = obj.nextDouble();  // First input before loop

            if (n < 0.0) {
                break;  // Exit loop if negative
            }
            sum += n;  // Add to sum
        }

        System.out.println("The sum is: " + sum);
        obj.close();
    
		
	/*	System.out.println("How many starts you want to print: ");
		
		int n=obj.nextInt();
		int i=1;
		while ( i<=n) {
		
			System.out.print("*");
		i++;
		}            */
		
		
		
		
		
		
	}

}
