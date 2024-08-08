package classes;

public class Student {

	
	String name;
	
	int age; 
	
	static int totalStudents = 0;
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
		totalStudents++;
	}
	
	
}
