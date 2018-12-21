package com.kvalit18.martinlindberg.MartinsCalculator;

/**
 * Den här classen innehåller metoderna för CalculatorAdvancedOperationsInterface
 */
public class CalcAdv implements CalculatorAdvancedOperationsInterface {
	
	/**
	 * Pi metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.PI classen och returnerar variabeln som double
	 */
	public double pi(double input) {
		return (Math.PI * input);		
	}
		
	/**
	 * Sin metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.sin classen och returnerar variabeln som double
	 */
	public double sin(double input) {
		input = Math.sin(input);
		return input;
	}
	
	/**
	 * Sinh metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.sinh classen och returnerar variabeln som double
	 */
	public double sinh(double input) {
		input = Math.sinh(input);
		return input;
	}
	
	/** 
	 * Cos metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.cos classen och returnerar variabeln som double
	 */
	public double cos(double input) {
		input = Math.cos(input);
		return input;
	}
	
	/**
	 * Tan metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.tan classen och returnerar variabeln som double
	 */
	public double tan(double input) {
		input = Math.tan(input);
		return input;
	}
	
	/**
	 * Root metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.sqrt classen och returnerar variabeln som double
	 */
	public double root(double input) {
		input = Math.sqrt(input);
		return input;
	}
	
	/**
	 * Cuberoot metoden
	 * @param input variabel
	 * @return räknar variabeln med Math.cbrt classen och returnerar variabeln som double
	 */
	public double cbrt(double input) {
		input = Math.cbrt(input);
		return input;
	}
	
}
