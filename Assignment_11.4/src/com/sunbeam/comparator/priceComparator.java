package com.sunbeam.comparator;

import java.util.Comparator;

import com.sunbeam.treeset2.Book;

public class priceComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		int diff = Double.compare(b1.getPrice(),b2.getPrice());
		return -diff;
	}

}
