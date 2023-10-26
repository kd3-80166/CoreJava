package com.sunbeam.tester;

import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		int fact = Stream
						 .iterate(1, x -> x + 1)
						 .limit(4)
						 .reduce(1,(a,e)->a*e);
		System.out.println("Sum : " + fact);
	}

}
