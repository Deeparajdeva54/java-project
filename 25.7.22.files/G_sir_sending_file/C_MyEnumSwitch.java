package enum_info;

public class C_MyEnumSwitch {
	
	
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day day = Day.THURSDAY;  
		
		switch(day){  
		case SUNDAY:   
		 System.out.println("sunday");  
		 break;  
		case MONDAY:   
		 System.out.println("monday");  
		 break;  
		default:  
		System.out.println("other day");  
		}  

	}

}
