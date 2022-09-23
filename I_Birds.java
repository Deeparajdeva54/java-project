package a_MethodCalling;

public class I_Birds extends H_Animal {
	
	public  void sound() {
		System.out.println("  sound  " );
	}
	
	public void colour() {
		
		System.out.println("  colour  " );
	}
	
	public void run() {
		System.out.println("   run " );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I_Birds b = new I_Birds();
		b.sound();
		b.colour();
		b.run();
		b.legs();
		b.wings();

	}

}
