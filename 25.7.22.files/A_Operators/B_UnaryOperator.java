package myFolder;

public class B_UnaryOperator {
	
	

	public static void main(String[] args) {
		 int a, b, c;
		 a =b =c =10;
		 
		  c = c + 1; // c = 10 + 1;
		  b++;       //  b++ means 1 + b;
		  
		  System.out.println("c="+c);
		  System.out.println("b="+b);
		  
		  a =b =c =10; 
		  
		  c = c - 1;   // c = 10 - 1;
		  b--;			 //  b-- means b - 1;
		  
		  
		  System.out.println("b="+b);
		  System.out.println("c="+c);
		  
		  
		  a =b =c =10; 
		  --b;		//  --b means b - 1;
		  System.out.println("b="+b);
		  
		  int time = 15;
		  
		 if( time == 7 ) {
			 System.out.println("Hello Good Morning");			 
		 }
		  
		
		 if( time != 7 ) {
			 System.out.println("Hello Good Evening");			 
		 }
		  
		 boolean result = true;
		 
		 System.out.println("result ="+result);	
		 System.out.println("result ="+ !result);	
		 
		 a =b =c =10; 
		 System.out.println("a ="+ ~b);	
		 a = ~b;
		 System.out.println("~a ="+a);	

	}

}
