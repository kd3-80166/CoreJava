package com.tester.sunbeam;

import com.employee.*;

public class Program {
	public static void main(String[] args) {
//	
//		Employee e;
//		e=new BasePlues_CommisionEmployee();
//		e.accept();
//		System.out.println(e.toString());
		
//		Employee e = new Hourly_Employee();
//		e.accept();
//		System.out.println(e.toString());
		
		Employee e = new Commission_Employee();
		e.accept();
		System.out.println(e.toString());
		
	}

}
