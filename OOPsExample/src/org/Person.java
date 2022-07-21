package org;

public class Person {
	String name;
	int age;
	public Person() {
		System.out.println("Person constructor called.");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public final void talk() {}
	public abstract void doSomething();
