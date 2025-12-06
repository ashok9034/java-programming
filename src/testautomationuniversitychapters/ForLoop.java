package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to implement FOR loop
public class ForLoop {

	public static void main(String args[]) {

		/**
		 * Scenario #1 Write a cashier program that will scan a given number of items
		 * and tally the cost
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items you wanna scan:");
		int items = sc.nextInt();
		double totalCost = 0;

		for (int i = 0; i < items; i++) {
			System.out.println("Enter the cost of item:");
			double cost = sc.nextDouble();
			totalCost = (totalCost + cost);
		}

		System.out.println("Total cost is $" + totalCost);

		/**
		 * ==========================================================================
		 * Scenario #2 Search the String to determine if it contains the letter 'A'
		 */
		System.out.println("Enter the string:");
		String text = sc.next();
		sc.close();
		boolean letterFound = false;

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'A' || character == 'a') {
				letterFound = true;
				break;
			}
		}
		if (letterFound) {
			System.out.println("String contains character A");
		} else {
			System.out.println("String does NOT contain character A");
		}
	}

}
