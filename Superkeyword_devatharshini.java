package supr.project;



class A {
	A()
	{
		System.out.println("IN A");
	}
   A(int i)
	{
		System.out.println("IN A int"+i);
	}
   void name() {
	   System.out.println("devatharshini");
   }
}
public class B extends A{
	B()
	{
     super();
	System.out.println("IN B");
}
	B(int i)
	{
		super(i);
		System.out.println("IN B int"+i);
	}
	void lastnmae()
	{
		super.name();
		System.out.println("tharmarajan");
	}


 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(5);
		b.lastnmae();

	}

}



	
