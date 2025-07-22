package Loops;

public class NestedLoop {

	public static void main(String[] args) {
		// Loop inside the loop which is called nested loop
		
/*		outerloop: //label
		
			for(int i=1;i<=5;i++) 
			{
			innerloop: //label
			for(int j=1;j<=5;j++) 
			{
				if(i==4&&j==4) //Inside this for loop only this will work.
					break outerloop;    //If we need to continue with the outer loop also means we can create a label to access.labelled break
			System.out.print(j); //If we print i the value is 11111 , j - 12345
			}
			System.out.println("\n");
		}                                           */

		
		for(int i=1;i<=10;i++) {
			if(i==7)
			continue; //Jump or loop control statement.continue to the next iteration for this time.so 7 will be skipped.Can use in the label also.
			System.out.print(i);
		}
	}
}
