package com.employee;

import java.util.Scanner;

public abstract class Employee {
	String firstName;
	String lastName;
	String socialSecurityNo;
	Scanner sc = new Scanner(System.in);
	
	abstract void totalSal();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, String socialSnumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNo = socialSnumber;
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
	public String getSocialSnumber() {
		return socialSecurityNo;
	}
	public void setSocialSnumber(String socialSnumber) {
		this.socialSecurityNo = socialSnumber;
	}
	
	public void accept() {
		System.out.print("Enter First Name: ");
		firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		lastName = sc.nextLine();
		System.out.print("Enter social security number: ");	
		socialSecurityNo = sc.next();
	}
	public void display() {
		System.out.print("First Name: "+firstName+" "+lastName);
		System.out.print("Social Security Number: "+socialSecurityNo);
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNo=" + socialSecurityNo
				+ "]";
	}
}
