package com.project;

public class Variablescope {

	int x=544;//instance or global variable used only for class methods
	static int y=94;//static variable used for any methods and main method also
	public void Method1() {
		System.out.println("method1.....DD.." +x);
		System.out.println("y=" +y);
		
		}
	public void Method2() {
		System.out.println("method2....DH.." +x);
	}
	public Variablescope(){
		System.out.println("constructor....");
		//constructor means the class name and the method name will be same
		
	}

	public static void main(String[] args) {
		System.out.println("y=" +y);
		Variablescope vs =new Variablescope();//call construcot and intialise the variable vs
		vs.Method1();//call method1,vs is variable
		vs.Method2();//call method2
		
		
		
		// TODO Auto-generated method stub

	}

}
