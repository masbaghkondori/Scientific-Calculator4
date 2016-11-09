package CalculatorInterface;



public class AdvanceCalculator implements CalculatorAdvancedOperationsInterface {
	
	public double calculatesquart(double firstNumber){
		double result = Math.sqrt(firstNumber);
		return result;
	}
	public double calculateCos(double firstNumber){
		double result = Math.cos(firstNumber);
		return result;
		
	}
	public double CalculateSinus (double firstNumber){
		double result = Math.sin(firstNumber);
		return result;
	}
	public double CalculateRound (double firstNumber){
		double result = Math.round(firstNumber);
		return result;
		
	}
	public double CalculateLog   (double firstNumber){
		double result = Math.log(firstNumber);
		return result;
	}
	
	public double calculatepower (double firstNumber, double secondNumber){
		double result = Math.pow(firstNumber, secondNumber);
		return result;
	}
	
	

}
