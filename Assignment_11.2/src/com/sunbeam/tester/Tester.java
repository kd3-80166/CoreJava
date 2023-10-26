package com.sunbeam.tester;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

import com.sunbeam.linkedhash.Book;

public class Tester {
	
//	2. In above assignment use LinkedHashSet instead of HashSet.
//	If any book with duplicate isbn is added, what will happen?
//	Books are stored in which order?

	public static void main(String[] args) {
		Book b1 = new Book("book1", 234, "abc", 10);
		Book b2 = new Book("book2", 3254, "abc", 13);
		Book b3 = new Book("book3", 653, "abc", 45);
		Book b4 = new Book("book4", 346, "abc", 12);
		Book b5 = new Book("book5", 457, "abc", 9);
		Book b6 = new Book("book5", 458, "oblivion", 9);
		Set<Book> lhs = new LinkedHashSet<>();
		lhs.add(b1);
		lhs.add(b2);
		lhs.add(b3);
		lhs.add(b4);
		lhs.add(b5);
		lhs.add(b6);
		Iterator<Book> itr = lhs.iterator();
		while (itr.hasNext()) {
			Book bk = itr.next();
			System.out.println(bk);
		}
		
//		No duplicates are added. 
//		Books are stored in the order of insertion.
		
	}
}
