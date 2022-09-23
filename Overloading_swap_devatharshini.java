package acess1.project;

public class Overloading_swap {

	public void mymethod(String str,float f1,float f2)
	{
		System.out.println("mymethod String str,float f1,float f2");
	}
	public void mymethod(float f1,String str,float f2)
	{
		System.out.println("mymethod float f1,String str,float f2");
	}
	public void mymethod(float f2,float f1,String str)
	{
		System.out.println("mymethod float f2,float f1,String str) ");
	}
	public void mymethod(String str,float f1,float f2,int a)
	{
		System.out.println("mymethod String str,float f1,float f2 int a");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_swap o=new Overloading_swap();
		o.mymethod("deva", 0.5f, 0.4f);
		o.mymethod(.5f, null, 0.5f);
		o.mymethod(6.5f, 2.5f, null);
		o.mymethod(null, 0.5f, 0.5f, 4);
		

	}

}
