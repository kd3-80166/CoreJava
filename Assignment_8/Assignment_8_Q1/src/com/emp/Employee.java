package com.emp;

import java.util.Scanner;

import com.person.Person;

public abstract class Employee extends Person {
	int empid;
	double salary;
	public Scanner sc = new Scanner(System.in);
	public Employee() {
		
	}
	public abstract double calculateTotalSalary();
	
	public Employee(int empid, double salary) {
		
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void accept() {
		super.accept();
		System.out.print("Enter Employee id: ");
		empid = sc.nextInt();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
	}
	public void  display() {
		super.display();
		System.out.println("Employee ID: "+this.empid);
		System.out.println("Employee Salary: "+this.salary);
	}

}
