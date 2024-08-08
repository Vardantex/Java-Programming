package polymorphism;

public class Dogs extends Animals{

	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}



class Cat extends Animals{
	
	
	@Override
	void makeSound () {
		System.out.println("Meow");
	}
}