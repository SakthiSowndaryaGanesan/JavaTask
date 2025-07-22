package Method;

public class MethodExample2 {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println("The addition answe is :" +c);
	}
	public void demo() {
		add(100,200); //Inside this method we are calling an anther method by giving the parameters.
	}
	
	static void PrintLine() {  //If the method has static method don't want to create a obj and we can call the method directly.
		System.out.println("----------------------");
	}
	public static void main(String[] args) {

		MethodExample2 mm=new MethodExample2();
		mm.add(200, 200);
		mm.demo();
		PrintLine(); //obj creation not needed for the static method
	}

}
