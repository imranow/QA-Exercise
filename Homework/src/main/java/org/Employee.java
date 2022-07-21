package org;

public class Employee {
	//Attributes/fields/class member
	String FirstName;
	String LastName;
	int age;
	String address;
	String PhoneNo;
	String email;
	int basicSalary;
	
	
	public Employee() {
		super();
	}
	

	public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email,
			int basicSalary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
		this.address = address;
		PhoneNo = phoneNo;
		this.email = email;
		this.basicSalary = basicSalary;
	}
//no of params
	//datatype of parameters
	//order of parameters

		
	
	public Employee(String firstName, String lastName, int age, String address, String phoneNo,
		int basicSalary) {
	super();
	FirstName = firstName;
	LastName = lastName;
	this.age = age;
	this.address = address;
	PhoneNo = phoneNo;
	
	this.basicSalary = basicSalary;
}


	public Employee(String firstName, String lastName, int age, String phoneNo,
			int basicSalary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
		
		PhoneNo = phoneNo;
		
		this.basicSalary = basicSalary;
	}

	public int CalculatefinalSalary() {
		
		this.basicSalary=basicSalary;
		int finalSalary = (basicSalary*10/100) + basicSalary;
		return finalSalary;
	}

	public String Greeting() {
		
		return "Hello "+FirstName+LastName;
	}
	public boolean CheckValidPhone() {
		if (PhoneNo.length()< 10)
			return false;
		else
			return true;
		
	}
	public boolean checkEmail() {
		if(email.contains("@"))
			return true;
		else
			return false;

	}
	public String Greeting(String fname, String lname) {
		// TODO Auto-generated method stub
		return "Hello " +fname+lname;
	}
	

}
