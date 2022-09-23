package inheritance.project;
 
 public class Child extends Parent{
	
	public void hotel()
	{
		System.out.println("hotel");
	}
	public void parks()
	{
		System.out.println("parks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.hotel();
		c.parks();
		c.banglow("from parent");
		c.car();
		c.cart();
		c.farms("first calling grand parent to parent ","second calling parent to child");
		c.cottage();
	
		
		
	}

}
