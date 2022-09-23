package inheritance.project;
class grandparent{
	public void  farms() {
		
		System.out.println("farms");
		}
	public void cart () {
			
		System.out.println("cart");
		}
	public void  cottage() {
		
		System.out.println("cottage");
		
	}
}
class parent1 extends grandparent{
public void car () {
		
		System.out.println("parent buy audi car");
	}
	public void banglow()
	{
		System.out.println("bigbanglow");
	}
}

public class Child_1 extends parent1{
public void car () {
		
		System.out.println("child buy BMW car");
	}
public void themepark()
{
	System.out.println("theme park");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Child_1 c=new  Child_1();
		 c.car();
		 c.banglow();
		 c.cart();
		 c.farms();
         c.cottage();
         c.themepark();
		 
		 
	}

}
