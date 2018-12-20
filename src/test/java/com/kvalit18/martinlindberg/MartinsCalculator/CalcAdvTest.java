package com.kvalit18.martinlindberg.MartinsCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class CalcAdvTest {
	
	CalcAdv CalcAdv = new CalcAdv();
	Random rand = new Random();
	DecimalFormat decform = new DecimalFormat();

	@Test
	public void testRootWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.sqrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.root(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testRootWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.sqrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.root(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testRootWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			
			res = Math.sqrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.root(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testcbrtWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.cbrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cbrt(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testcbrtWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.cbrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cbrt(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testcbrtWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			
			res = Math.cbrt(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cbrt(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testTanWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.tan(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.tan(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testTanWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.tan(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.tan(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testTanWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {

			res = Math.tan(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.tan(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testPiWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.PI * firstNum;
			
			
			assertEquals(Math.round(CalcAdv.pi(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testPiWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.PI * firstNum;
			
			
			assertEquals(Math.round(CalcAdv.pi(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testPiWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {

			res = Math.PI * firstNum;
			
			
			assertEquals(Math.round(CalcAdv.pi(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.sin(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sin(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.sin(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sin(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			
			res = Math.sin(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sin(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinhWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.sinh(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sinh(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinhWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.sinh(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sinh(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testSinhWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			
			res = Math.sinh(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.sinh(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testCosWithPositive() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = Math.cos(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cos(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testCosWithNegative() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = Math.cos(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cos(firstNum)), Math.round(res), 1);
			
		}
		
	}
	
	@Test
	public void testCosWithZero() {
		double firstNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			
			res = Math.cos(firstNum);
			
			
			assertEquals(Math.round(CalcAdv.cos(firstNum)), Math.round(res), 1);
			
		}
		
	}	

}
