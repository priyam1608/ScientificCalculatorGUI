package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField txtG;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 340, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 10, 255, 36);
		frame.getContentPane().add(lblNewLabel);
		
		txtG = new JTextField();
		txtG.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtG.setBounds(0, 42, 326, 65);
		frame.getContentPane().add(txtG);
		txtG.setColumns(10);
		
		JButton btnR = new JButton("\u221a");
		btnR.setEnabled(false);
		btnR.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnR.setBounds(0, 153, 68, 58);
		frame.getContentPane().add(btnR);
		
		JButton btn1x = new JButton("1/x");
		btn1x.setEnabled(false);
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btn1x.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn1x.setBounds(0, 209, 68, 58);
		frame.getContentPane().add(btn1x);
		
		JButton btnxy = new JButton("x^y");
		btnxy.setEnabled(false);
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtG.getText());
				txtG.setText("");
				operation="x^y";
			}
		});
		btnxy.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnxy.setBounds(0, 265, 68, 58);
		frame.getContentPane().add(btnxy);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.setEnabled(false);
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(txtG.getText()));
				double ans = a*a*a;
				txtG.setText("");
				txtG.setText(txtG.getText()+ans);
			}
		});
		btnx3.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnx3.setBounds(0, 319, 68, 58);
		frame.getContentPane().add(btnx3);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.setEnabled(false);
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(txtG.getText()));
				double ans = a*a;
				txtG.setText("");
				txtG.setText(txtG.getText()+ans);
			}
		});
		btnx2.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnx2.setBounds(0, 374, 68, 58);
		frame.getContentPane().add(btnx2);
		
		JButton btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Double.parseDouble(txtG.getText());
				int fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				txtG.setText("");
				txtG.setText(txtG.getText()+fact);
			}
		});
		btnfact.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnfact.setBounds(0, 431, 68, 58);
		frame.getContentPane().add(btnfact);
		
		JButton btnPlusMin = new JButton("+/-");
		btnPlusMin.setEnabled(false);
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(txtG.getText()));
				a=a*(-1);
				txtG.setText(String.valueOf(a));
			}
		});
		btnPlusMin.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnPlusMin.setBounds(0, 487, 68, 58);
		frame.getContentPane().add(btnPlusMin);
		
		JButton btnExpo = new JButton("e^x");
		btnExpo.setEnabled(false);
		btnExpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnExpo.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnExpo.setBounds(65, 153, 68, 58);
		frame.getContentPane().add(btnExpo);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnLog.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnLog.setBounds(65, 209, 68, 58);
		frame.getContentPane().add(btnLog);
		
		JButton btnPerc = new JButton("%");
		btnPerc.setEnabled(false);
		btnPerc.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnPerc.setBounds(65, 265, 68, 58);
		frame.getContentPane().add(btnPerc);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn7.getText();
				txtG.setText(number);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn7.setBounds(65, 319, 68, 58);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn4.getText();
				txtG.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn4.setBounds(65, 374, 68, 58);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn1.getText();
				txtG.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn1.setBounds(65, 431, 68, 58);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn0.getText();
				txtG.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn0.setBounds(65, 487, 135, 58);
		frame.getContentPane().add(btn0);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnSin.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSin.setBounds(132, 153, 68, 58);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		btnSinh.setBounds(132, 209, 68, 58);
		frame.getContentPane().add(btnSinh);
		
		JButton btnC = new JButton("C");
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtG.setText(null);
			}
		});
		btnC.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnC.setBounds(132, 265, 68, 58);
		frame.getContentPane().add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn8.getText();
				txtG.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn8.setBounds(132, 319, 68, 58);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn5.getText();
				txtG.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn5.setBounds(132, 374, 68, 58);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn2.getText();
				txtG.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn2.setBounds(132, 431, 68, 58);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnCos.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnCos.setBounds(197, 153, 68, 58);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnCosh.setBounds(197, 209, 68, 58);
		frame.getContentPane().add(btnCosh);
		
		JButton btnB = new JButton("<-");
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace =null;
				if(txtG.getText()!= null) {
					StringBuilder str = new StringBuilder(txtG.getText());
					str.deleteCharAt(str.length()-1);
					backSpace = str.toString();
					txtG.setText(backSpace);
				}
				
			}
		});
		btnB.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnB.setBounds(197, 265, 68, 58);
		frame.getContentPane().add(btnB);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn9.getText();
				txtG.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn9.setBounds(197, 319, 68, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn6.getText();
				txtG.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn6.setBounds(197, 374, 68, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btn3.getText();
				txtG.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 19));
		btn3.setBounds(197, 431, 68, 58);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= txtG.getText()+btnDot.getText();
				txtG.setText(number);
			}
		});
		btnDot.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnDot.setBounds(197, 487, 68, 58);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnTan.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnTan.setBounds(263, 153, 68, 58);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(txtG.getText()));
				txtG.setText("");
				txtG.setText(txtG.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnTanh.setBounds(263, 209, 68, 58);
		frame.getContentPane().add(btnTanh);
		
		JButton btnplus = new JButton("+");
		btnplus.setEnabled(false);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtG.getText());
				txtG.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnplus.setBounds(263, 263, 68, 58);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.setEnabled(false);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtG.getText());
				txtG.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnminus.setBounds(263, 319, 68, 58);
		frame.getContentPane().add(btnminus);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtG.getText());
				txtG.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnMul.setBounds(263, 374, 68, 58);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtG.getText());
				txtG.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnDiv.setBounds(263, 431, 68, 58);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(txtG.getText());
				if(operation=="+") {
					result =first + second;
					answer= String.format("%.2f", result);
					txtG.setText(answer);
				}
				else if(operation =="-") {
					result =first - second;
					answer= String.format("%.2f", result);
					txtG.setText(answer);
				}
				else if(operation =="*") {
					result =first * second;
					answer= String.format("%.2f", result);
					txtG.setText(answer);
				}
				else if(operation =="/") {
					result =first / second;
					answer= String.format("%.2f", result);
					txtG.setText(answer);
				}
				else if(operation=="x^y") {
					result=1;
					for(int i=0;i<second;i++) {
						result = first * result;
					}
					answer= String.format("%.2f", result);
					txtG.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnEqual.setBounds(258, 487, 68, 58);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnR.setEnabled(true);
				btnplus.setEnabled(true);
				btnminus.setEnabled(true);
				btnMul.setEnabled(true);
				btnDiv.setEnabled(true);
				btnPlusMin.setEnabled(true);
				btnExpo.setEnabled(true);
				btnx3.setEnabled(true);
				btnx2.setEnabled(true);
				btnxy.setEnabled(true);
				btnLog.setEnabled(true);
				btnDot.setEnabled(true);
				btnEqual.setEnabled(true);
				btnB.setEnabled(true);
				btnC.setEnabled(true);
				btnPerc.setEnabled(true);
				btnfact.setEnabled(true);
				btn1x.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(0, 113, 51, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnR.setEnabled(false);
				btnplus.setEnabled(false);
				btnminus.setEnabled(false);
				btnMul.setEnabled(false);
				btnDiv.setEnabled(false);
				btnPlusMin.setEnabled(false);
				btnExpo.setEnabled(false);
				btnx3.setEnabled(false);
				btnx2.setEnabled(false);
				btnxy.setEnabled(false);
				btnLog.setEnabled(false);
				btnDot.setEnabled(false);
				btnEqual.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnPerc.setEnabled(false);
				btnfact.setEnabled(false);
				btn1x.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(55, 113, 51, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
