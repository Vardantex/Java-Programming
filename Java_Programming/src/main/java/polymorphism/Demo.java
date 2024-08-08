package polymorphism;

public class Demo {

	
	
	public static void main(String[] args) {
		
		Animals[] animals = new Animals[3];
		
		animals[0] = new Dogs();
		animals[1] = new Cat();
		animals[2] = new Dogs();
		
		
		
		for (Animals animals1 : animals) {
//			System.out.println(animals1);
			animals1.makeSound();
			
		}
	}
}
