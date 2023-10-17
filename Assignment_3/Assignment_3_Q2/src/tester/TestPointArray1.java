package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	static Scanner scan = new Scanner(System.in);

	public static int menu() {

		int choice;
		
		System.out.println("****************************");
		System.out.println("1. Show specific index no: ");
		System.out.println("2. Display all points: ");
		System.out.println("3. Validate the indices: ");
		System.out.println("4. EXIT");
		System.out.println("****************************");
		System.out.println("Enter your choice: ");
		choice = scan.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		System.out.print("Enter number of points to plot: ");
		int count = scan.nextInt();

		Point2D[] pd = new Point2D[count];

		for (int i = 0; i < count; i++) {
			pd[i] = new Point2D();
			System.out.println("index["+i+"]");
			pd[i].accept();
		}

		
		boolean b = true;
		while (b) {
			int choice = menu();
			switch (choice) {
			case 1:
				System.out.print("Enter index value to display: ");
				int index = scan.nextInt();
				if(index >= count) {
					System.out.println("Invalid, Index out of Bounds! ");
				}
				else
				System.out.println(pd[index].getDetails());
				
				break;
			case 2:
				for (int i = 0; i < count; i++) {
					System.out.println(pd[i].getDetails());
					System.out.println("****************");
				}
				break;
			case 3:
				int index1, index2;
				System.out.print("Enter the 1st index: ");
				index1 = scan.nextInt();
				System.out.print("Enter the 2nd index: ");
				index2 = scan.nextInt();
				
				
				if(index1 < 0 || index1 > count && index2 < 0 || index2 > count ) {
					System.out.println("Invalid index values! ");
				}
				else if (pd[index1].isEqual(pd[index2])) {
					System.out.println("Points are in same location ");
				}
				else {
					System.out.println("Points are in different locations ");
					
					System.out.println("Distance: "+pd[index1].calculateDistance(pd[index2]));
				}
				
				break;
				
			case 4:
				b = false;
				
				break;

			default:
				System.out.println("Invalid selection, please retry!!!");
				break;
			}

		}
		System.out.println("Thankyou for using our app:)");
		
//		pd.accept();
//		System.out.println(pd.getDetails());

//		if (pd.isEqual())
//			System.out.println("Points are in same location ");
//		else {
//			System.out.println("Points are  in different locations ");
//			
//			System.out.println("Distance between points "+pd.calculateDistance());
//		}
//		sc.close();
	}

}
