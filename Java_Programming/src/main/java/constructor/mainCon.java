package constructor;

public class mainCon {

	int x; 
	public mainCon() {
		x = 10;
	}
	
	public static void main(String[] args) {
		
		mainCon myObj = new mainCon();
		
		System.out.println(myObj.x);
	}
}
