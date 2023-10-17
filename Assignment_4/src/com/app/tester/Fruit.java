package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.FruitBasket;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class Fruit {
	static Scanner sc = new Scanner(System.in);
	static int menu() {
		int choice;
		System.out.println("*******************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple ");
		System.out.println("4. Display all fruits ");
		System.out.println("5. Display name,color,weight of all fruits ");
		System.out.println("6. Display taste of all stale fruits");
		System.out.println("7. Mark fruit as stale");
		System.out.println("*******************************************");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}	
	
	public static void main(String[] args) {
		System.out.println("Enter Number of fruits to buy: ");
		int count;
		count = sc.nextInt();
		FruitBasket[] basket = new FruitBasket[count];
		int choice;
		int counter = 0;
		while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:
					if(counter < count) {
						basket[counter] = new Mango();
						basket[counter].accept();
						counter++;
					}
					else
						System.out.println("Basket is full! ");
					
					break;
				case 2:
					if(counter < count) {
						basket[counter] = new Orange();
						basket[counter].accept();
						counter++;	
					}
					else
						System.out.println("Basket is full! ");
					
					break;
				case 3:
					if(counter < count) {
						basket[counter] = new Apple();
						basket[counter].accept();
						counter++;	
					}
					else
						System.out.println("Basket is full! ");
					
				case 4:
					for(int i = 0; i < counter ; i++)
						System.out.println("Fruit name: "+basket[i].getName());
					
					break;
				case 5:
					for(int i = 0; i < counter ; i++)
						if(basket[i].isFresh())
					System.out.println(basket[i].toString());
					
					break;
				case 6:
					for(int i = 0; i < counter ; i++)
						if(!basket[i].isFresh())
					System.out.println("value"+basket[i].toString());
						
						break;
					
				case 7:
					System.out.print("Enter index value:");
					int val = sc.nextInt();
					basket[val].setFresh(false);
					System.out.println("Fruit is added as stale. ");
					break;
				
				default:
					System.out.println("Invalid Entry, try again! ");
					break;
				}
		}
				
		
	}


}
