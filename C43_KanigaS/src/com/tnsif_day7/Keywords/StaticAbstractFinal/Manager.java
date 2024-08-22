package com.tnsif_day7.Keywords.StaticAbstractFinal;
 class Demo{ // final class
	final String name = "Abhi"; //final variable
	final void show() {//final method
		System.out.println("Final Statement");
	}
}
class song extends Demo{
	void voice() {
		System.out.println("Write");
	}
}
class play extends song{
	void song () {
		System.out.println("Print");
	}
}
public class Manager {
	public static void main(String args[]) {
		play obj=new play();
      obj.song();
      obj.show();
}
}
