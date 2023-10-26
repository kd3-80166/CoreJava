package com.sunbeam.empclasses;

import com.sunbeam.empinterfaces.Employee;

public class Manager implements Employee{
	private double basicSalary;
	private double dearanceAllowance;
	
	@Override
	public double getSal() {
		return this.basicSalary + this.dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		return 0.2*this.basicSalary;
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	public Manager() 
	{	
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
	}
	
	
	

}
