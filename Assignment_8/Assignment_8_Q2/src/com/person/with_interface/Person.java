package com.person.with_interface;

import com.date.Date;

import java.util.Scanner;

import com.face.Displayable;

public class Person implements Displayable {
	String name;
	Date dob;
	
	Scanner sc1 = new Scanner(System.in);
	
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	
	
//	public Person(String name, Date dob, int day, int month, int year) {
//
//		this.name = name;
//	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, Date dob) {
		super();
		this.name = name;
	}
	
	public Person(String name, int day, int month, int year) {
		super();
		this.name = name;
	}


	public void accept() {
		System.out.print("Enter Name: ");
		name = sc1.nextLine();
		dob.accept();
	}


	@Override
	public void show() {
		System.out.println("Name: "+this.name);
		System.out.print("Ente DOB ");
		
	}
	
//	public void show() {
//		System.out.println("Name: "+this.name);
//		System.out.print("Ente DOB ");
//		dob.show();
//	}
	
}
