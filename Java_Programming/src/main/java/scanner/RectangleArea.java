package scanner;

import java.util.Scanner;

public class RectangleArea {

	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the length: ");
		double length = keyboard.nextDouble();
		
		System.out.println("Etner the width: ");
		double width = keyboard.nextDouble();
		
		
		double area = calculateArea(length, width);
		
		
		System.out.println("Area of rectangle: " + area);
		
		
	}

	private static double calculateArea(double length, double width) {
		
		
		
		
		return length * width;
	}
}
