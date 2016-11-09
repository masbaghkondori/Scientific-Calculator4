import java.CalculatorInterface.*;

/**@author Mojgan Akhavan- Masoomeh Baghban  
* @version 1.0
* 
*          class AdvanceCalculator is a class which implements methods 
*          in CalculatorAdvancedOperationsInterface as a Basic Interface.
*          The methods are add,subtract,multiply,divide      .
*          
*  @since 08-11-2016

*/ 
public class AdvanceCalculator implements CalculatorAdvancedOperationsInterface {
	/**
	 *This method returns the square root of a number. 
	 */
	 	
	public double calculatesquart(double firstNumber){
		double result = Math.sqrt(firstNumber);
		return result;
	}
	
	/**
	 *This method returns the cosinus  of a number. 
	 */
	public double calculateCos(double firstNumber){
		double result = Math.cos(firstNumber);
		return result;		
	}
	
	/**
	 *This method returns the Sinus  of a number. 
	 */
	public double CalculateSinus (double firstNumber){
		double result = Math.sin(firstNumber);
		return result;
	}
	
	/**
	 *This method returns the round  of a decimal number. 
	 */
	public double CalculateRound (double firstNumber){
		double result = Math.round(firstNumber);
		return result;		
	}
	
	/**
	 *This method returns the logarithm  of a number. 
	 */
	public double CalculateLog   (double firstNumber){
		double result = Math.log(firstNumber);
		return result;
	}

	/**
	 *This method returns the  powered of a number by another number. 
	 */
	public double calculatepower (double firstNumber, double secondNumber){
		double result = Math.pow(firstNumber, secondNumber);
		return result;
	}

}