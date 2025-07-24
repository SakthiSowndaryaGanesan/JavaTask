package Oops_Java;

public class Recurion { //Factorial 
	
	static int fact(int n) {
		if(n==0) {
			return 1;}
		else {
			return n*fact(n-1);
		}
	}  
	public static void main(String[] args) {

		System.out.println(fact(5));
	}

	
/* static int fibonacci (int n)	{
	
	if(n<=1)
		return 1;
	return fibonacci(n-1)+(n-2);
}
	
	public static void main(String[] args) {

		//System.out.println(fact(5));
		
		
		int terms=7;
		System.out.println("Fibonacci series using recursion: ");
		
		for(int i=0;i<terms;i++) {
			System.out.println(fibonacci(i)+" ");  */
		
		
	}


