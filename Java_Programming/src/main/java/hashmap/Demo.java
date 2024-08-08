package hashmap;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("USA", "New York");
		
		System.out.println(capitalCities);
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		people.put("John", 24);
		people.put("Amy", 44);
		
		
		for(String i : people.keySet()) {
			System.out.println("key: " + i + " value: " + people.get(i));
		}
	}
}
