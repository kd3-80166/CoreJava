package com.sunbeam;

import java.util.Scanner;

class Date 
{
	int day;
	int month;
	int year;
	
	Scanner sc = new Scanner(System.in);
	
	public Date() {
		this(01,01,2002);
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	void accept() {
		System.out.print("Enter day: ");
		day = sc.nextInt();
		System.out.print("Enter Month");
		month = sc.nextInt();
		System.out.print("Enter year");
		year = sc.nextInt();
	}
	void displayDate() {
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}

}
