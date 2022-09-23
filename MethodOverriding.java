package BasicFeature.polymorphism;


class Birds{
	
	// overridden
	//static public void doFly() {		
	 public void doFly(int x) {	
		System.out.println("I have wings");
	}
	 
	 public void doSound( String str) {
		 System.out.println(" doSound ="+ str);
	 }
}


public class MethodOverriding extends Birds  {
	
	//overriding
	public void doFly(int y) {
		System.out.println("I am Light weight");
	}
	
	
	

	public static void main(String[] args) {
		
		MethodOverriding m = new MethodOverriding();
		m.doFly(5);
		m.doSound("pihu pihu");
		
	}

}
