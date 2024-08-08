package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Deku");
		names.add("Ochako");
		names.add("Endeavor");
		
//		Iterate throug the array list
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			
			System.out.println(name);
		}
		
		
	}
}
