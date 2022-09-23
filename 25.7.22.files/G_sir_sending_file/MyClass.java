package BasicFeature.polymorphism;

public class MyClass {
	
	public int MyMethod(float x, int y , int z) {
		
		System.out.println(" MyMethod(float x, int y , int z) .. x="+y);
		
		return 0;
		
	}
	
	public void MyMethod(float x, int y ) {
		
		System.out.println(" MyMethod(float x, int y ) .. x="+y);
		
	}
	
	public void MyMethod(int x, float y) {
		
		System.out.println(" MyMethod(int x, float y) .. x="+x);
		
	}
	
	public void MyMethod() {
		System.out.println(" MyMethod  ");
	}
	
	
	
	double area = 0;
	public double area(double radious) {
		
		
		area = 3.142 * radious * radious;
		
		return area;
	}
	
	public double area(double length, int width) {
		
		
		area = length * width;
		
		return area;
	}
	
	public double area(double side , String str) {
		
		
		area = side * side;
		
		return area;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.MyMethod();
		m.MyMethod(7, 7.5f);
		m.MyMethod(25.25f, 30);
		m.MyMethod(1.5f, 10, 20);
		

	}

}
