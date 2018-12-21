package com.kvalit18.martinlindberg.MartinsCalculator;

/**
 * Den här classen innehåller metoderna för CalculatorBasicOperationsInterface
 */
public class CalcBasic implements CalculatorBasicOperationsInterface {
	
	/**
	 * Den här metoden adderar de 2 variabler som skickats till metoden och returnerar resultatet.
	 * @param tar emot 2 st double variabler
	 * @return returnerar uträkning utav de två mottagna variablerna och returnerar resultatet
	 */
	public double addition(double firstNum, double secondNum) {
		
		return firstNum + secondNum;
		
	}
	
	/**
	 * Den här metoden subtraherar de 2 variabler som skickats till metoden och returnerar resultatet.
	 * @param tar emot 2 st double variabler
	 * @return returnerar uträkning utav de två mottagna variablerna och returnerar resultatet
	 */
	public double subtraction(double firstNum, double secondNum) {
		
		return firstNum - secondNum;
		
	}
		
	/**
	 * Den här metoden multiplicerar de 2 variabler som skickats till metoden och returnerar resultatet.
	 * @param tar emot 2 st double variabler
	 * @return returnerar uträkning utav de två mottagna variablerna och returnerar resultatet
	 */
	public double multiplication(double firstNum, double secondNum) {
		
		return firstNum * secondNum;
				
	}
	
	/**
	 * Den här metoden delar de 2 variablerna som skickats till metoden med varandra och returnerar resultatet.
	 * metoden tillåter in att dela med 0 och returnerar ett meddelande om man försöker göra det.
	 * @param tar emot 2 st double variabler
	 * @return returnerar uträkning utav de två mottagna variablerna och returnerar resultatet
	 */
	public double division(double firstNum, double secondNum) {
		
		double res = firstNum / secondNum;
		

		if (secondNum == 0) {
			System.out.println("You cant divide by zero, fool!");
			return -0.123456789;
		}
		return res;
				
	}

}
