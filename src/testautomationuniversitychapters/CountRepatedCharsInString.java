package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to identify the number of times a character has been repeated
public class CountRepatedCharsInString {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String text = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Number of times character A has been repeated is " + count);
		sc.close();
	}

}
