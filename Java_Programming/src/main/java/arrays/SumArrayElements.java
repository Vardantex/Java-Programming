package arrays;

import java.util.Scanner;

public class SumArrayElements {

	
	
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int size = keyboard.nextInt();
		
//		Create an array with a fixed size
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("element: " + (i+1) + ":");
			array[i] = keyboard.nextInt();
			
		}
		
		int sum = findSum(array);
		System.out.println("sum of array element: " + sum);
		keyboard.close();
	}

	private static int findSum(int[] array) {
		int sum = 0;
		
		for(int value : array) {
			sum += value;
		}
		
		return sum;
	}
}
