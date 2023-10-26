package com.sunbeam.tester;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.comparator.Comparator;
import com.sunbeam.employee.Employee;

public class Tester {
	
	public static int emenu() {
		int choice;
		System.out.println("*******************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add Employee.");
		System.out.println("2. To delete Employee (empid).");
		System.out.println("3. To find Employee (empid).");
		System.out.println("4. To sort Employee list (salary(desc),name(asc),empid(asc)).");
		System.out.println("5. To edit.");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		List<Employee> l = new LinkedList<>();
		
		while ((choice = emenu()) != 0) {
			switch (choice) {
				case 1: Employee e = new Employee();
						e.accept();
						l.add(e);
						break;
						
				case 2: System.out.print("Enter the Employee Id to be deleted : ");
		 		 		String str = new Scanner(System.in).next();
		 		 		Employee e2 = new Employee();
		 		 		e2.setEmpid(str);
		 		 		if (l.contains(e2)) {
		 		 			System.out.println("The Employee is present and is removed.");
		 		 			l.remove(l.indexOf(e2));
		 		 		}
		 		 		else {
		 		 			System.out.println("The Employee is not present.");
		 		 		}
		 		 		break;
					
				case 3: System.out.print("Enter the Employee Id to be found : ");
		 		 		String str1 = new Scanner(System.in).next();
		 		 		Employee key1 = new Employee();
		 		 		key1.setEmpid(str1);
		 		 		if (l.contains(key1)) {
		 		 			System.out.println("The Employee is in the list.");
		 		 			int i = l.indexOf(key1);
		 		 			System.out.println(l.get(i));
		 		 		}
		 		 		else {
		 		 			System.out.println("The Employee is not found.");
		 		 		}
					break; 
					
				case 4: Comparator cmp = new Comparator();
						l.sort(cmp);
						System.out.println(l);
					break;
					
				case 5: System.out.print("Enter the Employee Id to be replaced : ");
 		 				String str2 = new Scanner(System.in).next();
 		 				Employee e3 = new Employee();
 		 				e3.setEmpid(str2);
 		 				if (l.contains(e3)) {
 		 					System.out.println("The Employee is present./n Enter the employee details.");
 		 					Employee e4 = new Employee();
 		 					e4.accept();
 		 					l.set(l.indexOf(e3), e4);
 		 				}
 		 				else {
 		 					System.out.println("The Employee is not present. Please enter a valid Employee Id.");
 		 				}
 		 				break;
					
			}
		}
		
	}

}
