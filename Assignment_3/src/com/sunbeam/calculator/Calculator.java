package com.sunbeam.calculator;

import java.util.Scanner;

public class Calculator {
	 int accoutNo = 1000;
	 String name;
	 int balance;
	 int credit = 1300;
	 int charges;
	 Scanner sc = new Scanner(System.in);
	 
	 public Calculator(int accoutNo, String name, int balance, int credit, int charges) {
		super();
		this.accoutNo = accoutNo;
		this.name = name;
		this.balance = balance;
		this.credit = credit;
		this.charges = charges;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 
	public Calculator() {
		this(1001,"",0,1300,0);
	}
	public int getAccoutNo() {
		return accoutNo;
	}
	public void setAccoutNo(int accoutNo) {
		this.accoutNo = accoutNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public void accept() {
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Balance: ");
		balance = sc.nextInt();
		System.out.print("Enter Charges:");
		charges = sc.nextInt();	
	}
	public void display() {
		System.out.println("***********");
		System.out.println("Account No: "+this.accoutNo++);
		System.out.println("Name: "+this.name);
		System.out.println("Balance: "+this.balance);

		System.out.println("Charges: "+this.charges);
	}
	public void showNewBalance(){
		int NewBalance = this.balance + this.charges - this.credit;
		
		if(NewBalance > this.credit) {
			System.out.println("Credit limit exceeded: "+ NewBalance);
		}
		else
			System.out.println("New Balance: "+NewBalance);
			
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.accept();
		c.display();
		c.showNewBalance();
	}
	
}

