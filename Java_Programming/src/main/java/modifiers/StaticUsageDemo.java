package modifiers;

public class StaticUsageDemo {

	
	public static void main(String[] args) {
		
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		
		
		System.out.println("Count from obj1: " + obj1.count);
		System.out.println("Count from obj2: " + obj2.count);
		
		
		StaticDemo.displayCount();
		
	}
}
