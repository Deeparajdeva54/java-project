package acess1.project;

class fruits extends flower{
	 public void mango()
	{
		apple();
		System.out.println("1.Mango colour is yellow");
	}
	private void apple()
	{
		System.out.println("2.Apple colour is red");
	}
	protected void orange()
	{
		System.out.println("3.Orange colour is orange");
	}

}

class flower{
	
	public void rose()
	{
		System.out.println("red colour rose is very beautiful");
	}
	
	public void lotous()
	{
		System.out.println("lotous is our national flower");
	}
	
	public void jasmine()
	{
		System.out.println("jasmine have good fragrance");
	}
}



public class Inheritance extends fruits {
	
	public void fruits_colour()
	{
		System.out.println("FRUITS COLOURS:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance I=new Inheritance();
		I.fruits_colour();
		I.mango();
		I.orange();
		//I.jasmine();
		//I.lotous();
		//I.rose();

	}

}
