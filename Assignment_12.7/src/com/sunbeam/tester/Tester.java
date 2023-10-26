package com.sunbeam.tester;

import java.util.Random;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		Random r = new Random();
		
		int total = Stream.generate(()->r
										 .nextInt(100))
									     .limit(10)                                       
										 .reduce(0,(a,e)->a+e);
		System.out.println(total);
		
	}

}
