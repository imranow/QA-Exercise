package org.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnits {
	@Test
	public void checkFindBig() {
		assertEquals(20, CalculatorExample.findBig(10, 20));
	}

	@Test
	public void checkFindBiggest() {
		assertEquals(30, CalculatorExample.findBiggest(10, 20, 30));
	}

	@Test
	public void checkCCLength() {
		assertEquals(16, CalculatorExample.checkCCNum("1234567891023456"));
	}

	@Test
	public void checkFindMax() {
		int[] x = { 100, 200, 300, 400, 50, 600, 7, 40 };
		assertEquals(600, CalculatorExample.findMax(x));
	}
}