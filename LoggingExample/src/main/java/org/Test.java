package org;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static void main(String[] args) {
		LogException le = new LogException();
		Logger log = Logger.getLogger("");
		try {
			le.divByZero();
		} catch (Exception e) {
			log.log(Level.WARNING, "Can not/ by zero");
		
		}
		try {
			le.arrayBound();
		} catch (Exception e) {
			log.log(Level.INFO, "Array index out of bound");
		}
		try {
			le.fileNotFound();
		} catch (Exception e) {
			log.log(Level.INFO, "File cant be read");
		}
	}

}
