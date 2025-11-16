package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test IF operations
public class IFStatement {
	
	public static void main(String args[]) {
		
		//Employee gets paid $1000 a week
		//If sales are more than 10, then extra $250 will be paid
		int basePay = 1000;
		int extraPay = 250;
		int target = 10;
		
		Scanner sc = new Scanner(System.in);
		//Ask employee for the number of sales they worked
		System.out.println("How many sales took place this week:");
		int salesDone = sc.nextInt();
		sc.close();
		
		//Condition for extra pay
		if (salesDone > target) {
			basePay = basePay + extraPay;
		}
		
		System.out.println("Salary of the employee for the week is $" + basePay);
	}

}
