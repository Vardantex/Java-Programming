package abstraction;

public class Circle extends Shape{

	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{

	double length;
	
	double width;
		
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	
}


