package com.labor;


import com.emp.Employee;

public class Labor extends Employee {
	String WorksiteLocation;

	public Labor(String worksiteLocation) {
		super();
		WorksiteLocation = worksiteLocation;
	}
	
	public void accept() {
		super.accept();
		System.out.print("Enter WorksiteLocation: ");
		WorksiteLocation = sc.next();
	}
	public void display() {
		super.display();
		System.out.println("Worksite Location is "+this.WorksiteLocation);
	}

	@Override
	public double calculateTotalSalary() {
		return this.getSalary();
	}
}
