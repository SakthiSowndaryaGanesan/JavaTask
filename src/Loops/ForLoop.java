package Loops;

public class ForLoop {

	public static void main(String[] args) {

		//For loop will be used for the known iterations.
		//Initialization - It will check the condition and runs the block- update-repeat.
		
/*	int i; //we can initiate it in the for loop itself but that we known inside the loop only.outer the loop we can't access.
	for (i=1;i<=5;i++) {
		
		System.out.println(i);
	}                        */
		
		int num1,num2;
		
		for(num1=0;num1<=10;num1++) {
			for(num2=0;num2<=5;num2++) {
			System.out.print("V");
		}
			System.out.println("\n");
		}
	}

}
