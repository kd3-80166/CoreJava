package com.sunbeam.tester;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.comparator.priceComparator;
import com.sunbeam.treeset2.Book;

public class Tester {

	public static void main(String[] args) {
		Book b1 = new Book("book1", 234, "abc", 10);
		Book b2 = new Book("book2", 3254, "abc", 13);
		Book b3 = new Book("book3", 653, "abc", 45);
		Book b4 = new Book("book4", 346, "abc", 12);
		Book b5 = new Book("book5", 457, "abc", 9);
		priceComparator cmp = new priceComparator();
		TreeSet<Book> ts = new TreeSet<>(cmp);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		Iterator<Book> itr1 = ts.iterator();
		while (itr1.hasNext()) {
			Book bk1 = itr1.next();
			System.out.println(bk1);
		}
		
		Iterator<Book> itr2 = ts.descendingIterator();
		while (itr2.hasNext()) {
			Book bk2 = itr2.next();
			System.out.println(bk2);
		}
	}
}
