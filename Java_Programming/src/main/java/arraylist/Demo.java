package arraylist;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		
		int firstNumber = numbers.get(0);
		int secondNumber = numbers.get(1);
		
		System.out.println("first Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);
		
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}
}
