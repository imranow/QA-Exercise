package org;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println("Hello, Welcome to my calculator");
		System.out.println("-------------------");
		System.out.println("What would you like to do? please choose one");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Good choice- Addition");
			System.out.println("The result is "+cal.plus());
			break;
		case 2:
			System.out.println("Good choice- Subtraction");
			System.out.println("The result is "+cal.minus());
			break;
		case 3:
			System.out.println("Good choice- Division");
			System.out.println("The result is "+cal.division());
			break;
		case 4:
			System.out.println("Good choice- Multiplication");
			System.out.println("The result is "+cal.multiply());
			break;
		}
	}

}
