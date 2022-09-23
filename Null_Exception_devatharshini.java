package exception.project;

public class Null_Exception_devatharshini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		int l=0;
		
		try {
			l=str.length();
		}
		catch( Exception l2)
		{
			System.err.println("....L2...."+l2);
		}
		
		String str1="devatharshini";
		int l1=str1.length();
		System.out.println("length of string str1"+l1);
		
		

	}

}
