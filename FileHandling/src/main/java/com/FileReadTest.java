package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("x.txt");
			BufferedReader br= new BufferedReader(fr);
			int data=br.read();
			while(data != -1) {
				System.out.print((char)data);
				data=br.read();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
