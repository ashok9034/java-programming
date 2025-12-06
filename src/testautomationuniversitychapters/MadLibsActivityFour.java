package testautomationuniversitychapters;

import java.util.Scanner;

public class MadLibsActivityFour {

	/**
	 * Allow the user to input the plan fee and the number of coverage minutes. And
	 * then you're going to charge 25 cents for every minute that they've gone over,
	 * and then a 15% tax on the sub-total. Create separate methods to calculate the
	 * tax, to calculate the coverage fees, and to calculate and print the final
	 * total. Please print this as an itemized bill.
	 */
	static Scanner sc = new Scanner(System.in);
	static double overCharge = 0.25;
	static double extraTax = 15;

	public static void main(String args[]) {

		double planFee = getPlanFee();
		double overMinutes = overageMinutes();
		double overageFee = overageFees(overMinutes);
		double totalTax = calculateTax(planFee, overageFee);
		double totalFees = coverageFees(planFee, overageFee, totalTax);
		printBill(planFee, overageFee, totalTax, totalFees);

	}

	// Ask users for plan fee
	public static double getPlanFee() {
		System.out.println("Enter base cost of the plan:");
		double planFee = sc.nextDouble();
		return planFee;
	}

	// Ask users for coverage minutes
	public static double overageMinutes() {
		System.out.println("Enter overage minutes:");
		double overMinutes = sc.nextDouble();
		return overMinutes;
	}

	// Calculate overage fees
	public static double overageFees(double overMins) {
		if (overMins > 0) {
			double overFees = (overMins * overCharge);
			return overFees;
		} else {
			return overMins;
		}
	}

	// Calculate the tax
	public static double calculateTax(double planFee, double overageFee) {
		double total = (planFee + overageFee);
		double tax = total * (extraTax / 100);
		return tax;
	}

	// Calculate the coverage fees
	public static double coverageFees(double planFee, double overageFee, double tax) {
		double totalFees = (planFee + overageFee + tax);
		return totalFees;
	}

	// Print the final bill
	public static void printBill(double planFee, double overageFee, double tax, double totalBill) {
		System.out.println(
				"Phone Bill Statement:\n" + "Plan: $" + String.format("%.2f", planFee) + "\nOverage: $" + overageFee
						+ "\nTax: $" + String.format("%.2f", tax) + "\nTotal: $" + String.format("%.2f", totalBill));
	}

}
