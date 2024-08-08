package classes;

public class StudentDemo {

	
	public static void main(String[] args) {
		
		Student student = new Student("Alice", 55); 
		
		
		System.out.println(student.name + " is their name");
		System.out.println(student.age + " is their age");
		
		System.out.println("Total Students: " + Student.totalStudents);
	
	}
}
