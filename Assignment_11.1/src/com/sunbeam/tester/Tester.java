package com.sunbeam.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sunbeam.hashset.Book;

public class Tester {
	
//	Store few books (hardcoded values with the Book class in previous assignment) 
//	in a HashSet and display them using iterator. 
//	If any book with duplicate
//	isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

	public static void main(String[] args) {
		Book b1 = new Book("book1", 234, "abc", 10);
		Book b2 = new Book("book2", 3254, "abc", 13);
		Book b3 = new Book("book3", 653, "abc", 45);
		Book b4 = new Book("book4", 346, "abc", 12);
		Book b5 = new Book("book5", 457, "abc", 9);
		Book b6 = new Book("book5", 458, "oblivion", 9);
		Set<Book> hs = new HashSet<>();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		hs.add(b6);
		Iterator<Book> itr = hs.iterator();
		while (itr.hasNext()) {
			Book bk = itr.next();
			System.out.println(bk);
		}
		
		//Books are stored without any order (stored with respect to hashcode.)
		//Duplicate values are stores here. To solve it we will have to override the 
        //hashcode() method.
		
		

	}

}
