package com.tnsif_day7.Keywords.StaticAbstractFinal;
abstract class value{//abstract class
	void show() {//normal method
		System.out.println("Abstract");
		//abstract value();//adstract method 
}
}
class A extends value{
	void Demo() {
		System.out.println("child");
	}
}
public class Student {
//abstract int a is not possible to create
	public static void main(String args[]) {
		A obj =new A();
		obj.Demo();		
	}
}

