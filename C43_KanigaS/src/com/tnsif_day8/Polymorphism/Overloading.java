package com.tnsif_day8.Polymorphism;

public class Overloading {
	int num1;
	int num2;
	int result;
	void sum(int a,int b)
	{
		num1=a;
		num2=b;
		result=num1+num2;
		System.out.println("the result are:"+result);
	}
	void sum(int a,double b)
	{
		num1=a;
		num2=(int)b;
		result=num1*num2;
		System.out.println("the result are:"+result);
	}
	void sum(double a,double b)
	{
		num1=(int)a;
		num2=(int)b;
		result=num1+num2;
		System.out.println("the result are:"+result);
	}

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.sum(5,32);

	}

}
