package interfaces;


interface FirstInterface {
	
	public void myOtherMethod();
}

interface SecondInterface {
	public void myMethod();
}

class Democlass implements FirstInterface, SecondInterface {

	@Override
	public void myMethod() {
		System.out.println("Hello World!");
		
	}
	
	public void myOtherMethod()  {
		System.out.println("This is other print line");
	}
}

public class Interfaces {

	
	
	public static void main(String[] args) {
		Democlass myObj = new Democlass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
