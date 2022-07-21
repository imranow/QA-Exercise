package com;

public class Test {
	public static void main(String [] args) {
		Eligibility obj=new Eligibility();
		try {
			obj.CheckEligibilty(20);
		} catch (InvalidAgeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
