package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnits {
	public void checkFindBig() {
		assertEquals(20, Calculator.findBig(10, 20))
	}
	public void checkFindBiggest() {
		assertEquals(20, Calculator.findBiggest(10, 20, 30))
	}
	public void checkCCLength() {
		AssertEquals(16, Calculator.checkCCNum("123423345346453523"));
	}
	public void checkFindMax() {
		int [] x= {100, 200, 300, 400, 50, 600, 7, 40};
		assertEquals(400, Calculator.findMax(x));
}
