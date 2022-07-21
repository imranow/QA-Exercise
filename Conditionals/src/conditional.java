
public class conditional {
	
	public static void main(String[] args) {
        Employee e=new Employee();
        Student s=new Student();
        Customer c=new Customer();
        
        if(c instanceof Customer) {
        	System.out.println("You gota customer object");
        } else if(c instanceof Student) {
        	System.out.println("You got a student object");
        } else if(c instanceof Employee) {
        	System.out.println("You got an Employee object");
        }

}
}
