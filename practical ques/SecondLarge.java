package practicalEX;

import java.util.Scanner;

public class SecondLarge {
	
	public int secondlarge(int num)
	{
		int j=0;
		int i=0;
		int count=0;
		int a[]=new int[10];
		for( i=1;i<num;i++)
		{
			 if((num%i)==0)
			{
			a[j]=i;
			j++;
			count++;
			}
			
			
		}
		int temp=0;
		int k=0;
		int b=0;
		for(j=0;j<count;j++)
		{	
			for( k=j+1;k<count;k++)
			{
				if(a[j]>a[k])
				{
				temp=a[j];
				a[j]=a[k];
				a[k]=temp;
				}
			}
		
		}
		
			System.out.println(a[b+1]);
			return b ;
			
		
	}
	


	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("enter the nuumber:"+num);
		if(num<0||num>32767)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		SecondLarge l=new SecondLarge();
		l.secondlarge(num);
		
		
	}

}
