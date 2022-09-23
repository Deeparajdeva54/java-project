package com.project.abc;

class primenumber {

	public static void main(String[] arg) {
	    int a[]= {1,2,3,4,5,6,7,8,9,10}; 
	    int num =0;
	    String  primeNumbers = "";
	    for (int i = 0; i <= a.length; i++)     
	      {                   
	         int counter=0;           
	         for(num =i; num>=1; num--)
	         {
	        if(i%num==0)
	        {
	        counter = counter + 1;
	        }
	     }
	     if (counter ==2)
	     {
	        
	        primeNumbers = primeNumbers + i + " ";
	     }  
	      } 
	      System.out.println("Prime numbers from given array :");
	      System.out.println(primeNumbers);
	     
	   }
	}