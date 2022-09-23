package acess2.project;

public class Area {
	
	public void area(int a){
	
		System.out.println("area of square a ="+a*a);
	}
public void area(float l,int b){
	
	System.out.println("area of rectangular a ="+l*b);
		
	}
public void area(float r){
	
	System.out.println("area of circle a ="+3.14*r*r);
	
}
	public static void main(String[] args) {
		
		Area A=new Area();
		A.area(2);
		A.area(2.5f, 3);
		A.area(2.5f);
		
		// TODO Auto-generated method stub

	}

}
