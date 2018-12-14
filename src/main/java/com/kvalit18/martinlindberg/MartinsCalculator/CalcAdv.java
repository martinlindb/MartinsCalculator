package com.kvalit18.martinlindberg.MartinsCalculator;

public class CalcAdv implements CalculatorAdvancedOperationsInterface {
	
	public double pi(double input) {
		input = (3.141592653589) * 2;
		return input;
	}
	
	public double pow2(double input) {
		input = (input * input);
		return input;			
	}	
	public double sin(double input) {
		input = Math.sin(input);
		return input;
	}
	
	public double sinh(double input) {
		input = Math.sinh(input);
		return input;
	}
	
	public double cos(double input) {
		input = Math.cos(input);
		return input;
	}
	
	public double tan(double input) {
		input = Math.tan(input);
		return input;
	}
	public double root(double input) {
		input = Math.sqrt(input);
		return input;
	}
	public double cbrt(double input) {
		input = Math.cbrt(input);
		return input;
	}
	public double plusminus(double input) {
		input = input * (-1);
		return input;
	}
	
}
