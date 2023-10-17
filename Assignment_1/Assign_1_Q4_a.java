
public class Assign_1_Q4_a {
	
	
	public static void main(String[] args) {
		int count = 10;
	 for(int i = 0; i<count;i++) {
		 for(int j = 0;j<count-i;j++) {
			 System.out.print(" "); 
		 }
		 
			 for(int l = 0; l < i+1 ; l++) {
				 System.out.print("* ");	 	 
		 }
			 System.out.println();
		 
	 }
	}
}
