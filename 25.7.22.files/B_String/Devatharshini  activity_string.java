package loops.project;

public class Deva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "deva";
		String str2= "tharshini";
		String str3=str1.concat(str2);
		System.out.println(str3);
		String str="devatharshini";
		char c[]=new char[12];
		str.getChars(0,12,c,0);
		//System.out.println(c);
		for(char output :c) {
			System.out.println(output);
			
		}
		
		String s1="Hello";
		String s2="!";
		for(int i=1;i<4;i++)
		{
			
			// output=s1.repeat(i)+s2.repeat(i);
			 
			System.out.print(  s1.repeat(i) +s2.repeat(i));
		
		}

		
		
			
	}
	
	

}
