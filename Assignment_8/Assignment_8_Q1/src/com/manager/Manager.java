package com.manager;

import com.emp.Employee;

public class Manager extends Employee {
	double bonus;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Manager(double bonus) {
		super();
		
		this.bonus = bonus;
	}
	public void accept() {
		super.accept();
		System.out.print("Enter bonus");
		bonus = sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("Bonus"+this.bonus);	
	}


	@Override
	public double calculateTotalSalary() {
		return (this.getSalary()+this.bonus);
		
	}	
}
