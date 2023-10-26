package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.interface1.Arithmetic;

public class Tester {
//	Create a functional interface Arithmetic with single abstract method double 
//	calc(double,double). Write a static method calculate() in main
//	class as follows. In main(), write a menu driven program that inputs 
//	two numbers from the user and calls calculate() method with appropriate lambda
//	expression (in arg3) to perform addition, subtraction, multiplication and division operations.

	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	static int emenu() {
		int choice;
		
		System.out.println("****************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add.");
		System.out.println("2. To subtract.");
		System.out.println("3. To multiply.");
		System.out.println("4. To divide.");
		System.out.println("****************************************************");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	
	
	public static void main(String[] args) {
		int choice,a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		a = sc.nextInt();
		System.out.print("Enter the second number : ");
		b = sc.nextInt();
		
		
		while ((choice=emenu())!=0){
			switch (choice) {
			
			case 1 :calculate(a, b, (n1,n2)->n1+n2);                      
					break;
					
			case 2 :calculate(a, b, (n1,n2)->n1-n2);
					break;
					
			case 3 :calculate(a, b, (n1,n2)->n1*n2);
					break;
					
			case 4 :calculate(a, b, (n1,n2)->n1/n2);
					break;
			}
			
		}
		
	}

}
