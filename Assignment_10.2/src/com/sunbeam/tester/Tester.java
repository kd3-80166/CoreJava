package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunbeam.comparator.Comparator1;

public class Tester {

	public static void main(String[] args) {
		List<String> l= new ArrayList<>();
		l.add("ram");
		l.add("raju");
		l.add("rohan");
		l.add("rajesh");
		
		Comparator1 cmp = new Comparator1();
		System.out.println(Collections.max(l,cmp));
	}
}
