import java.util.Scanner;

public class Assign_1_Q3 {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************");
		System.out.println("Sunbeam Menu");
		System.out.println("1. Dosa 70");
		System.out.println("2. Samosa 30");
		System.out.println("3. Idli  30");
		System.out.println("4. Wada 30");
		System.out.println("5. Poha 25");
		System.out.println("6. Tea  15");
		System.out.println("7. Coffee 20");
		System.out.println("8. Wada Pav 35");
		System.out.println("9. Appam 80");
		System.out.println("0. Not Inetested");
		System.out.println("10. Generate Bill");
		System.out.println("Choose what you want:");
		System.out.println("********************");
		
		int choice = sc.nextInt();
		
		return choice;
			}

	public static void main(String[] args) {

		int choice;
		int total = 0;
		while ((choice = Assign_1_Q3.menu()) != 0) {

			switch (choice) {
			case 0:
				System.out.println("Please Come again :)");
				System.exit(0);
				break;
			case 1:
				System.out.println("Dosa added: ");
				total = total + 70;
				break;

			case 2:
				System.out.println("Samosa added: ");
				total = total + 30;
				break;

			case 3:
				System.out.println("Idli added: ");
				total = total + 30;
				break;

			case 4:
				System.out.println("Wada added: ");
				total = total + 30;
				break;

			case 5:
				System.out.println("Poha added: ");
				total = total + 25;
				break;

			case 6:
				System.out.println("Tea added: ");
				total = total + 15;
				break;

			case 7:
				System.out.println("Coffee added: ");
				total = total + 20;
				break;

			case 8:
				System.out.println("Wada Pav added: ");
				total = total + 35;
				break;

			case 9:
				System.out.println("Appam added: ");
				total = total + 80;
				break;
			case 10:
				System.out.println("Total bill is: " + total);
				System.exit(0);
			default:
				System.out.println("Invalid selection");
				break;
			}

		}

	}

}
