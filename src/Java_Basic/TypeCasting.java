package Java_Basic;

public class TypeCasting {

	public static void main(String[] args) {

		// Implicit casting (widening) Small to bigger values
		//Automatic casting
		
        int x = 100;
        double doubleVal = x;
        System.out.println("Implicit casting (int to double): " + doubleVal);

        // Explicit casting (narrowing) Bigger value to small
        //Manual casting
        
        double anotherDouble = 99.99;
        int newInt = (int) anotherDouble; //Manual way
        System.out.println("Explicit casting (double to int): " + newInt);
	}

}
