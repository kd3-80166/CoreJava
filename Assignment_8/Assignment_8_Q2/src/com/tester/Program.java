package com.tester;

import com.date.Date;
import com.face.Displayable;
import com.person.with_interface.Person;

class Box<T>{
	private T val;
	public void set(T val) {
		this.val = val;
	}
	public T get() {
		return this.val;
	}
}

public class Program {
	
	public static void printDisplayableBox( Box<? extends Displayable> b) {
		b.get().show();
		}
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
	}
	
	
	
	
	public static void main(String[] args) {
//		Person p = new Person();
//		p.accept();
//		p.show();
	
		Box<Person> b1 = new Box<>();
//		b1.set(p);
		b1.set(new Person("Name",06,01,2002));
		printDisplayableBox(b1);
		
		Box<Date> b2 = new Box<>();
		b2.set(new Date(1,1,2002));
		printAnyBox(b2);
		Box<String> b3 = new Box<>();
		b3.set(new String("Sunbeam "));
		printAnyBox(b3);
		

		
//		
	}	
}
