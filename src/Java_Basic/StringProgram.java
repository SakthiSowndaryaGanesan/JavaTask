package Java_Basic;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter a first String : ");
		String str1 =obj.nextLine();
		
		System.out.println("Enter a secound String : ");
        String str2 =obj.nextLine();

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Length
        System.out.println("Length of str1: " + str1.length());

        // Character at index
        System.out.println("Character at index 1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str2: " + str2.substring(1, 4));

        // Equals
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // To Upper Case
        System.out.println("Uppercase str1: " + str1.toUpperCase());
    }
}
	