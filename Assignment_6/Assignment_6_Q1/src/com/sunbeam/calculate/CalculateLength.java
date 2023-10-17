package com.sunbeam.calculate;

import java.util.Scanner;

public class CalculateLength {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input;
		try {
		System.out.println("Enter String:");
		input=scanner.nextLine();
		if(input.length()>80)
			throw new ExceptionLineTooLong("The strings is too long",input.length());
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
	}
}
