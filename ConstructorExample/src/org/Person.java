package org;

public class Person {
	String name;
	int age;
	String address;
	
	public Person(String n, int age, String address) {
		this.name=name;
		if(age<=0 || age>130) {
			System.out.println("Invalid Age");
		} else { this.age=age;}
		this.address=address;
		System.out.println("Person constructor called");
	}
	public Person() {
		this.name="Not Known";
		this.age=12;
		this.address="not known";
	}
	
	
	public Person(String n, int a) {
		name=n;
		age=a;
	}

}
