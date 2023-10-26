package com.sunbeam.comparator;

import com.sunbeam.employee.Employee;

public class Comparator implements java.util.Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = Double.compare(e1.getSalary(),e2.getSalary());
		if (diff == 0) {
			diff = e1.getEmpname().compareTo(e2.getEmpname());
			if (diff == 0) {
				return (e1.getEmpid().compareTo(e2.getEmpid()));
			}
			else {
				return diff;
			}
		}
		else {
			return -diff;
		}
	}

}
