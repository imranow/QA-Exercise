package org;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("x.txt");
			int data=fr.read();
			while(data != -1) {
				System.out.print((char)data);
				data=fr.read();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
