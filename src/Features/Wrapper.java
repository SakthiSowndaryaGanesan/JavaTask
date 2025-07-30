package Features;

public class Wrapper {

	public static void main(String[] args) {

		int i=10;
		int j=50;
		float weight =50.5f;
		
		Integer i2=Integer.valueOf(15); //for i2 we are setting an value 
		
		Integer i3=Integer.valueOf(j); //Boxing, Wrapping
		
		int z=i3.intValue(); //Unboxing , unwrappering
		
		Integer age=23; //Integer.value(23) - autoboxing
		
		//Convering string into int
		
		String num="12345";
		
		int na=Integer.parseInt(num);
		
		System.out.println(num);
		System.out.println(i); //Without creating an obj directly value is printed.
		System.out.println(i2); //Obj created by using that we printed a value here.
		
		System.out.println(z);
		System.out.println(age);
	}

}
