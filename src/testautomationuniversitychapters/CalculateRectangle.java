package testautomationuniversitychapters;

import java.util.Scanner;

public class CalculateRectangle {

	public static void main(String[] argas) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the triangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the triangle: ");
		double width = sc.nextDouble();

		// Instantiating Room 1 with default constructor
		Rectangle room1 = new Rectangle();
		double room1Area = room1.calculateArea();
		double room1Perimeter = room1.calculatePerimeter();

		// Instantiating Room 2 with parameterized constructor
		Rectangle room2 = new Rectangle(10, 20);
		double room2Area = room2.calculateArea();
		double room2Perimeter = room2.calculatePerimeter();

		// Instantiating Room 3 with user input parameters in constructor
		Rectangle room3 = new Rectangle(length, width);
		double room3Area = room3.calculateArea();
		double room3Perimeter = room3.calculatePerimeter();

		// Room1 output
		System.out.println("Below is the output for Room1 with default constructor:\n" + "Length = " + room1.length
				+ "\nWidth = " + room1.width + "\n" + "Area = " + room1Area + "\nPerimeter = " + room1Perimeter);

		// Room2 output
		System.out
				.println("Below is the output for Room2 with parameterized constructor:\n" + "Length = " + room2.length
						+ "\nWidth = " + room2.width + "\nArea = " + room2Area + "\nPerimeter = " + room2Perimeter);

		// Room3 output
		System.out.println("Below is the output for Room3 with user input constructor:\n" + "Length = " + room3.length
				+ "\nWidth = " + room3.width + "\nArea = " + room3Area + "\nPerimeter = " + room3Perimeter);

		sc.close();
	}
}
