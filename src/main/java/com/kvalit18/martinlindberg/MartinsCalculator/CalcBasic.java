package com.kvalit18.martinlindberg.MartinsCalculator;

public class CalcBasic implements CalculatorBasicOperationsInterface {
	
	public double addition(double firstNum, double secondNum) {
		
		return firstNum + secondNum;
		
	}
	
	public double subtraction(double firstNum, double secondNum) {
		
		return firstNum - secondNum;
		
	}
		
	public double multiplication(double firstNum, double secondNum) {
		
		return firstNum * secondNum;
				
	}
	
	public double division(double firstNum, double secondNum) {
		
		double res = firstNum / secondNum;
		

		if (secondNum == 0) {
			System.out.println("You cant divide by zero, fool!");
			return -0.123456789;
		}
		return res;
				
	}

}
