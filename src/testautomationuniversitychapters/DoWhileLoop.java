package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to implement DO WHILE Loop
public class DoWhileLoop {

	public static void main(String args[]) {

		/**
		 * Get the input from user for 2 numbers
		 * Sum those 2 numbers Repeat the process
		 * until user wants to end it
		 */

		Scanner sc = new Scanner(System.in);
		boolean again;

		do {
			System.out.println("Enter the first number:");
			double numOne = sc.nextDouble();

			System.out.println("Enter the second number:");
			double numTwo = sc.nextDouble();

			double sum = numOne + numTwo;
			System.out.println("Sum of two number is " + sum);

			System.out.println("Do wanna run again? True or False");
			again = sc.nextBoolean();

		} while (again);
		System.out.println("The code ended...");
		sc.close();
	}

}
