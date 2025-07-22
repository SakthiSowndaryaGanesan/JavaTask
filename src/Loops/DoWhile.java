package Loops;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        double number, sum = 0;

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = input.nextDouble();

            if (number >= 0) {
                sum += number;
            }

        } while (number >= 0);  // Condition is checked after loop runs once

        System.out.println("The total sum is: " + sum);
        input.close();
    }


	}

