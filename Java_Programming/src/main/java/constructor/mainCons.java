package constructor;

public class mainCons {

	int modelYear;
	
	String modelName;

	public mainCons(int modelYear, String modelName) {
		super();
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	
	public static void main(String[] args) {
		mainCons myCar = new mainCons(1988, "Mustang");
		
		System.out.println(myCar.modelName + " " + myCar.modelYear);
	}
}
