package com.sunbeam;

import java.util.Scanner;

class Employee{
	String firstName;
	String lastName;
	double monthlySal;
	
	Scanner sc = new Scanner(System.in);
	 Employee() {
		this("","",0.0);
	}
	 Employee(String firstName, String lastName, double monthlySal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySal = monthlySal;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySal() {
		return monthlySal;
	}
	public void setMonthlySal(double monthlySal) {
		this.monthlySal = monthlySal;
	}
	void afterRaise() {
		
		System.out.println("Full Name "+firstName +" "+lastName);
		System.out.println("After 10% raise: "+((monthlySal*12)*0.1)+monthlySal);
	}
	
	void accept() {
		System.out.print("Enter First Name: ");
		firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		lastName = sc.nextLine();
		System.out.print("Enter Monthly Sal: ");
		monthlySal = sc.nextDouble();
		if(sc.nextDouble() < 0) {
			this.monthlySal =  0.0;
		}
	}
	
	void display() {
		System.out.println("Full Name "+firstName +" "+lastName);
		System.out.println("Yearly Salary "+monthlySal*12);	
		
	}
}
