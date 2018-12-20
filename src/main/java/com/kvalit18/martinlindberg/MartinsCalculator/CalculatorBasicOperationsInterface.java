package com.kvalit18.martinlindberg.MartinsCalculator;

/**
 * Interface för CalcBasic
 */
public interface CalculatorBasicOperationsInterface {
	
	/**
	 * Addition.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @return the double
	 */
	public double addition(double firstNumber, double secondNumber);
	
	/**
	 * Subtraction.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @return the double
	 */
	public double subtraction(double firstNumber, double secondNumber);
	
	/**
	 * Multiplication.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @return the double
	 */
	public double multiplication(double firstNumber, double secondNumber);
	
	/**
	 * Division.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @return the double
	 */
	public double division(double firstNumber, double secondNumber);


}
