package Features;

import java.util.ArrayList;
import java.util.List;

class Student<T>{ //Generic class
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

class genericMethod{  //Generic method
	
	public static <T> void printArray(T [] arrayList ) {
		
		for(T element : arrayList ) {
			System.out.println(element);
		}
	}
}
 
//Bounded Class - there we can mention the abstract class.
class Calculator<T extends Number>{
	T nums;
	
	Calculator(T nums){
		this.nums=nums;
	}
	
	public double square() {
		return nums.doubleValue()*nums.doubleValue();
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(3);
		Calculator calc1 = new Calculator(6.9);
		
		System.out.println(calc.square());
		System.out.println(calc1.square());

		
		//generic Collections
		List <Object>name = new ArrayList<Object>(); //Good practice is to mention as a Object
		name.add("Sakthi");
		name.add("Sowndarya");
		name.add(2);
		name.add(234.87);
		

		Student<String> sbox = new Student();
		
		sbox.setValue("Sakthi");
		System.out.println("String output : " + sbox.getValue());
		
		Student<Integer> ibox = new Student();
		ibox.setValue(23);
	System.out.println("Age : " + ibox.getValue());
	
	Integer [] intArr = {1,2,3,4,45,7};
	String [] strArr = { "Sakthi" , "Vishnu" ,"Kavya","Prabha"};
	
	genericMethod.printArray(intArr); //Works for interger 
	genericMethod.printArray(strArr); //Works for String
	
	}

}
