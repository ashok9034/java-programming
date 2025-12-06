package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to implement WHILE loop
public class WhileLoop {
	
	public static void main(String args[]) {
		
		/**
		 * Employee make $15 per hour
		 * Employee can only work for 40 hours/week, no overtime allowed
		 * Accept input of the hours worked and print the pay
		 */
		
		int hourRate = 15;
		int maxHours = 40;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of hours the Employee worked:");
		double hoursWorked = sc.nextDouble();
		
		while(hoursWorked > maxHours || hoursWorked < 1) {
			System.out.println("Invalid input, try again.");
			hoursWorked = sc.nextDouble();
		}
		
		double payRate = hoursWorked*hourRate;
		System.out.println("Salary to be paid to the Employee is $" + payRate);
		
		sc.close();
	}

}
