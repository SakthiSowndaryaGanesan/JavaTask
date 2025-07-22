package Arrays;
import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		
/*		int a[]= {80,90,99,75,79,85};
		
		for(int i=0;i<a.length;i++) {  //a.leanth is used to get the length of array
			System.out.println(a[i]);
		}                  */
		
		//To get the input from the user. 
		
	int a[]= new int[6];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 6 elements of the array : ");
		
		for (int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
			
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);             
				
		}
		
	}
	

