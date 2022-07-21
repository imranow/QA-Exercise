package org;

import java.util.Scanner;

public class Calculator {

	int x;
	int y;
	
	public int plus () {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your first no.");
		x=scn.nextInt();
		System.out.println("Enter your second no.");
		x=scn.nextInt();
		return x+y;
	}
	public int minus() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your first no.");
		x=scn.nextInt();
		System.out.println("Enter your second no.");
		x=scn.nextInt();
		return x-y;
	}
	public int division() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your first no.");
		x=scn.nextInt();
		System.out.println("Enter your second no.");
		x=scn.nextInt();
		return x/y;
	}
	public int multiply() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your first no.");
		x=scn.nextInt();
		System.out.println("Enter your second no.");
		x=scn.nextInt();
		return x*y;
	}
}
