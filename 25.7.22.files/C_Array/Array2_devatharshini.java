package array.project;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= {10,20,30,40,50};//array1

		
		System.out.println(marks[0] );
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		int [] percentage= {25,35,45,65,55};//array2
		System.out.println(percentage[0] );
		System.out.println(percentage[1]);
		System.out.println(percentage[2]);
		System.out.println(percentage[3]);
		System.out.println(percentage[4]);
		
		int [] add;
		add=new int[5];//addition of array1 and array2
		add[0]=marks[0]+percentage[0];
		add[1]=marks[1]+percentage[1];
		add[2]=marks[2]+percentage[2];
		add[3]=marks[3]+percentage[3];
		add[4]=marks[4]+percentage[4];
		System.out.println(add[0]);
		System.out.println(add[1]);
		System.out.println(add[2]);
		System.out.println(add[3]);
		System.out.println(add[4]);
		
		
		
		
		//add=marks[0]+percentage[0];
		//System.out.println("add=" +add);
		
		
		

}
}
