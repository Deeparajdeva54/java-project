package exception.project;

public class Array_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
					String[] myFriends = {"deva","deeparaj","hiranya","sangeetha","Divya","hiran"}; // 			
							
					try {				
						System.out.println("my number ="+myFriends[6]); 				
					}catch(ArrayIndexOutOfBoundsException A) {
						System.out.println("sop="+A);
						System.err.println("sep="+A);
					} 
				    int x = 40;
				    int y = 50;
				    int z = x * y;
				    System.out.println("x * y ="+ z);
			}
		}

	


