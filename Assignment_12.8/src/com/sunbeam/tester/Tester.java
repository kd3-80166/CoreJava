package com.sunbeam.tester;

import java.util.stream.IntStream;

public class Tester {
//	Create an IntStream to represent numbers from 1 to 10. Call various functions 
//	like sum(), summaryStatistics() and observe the output

	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println(IntStream.range(1, 10).summaryStatistics());
	}

}
