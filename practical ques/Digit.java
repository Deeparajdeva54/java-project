package practicalEX;

import java.util.Scanner;

public class Digit {
	
	public int CountDigit(int n)
	{
		int digit=0;
		int count=0;
		while(n>0)
		{
		 digit=n%10;
		n=n/10;
		count++;
		
		}
		
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
	     // System.out.println("Enter the element :"+n);
	      if(n<0)
	      {
	    	  System.out.println("invalid input");
	    	  System.exit(0);
	      }
	      Digit d=new Digit();
	    int  D= d.CountDigit(n);
	    
	     System.out.println(D);

	}

}
