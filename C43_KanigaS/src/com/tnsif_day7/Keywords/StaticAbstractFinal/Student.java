package com.tnsif_day7.Keywords.StaticAbstractFinal;
abstract class value{
	void show() {
		System.out.println("Abstract");
		//abstract value();//abstract method
	}
}
class A extends value{
	void demo() {
		System.out.println("print");
	}
}

public class Student {
    //abstract int a - it is not possible to create a variable using abstract 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show();
		obj.demo();
	}

}
