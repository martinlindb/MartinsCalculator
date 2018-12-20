package com.kvalit18.martinlindberg.MartinsCalculator;

/**
 * Den här classen innehåller metoderna för CalculatorAdvancedOperationsInterface
 */
public class CalcAdv implements CalculatorAdvancedOperationsInterface {
	
	/* 
	 * Pi metoden
	 */
	public double pi(double input) {
		return (Math.PI * input);		
	}
		
	/* 
	 * Sin metoden
	 */
	public double sin(double input) {
		input = Math.sin(input);
		return input;
	}
	
	/* 
	 * Sinh metoden
	 */
	public double sinh(double input) {
		input = Math.sinh(input);
		return input;
	}
	
	/* 
	 * Cos metoden
	 */
	public double cos(double input) {
		input = Math.cos(input);
		return input;
	}
	
	/* 
	 * Tan metoden
	 */
	public double tan(double input) {
		input = Math.tan(input);
		return input;
	}
	
	/* 
	 * Root metoden
	 */
	public double root(double input) {
		input = Math.sqrt(input);
		return input;
	}
	
	/* 
	 * Cuberoot metoden
	 */
	public double cbrt(double input) {
		input = Math.cbrt(input);
		return input;
	}
	
}
