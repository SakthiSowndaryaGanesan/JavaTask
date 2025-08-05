package Oops_Java;

	
class Subject{
	void english(int a) {
		System.out.println("English mark : " + a);
	}
	void english (int mark, int total ) {
		System.out.println();
	}
}

public class MethodOverLoadingDemo {

	public static void main(String[] args) {

		Subject sc=new Subject();
		
		sc.english(90);
	}

}
