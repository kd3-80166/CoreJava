package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.sunbeam.books.*;

public class Tester {
	
	public static int emenu() {
		int choice;
		System.out.println("*******************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add books.");
		System.out.println("2. To display all books.");
		System.out.println("3. To delete book at index.");
		System.out.println("4. To check if book present.");
		System.out.println("5. To delete all books.");
		System.out.println("6. To display total number of books.");
		System.out.println("7. To sort by price (Descending order).");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice = 0,i = 0;
		List<Book>l = new ArrayList<>();
		
		while ((choice = emenu())!=0) {
			switch (choice) {
			case 1 : Book b = new Book();
					 b.accept();
					 l.add(b);
					 break;
					
			case 2 : Iterator<Book> itr = l.iterator();
					 while (itr.hasNext()) {
						 Book b1 = itr.next();
						 System.out.println(b1);
					 }
					 break;
				
			case 3 : System.out.print("Enter the index for deleting the book : ");
					 i = new Scanner(System.in).nextInt();
					 l.remove(i);
					 break;
				
			case 4 : System.out.print("Enter the isbn to be checked : ");
					 String str = new Scanner(System.in).next();
					 Book key = new Book();
					 key.setIsbn(str);
					 if (l.contains(key)) {
						 System.out.println("The Book is present.");
					 }
					 else {
						 System.out.println("The Book is not present.");
					 }
					 break;
				
			case 5 : l.clear();
					 break;
				
			case 6 : System.out.println("The total number of books is " +l.size());
					break;
				
			case 7 : class priceComparator implements Comparator<Book>{
						@Override
						 public int compare(Book b1, Book b2) {
							int diff = Double.compare(b1.getPrice(),b2.getPrice());
							return -diff;
						 }	
					 }
					 
					 priceComparator pc = new priceComparator();
					 l.sort(pc);
					 for (Book bprice : l) {
						 System.out.println(bprice);
					 }
					break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
