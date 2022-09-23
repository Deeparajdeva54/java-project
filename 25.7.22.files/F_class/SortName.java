package string_info;

public class SortName {
	
	String str= "Prathamesh";
	String str1 = "Dhivya";
	int length = 0;
	
	public  String names() {
		
		 String [] Names = {"Deva", "Mathan", "Mahalaxmi", "Gowtham" , "Yogita", "Suvetha","Kalif", "Srija", "Heena", "Raghunath", "Rajesh"};
		 
		 length = str1.length();
		 
		 if(length < 7) {
			 System.out.println("length is less than 7 for name=" + str1);
		 }else {
			 System.out.println("length is greater than 7 for name=" + str);
		 }
		
		
		
		return str;
	} 
	
	

	public static void main(String[] args) {
		
		SortName s = new SortName();
		s.names();
		
	}

}
