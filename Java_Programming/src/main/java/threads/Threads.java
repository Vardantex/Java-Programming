package threads;

public class Threads implements Runnable {
	


	
	public static void main(String[] args) {
		
		Threads obj = new Threads();
		
		Thread thread = new Thread(obj);
		thread.start();
		
		System.out.println("This code is outside of the thread");
		
		
	}
	
	
	@Override
	public void run() {
		
	System.out.println("This code is running in a thread");	
	}
	
}
