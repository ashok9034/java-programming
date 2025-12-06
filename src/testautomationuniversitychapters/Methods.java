package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test methods in java
public class Methods {

	public static void main(String args[]) {
		
		/**
		 * Ask user for their name and then greet them
		 */
		System.out.println("Hello! " + askName() + " Nice to meet you!");
		
	}
	
	public static String askName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		sc.close();
		return name;
	}
}
