package wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer myInt = new Integer(42);
		
		int primitiveInt = myInt.intValue();
		
		Integer num1 = 10;
		Integer num2 = 20;
		
		int result = num1.compareTo(num2);
		
		System.out.println("Compareison result: " + result);
		
		
	}
}
