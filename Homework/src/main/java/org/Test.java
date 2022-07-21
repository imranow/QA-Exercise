package org;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.FirstName="John";
		e1.LastName="Doe";
		e1.age=32;
		e1.address="India";
		int tempSalary = e1.CalculatefinalSalary();
		System.out.println(tempSalary);
		System.out.println(e1.Greeting());
		//public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email,
		//int basicSalary) 
		System.out.println(e1.Greeting("Imran", " Lopez"));
		System.out.println(e1.CheckValidPhone());
		System.out.println(e1.checkEmail());
		/*public Employee(String firstName, String lastName, int age, String phoneNo,
			int basicSalary)*/
		Employee e2=new Employee("Upasana", "Dew", 32, "9832834813123","240000", tempSalary);
		int tempSalary1 = e2.CalculatefinalSalary();
		System.out.println(tempSalary1);
		System.out.println(e2.Greeting());
		System.out.println(e2.Greeting("Imran", " Lopez"));
		System.out.println(e2.CheckValidPhone());
		System.out.println(e2.checkEmail());
		

	}

}
