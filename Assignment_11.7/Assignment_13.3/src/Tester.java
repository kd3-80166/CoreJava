import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Program Started.");
		Scanner sc = new Scanner(System.in);
		
		try(FileWriter fwr = new FileWriter("file.txt")) {
			try(BufferedWriter bwr = new BufferedWriter(fwr)) {
				for(int i=1; i<=4; i++) {
					System.out.print("Enter the "+i+"th line :");
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Saved.");
	}
}
