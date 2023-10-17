package com.app.fruits;

import java.util.Scanner;


public class FruitBasket {
	public String color;
	public double weight;
	public String name;
	public boolean isFresh = true;
	Scanner sc = new Scanner(System.in);
	
	public FruitBasket() {
		 
	}
	
	public FruitBasket(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String taste() {
		return "No specific taste";
	}
	
	
	
	@Override
	public String toString() {
		return "********FruitBasket******** \nColor: " + color + "\nWeight: " + weight + "\nName: " + name + "\nIsFresh: " + isFresh + "\nTaste: "+taste();
	}

	public void accept() {
		System.out.print("Enter color:");
		color = sc.next();
		System.out.print("Enter weight: ");
		weight = sc.nextDouble();
		System.out.print("Enter name: ");
		name = sc.next();
		}
	public void display() {
		System.out.println("*******************");
		System.out.println("Color: "+color);
		System.out.println("Weight: "+weight);
		System.out.println("Name: "+name);
		System.out.println("is fresh: "+isFresh);
		System.out.println("*******************");
	}
	
}
