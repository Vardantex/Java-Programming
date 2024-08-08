package scanner;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String inputString = keyboard.nextLine();
		
		String reversedString = reverseString(inputString);
		
		System.out.println("Reversed String: " + reversedString);
		
		keyboard.close();
		
	}

//	Create the method to reverse string with StringBuilder 
	private static String reverseString(String inputString) {
		
		
		if (inputString == null || inputString.isEmpty()) {
			return inputString;
		}
		
		StringBuilder reversed = new StringBuilder(inputString).reverse();
		
		
		return reversed.toString();
	}
}
