package com.sunbeam.tester;
import com.sunbeam.empclasses.Clerk;
import com.sunbeam.empclasses.Labor;
import com.sunbeam.empclasses.Manager;
import com.sunbeam.empinterfaces.Employee;

public class Tester {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[3];
		
		arr[0] = new Manager(10000,4000);
		arr[1] = new Labor(310,20);
		arr[2] = new Clerk(7000);
		
		System.out.println(Employee.calcTotalIncome(arr));

	}

}
