package loops.project;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=s.nextInt();
		do {
			System.out.print("["+i+"]");
			i++;
		}
		
		while(i<=n);
		System.out.println();
		// TODO Auto-generated method stub
		int mul=7,j=1,mul1=9;
		do {
			System.out.print(mul*j);
			System.out.print(" ");
			System.out.println(mul1*j);
			j++;
		}
		while(j<=10);

	}

}
