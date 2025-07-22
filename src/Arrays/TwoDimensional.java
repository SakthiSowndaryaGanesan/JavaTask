package Arrays;
import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		int number [][]=new int [2][3]; //2 row , 3 columns matrix
		
		System.out.println("Enter 6 integers for 2*3 matrix");
		for(int row=0;row<2;row++) {
			for(int column=0;column<3;column++) {
				System.out.print("Enter elements [ " + row + " ] [ " + column +"] ");
				number[row][column]=obj.nextInt(); //To store the value
			}
		
		}
			
			//To display the array
			System.out.println("\nMatrix");
			
			for(int row=0;row<2;row++) {
				for(int column=0;column<3;column++) {
					System.out.print(number[row][column]+ " ");
					
				}
				System.out.println();
			}
			
			//Calculate sum of all elements
			
			int sum=0;
			for(int row=0;row<2;row++) {
				for(int column=0;column<3;column++) {
					sum=sum+number[row][column];
				}
			}
			
			System.out.println("\nSum of all elements: " +sum);
			obj.close();
		}
		
	}


