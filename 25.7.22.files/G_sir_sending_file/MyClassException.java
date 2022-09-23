package try_catch;

import java.util.ArrayList;

public class MyClassException {
	
	
	public void MyMethod() {
		
		
		try {
		ArrayList  a = new ArrayList();		
		for(int i = 100; i < 121; i++) {			
			a.add(i);
		}		
		
		int h;
		int x = 0;
		int y = 0;
		int z =0;
		
		
		z = 3 / 0;
		for(int i = 0; i <31; i++) {
			
			
			x = (int) a.get(i);			
			y = x%3;			
			if (y == 0) {
				System.out.println("number divisible by 3="+a.get(i));
			}			
		}
		
		} catch(IndexOutOfBoundsException e) {
			System.err.println(e);
		} catch(ArithmeticException e) {
			System.err.println(e); // for developer
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MyClassException m = new MyClassException();
		m.MyMethod();

	}

}
