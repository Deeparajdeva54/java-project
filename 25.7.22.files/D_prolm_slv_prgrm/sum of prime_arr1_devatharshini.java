package loops.project;

import java.util.Scanner;

public class sum_prime_arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("no.of.element in array="+n);
		int a[]=new int[10];
		int i=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();		
			}
		
		int sum=0;
		for(  i=0;i<n;i++)
		{
			int k=0;
			for(int j=2;j<=a[i];j++)
			{			
			if(a[i]%j==0) {
				
				k++;
			}
			
		}
			if(k==1)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
			}

	}
		System.out.println("sum of prime number="+sum);	
	
	}
}
