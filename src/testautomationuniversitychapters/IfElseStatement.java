package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test IF-ELSE operations
public class IfElseStatement {
	
	public static void main(String args[]) {
	
		//All salesperson expected to meet a target of 10 sales per week
		//For those who met, get a congratulation message
		//For those who don't, they're informed how many sales they fell short
		
		int salesTarget = 10;
		String congratsMessage = "Congratulations! You reached the target of 10 sales/week";
		String failureMessage = "Unfortunately, you didn't meet the target of 10 sales/week. You fell short of ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many sales were made this week?");
		int salesMade = sc.nextInt();
		
		sc.close();
		
		if(salesMade >= salesTarget) {
			System.out.println(congratsMessage);
		} else {
			System.out.println(failureMessage + (salesTarget-salesMade) + " sales.");
		}
	}

}
