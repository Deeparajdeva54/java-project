package inheritance.project;

public class GrantParent
{
public void  farms(String msg,String msg2) {
		
	System.out.println(" farms"+msg +msg2);
	}
public void cart () {
		
	System.out.println(" cart");
	}
public void  cottage() {
	
	System.out.println(" cottage");
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrantParent g=new GrantParent();
		g.cottage();
		g.cart();
		//g.farms();
	}
}
	