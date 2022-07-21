package org;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("x.txt");
			String content = "This is java class for QA, Upasana is the instructor of the class";
			fw.write(content);
			fw.flush();
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
