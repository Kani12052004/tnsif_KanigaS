package com.tnsif_day5.Constructor;

public class Constructor {
	String name; // data member &instance variable
	int age;
	String dept;
	//Default Constructor
	public Constructor() {
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	// use keywords
	public Constructor (String ConstructorName, int ConstructorAge, String ConstructorDept) {
	System.out.println("parameterized  Constructor");
  this.name=ConstructorName;
  this.age=ConstructorAge;
  this.dept=ConstructorDept;
	
}


// TODO Auto-generated method stub

public String getName() { //naming convension 
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "oops concept [Name="+name +",Age="+ age+",Dept="+dept+"]";
}

public static void main(String[] args) {
	
	Constructor obj=new Constructor();
	obj.setName("Amu");
	obj.setAge(20);
	obj.setDept("ECE");
System.out.println(obj);
}
}
