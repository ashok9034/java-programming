package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to print Strings and Integers by appending them
public class MadLibsActivityOne {

	public static void main(String[] args) {
		//Create a program that asks a user for a season of the year, then a whole number, then an adjective.
		//And use the input to complete the sentence below. Output the result.

		//Ask the user for the season of the year
		System.out.println("What's the season of the year?");
		Scanner sc = new Scanner(System.in);
		String season = sc.next();
		
		//Ask the user for a whole number
		System.out.println("Type any number:");
		int number = sc.nextInt();
		
		//Ask for an adjective
		System.out.println("How's the weather today?");
		String weather = sc.next();
		sc.close();
		
		//Print final statement
		System.out.println("On a " + weather + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
		
	}

}
