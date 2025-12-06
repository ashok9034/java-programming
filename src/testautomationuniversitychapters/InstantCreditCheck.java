package testautomationuniversitychapters;

import java.util.Scanner;

public class InstantCreditCheck {

	static double eligibleSalary = 30000;
	static double eligibleCredit = 700;
	//static boolean eligible = true;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		/**
		 * Instant credit check that approves anyone who makes more than $25000 and has
		 * credit score of 700. Rest all should be rejected
		 */
		double actualSalary = getSalary();
		double actualCredit = getCredit();
		boolean qualified = isQualified(actualSalary, actualCredit);
		greetMessage(qualified);
		sc.close();
		
	}
	
	//Get the Salary
	public static double getSalary() {
		System.out.println("Enter your salary:");
		double actualSalary = sc.nextDouble();
		return actualSalary;
	}
	
	//Get the Credit Score
	public static double getCredit() {
		System.out.println("Enter your Credit score:");
		double actualCredit = sc.nextDouble();
		return actualCredit;
	}
	
	//Check if qualified
	public static boolean isQualified(double actualSalary, double actualCredit) {
		if(actualSalary >= eligibleSalary && actualCredit >= eligibleCredit) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Print message
	public static void greetMessage(boolean isQualified) {
		if(isQualified) {
			System.out.println("You're qualified");
		} else {
			System.out.println("You're not qualified");
		}
	}

}
