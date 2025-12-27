package testautomationuniversitychapters;

import java.util.Scanner;

public class Palindrome {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int db = sc.nextInt();
		String sdb = String.valueOf(db);
		
		StringBuilder sb = new StringBuilder(sdb);
		String rsdb = sb.reverse().toString();
		
		if (sdb.equals(rsdb)) {
			System.out.println("The number is a palindrome: " + db);
		} else {
			System.out.println("The number is NOT a palindrome: " + db);
		}
		
		sc.close();
	}

}
