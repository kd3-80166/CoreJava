
public class Assign_1_Q4_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 5;
		int c = 0;
	 for(int i = 0; i<count;i++) {
		 for(int j = 0;j<count-i;j++) {
			 System.out.print(" "); 
		 }
		 
			 for(int l = 0; l < i+c+1 ; l++) {
				 System.out.print("*");
				 
		 }
			 c++;
			 System.out.println();
		 
	 }
		
	}

}
