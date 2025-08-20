package Java17Features;

import java.util.Scanner;

public class PattrenMatching2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Object input;
		
		System.out.println("Enter a value : " );
		
		if(sc.hasNextInt()) {
			 input = sc.nextInt();
		}
		else if(sc.hasNextDouble()) {
			 input = sc.nextDouble();
		}
		else {
			 input = sc.next();
		}
	
		
		
		String result = switch(input) {
		
		case Integer i -> "Receievd Integer " +i;
		case Double d -> "Receievd Double " +d;
		case String s -> "Receievd String "+s;
		default -> "Unknown type";
		
		};
		
		System.out.println(result);

	}

}
