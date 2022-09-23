package exception.project;

public class Finally_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=10,c=0;
		int x=20;
		String str=null;
		int l=0;
		int arr[]= {10,20,30,40,50};
	
		try {
		c=x/(a-b);
		}
		catch(ArithmeticException A)
		{
			System.err.println("Arithemetic Exception"+A);
		}
		finally {
			System.out.println("Arthemetic exception");
		}
		try {
			 l=str.length();
		}
		catch(NullPointerException B)
		{
			System.err.println("NullPointerException"+B);
		}
		try {
			System.out.println("arr[5]"+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException C) {
			System.err.println("ArrayIndexOutOfBoundsException"+C);
		}
		finally {
			System.out.println("Types of Exception");
		}
		///System.out.println("c="+c);

	}

}
