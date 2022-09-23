package com.project;

public class Typecasting {

	public static void main(String[] args) {
          int a = 90;   
		
		float b = 90F;
		
		double c = 90.99D;
		
		
		String d = "30";
		
		
		int H = a + (int)b;  // type casting from float to int		
		System.out.println("H = "+H);
		
		float f = a + b;
		System.out.println("f = "+f); // to convert float no need to use type castint
		
		int g = a + (int)c;
		System.out.println("g = "+g); //  type casting from double to int	
	 
		int j=a+Integer.parseInt(d);//  type casting from String to int
		System.out.println("j = "+j);
		
		
		double k=c+Double.parseDouble(d);
		System.out.println("k = "+k);//type casting from string to double
		
		float l=(float) c+Float.parseFloat(d);		
		System.out.println("l = "+l);
		
		
		String h = Integer.toString(a) +Double.toString(c);
		System.out.println("h = "+h);
		int x=a+(int)c;
		String y=String.valueOf(x);
		System.out.println("y= "+y);
		
		

		// TODO Auto-generated method stub

	}

}
