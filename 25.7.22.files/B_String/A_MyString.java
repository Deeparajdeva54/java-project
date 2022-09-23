package string_info;

public class A_MyString {

	public static void main(String[] args) {
		
		String myString1 = "";    // Empty string
		String myString2 = null; // null String
		String myString = " I Love India";
		String str = "x";
		String str1 = "yogesh";
		
		System.out.println("given String ="+myString1);
		System.out.println("given String ="+myString2);
		System.out.println("given String ="+myString);
		
		String str2 = new String("java");		
		System.out.println("given String ="+str2);
		
		String str3 = new String();
		str3 = "HTML";
		System.out.println("given String ="+str3);
		
		
		String name = "Ravindranath";
		String surName = " Thakur";
		String join = name + surName;
		System.out.println("given String ="+join);
		String join1 = name.concat(surName);
		System.out.println("given String ="+join1);
		
		int x = name.length();
		System.out.println("given String length ="+x);
		
		char [] j = {'j','k'};
		
		//name.getChars(3, 5,j , 7);
		System.out.println("given String length ="+ x);
		
		String str4 = "zxcvbnmlkjhgfdsaqwss";
		char c[]=new char[20];
		str4.getChars(0,5,c,0);
		System.out.println(c);
		for(char output :c) {
			System.out.println(output);			
		}
		
		System.out.println("Char at index val="+str4.charAt(3));	
		System.out.println("Compare="+str4.compareTo(myString));	
		
	}

}
