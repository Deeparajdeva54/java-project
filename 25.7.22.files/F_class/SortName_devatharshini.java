package array.project;

public class SortName {
	int length = 0;
	
	public void names() {
		
		 String [] Names = {"Deva", "Mathan", "Mahalaxmi", "Gowtham" , "Yogita", "Suvetha","Kalif", "Srija", "Heena", "Raghunath", "Rajesh"};
		 
		
		 for(int i=0;i<=10;i++)
		 {
			 length = Names[i].length();
			 if(length<7) {
				 System.out.println("length is less than 7 for name=" +Names[i]);
				 
			 }
			 else {
				 System.out.println("length is gretar than 7 for name=" +Names[i]);
			 
			 }
			
				 }
		
	}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortName s = new SortName();
		s.names();
		

	}

}
