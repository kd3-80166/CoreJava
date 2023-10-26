package com.sunbeam.tester;

import java.util.Comparator;

public class Tester {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		class doubleComparator implements Comparator<Double> {
			@Override
			public int compare(Double e1, Double e2) {
				int diff = Double.compare(e1.doubleValue(), e2.doubleValue());
				return diff;
			}
		}
		
		doubleComparator comparator = new doubleComparator();
		Double[] arr = {2.3, 3.6, 1.2, 0.9, 0.4, 23.7, 45.3, 2.2};
		selectionSort(arr, comparator);
		
		System.out.println("The sorted array is as follows :");
		for (Double d : arr) {
			System.out.print(d+"  ");
		}
		

	}

}
