package com.sunbeam.tester;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.sunbeam.linkedhashmap.Student;

public class Tester {
	
	static int emenu() {
		int choice;
		System.out.println("***********************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To input students.");
		System.out.println("2. To display students.");
		System.out.println("3. To find students (basis of roll number)");
		System.out.println("***********************************************");
		System.out.println("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		
		Map<Integer, Student> lhm = new LinkedHashMap<>();
		
		while ((choice = emenu())!=0) {
			switch (choice) {
				case 1: Student s = new Student();
						s.accept();
						lhm.put(s.getRoll(), s);
						break;
						
				case 2: Set<Entry<Integer,Student>> entries = lhm.entrySet();
		        		for(Entry<Integer,Student> entry : entries) {
		        			System.out.println(entry.getKey() + " -- " + entry.getValue().getName());
		        }
				
				case 3: System.out.print("Enter the roll number to be found : ");
						int r = new Scanner(System.in).nextInt();
						if ((lhm.get(r))==null) {
							System.out.println("Student not present.");
						}
						else {
							System.out.println(lhm.get(r));	
						}
						break;
				
			}
		}
	}
}
