package linkedlist;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alice");
		names.add("Deku");
		names.add("Amy");
		
		String firstPerson = names.get(0);
		String secondPerson = names.get(1);
		
		
		System.out.println("First Person: " + firstPerson);
		System.out.println("Second Person: " + secondPerson);
		
		for(String i : names) {
			System.out.println(i);
		}
		
	}
}
