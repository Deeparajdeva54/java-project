package practicalEX;

import java.util.Scanner;

public class Prime_Prd {
	
	public int productPrimedigits(int num)
	{
		int digit=1;
		int prod=1;
		int k=0;
		int i=0;
		int arr[]=new int[10];
		while(i<=num)
		{
			
		if(num<32767)
		{
			
			arr[i]=num%10;
			num=num/10;
			
		}
		
		else
		{
			System.out.println("invalid input");
			System.exit(0);
			
		}
		i++;
			k++;
		}
		
		for(i=0;i<k;i++)
		{
			int flag=0;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				prod=prod*arr[i];
				
			
				
			}
		}
		System.out.println(prod);
		return prod;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("enter the nuumber:"+num);
		if(num<0)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		Prime_Prd p=new Prime_Prd();
		p.productPrimedigits(num);
		
		
		

	}

}
