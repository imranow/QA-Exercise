package com;

import static org.junit.Assert.assertEquals;

import org.CalculatorExample;

public class TestAnnotation {
	private ArrayList<String> list;
	@BeforeClass //before each test
	
	public static void(m1)(){
		System.out.println("@BeforeClass");
	}
	@Before
	public void m2() {
		list=new ArrayList<String>();
		System.out.println("@Before");
	}
	@Test
	public void CheckFindBig() {
		assertEquals(50, CalculatorExample.findBiggest(10, 20, 50))
	}
	@Test
	public void check
}
public 