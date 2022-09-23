package inheritance.project;

 class Grandfather{
	
	public void G()
	{
		System.out.println("grandfather");
	}
}
 class Parent1 extends Grandfather
 {
	 public void P1()
	 {
		 System.out.println("Parent1");
	 }
 }
 class parent2 extends Grandfather
 {
	 public void P2() {
		 
		 System.out.println("Parent2");
	 }
 }
 class child_A_p1 extends Parent1 {
	 public void childA() {
		 
		 System.out.println("childA_p1");
	 }
 }
 class child_B_p1 extends Parent1 {
	 public void childB() {
		 
		 System.out.println("childB_p1");
	 }
 }
 class child_C_p2 extends parent2 {
	 public void childC() {
		 
		 System.out.println("childC_p2");
	 }
 }
 public class Child_D_p2 extends parent2{
	 public void childD() {
		 
		 System.out.println("childD_p2");
	 }
 
 
	 
	public static void main(String[] args) {
		
		 Child_D_p2 c=new  Child_D_p2();
		 c.childD();
		 c.P2();
		 c.G();
		 child_C_p2 c1=new child_C_p2 ();
		 c1.childC();
		 
		 
		 
		 
		
		// TODO Auto-generated method stub

	}

}
