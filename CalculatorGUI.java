import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSpinner;

public class CalculatorGUI implements ActionListener {
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	private BasicCalculator calculator = new BasicCalculator();
	private AdvanceCalculator calculatorA = new AdvanceCalculator();
	private JLabel lblResult = new JLabel("Result:");
	private JLabel lblFirstNumber = new JLabel("first number");
	private JLabel lblSecondNumber = new JLabel("second number:");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btnPow = new JButton("POW");
	private JButton btnSqr = new JButton("Sqr");
	private JButton btnLog = new JButton("log");
	private JButton btnRND = new JButton("RND");
	private JButton btnCos = new JButton("Cos");
	private JButton btnSin = new JButton("Sin");
	private JButton btnPoint = new JButton(".");
	private final JButton btn0 = new JButton("0");
	private final JButton btn1 = new JButton("1");
	private final JButton btn2 = new JButton("2");
	private final JButton btn3 = new JButton("3");
	private final JButton btn4 = new JButton("4");
	private final JButton btn5 = new JButton("5");
	private final JButton btn6 = new JButton("6");
	private final JButton btn7 = new JButton("7");
	private final JButton btn8 = new JButton("8");
	private final JButton btn9 = new JButton("9");
	private final JButton btnEqual = new JButton("=");



	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createAndShowGUI() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.YELLOW);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 311, 445);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		txfFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));

		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);

		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		txfSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));

		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);

		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setBounds(10, 86, 223, 14);

		btnAdd.setBounds(10, 139, 47, 23);
		btnAdd.setMargin(new Insets(0, 0, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubtract.setBounds(67, 139, 44, 23);
		btnSubtract.setMargin(new Insets(0, 0, 0, 0));
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMultiply.setBounds(125, 139, 47, 23);
		btnMultiply.setMargin(new Insets(0, 0, 0, 0));
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDivide.setBounds(182, 139, 47, 23);
		btnDivide.setMargin(new Insets(0, 0, 0, 0));
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPow.setBounds(10, 179, 47, 23);
		btnPow.setMargin(new Insets(0, 0, 0, 0));
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSqr.setBounds(67, 179, 47, 23);
		btnSqr.setMargin(new Insets(0, 0, 0, 0));
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLog.setBounds(67, 179, 47, 23);
		btnLog.setMargin(new Insets(0, 0, 0, 0));
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRND.setBounds(125, 179, 47, 23);
		btnRND.setMargin(new Insets(0, 0, 0, 0));
		btnRND.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCos.setBounds(182, 179, 47, 23);
		btnCos.setMargin(new Insets(0, 0, 0, 0));
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSin.setBounds(241, 139, 47, 23);
		btnSin.setMargin(new Insets(0, 0, 0, 0));
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPoint.setBounds(241, 179, 40, 25);
		btnPoint.setMargin(new Insets(0, 0, 0, 0));
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(9, 350, 48, 25);
		btn0.setMargin(new Insets(0, 0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(241, 179, 40, 25);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 317, 48, 25);
		btn2.setBounds(76, 317, 48, 25);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setMargin(new Insets(0, 0, 0, 0));
		btn3.setBounds(143, 317, 48, 25);
		btn3.setMargin(new Insets(0, 0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(9, 277, 48, 25);
		btn4.setMargin(new Insets(0, 0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(76, 277, 48, 25);
		btn5.setMargin(new Insets(0, 0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(143, 277, 48, 25);
		btn6.setMargin(new Insets(0, 0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 239, 48, 25);
		btn7.setMargin(new Insets(0, 0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(76, 239, 48, 25);
		btn8.setMargin(new Insets(0, 0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(143, 239, 48, 25);
		btn9.setMargin(new Insets(0, 0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(241, 239, 40, 130);
		btnEqual.setMargin(new Insets(0, 0, 0, 0));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.setVisible(true);
	}

	/**
	 * Addind components to frame.
	 * 
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame() {
		frmCalculator.getContentPane().add(lblFirstNumber);
		frmCalculator.getContentPane().add(lblSecondNumber);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);
		frmCalculator.getContentPane().add(btnPow);
		frmCalculator.getContentPane().add(btnSqr);
		frmCalculator.getContentPane().add(btnLog);
		frmCalculator.getContentPane().add(btnRND);
		frmCalculator.getContentPane().add(btnCos);
		frmCalculator.getContentPane().add(btnSin);
		frmCalculator.getContentPane().add(btnPoint);
		frmCalculator.getContentPane().add(btn0);
		frmCalculator.getContentPane().add(btn1);
		frmCalculator.getContentPane().add(btn2);
		frmCalculator.getContentPane().add(btn3);
		frmCalculator.getContentPane().add(btn4);
		frmCalculator.getContentPane().add(btn5);
		frmCalculator.getContentPane().add(btn6);
		frmCalculator.getContentPane().add(btn7);
		frmCalculator.getContentPane().add(btn8);
		frmCalculator.getContentPane().add(btn9);
	}
		
		
	public void addActionListeners() {
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnPow.addActionListener(this);
		btnSqr.addActionListener(this);
		btnLog.addActionListener(this);
		btnRND.addActionListener(this);
		btnCos.addActionListener(this);
		btnSin.addActionListener(this);
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnEqual.addActionListener(this);

	}

	/**
	 *
	 * get value from text field
	 * 
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double getValueFromTextField1() {
		double firstNumber = 0.0;
		firstNumber = Double.valueOf(txfFirstNumber.getText());
		return firstNumber;
	}

	public double getValueFromTextField2() {
		double secondNumber = 0.0;
		secondNumber = Double.valueOf(txfSecondNumber.getText());
		return secondNumber;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnSubtract) {
			double result = calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnMultiply) {
			double result = calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnDivide) {
			double result = calculator.divide(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnPow) {
			double result = calculatorA.calculatepower(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnSqr) {
			double result = calculatorA.calculatesquart(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnLog) {
			double result = calculatorA.CalculateLog(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnRND) {

			double result = calculatorA.CalculateRound(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnCos) {
			double result = calculatorA.calculateCos(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnSin) {
			double result = calculatorA.CalculateSinus(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnPoint) {
			txfFirstNumber.setText(txfFirstNumber.getText() + ".");
		}

	}
}
