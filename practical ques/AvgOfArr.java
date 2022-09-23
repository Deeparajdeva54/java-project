package practicalEX;

import java.util.Scanner;

public class AvgOfArr {
	
	public float avg(int a[],int n)
	{
		int sum=0;
		for( int j=0;j<n;j++)
		{
			sum=sum+a[j];
		}
		float Avg=sum/n;
		//System.out.println(Avg);
		return Avg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 Scanner s=new Scanner(System.in);
     int n=s.nextInt();
    // System.out.println("Enter the element :"+n);
     if(n<0||n>20)
     {
   	  System.out.println("invalid input");
   	  System.exit(0);
     }
     int a[]=new int[n];
     int i=0;
     for(i=0;i<n;i++)
     {
   	  a[i]=s.nextInt();
   	  if(a[i]<0)
   	  {
   		  System.out.println("invalid input");
   		  System.exit(0);
   	  }
     }
     
     AvgOfArr A=new AvgOfArr();
    float f= A.avg(a, n);
  System.out.println(String.format("%.2f", f));
     
     
     
	}
}
