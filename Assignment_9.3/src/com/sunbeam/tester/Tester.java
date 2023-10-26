package com.sunbeam.tester;
import java.util.Arrays;

import com.sunbeam.student.*;

public class Tester {

	public static void main(String[] args) {
		Student[] arr = new Student[7];
		arr[0] = new Student(1,"Ashish","Karad",69);
		arr[1] = new Student(2,"Amar","Pune",89);
		arr[2] = new Student(4,"Akabr","Mumbai",56);
		arr[3] = new Student(56,"Babar","Mumbai",56);
		arr[4] = new Student(98,"Chanakya","Mumbai",62);
		arr[5] = new Student(3,"Dabur","Delhi",39);
		arr[6] = new Student(32,"Elijah","Chennai",88);
		
		Comparatorclass comp = new Comparatorclass();
		Arrays.sort(arr,comp);
		
		System.out.println("The sorted array is : ");
		for (Student s:arr) {
			System.out.println(s);
		}
		
		
		

	}

}
