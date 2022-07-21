package domain;

public class Sample {
	public void method1() {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	public void method2() throws Exception {
		int x = 10;
		int y = 0;
		int z = x / y;
		
	}

}
