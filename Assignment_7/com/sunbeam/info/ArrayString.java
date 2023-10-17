package com.sunbeam.info;

public class ArrayString {
	public static void main(String[] args) {
		
		String[] arr= {"ABC","XYZ","PQR"};
		String[] arr2= {"ABC","RST","pqr"};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(arr2[i]))
			{
				System.out.println(arr[i]+" is equal to "+arr2[i]);
			}
		}
	}
}
