package com.salesman;

import com.emp.Employee;

public class Salesman extends Employee{
	double comm;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}
	
	public Salesman(double comm) {
		super();
		this.comm = comm;
	}
	public void accept() {
		System.out.println("Enter Commission"+this.comm);
		comm = sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("commision is "+this.comm);
	}

	@Override
	public double calculateTotalSalary() {
		return (this.getSalary()+ this.comm);
		
	}
}
