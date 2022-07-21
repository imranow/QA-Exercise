package Example1;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		InputAndOutput obj = new InputAndOutput();
		try {
			obj.bufferedCopy();
			System.out.println("Operation done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
