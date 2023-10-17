package com.employee;

public class BasePlues_CommisionEmployee extends Employee{

	double commissionRate;
	double grossSales;
	double baseSalary;
	
	
	public BasePlues_CommisionEmployee() {
		this.baseSalary = 0.0;
	}
	public void accept() {
		super.accept();
		System.out.print("Enter Gross sales: ");
		commissionRate = sc.nextDouble();
		System.out.print("Enter Commission Rate: ");
		grossSales = sc.nextDouble();
		System.out.print("Enter Base Salary: ");
		baseSalary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Gross Sales: "+this.commissionRate);
		System.out.println("Commision Rate: "+this.grossSales);
		System.out.println("Base Salary: "+(baseSalary +(0.1*baseSalary)));
	}
	

	@Override
	void totalSal() {
		System.out.println("Total salary: "+((this.grossSales*this.commissionRate)+this.baseSalary));
	}
	@Override
	public String toString() {
		return "BasePlues_CommisionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales
				+ ", baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}	
	
}
