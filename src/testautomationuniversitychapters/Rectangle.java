package testautomationuniversitychapters;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length*width;
	}
	
	public double calculatePerimeter() {
		return (2*length) + (2*width);
	}

}
