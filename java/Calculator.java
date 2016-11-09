import javax.swing.JOptionPane;

public class Calculator {
	
	public double add(double firstNumber, double secondNUmber){
		return  firstNumber + secondNUmber;
	}

	public double subtract(double firstNumber, double secondNUmber){
		return  firstNumber - secondNUmber;
	}
	
	public double multiply(double firstNumber, double secondNUmber){
		return  firstNumber * secondNUmber;
	}
	
	public double divide(double firstNumber, double secondNUmber){
		double result = firstNumber / secondNUmber;
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}		
		
		return result;
	}

	public double pow(double firstNumber, double secondNUmber){
		return Math.pow(firstNumber, secondNUmber);
	}
	public double sin(double firstNumber){
		return Math.sin(firstNumber);
	}
}
