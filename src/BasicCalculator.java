import javax.swing.JOptionPane;
import java.CalculatorInterface.*;
/***
 * 
*@author Mojgan Akhavan- Masoomeh Baghban  
 * @version 1.0
 * 
 *          class BasicCalculator is a class which implements methods 
 *          in CalculatorBasicOperationsInterface as a Basic Interface.
 *          The methods are add,subtract,multiply,divide *          .

 *          
 *  @since 08-11-2016

 */      
 


public class BasicCalculator implements CalculatorBasicOperationsInterface{
		
	/**
		 *This method adds two double numbers and returns the result to class calculatorGUI
		 */
		 
		public double add(double firstNumber, double secondNUmber){
			return  firstNumber + secondNUmber;
		}
		/**
		 *This method subtracts two double numbers and returns the result to class calculatorGUI
		 */
		public double subtract(double firstNumber, double secondNUmber){
			return  firstNumber - secondNUmber;
		}
		/**
		 *This method multiplies two double numbers and returns the result to class calculatorGUI
		 */
		public double multiply(double firstNumber, double secondNUmber){
			return  firstNumber * secondNUmber;
		}
		/**
		 *This method divides two double numbers and returns the result to class calculatorGUI, 
		 *also checks if it is a infinite division.
		 */
		public double divide(double firstNumber, double secondNUmber){
			double result = firstNumber / secondNUmber;
			if (Double.isInfinite(result)){
				JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
				return -1111.1111;
			}		
			
			return result;
		}
}

