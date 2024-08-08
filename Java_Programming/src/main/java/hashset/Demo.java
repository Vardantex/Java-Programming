package hashset;

import java.util.HashSet;

public class Demo {

	
public static void main(String[] args) {
	
	HashSet<Integer> number = new HashSet<Integer>();
	
	number.add(5);
	number.add(7);
	number.add(9);
	
	for(int i =1; i <= 10; i++) {
		if (number.contains(i)){
			System.out.println(i + " was found in the set");
		} else {
			System.out.println(i + " was not found in the set");
		}
	}
}	
}
