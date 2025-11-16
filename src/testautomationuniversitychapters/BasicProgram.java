package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test basic arithmetic operation
public class BasicProgram {
	
	public static void main(String args[]) {
		
		//Get the number of hours an employee worked
		System.out.println("Enter the number of hours an employee worked:");
		Scanner sc = new Scanner(System.in);
		int hoursWorked = sc.nextInt();
		
		//Get the hourly rate for the employee
		System.out.println("Enter the hourly rate for the employee:");
		double hourlyRate = sc.nextDouble();
		sc.close();
		
		//Calculate the employee's gross pay
		double grossPay = (hoursWorked * hourlyRate);
		System.out.println("The gross pay for the employee is $" + grossPay);
		
	}
}
