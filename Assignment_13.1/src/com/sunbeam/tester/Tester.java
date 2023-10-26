package com.sunbeam.tester;
import com.sunbeam.book.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	public static int emenu() {
		int choice;
		System.out.println("*******************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add books(check first!!).");
		System.out.println("2. To display all books.");
		System.out.println("3. To check if book present.");
		System.out.println("4. To delete book at index.");
		System.out.println("5. To delete books of given isbn.");
		System.out.println("6. To reverse books list.");
		System.out.println("7. To save books in file.");
		System.out.println("8. To read books from file.");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	
	public static void writeFile (List<Book> l) {
		try (FileOutputStream fout = new FileOutputStream("books.abc")){
			try(DataOutputStream dout = new DataOutputStream(fout) ){
				for (Book b : l) {
					dout.writeUTF(b.getIsbn());
					dout.writeDouble(b.getPrice());
					dout.writeUTF(b.getAuthorName());
					dout.writeInt(b.getQuantity());
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Book File Saved");
	}
	
	public static void readFile (List<Book> l)  {
		try (FileInputStream fin = new FileInputStream("books.abc")){
			try(DataInputStream din = new DataInputStream(fin) ){
				while(true) {
					Book b = new Book();
					b.setIsbn(din.readUTF());
					b.setPrice(din.readDouble());
					b.setAuthorName(din.readUTF());
					b.setQuantity(din.readInt());
					System.out.println(b);
				}
			}
		}
		catch (EOFException e) {
			System.out.println();
			System.out.println("All data printed.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		int choice = 0,i = 0;
		List<Book>l = new ArrayList<>();
		
		while ((choice = emenu())!=0) {
			switch (choice) {
			case 1 : System.out.print("Enter the isbn to be checked : ");
			 		 String str = new Scanner(System.in).next();
			 		 Book key = new Book();
			 		 key.setIsbn(str);
			 		 if (l.contains(key)) {
			 			 System.out.println("The Book is present.Quantity incremented.");
			 			l.get(l.indexOf(key)).setQuantity((l.get(l.indexOf(key)).getQuantity()) + 1);
			 			 
			 		 }
			 		 else {
			 			 System.out.println("The Book is not present.");
			 			 Book b = new Book();
						 b.accept();
						 l.add(b);
			 		 }
					 break;
					
			case 2 : for (int j = 0; j<l.size(); j++) {
						 Book b1 = l.get(j);
						 System.out.println(b1);
					 }
					 break;
				
			case 3 : System.out.print("Enter the isbn to be checked : ");
	 		 		 String str1 = new Scanner(System.in).next();
	 		 		 Book key1 = new Book();
	 		 		 key1.setIsbn(str1);
	 		 		 if (l.contains(key1)) {
	 		 			 System.out.println("The Book is present.");
	 		 			 l.indexOf(key1);
	 		 			 System.out.println(l.get(l.indexOf(key1)));
	 		 		 }
	 		 		 else {
	 		 			 System.out.println("The Book is not present.");
	 		 		 }
					 break;
				
			case 4 : System.out.println("Enter the index that you want to delete : ");
					 i = new Scanner(System.in).nextInt();
					 l.remove(i);
					 break;
				
			case 5 : System.out.print("Enter the isbn to be checked : ");
	 		 		 String str2 = new Scanner(System.in).next();
	 		 		 Book key2 = new Book();
	 		 		 key2.setIsbn(str2);
	 		 		 if (l.contains(key2)) {
	 		 			 System.out.println("The Book is present and it is removed.");
	 		 			 l.remove(l.indexOf(key2));
	 		 		 }
	 		 		 else {
	 		 			 System.out.println("The Book is not present.");
	 		 		 }
					 break;
				
			case 6 : Collections.reverse(l);
					 break;
					 
			case 7 : writeFile(l);
					 break;
					 
			case 8 : readFile(l);
			default : System.out.println("Wrong input. Please try again....");
					  break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
