package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
  
		//one dimensional array
		//Single row of elements. List of items989
/*		int marks[]=new int[5]; //Instead of initializing the value we can use this method - int marks[]={10,20} so it will allocate 2 space in the memory.
		
		marks[0]=80;
		marks[1]=80;
		marks[2]=80;
		marks[3]=80;
		marks[4]=80;  

System.out.println(marks[3]);

//two dimensional array. Table (rows and columns). Matrices, grids, tables

int score[][]=new int[3][90]; //3-row. 90-coloumn8

int a[][]=new int[3][4];
a[0][0]=100;
a[2][3]=78;                               */
		
		int arr[]= {1,3,5,7,9,11};
		int sum=0;
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		for(int j: arr) {//foreach
			 sum+=j;
		}
			System.out.println("Sum is : " + sum);
		}
		}
}
		




	


