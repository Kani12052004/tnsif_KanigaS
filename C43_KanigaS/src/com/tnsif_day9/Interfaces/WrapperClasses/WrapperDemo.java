package com.tnsif_day9.Interfaces.WrapperClasses;

public class WrapperDemo {
	public static void main(String[] args) {
		// Unboxing - Converting explicity
		Integer i = new Integer(10);
		System.out.println(i);
		int b = i.intValue(); //predefined method
		System.out.println(b);

		// Without using intValue()
		int c = i;
		System.out.println(c);
		
		//Autoboxing - Converting Implicitly
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
	}
	}
