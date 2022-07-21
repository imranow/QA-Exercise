package org;

import java.util.Scanner;

public class JDBCApp {

	public static void main(String[] args) {
		methods meth = new methods();
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello welcome to my application");
		System.out.println("------------------------------");
		System.out.println("What would you like to do? please enter a method");
		System.out.println("Method 1. Read all the records from Product table");
		System.out.println("Method 2. Accept input from the user and add a new record to product table.");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Good choice - Method 1.");
			System.out.println(meth.method1() );
			break;
		case 2:
			System.out.println("Good choice - Method 2");
			System.out.println(meth.methods2());
		}
}

}