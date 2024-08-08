package modifiers;

public class StaticDemo {

	static int count=0;
	
	public StaticDemo() {
		count++;
	}
	
	
	public static void displayCount() {
		System.out.println("Count: " + count);
	}
}
