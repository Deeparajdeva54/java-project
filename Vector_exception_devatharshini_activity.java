package exception.project;

import java.util.Vector;

public class Vector_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		v.add("apple");
		v.add("mango");
		v.add("orange");
		v.add("papaya");
		v.add("banana");
		int i=0;
		try {
		for(i=6;i>=0;i--)
		{
			System.out.println(v.get(i));
		}
		}
		catch(Exception A)
		{
			System.err.println("array Indexout Bound ");
			System.out.println("array Indexout Bound ");
		}
		for(i=0;i<=4;i++)
		{
			System.out.println(v.get(i));
		}
		
		}
		
		

	}


