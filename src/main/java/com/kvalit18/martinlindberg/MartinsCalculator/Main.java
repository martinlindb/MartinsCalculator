package com.kvalit18.martinlindberg.MartinsCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
	
	double firstNum;
	double secondNum;
	double res;
	
	private  JTextField nr1TF;
	private  JTextField nr2TF;
	
	private JLabel jlabelRes = new JLabel("Result: ");
	
	CalcBasic CalcBasic = new CalcBasic();
	CalcAdv CalcAdv = new CalcAdv();

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**textField = new JTextField();
		textField.setBounds(6, 6, 401, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);*/
		
		nr1TF = new JTextField();
		nr1TF.setBounds(6, 6, 321, 58);
		frame.getContentPane().add(nr1TF);
		nr1TF.setColumns(10);
		
		nr2TF = new JTextField();
		nr2TF.setBounds(6, 71, 321, 58);
		frame.getContentPane().add(nr2TF);
		nr2TF.setColumns(10);
		
		jlabelRes.setBounds(6, 129, 321, 20);
		frame.getContentPane().add(jlabelRes);

		JButton btn_sqrt = new JButton("√");
		btn_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(String.valueOf(textField.getText()));
				firstNum = CalcAdv.root(firstNum);
				jlabelRes.setText(String.valueOf(firstNum));
			}
		});
		btn_sqrt.setBounds(166, 153, 80, 45);
		frame.getContentPane().add(btn_sqrt);
		
		JButton btn_cbrt = new JButton("cbrt");
		btn_cbrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(String.valueOf(textField.getText()));
				firstNum = CalcAdv.cbrt(firstNum);
				jlabelRes.setText(String.valueOf(firstNum));
				
			}
		});
		btn_cbrt.setBounds(85, 153, 80, 45);
		frame.getContentPane().add(btn_cbrt);
		
		JButton btn_xy3 = new JButton("x^2");
		btn_xy3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText().toString());
				res = CalcAdv.pow2(firstNum);
				jlabelRes.setText("Result: " + res);
				
			}
		});
		btn_xy3.setBounds(6, 196, 80, 45);
		frame.getContentPane().add(btn_xy3);

		JButton btn_tan = new JButton("tan");
		btn_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(String.valueOf(textField.getText()));
				firstNum = CalcAdv.tan(firstNum);
				jlabelRes.setText(String.valueOf(firstNum));
				
			}
		});
		btn_tan.setBounds(6, 153, 80, 45);
		frame.getContentPane().add(btn_tan);

		JButton btn_sin = new JButton("sin");
		btn_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText());
				res = CalcAdv.sin(firstNum);
				jlabelRes.setText("Result: " + res);
				
			}
		});
		btn_sin.setBounds(247, 153, 80, 45);
		frame.getContentPane().add(btn_sin);

		JButton btn_cos = new JButton("cos");
		btn_cos.setBounds(85, 196, 80, 45);
		frame.getContentPane().add(btn_cos);
		
		JButton btn_sinh = new JButton("sinh");
		btn_sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText());
				res = CalcAdv.sinh(firstNum);
				jlabelRes.setText("Result: " + res);
				
			}
		});
		btn_sinh.setBounds(247, 196, 80, 45);
		frame.getContentPane().add(btn_sinh);
		
		JButton btn_pi = new JButton("π");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText());
				res = CalcAdv.pi(firstNum);
				jlabelRes.setText("Result: " + res);
				
			}
		});
		btn_pi.setBounds(166, 196, 80, 45);
		frame.getContentPane().add(btn_pi);
		
		JButton btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText().toString());
				secondNum = Double.parseDouble(nr2TF.getText().toString());
				res = CalcBasic.division(firstNum, secondNum);
				jlabelRes.setText("Result: " + res);
				
				
			}
		});
		btn_division.setBounds(6, 239, 80, 45);
		frame.getContentPane().add(btn_division);
		
		JButton btn_multiplication = new JButton("*");
		btn_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText().toString());
				secondNum = Double.parseDouble(nr2TF.getText().toString());
				res = CalcBasic.multiplication(firstNum, secondNum);
				jlabelRes.setText("Result: " + res);
				
			}
		});
		btn_multiplication.setBounds(85, 239, 80, 45);
		frame.getContentPane().add(btn_multiplication);
		
		JButton btn_addition = new JButton("+");
		btn_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText().toString());
				secondNum = Double.parseDouble(nr2TF.getText().toString());
				res = CalcBasic.addition(firstNum, secondNum);
				jlabelRes.setText("Result: " + res);
				
				
			}
		});
		btn_addition.setBounds(166, 239, 80, 45);
		frame.getContentPane().add(btn_addition);
		
		JButton btn_subtraction = new JButton("-");
		btn_subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(nr1TF.getText().toString());
				secondNum = Double.parseDouble(nr2TF.getText().toString());
				res = CalcBasic.subtraction(firstNum, secondNum);
				jlabelRes.setText("Result: " + res);
				
				
			}
		});
		btn_subtraction.setBounds(247, 239, 80, 45);
		frame.getContentPane().add(btn_subtraction);
	}
}
