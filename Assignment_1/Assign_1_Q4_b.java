
public class Assign_1_Q4_b {
	
	public static void main(String[] args) {
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
	 for(int i = 0; i < count ; i++) {
		 for(int j = 0; j < i+1; j++) {
			System.out.print(" "); 
		 }
		 for(int l = 0; l < c + count - i - 1 ; l++ ) {
			 System.out.print("*");
		 }
		 c--;
		 System.out.println();
	 }
	}
}

