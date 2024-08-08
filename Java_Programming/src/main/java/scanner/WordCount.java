package scanner;

import java.util.Scanner;

public class WordCount {

	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence or a paragraph: ");
		String inputText = keyboard.nextLine();
		
		int wordCount = countWords(inputText);
		
		System.out.println("Word Count: " + wordCount);
		keyboard.close();
		
	}

	private static int countWords(String inputText) {
		// TODO Auto-generated method stub
		
		if(inputText == null || inputText.isEmpty()) {
			
			return 0;
		}
		
//		Split into words using white space as delimiter
		String[] words = inputText.split("\\s+");
			
		return words.length; 
		
	}
}
