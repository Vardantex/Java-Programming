package abstraction;

public class Demo {

	
	public static void main(String[] args) {
		
		Shape circle = new Circle(5);
		
		Shape rectangle = new Rectangle(4, 7);
		
		System.out.println("Area of a circle: " + circle.calculateArea());
		
		System.out.println("Area of a Rectange: " + rectangle.calculateArea());
		
	}
}
