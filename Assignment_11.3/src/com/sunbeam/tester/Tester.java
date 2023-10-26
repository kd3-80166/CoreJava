package com.sunbeam.tester;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.treeset.Book;

public class Tester {
	
//	In above assignment use TreeSet instead of LinkedHashSet. 
//	Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
//			Books are stored in which order?

	public static void main(String[] args) {
			Book b1 = new Book("book1", 234, "abc", 10);
			Book b2 = new Book("book2", 3254, "abc", 13);
			Book b3 = new Book("book3", 653, "abc", 45);
			Book b4 = new Book("book4", 346, "abc", 12);
			Book b5 = new Book("book5", 457, "abc", 9);
			Book b6 = new Book("book5", 458, "oblivion", 9);
			Set<Book> ts = new TreeSet<>();
			ts.add(b1);
			ts.add(b2);
			ts.add(b3);
			ts.add(b4);
			ts.add(b5);
			ts.add(b6);
			Iterator<Book> itr = ts.iterator();
			while (itr.hasNext()) {
				Book bk = itr.next();
				System.out.println(bk);
			}
			
//			No duplicates are added. 
//			Books are stored in the sorted order given by the hashcode.

	}

}
