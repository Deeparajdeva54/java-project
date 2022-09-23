package acess2.project;

 class Area1  {
	
	public double area(double a)
	{
		System.out.println("area of square a ="+a*a);
		
		return 0.0 ;
	}
	public double area(float r)
	{
		System.out.println("area of circle a ="+3.14*r*r);
		
		return 0.0 ;
	}
	public double area(double l,double b)
	{
		System.out.println("area of rectangular a ="+l*b);
		
		return 0.0 ;
	}
 }
	public class Area_of_scr extends Area1 {
		
		public void rectangular(int l,int b)
		{
			System.out.println("area of rectangular a ="+l*b);
		}
		
	
 

	public static void main(String[] args) {
		
		Area_of_scr A=new Area_of_scr();
		A.area(2.5);
		A.area(4.5);
		A.area(2.5, 4.5);
		A.rectangular(2,3);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
