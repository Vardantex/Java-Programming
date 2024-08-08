package lambda;

import java.util.Arrays;
import java.util.List;

interface MyFunctionalInterface {
	
	void myMethod();
	
}


public class LambdaDemo {

	
	public static void main(String[] args) {
	
//		Use interface on line 6 with a lambda expression 
		MyFunctionalInterface myLambda = () -> System.out.println("Hello from Lambda");
		
		myLambda.myMethod();
		
		
		List<String> names = Arrays.asList("Alice","Bob","Charlie");
		names.forEach(name -> System.out.println("Hello " + name));
		
	}
}
