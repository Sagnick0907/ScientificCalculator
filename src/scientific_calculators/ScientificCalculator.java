package scientific_calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	private JTextField jtxtConverts;

	double firstnum;
	double secondnum;
    double result;
	String operations;
	String answer;
	
	double Nigerian_Naira = 5.53;
	double US_Dollar = 0.013;
	double Kenyan_Shilling = 1.51;
	double Brazilian_Real = 0.075;
	double Canadian_Dollar = 0.017;
	double British_Pound = 0.010;
	double Philippines_Peso = 0.68;
	double Indonesian_Rupiah = 191.67 ;
	private JTextField jlblConverts;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 411, 500);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 410, 500);
				
				txtDisplay.setBounds(10, 10, 375, 45);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 745, 500);
				
				txtDisplay.setBounds(10, 10, 710, 45);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Unit Conversion");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Unit Conversion Calculator");
				frmStandardCalculator.setBounds(100, 100, 1000, 500);
				
				txtDisplay.setBounds(10, 10, 960, 45);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 10, 371, 40);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBack.setBounds(10, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnBack);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setBounds(10, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn8.setBounds(87, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn9.setBounds(164, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(241, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn4.setBounds(10, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn5.setBounds(87, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn6.setBounds(164, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMultiply.setBounds(241, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn1.setBounds(10, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn2.setBounds(87, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btnAllClear = new JButton("CE");
		btnAllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
				firstnum = Double.NaN;
			}
		});
		btnAllClear.setBounds(87, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnAllClear);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn3.setBounds(164, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setBounds(241, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn0.setBounds(10, 357, 147, 60);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(164, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnClear);
		
		JButton btnNat = new JButton("\u00B1");
		btnNat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNat.setBounds(241, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnNat);
		
		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String iNum = txtDisplay.getText() + ".";
				txtDisplay.setText(iNum);
				
			}
		});
		btnDec.setBounds(164, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnDec);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(241, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnPlus);
		
		JButton btnsqr = new JButton("\u221A");
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnsqr.setBounds(318, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnsqr);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setBounds(318, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnPercent);
		
		JButton btnInv = new JButton("1/x");
		btnInv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = 1/ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnInv.setBounds(318, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnInv);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText (answer);
				}
				else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText (answer);
				}
				else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText (answer);
				}
				else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText (answer);
				}
				
			}
		});
		btnEqual.setBounds(318, 287, 70, 130);
		frmStandardCalculator.getContentPane().add(btnEqual);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setBounds(408, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setBounds(488, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setBounds(568, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";
			}
		});
		btnMod.setBounds(648, 77, 70, 60);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = 3.1415926535897932384626433832795;
				txtDisplay.setText (String.valueOf(ops));
			}
		});
		btnPi.setBounds(408, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setBounds(488, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setBounds(568, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLnx.setBounds(648, 147, 70, 60);
		frmStandardCalculator.getContentPane().add(btnLnx);
		
		JButton btnPow = new JButton("x^x");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops,ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPow.setBounds(408, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnPow);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setBounds(488, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setBounds(568, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnExp.setBounds(648, 217, 70, 60);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops*ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSquare.setBounds(408, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btnSquare);
		
		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops*ops*ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCube.setBounds(408, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnCube);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(488, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); //Binary
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBin.setBounds(488, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnBin);
		
		JButton btnRnd = new JButton("Rnd");
		btnRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRnd.setBounds(568, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btnRnd);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); //Hex
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(568, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		JButton btnPeri = new JButton("2*\u03C0");
		btnPeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795)*2;
				txtDisplay.setText (String.valueOf(ops));
			}
		});
		btnPeri.setBounds(648, 287, 70, 60);
		frmStandardCalculator.getContentPane().add(btnPeri);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); //Oct
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setBounds(648, 357, 70, 60);
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		JTextPane txtpnCurrencyConvertor = new JTextPane();
		txtpnCurrencyConvertor.setBackground(new Color(100, 149, 237));
		txtpnCurrencyConvertor.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		txtpnCurrencyConvertor.setText("  Currency Convertor");
		txtpnCurrencyConvertor.setBounds(743, 77, 220, 46);
		frmStandardCalculator.getContentPane().add(txtpnCurrencyConvertor);
		
		JComboBox jcmbCurrencys = new JComboBox();
		jcmbCurrencys.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jcmbCurrencys.setModel(new DefaultComboBoxModel(new String[] {"Choose -", "USA", "British", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "Philippines"}));
		jcmbCurrencys.setBounds(764, 147, 169, 43);
		frmStandardCalculator.getContentPane().add(jcmbCurrencys);
		
		jtxtConverts = new JTextField();
		jtxtConverts.setBounds(764, 217, 169, 40);
		frmStandardCalculator.getContentPane().add(jtxtConverts);
		jtxtConverts.setColumns(10);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Indian_Rupee = Double.parseDouble(jtxtConverts.getText());
				if (jcmbCurrencys.getSelectedItem().equals("Nigeria")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Nigerian_Naira);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("USA")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * US_Dollar);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("British")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * British_Pound);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("Kenya")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Kenyan_Shilling);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("Canada")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Canadian_Dollar);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("Brazil")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Brazilian_Real);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("Indonesia")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Indonesian_Rupiah);
					jlblConverts.setText(cConvert1);
				}
				if (jcmbCurrencys.getSelectedItem().equals("Philippines")){  
					String cConvert1 = String.format("N %.2f", Indian_Rupee * Philippines_Peso);
					jlblConverts.setText(cConvert1);
				}
				
				
			}
		});
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnConvert.setBounds(743, 332, 100, 40);
		frmStandardCalculator.getContentPane().add(btnConvert);
		
		JButton btnClear_1 = new JButton("CLEAR");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtConverts.setText(null);
				jlblConverts.setText(null);
				jcmbCurrencys.setSelectedItem("Choose-");
				
			}
		});
		btnClear_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnClear_1.setBounds(863, 332, 100, 40);
		frmStandardCalculator.getContentPane().add(btnClear_1);
		
		jlblConverts = new JTextField();
		jlblConverts.setBackground(new Color(135, 206, 250));
		jlblConverts.setColumns(10);
		jlblConverts.setBounds(764, 269, 169, 40);
		frmStandardCalculator.getContentPane().add(jlblConverts);
	}
}
