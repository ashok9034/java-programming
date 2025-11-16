package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test SWITCH statements
public class SwitchProgram {
	
	public static void main(String args[]) {
		
		//Print the message based on the grade received by students
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the grade?");
		String grade = sc.next();
		sc.close();
		
		String message;
		
		switch (grade) {
		case "A":
			message = "Outstanding";
			break;
		case "B":
			message = "Excellent";
			break;
		case "C":
			message = "Average";
			break;
		case "D":
			message = "Needs Imporvement";
			break;
		case "F":
			message = "Failed";
			break;
		default:
			message = "Error";
			break;
		}
		
		System.out.println("Remarks: " + message);
	}

}
