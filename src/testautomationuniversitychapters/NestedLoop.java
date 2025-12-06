package testautomationuniversitychapters;

import java.util.Scanner;

//This class is to implement NESTED loops
public class NestedLoop {
	
	public static void main(String args[]) {
		
		/**
		 * Calculate the average of test scores for each student
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nunmber of students:");
		int students = sc.nextInt();
		
		System.out.println("Enter the number of subjects:");
		int subjects = sc.nextInt();
		
		double average = 0;
		
		for(int i = 0; i < students; i++) {
			double totalScore = 0;
			for(int j = 0; j < subjects; j++) {
				System.out.println("Enter the score for Test #" + (j+1));
				double subjectScore = sc.nextDouble();
				totalScore = totalScore + subjectScore;
			}
			average = totalScore/subjects;
			System.out.println("The average score of Student #" + (i+1) + " is " + String.format("%.2f", average));
		}
		System.out.println("End of code...");
		sc.close();
	}

}
