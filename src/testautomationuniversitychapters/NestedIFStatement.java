package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test Nested IF operations
public class NestedIFStatement {

	public static void main(String args[]) {

		/**
		 * To qualify for a loan, person must make at least $30,000
		 * and have been working at their current job for at least 2 years.
		**/
		
		int eligibleSalary = 30000;
		int eligileWorkExp = 2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your salary?");
		long actualSalary = sc.nextLong();
		
		System.out.println("How many years worked in current job?");
		double actualWorkExp = sc.nextDouble();
		
		sc.close();
		
		if(actualSalary >= eligibleSalary) {
			if(actualWorkExp >= eligileWorkExp) {
				System.out.println("You've met both eligible salary and experience. Hence you're qualified for the loan.");
			} else {
				System.out.println("You met the eligible salary but not the experience. Hence, you do NOT qualify for the loan.");
			}
		} else {
			System.out.println("You did NOT meet either of the requirements. Hence, you do NOT qualify for the loan.");
		}
	}
}