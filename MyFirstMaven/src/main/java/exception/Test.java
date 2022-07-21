package exception;

public class Test {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(z);
			int[] m=new int[5];
			m[5]=100;
			System.out.println(Math.sin(12345.78));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong probably, one of the numbers is zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("max size of array is 5, u r placing a value at 6th");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong, probably one of the numbers is zero");
		} finally {
			System.out.println("This block will execute irrespective of exception raised");
			System.out.println("I will execute surely");
		
		}
	}

}
