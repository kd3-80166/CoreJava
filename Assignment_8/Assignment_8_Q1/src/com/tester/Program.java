package com.tester;

import com.emp.Employee;
import com.manager.Manager;


class Box<T extends Employee>{
	private T obj;
	public void set(T val) {
		this.obj = val;
	}
	public T get(){
		return  this.obj;
	}
	public void getTotalSal() {
		System.out.print("Total Salary: "+obj.calculateTotalSalary());		
	}
	
}

public class Program {
	

	public static void main(String[] args) {
		
//		Manager m = new Manager();
//		m.accept();
//		m.display();
//	
//		
//		Box<Employee> b = new Box<>();
//		b.set(m);
//		//System.out.println(b.getTotalSal());
//		b.getTotalSal();
		
		Box<Employee> b = new Box<Employee>();
		b.set(new Manager());
		b.getTotalSal();
		
					
	}

}

