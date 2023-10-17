import java.util.Scanner;

import javax.swing.AbstractAction;

public class Assign_1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Integer value: ");
		
		int a = sc.nextInt();
		System.out.println("Binary Value:"+Integer.toBinaryString(a));
		System.out.println("Octal Value: "+Integer.toOctalString(a));
		System.out.println("Hexadecimal: "+Integer.toHexString(a));
	}

}
