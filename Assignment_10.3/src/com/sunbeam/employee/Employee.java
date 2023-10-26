package com.sunbeam.employee;

import java.util.Scanner;

public class Employee implements Comparable<Employee> {
	private String empname;
	private String empid;
	private double salary;

	public Employee() {
	}

	public Employee(String empname, String empid, double salary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		this.empname = sc.nextLine();
		System.out.print("Enter the Employee id : ");
		this.empid = sc.nextLine();
		System.out.print("Enter the salary : ");
		this.salary = sc.nextInt();
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		return this.empid.compareTo(e1.empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (obj instanceof Employee) {
			Employee other = (Employee) obj;
			if (this.empid.equals(other.empid)) {
				return true;
			}
		} 
		return false;
	}

}
