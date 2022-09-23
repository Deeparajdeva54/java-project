package array.project;

public class Md_array_det {

	public static void main(String[] args) {
		
		int MD_arr[][]={{1,2,3,4,5,6,7,8,9}};
		
		int det1,det2,det3,Total_det;
		
		det1=((MD_arr[0][4]*MD_arr[0][8])-(MD_arr[0][5]*MD_arr[0][7]))*MD_arr[0][0];
		
		det2=((MD_arr[0][3]*MD_arr[0][8])-(MD_arr[0][5]*MD_arr[0][6]))*MD_arr[0][1];
		
		det3=((MD_arr[0][3]*MD_arr[0][7])-(MD_arr[0][4]*MD_arr[0][6]))*MD_arr[0][2];
		
		Total_det=det1-det2+det3;
		
		System.out.println("Total_det=" +Total_det);
		

		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
