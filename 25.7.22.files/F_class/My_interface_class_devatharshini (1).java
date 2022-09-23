package com.project;

public class My_interface_class implements  Myinterface{
	
	public void mymethod()
	{
		System.out.println("mymethod....");
	}
	public void urmethod()
	{
		System.out.println("urmethod....");
	}
	public void ourmethod() {
		
		System.out.println("ourmethod....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_interface_class I=new My_interface_class();
		I.mymethod();
		I.urmethod();
		I.ourmethod();

	}

}
