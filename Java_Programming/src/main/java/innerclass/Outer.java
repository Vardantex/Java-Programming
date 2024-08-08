package innerclass;

public class Outer {

	
	private int outerVar = 10;
	
	class Inner{
		void display() {
			System.out.println("Value of outderVar: " + outerVar );
		}
	}
}
