package com.sunbeam.tester;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.hashmap.Book;

public class Tester {
	
//	Store Books in HashMap<> so that for given isbn, book can be searched
//	in fastest possible time. Do we need to write equals() and hashCode() in Book
//	class?

	public static void main(String[] args) {
		Book b1 = new Book("book1", 234, "abc", 10);
		Book b2 = new Book("book2", 3254, "abc", 13);
		Book b3 = new Book("book3", 653, "abc", 45);
		Book b4 = new Book("book4", 346, "abc", 12);
		Book b5 = new Book("book5", 457, "abc", 9);
		Map<String,Book> hm = new HashMap<>();
		hm.put(b1.getIsbn(), b1);
		hm.put(b2.getIsbn(), b2);
		hm.put(b3.getIsbn(), b3);
		hm.put(b4.getIsbn(), b4);
		hm.put(b5.getIsbn(), b5);
		
		System.out.println("Enter the isbn to be searched : ");
		String str = new Scanner(System.in).next();
		
		System.out.println("The book is : "+ hm.get(str));
	}
}
