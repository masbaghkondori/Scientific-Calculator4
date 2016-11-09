
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;

import java.lang.Math.*;
import java.util.EventObject;
public class CalculatorGUIGG implements ActionListener {

    private static final ActionEvent ActionEvent = null;
    private JFrame frmCalculator;
    private JPanel p = new JPanel();

    private JTextField txfFirstNumber;

    private Calculator calculator = new Calculator();
    private JLabel lblResult = new JLabel("Result:");

    private JLabel lblFirstNumber = new JLabel("first number");
//    private JLabel lblSecondNumber = new JLabel("second number:");

    private JButton b[] = new JButton[21];
    private String s[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "POW", "SQR", "log",
        "RND", "Cos", "Sin", "="};
            ArrayList<String> numbers = new ArrayList<String>();

    private JTextField r;

    private String first = "";
//    private String second = "";
    private double firstNumber = 0.0;
//    private double secondNUmber = 0.0;
    

   
    String f="";
   

    /**
     * Create the application.
     */
    public CalculatorGUI() {
        createAndShowGUI();
        addComponentsToFrame();
     
    }

    /**
     * Initialize the contents of the frame.
     * @wbp.parser.entryPoint
     */
    private void createAndShowGUI() {

        frmCalculator = new JFrame();
        frmCalculator.getContentPane().setBackground(Color.CYAN);
        frmCalculator.setTitle("Calculator");
        frmCalculator.setBounds(100, 100, 355, 456);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCalculator.getContentPane().setLayout(null);

        txfFirstNumber = new JTextField();
        txfFirstNumber.setText("");
        
        txfFirstNumber.setBounds(116, 27, 108, 20);
        frmCalculator.getContentPane().add(txfFirstNumber);
        txfFirstNumber.setColumns(10);

//        txfSecondNumber = new JTextField();
//        txfSecondNumber.setBounds(116, 58, 108, 20);
//        frmCalculator.getContentPane().add(txfSecondNumber);
//        txfSecondNumber.setColumns(10);

        lblFirstNumber.setBounds(10, 30, 96, 14);
//        lblSecondNumber.setBounds(10, 61, 96, 14);
        lblResult.setBounds(20, 96, 223, 14);
        for (int i = 0; i < 21; i++) {
            b[i] = new JButton(s[i]);

            b[i].setMargin(new Insets(0, 0, 0, 0));
            b[i].setFont(new Font("Tahoma", Font.PLAIN, 14));

            b[i].setName(s[i]);

            b[i].addActionListener(this);
            frmCalculator.getContentPane().add(b[i]);
            p.setBackground(Color.BLUE);

        }

        b[10].setBounds(40, 183, 40, 25);
        b[11].setBounds(99, 183, 40, 25);
        b[12].setBounds(151, 183, 40, 25);
        b[13].setBounds(203, 183, 40, 25);

        b[14].setBounds(262, 182, 40, 25);
        b[15].setBounds(99, 145, 40, 25);
        b[16].setBounds(151, 145, 40, 25);
        b[17].setBounds(262, 146, 40, 25);
        b[18].setBounds(203, 145, 40, 25);
        b[19].setBounds(40, 145, 40, 25);
        b[20].setBounds(262, 221, 40, 143);

        b[0].setBounds(40, 339, 40, 25);
        b[1].setBounds(40, 301, 40, 25);
        b[2].setBounds(120, 301, 40, 25);
        b[3].setBounds(203, 301, 40, 25);
        b[4].setBounds(40, 263, 40, 25);
        b[5].setBounds(120, 263, 40, 25);
        b[6].setBounds(203, 263, 40, 25);
        b[7].setBounds(40, 223, 40, 25);
        b[8].setBounds(120, 223, 40, 25);
        b[9].setBounds(203, 223, 40, 25);
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
//        frmCalculator.getContentPane().add(lblSecondNumber);
        frmCalculator.getContentPane().add(lblResult);
    }

    public void actionPerformed(ActionEvent e) { 
        numbers.clear();
        f="";
            for (int i = 0; i < 10; i++) {
            if (e.getSource() == b[i]) {
                f = f + s[i];
            }
            
        }
        numbers.add(f);
                                System.out.println("add "+numbers.size());
                                              for (int k = 0; k < numbers.size(); k++) {
                      System.out.println(numbers.get(k)+"    k  "+k+"   size "+numbers.size());
}

        txfFirstNumber.setText(txfFirstNumber.getText()+f);
        for (int j = 10; j < 21; j++) {
            
      

            if (e.getSource() == b[j]) {
//               txfFirstNumber.setText(s[j]);
               txfFirstNumber.setText(txfFirstNumber.getText()+" "+s[j]+"");
                System.out.println("txfFirstNumber.setText" + txfFirstNumber.getText());
            }
        }
   

        if (e.getSource() == b[20]) {
            System.out.println("Equal ");
                        System.out.println(numbers.size());

               for (int k = 0; k < numbers.size()-1; k++) {
                      System.out.println(numbers.get(k)+"    k  "+k+"   size "+numbers.size());
}
            double result = 0;
            for (int m = 0; m < numbers.size()-1; m++) {
               double s = Double.valueOf(numbers.get(m));
//               System.out.println("  m "+s);
//                result = calculator.add(Double.valueOf(s), result);
               result = (s+ result);

               
                lblResult.setText("Result: " + result);
            }
            System.out.println(" result  " + result);
//			
        }
    }

//    public void setTextField1(String f1) {
//        txfFirstNumber.setText(f1);
//        return;
//    }
//
//    public double getValueFromTextField1() {
//        double firstNumber = 0.0;
//        firstNumber = Double.valueOf(txfFirstNumber.getText());
//        return firstNumber;
//    }
//
//    public double getValueFromTextField2() {
//        double secondNumber = 0.0;
//        secondNumber = Double.valueOf(txfSecondNumber.getText());
//        return secondNumber;
//    }
//
//    public void setTextField2(String f2) {
//        txfSecondNumber.setText(second);
//    }

//    public String getNumbers(ActionEvent e) {
//
//        System.out.print("getNumbers44 ");
//
//        check = true;
//        String f1 = "";
//        String f2 = "";
//        boolean checknum = true;
//        int i = 0;
//        while (i < 10) {
//            if (e.getSource() == b[i]) {
//
//                System.out.println(" getNumbers44 s " + s[i]);
//
//                f = f.concat(s[i]);
//                // r.setText("");
//                // r.setText(f);
//                System.out.println("getNumbersfirst " + f);
//
//                System.out.println("getNumbersb[i].getName()  " + b[i].getName());
//                System.out.println("getNumberss[i]  " + s[i]);
//                txfFirstNumber.setText(f);
//                System.out.println("getNumberstxfFirstNumber  " + txfFirstNumber.getText());
//
//            } else if (e.getSource() == b[i] && check) {
//                f = f + b[i].getName();
//                System.out.print("second " + f);
//                txfSecondNumber.setText(f);
//            }
//            i = i + 1;
//        }
//        return f;
//    }
    /*
		 * System.out.println("add");
		 * 
		 * String f2=" "; e=ActionEvent; f2= (Textfields(e));
		 * System.out.println("f2 "+ f2);
		 * 
		 * setTextField1(f1);
		 * 
		 * setTextField2(f2);
		 * 
		 * //
		 * System.out.println("fnum "+txfSecondNumber+"semcnu "+txfSecondNumber)
		 * ;
		 * 
		 * 
		 * double result = calculator.add(getValueFromTextField1(),
		 * getValueFromTextField2()); lblResult.setText("Result: " + result);
		 * System.out.println("result "+result);} else
		 * {System.out.println("nt oadd");
		 * 
		 * } }
     */
    /**
     *
     * get value from text field
     *
     * @return firstNUmber - Number that is written in the textfield
		 *
     */
    /*
		 * public double getValueFromTextField1() { double firstNumber = 0.0;
		 * firstNumber = Double.valueOf(txfFirstNumber.getText()); return
		 * firstNumber; }
		 * 
		 * public double getValueFromTextField2() { double secondNumber = 0.0;
		 * secondNumber = Double.valueOf(txfSecondNumber.getText()); return
		 * secondNumber; }
		 * 
		 * public void setTextField1(String first) {
		 * txfFirstNumber.setText(first); }
		 * 
		 * public void setTextField2(String second) {
		 * txfSecondNumber.setText(second); }
     */
    // public void actionPerformed(java.awt.event.ActionEvent e) {
    // TODO Auto-generated method stub
    /*
	 * public void setFirstNumber(double firstNumber) { this.firstNumber =
	 * firstNumber; }
	 * 
	 * public void setSecondNUmber(double secondNUmber) { this.secondNUmber =
	 * secondNUmber; }
	 * 
	 * public double getFirstNumber() { return firstNumber; }
	 * 
	 * public double getSecondNUmber() { return secondNUmber; }
     */

 /*
	 * public String Textfields(ActionEvent e){ // while(e.getSource() ==
	 * btn1||e.getSource() == btn2||e.getSource() == btn3){ if(e.getSource() ==
	 * btn1) first=first+btn1.getName();
	 * 
	 * if(e.getSource() == btn2) first=first+btn2.getName();
	 * 
	 * if(e.getSource() == btn3) first=first+btn3.getName();
	 * 
	 * if(e.getSource() == btn4) first=first+btn4.getName(); if(e.getSource() ==
	 * btn5) first=first+btn5.getName(); // } return first;
	 * 
	 * }
     */
 /*
	 * public void actionPerformed(ActionEvent e) {
	 * 
	 * String f1=Textfields(e); System.out.println("f1  "+f1);
	 * 
	 * 
	 * if (e.getSource()==btnAdd) {
	 * 
	 * System.out.println("add");
	 * 
	 * String f2=" "; e=ActionEvent; f2= (Textfields(e));
	 * System.out.println("f2 "+ f2);
	 * 
	 * setTextField1(f1);
	 * 
	 * setTextField2(f2);
	 * 
	 * // System.out.println("fnum "+txfSecondNumber+"semcnu "+txfSecondNumber);
	 * 
	 * 
	 * double result = calculator.add(getValueFromTextField1(),
	 * getValueFromTextField2()); lblResult.setText("Result: " + result);
	 * System.out.println("result "+result);} else
	 * {System.out.println("nt oadd");
	 * 
	 * }
	 * 
	 * if (e.getSource() == btnSubtract) { double result =
	 * calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
	 * lblResult.setText("Result: " + result); }
	 * 
	 * if (e.getSource() == btnMultiply) { double result =
	 * calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
	 * lblResult.setText("Result: " + result); }
	 * 
	 * if (e.getSource() == btnPow) { double result =
	 * calculator.pow(getValueFromTextField1(), getValueFromTextField2());
	 * lblResult.setText("Result: " + result); } if (e.getSource() == btnSin) {
	 * double result = calculator.sin(getValueFromTextField1());
	 * lblResult.setText("Result: " + result); } if (e.getSource() == btnCos) {
	 * double result = calculator.cos(getValueFromTextField1());
	 * lblResult.setText("Result: " + result); } if (e.getSource() == btnSqr) {
	 * double result = calculator.sqrt(getValueFromTextField1());
	 * lblResult.setText("Result: " + result); } if (e.getSource() == btnLog) {
	 * double result = calculator.log(getValueFromTextField1());
	 * lblResult.setText("Result: " + result); } if (e.getSource() == btnRnd) {
	 * double result = calculator.rnd(getValueFromTextField1());
	 * lblResult.setText("Result: " + result); }
	 * 
	 * 
	 * }
     */
}
