package com.employee;

public class Hourly_Employee extends Employee{
	double wageHour;
	double workedHour;
	
	public Hourly_Employee() {
		this(1.6,12);
	}
	
	public Hourly_Employee(double wageHour,double workedHour) {
		this.wageHour = wageHour;
		this.workedHour = workedHour;
	}

	
	public double getWageHour() {
		return wageHour;
	}

	public void setWageHour(double wageHour) {
		this.wageHour = wageHour;
	}

	public double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(double workedHour) {
		this.workedHour = workedHour;
	}
	
	public void accept() {
		super.accept();
		System.out.print("Enter Hourly Wage: ");
		wageHour = sc.nextDouble();
		System.out.print("Enter Hours Worked: ");
		workedHour = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Hours Worked: "+this.workedHour);
		System.out.println("Hourly Wage: "+this.wageHour);
	}
	@Override
	void totalSal() {
		if(this.workedHour <= 40)		
			System.out.println("Total Salary: "+(this.wageHour*this.workedHour));
		else if(this.workedHour > 40) {
			System.out.println("Total Salary: "+(40 * this.wageHour + (this.workedHour - 40) * this.wageHour*1.5));
		}
	}

	@Override
	public String toString() {
		return "Hourly_Employee [wageHour=" + wageHour + ", workedHour=" + workedHour +","+ super.toString() + "]";
	}
	
	
	

	
	
	

}
