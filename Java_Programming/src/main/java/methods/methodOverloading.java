package methods;

public class methodOverloading {

	static void printValue(int value) {
		
		System.out.println("Integer value: " + value);
	}
	
	static void printValue(double value) {
		
		System.out.println("Double value: " + value);
	}
	
	public static void main(String[] args) {
		
		printValue(33);
		
		printValue(3.54);
		
	}
}
