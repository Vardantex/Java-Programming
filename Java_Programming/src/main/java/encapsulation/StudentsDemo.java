package encapsulation;

public class StudentsDemo {

	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setName("Amy Rose");
		student1.setAge(22);
		
		System.out.println("Student Name: " + student1.getName());
		System.out.println("Student Age: " + student1.getAge() );
	}
}
