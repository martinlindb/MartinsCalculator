package com.kvalit18.martinlindberg.MartinsCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class CalcBasicTest {
	
	CalcBasic CalcBasic = new CalcBasic();
	Random rand = new Random();
	DecimalFormat decform = new DecimalFormat();

	@Test
	public void testAdditionPositive() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum + secondNum;
			
			assertEquals(Math.round(CalcBasic.addition(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testAdditionNegative() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = firstNum + secondNum;
			
			assertEquals(Math.round(CalcBasic.addition(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testAdditionFirstZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum + secondNum;
			
			assertEquals(Math.round(CalcBasic.addition(firstNum, secondNum)), Math.round(res), 1);
		} 
				
	}
	
	@Test
	public void testAdditionSecondZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum + secondNum;
			
			assertEquals(Math.round(CalcBasic.addition(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testAdditionZeros() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
			
			assertEquals(Math.round(CalcBasic.addition(firstNum, secondNum)), Math.round(res), 0); 
		
	}
	
	@Test
	public void testSubtractionPositive() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum - secondNum;
			
			assertEquals(Math.round(CalcBasic.subtraction(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testSubtractionNegative() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = firstNum - secondNum;
			
			assertEquals(Math.round(CalcBasic.subtraction(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testSubtraction3FirstZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
		for (int k=0; k<50; k++) {
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum - secondNum;
			
			assertEquals(Math.round(CalcBasic.subtraction(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testSubtractionSecondZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum - secondNum;
			
			assertEquals(Math.round(CalcBasic.subtraction(firstNum, secondNum)), Math.round(res), 1);
		} 
		
	}
	
	@Test
	public void testSubtractionZeros() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
			
			assertEquals(Math.round(CalcBasic.subtraction(firstNum, secondNum)), Math.round(res), 0); 
		
	}
	
	@Test
	public void testMultiplicationPositive() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum * secondNum;
			
			assertEquals(Math.round(CalcBasic.multiplication(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testMultiplicationNegative() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = firstNum * secondNum;
			
			assertEquals(Math.round(CalcBasic.multiplication(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testMultiplicationFirstZeros() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum * secondNum;
			
			assertEquals(Math.round(CalcBasic.multiplication(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testMultiplicationSecondZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum * secondNum;
			
			assertEquals(Math.round(CalcBasic.multiplication(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testMultiplicationZeros() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum - secondNum;
		
			
			assertEquals(Math.round(CalcBasic.multiplication(firstNum, secondNum)), Math.round(res), 0); 
		
	}
	
	@Test
	public void testDivisionPositive() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum / secondNum;
			
			assertEquals(Math.round(CalcBasic.division(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testDivisionNegative() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*-10));
			res = firstNum / secondNum;
			
			assertEquals(Math.round(CalcBasic.division(firstNum, secondNum)), Math.round(res), 1);
		}
	}
	
	@Test
	public void testDivisionFirstZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			secondNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum / secondNum;
			
			assertEquals(Math.round(CalcBasic.division(firstNum, secondNum)), -0.123456789, 1);
		}
	}
	
	@Test
	public void testDivisionSecondZero() {
		double firstNum = 0;
		double secondNum = 0;
		double res = 0;
		
		for (int k=0; k<50; k++) {
			firstNum = Double.valueOf(decform.format(rand.nextDouble()*10));
			res = firstNum / secondNum;
			
			assertEquals(Math.round(CalcBasic.division(firstNum, secondNum)), -0.123456789, 1);
		}
	}
	
	@Test
	public void testDivisionZeros() {
		double firstNum = 0;
		double secondNum = 0;
		double res = firstNum / secondNum;
		
			
			assertEquals(Math.round(CalcBasic.division(firstNum, secondNum)), Math.round(res), 0); 
		
	}

}
