package inheritance.project;
	
public class Parent extends  GrantParent {
	
	public void car () {
		
		System.out.println(" car");
	}
	public void banglow(String str)
	{
		System.out.println(" big  banglow"+str);
	}
	

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.banglow("parent");
		p.car();
		//p.farms("from grand parent"," now in parent");
		p.cottage();
		p.cart();
		
				
		// TODO Auto-generated method stub

	}

}
