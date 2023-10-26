package com.sunbeam.tester;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("file.txt")) {
			try(BufferedReader br = new BufferedReader(fr)) {
					System.out.println(br.readLine());
				}
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
