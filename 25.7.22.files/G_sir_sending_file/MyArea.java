package BasicFeature.polymorphism;

public class MyArea {
	
	static double CircleArea = 0;
	static double RectangleArea = 0;
	static double SquareArea = 0;
	
	
	
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		CircleArea = m.area(15);
		RectangleArea = m.area(10, 50);
		SquareArea = m.area(85, null);
		
		System.out.println("CircleArea ="+ CircleArea );
		System.out.println("RectangleArea= "+RectangleArea  );
		System.out.println(" SquareArea="+ SquareArea );
	
	}

}
