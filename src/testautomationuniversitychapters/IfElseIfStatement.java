package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to test IF-ELSE IF operations
public class IfElseIfStatement {
	
	public static void main(String args[]) {
		
		//Based on the results, students should get the grades
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the total marks of the student out of 100?");
		int marks = sc.nextInt();
		sc.close();
		
		//Method #1 (as per the course)
		char grade;
		
		if(marks < 60) {
			grade = 'F';
		} else if(marks < 70) {
			grade = 'D';
		} else if(marks < 80) {
			grade = 'C';
		} else if(marks < 90) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		System.out.println("Your grade is " + grade);
		
		//Method #2 (my own method)
		if(marks >= 90 && marks <= 100) {
			System.out.println("Student got the grade A+");
		} else if(marks >= 80 && marks < 90) {
			System.out.println("Student got the grade A-");			
		} else if (marks >= 70 && marks < 80) {
			System.out.println("Student got the grade B+");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("Student got the grade B-");
		} else if (marks >= 0 && marks <60) {
			System.out.println("Student got the grade F");
		} else {
			System.out.println("ERROR: Please check your input.");
		}
	}

}
