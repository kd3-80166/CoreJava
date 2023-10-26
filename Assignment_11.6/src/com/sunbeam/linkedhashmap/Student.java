package com.sunbeam.linkedhashmap;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private double marks;
	
	public Student() 
	{	
	}
	
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public void accept () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		this.name = sc.nextLine();
		System.out.print("Enter the roll number : ");
		this.roll = sc.nextInt();
		System.out.println("Enter the marks : ");
		this.marks = sc.nextDouble();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
