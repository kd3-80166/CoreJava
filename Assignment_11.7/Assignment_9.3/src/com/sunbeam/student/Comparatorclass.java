package com.sunbeam.student;

import java.util.Comparator;

public class Comparatorclass implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		int diff = s1.getCity().compareTo(s2.getCity());
		if (diff == 0) {
			diff = Double.compare(s1.getMarks(),s2.getMarks());
			if (diff == 0) {
				return s1.getName().compareTo(s2.getName());
			}
			else {
				return -diff;
			}
		}
		else {
			return -diff;
		}
	}
}
			