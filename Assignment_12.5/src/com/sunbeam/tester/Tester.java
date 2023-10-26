package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.interface1.Check;

public class Tester{
	
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T e:arr) {
			if (c.compare(e, key)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Double [] arr = {2.8, 1.2, 3.5, 2.3, 1.2, 2.8, 3.8, 1.4, 1.2};
		Double key;
		System.out.print("Enter the key which is to be counted : ");
		key = new Scanner(System.in).nextDouble();
		
		int cnt = countIf(arr, key, (x,y)-> x.equals(y));
		System.out.println("Count = " + cnt);
		
	}

}
