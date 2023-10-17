package com.sunbeaminfo;

public class ReverseString {

	public static void main(String[] args) {
	
		String s1="Hello world";
		System.out.println("Original string:"+s1);
		System.out.print("Reverse string:");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}

		
		StringBuilder s2=new StringBuilder("Hello World");
		s2.reverse();
		System.out.println(s2);
	}

}
