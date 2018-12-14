package com.kvalit18.martinlindberg.MartinsCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {
	Methods ma = new Methods();

	@Test
	public void test() {
		assertEquals(ma.myAdd1(1),2);
		
		assertTrue(ma.myAdd1(1) == 2);
	}

}
