package com.employee;

public class Commission_Employee extends Employee {
	double commissionRate;
	double grossSales;
	public Commission_Employee() {
		this.commissionRate = 0.0;
		this.grossSales = 0.0;
	}
	public void accept() {
		super.accept();
		System.out.print("Enter commision rate ");
		commissionRate = sc.nextDouble();
		System.out.print("Enter Gross Sales ");
		grossSales = sc.nextDouble();
	}
	public void display() {
		System.out.println("Commission Rate: "+this.commissionRate);
		System.out.println("Gross Sales: "+this.grossSales);
	}
	
	
	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	@Override
	void totalSal() {
		System.out.println("Total Salary: "+(this.commissionRate*this.grossSales));
	}
	
	

	@Override
	public String toString() {
		return "Commission_Employee [commissionRate=" + commissionRate + ", grossSales=" + grossSales + ", "
				+ super.toString() + "]";
	}
	
	

}
