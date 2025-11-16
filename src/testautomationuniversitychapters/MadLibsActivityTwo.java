package testautomationuniversitychapters;

import java.util.Scanner;

public class MadLibsActivityTwo {
	
	public static void main(String args[]) {
	
		/**
		 * You'll ask them how many pennies would you like?
		 * How many nickels would you like?
		 * How many dimes?
		 * How many quarters?
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many pennies would you like?");
		int pennies = sc.nextInt();
		
		System.out.println("How many nickels would you like?");
		int nickels = sc.nextInt();
		
		System.out.println("How many dimes would you like?");
		int dimes = sc.nextInt();
		
		System.out.println("How many quarters would you like?");
		int quarters = sc.nextInt();
		sc.close();
		
		//Initializing worth of each for user input
		double pennyWorth = pennies*(0.01);
		double nickelWorth = nickels*(0.05);
		double dimesWorth = dimes*(0.1);
		double quarterWorth = quarters*(0.25);
		double totalWorth = (pennyWorth + nickelWorth + dimesWorth + quarterWorth);
		
		if(totalWorth == 1) {
			System.out.println("WINNER! The count is exactly $1.");
		} else if(totalWorth > 1) {
			double actualWorth = (totalWorth - 1);
			
			//String.format has been used with %.2f to only print 2 decimal values
			System.out.println("LOSE! The count is more than $1. You were up by $" + String.format("%.2f", actualWorth));
		} else if(totalWorth < 1) {
			double actualWorth = (1 - totalWorth);
			System.out.println("LOSE! The count is less than $1. You went down by $" + String.format("%.2f", actualWorth));
		} else {
			System.out.println("Invalid input. Please check.");
		}
		
	}

}
