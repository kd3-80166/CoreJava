package com.sunbeam.treeset2;

import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() 
	{	
	}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the isbn : ");
		this.isbn = sc.next();
		System.out.print("Enter the price : ");
		this.price = sc.nextDouble();
		System.out.println("Enter the Author name : ");
		this.authorName = sc.next();
		System.out.print("Enter the quantity :");
		this.quantity = sc.nextInt();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	@Override
//	public boolean equals(Object other) {
//		if (this == other)
//			return true;
//		if (other == null)
//			return false;
//		if (other instanceof Book) {
//			Book b	= (Book) other;
//			if (this.isbn.equals(b.isbn)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public int hashCode() {
//		int hash = Objects.hash(this.isbn);
//		return hash;
//	}

	@Override
	public int compareTo(Book obj) {
		int diff = obj.isbn.compareTo(this.isbn);
		return diff;
	}
	
	@Override
	public String toString() {
		return "Book : [isbn=" + isbn + ", price=" + price + ", author=" + authorName + ", qty=" + quantity
				+ "]";
	}
}
