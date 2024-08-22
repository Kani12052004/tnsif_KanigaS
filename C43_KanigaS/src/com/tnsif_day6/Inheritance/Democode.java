package com.tnsif_day6.Inheritance;
class A{
	 void show() {
		System.out.println("i am a parent");
	}}
	class A1  extends A{
	 void Demo() {
		System.out.println("i am a child");
	}}
  public  class Democode{

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
	A1 obj = new A1();
	obj.Demo();
		obj.show();
		
	}
	}
