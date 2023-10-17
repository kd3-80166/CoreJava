package com.person;

import java.util.Date;
import java.util.Scanner;

public class Person {
	String name;
	Date dob;
	int day,month,year;
	
	Scanner sc1 = new Scanner(System.in);
	
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public Person(String name, Date dob, int day, int month, int year) {

		this.name = name;
		this.dob = dob;
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Person(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	
	public void accept() {
		System.out.println("Enter Name: ");
		name = sc1.nextLine();
		System.out.println("Enter DOB");
		System.out.print("Enter Day: ");
		day = sc1.nextInt();
		System.out.print("Enter Month: ");
		month = sc1.nextInt();
		System.out.print("Enter year: ");
		year  = sc1.nextInt();	
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("DOB: "+this.day+"/"+this.month+"/"+this.year);
	}
}
