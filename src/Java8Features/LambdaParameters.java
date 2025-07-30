package Java8Features;

interface Addable{
	int add(int a,int b);
}
public class LambdaParameters {

	public static void main(String[] args) {

		Addable addition=(int a,int b)-> a+b; //Passing parameter
		int result=addition.add(10, 10);
		System.out.println(result);
	}
}
