package mypackage;

import java.lang.reflect.Array;

public class Hello { 
	
	
  Hello()  { 
     System.out.println("Hello Java"); 
  } 
  
  
public static void main(String[] args) 
{ 
	Hello h1 = new Hello();
	
	
	
 // Create an array object. 
      Hello[] h = new Hello[4]; 
      
      for(int i=1; i < h.length; i++ )
      { 
        h[i] = new Hello(); 
      } 
    } 
 }

