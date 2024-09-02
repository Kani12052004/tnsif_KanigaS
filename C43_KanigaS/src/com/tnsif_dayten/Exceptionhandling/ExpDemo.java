package com.tnsif_dayten.Exceptionhandling;
import java.util.Scanner;

public class ExpDemo {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the number");
			int num=sc.nextInt();
			System.out.println(num%2==0?num+"is Even":num+"is Odd");
			return;
		}
		catch (Exception e) {
			System.out.println("Invalid input...");
		}
		finally {
			System.out.println("In Finally...");
			sc.close();
		}
	}
}
