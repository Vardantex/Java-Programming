package innerclass;

public class Demo {

	
public static void main(String[] args) {
//	Create an outer object
	Outer outerObj = new Outer();
	
//	Create an inner object from the same class
	Outer.Inner innerObj = outerObj.new Inner();
	
	innerObj.display();
	
}	
	 
}
