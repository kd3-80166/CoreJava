package com.sunbeam.empclasses;

import com.sunbeam.empinterfaces.Employee;

public class Labor implements Employee {
	private int hours;
	private double rate;
	
	public Labor() {
	}
	
	@Override
	public double getSal() {
		return this.hours*this.rate;
	}
	
	@Override
	public double calcIncentives() {
		if (this.hours>300) {
			return 0.05*this.getSal();
		}
		else {
			return 0.0;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Labor(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Labor [hours=" + hours + ", rate=" + rate + "]";
	}
}
