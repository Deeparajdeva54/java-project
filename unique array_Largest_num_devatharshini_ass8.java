package acess1.project;

import java.util.Scanner;

public class Largest_num {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print("No.of.element n="+n);
		int i=0, j=0;
		int x[]=new int[10];
		int a[]=new int[10];
		int tem=0;
		for(i=0;i<=n;i++)
		{
			x[i]=s.nextInt();
		
		}
		int k=0;
		System.out.print("unique array= ");
		for(i=0;i<=n;i++)
		{
			int flag=0;
			for(j=0;j<i;j++)
			{
				
				if(x[i]==x[j])
				{
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
				
					a[k]=x[i];
					k++;
				}
			}
			for( i=0;i<k;i++)
			{
				System.out.print(a[i]+" ");//unique array
			}
				//Auto-generated method stub
			
			System.out.println();
			System.out.print("ascending order=");
			for( i=0;i<=k;i++) {
				
				for(j=i+1;j<=k;j++)
				{
					if(a[i]!=a[j])
					{
			if(a[i]>a[j])
			{
				tem=a[i];
				a[i]=a[j];
				a[j]=tem;
				
			}
					}
				}
			}
			for(j=1;j<=k;j++)
			{
			
		System.out.print(a[j]+" ");//ascending order
			}
			System.out.println();
			
			System.out.println("second largest number="+a[n-1]);
			
	}
}


