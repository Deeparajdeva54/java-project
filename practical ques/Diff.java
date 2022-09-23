package practicalEX;

import java.util.Scanner;

public class Diff {
	
public int secondMaxMinDiff(int a[],int n)
    {
	
	int temp=0;
	
	
	
	
	
	for( int i=0;i<=n;i++)
	{
		for( int j=i+1;j<=n;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	
	
	System.out.println(a[n-1]-a[1]);

	return temp;
	
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("Enter the element :"+n);
      if(n<0)
      {
    	  System.out.println("invalid input");
    	  System.exit(0);
      }
      int a[]=new int[10];
      int i=0;
      for(i=0;i<=n;i++)
      {
    	  a[i]=s.nextInt();
    	  if(a[i]<0)
    	  {
    		  System.out.println("invalid input");
    		  System.exit(0);
    	  }
      }
		Diff d=new Diff();
		d.secondMaxMinDiff(a, n);
	}

}
