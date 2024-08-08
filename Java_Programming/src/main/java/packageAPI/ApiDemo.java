package packageAPI;

import java.util.ArrayList;

public class ApiDemo {
	
	
public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	
	for( int num : numbers) {
		System.out.println(num);
	}
	
	}
}
