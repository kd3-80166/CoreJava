package com.sunbeam.tester;
import java.util.Arrays;
import java.util.Comparator;

public class Tester {
	
	static <T extends Number> T findMin(T[] arr) {
		T t = arr[0] ;
		for (int i = 0; i<(arr.length)-1; i++) {
			if (t.doubleValue()>arr[i+1].doubleValue()) {
				t = arr[i+1];
			}
		}
		return t;
	}
	
		public static void main(String[] args) {
			Integer[] arr1 = { 22, 55, 77, 11, 33 };
			System.out.println("The minimum integr number is : " +findMin(arr1));
			Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
			Double min2 = findMin(arr2);
			System.out.println("The minimum float number is : " +findMin(arr2));
			Long[] arr3 = {34L,243L,124325L,340L};
			Long min3 = findMin(arr3);
			System.out.println("The minimum Long number is : " +findMin(arr3));
			Byte[] arr4 = {1,2,4,5,6,8};
			Byte min4 = findMin(arr4);
			System.out.println("The minimum Long number is : " +findMin(arr4));
			Short[] arr5 = {1,2,4,5,6,8};
			Short min5 = findMin(arr5);
			System.out.println("The minimum Long number is : " +findMin(arr5));
		}
}
