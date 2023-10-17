package com.sunbeam;

class EmployeeTest {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.accept();
	e1.display();
	
	Employee e2 = new Employee();
	e2.accept();
	e2.display();
	
	System.out.println("*****************");
	e1.afterRaise();
	e2.afterRaise();
	
	
}



}
