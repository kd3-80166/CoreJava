package com.employee;

public class Salaried_Employee extends Employee {
	double weeklySalary;
	
	public Salaried_Employee(double weeklySalary) {
		
	this.weeklySalary = weeklySalary;
	}

	@Override
	void totalSal() {
		System.out.print("Weekly Salary: "+weeklySalary);		
	}

	@Override
	public String toString() {
		return "Salaried_Employee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}
	
}
