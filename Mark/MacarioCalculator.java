import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class MacarioCalculator {

	private JFrame frame;
	private JTextField textField;
	private double firstNumber;
	private double secondNumber;
	private String operator;
	private boolean isOperatorClicked;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MacarioCalculator window = new MacarioCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MacarioCalculator() {
		initialize();
	}

	private boolean isON = false;

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 46, 46));
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(8, 11, 350, 72);
		textField.setFont(new Font("Arial", Font.BOLD, 47));
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnBackSpace = new JButton("<--");
		btnBackSpace.setBounds(98, 93, 80, 50);
		btnBackSpace.setForeground(new Color(255, 255, 255));
		btnBackSpace.setBackground(new Color(46, 46, 46));
		btnBackSpace.setFont(new Font("Arial", Font.BOLD, 30));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
				if (currentText.length() > 0) {
					textField.setText(currentText.substring(0, currentText.length() - 1));
				}
			}
		});
		frame.getContentPane().add(btnBackSpace);

		JButton btnC = new JButton("C");
		btnC.setBounds(188, 93, 80, 50);
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(46, 46, 46));
		btnC.setFont(new Font("Arial", Font.BOLD, 30));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		frame.getContentPane().add(btnC);

		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(278, 93, 80, 50);
		btnPlus.setForeground(new Color(255, 255, 255));
		btnPlus.setBackground(new Color(46, 46, 46));
		btnPlus.setFont(new Font("Arial", Font.BOLD, 30));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorButtonClicked("+");
			}
		});
		frame.getContentPane().add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(278, 154, 80, 50);
		btnMinus.setForeground(new Color(255, 255, 255));
		btnMinus.setBackground(new Color(46, 46, 46));
		btnMinus.setFont(new Font("Arial", Font.BOLD, 30));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorButtonClicked("-");
			}
		});
		frame.getContentPane().add(btnMinus);

		JButton btnNine = new JButton("9");
		btnNine.setBounds(188, 154, 80, 50);
		btnNine.setForeground(new Color(255, 255, 255));
		btnNine.setBackground(new Color(46, 46, 46));
		btnNine.setFont(new Font("Arial", Font.BOLD, 30));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("9");
			}
		});
		frame.getContentPane().add(btnNine);

		JButton btnEight = new JButton("8");
		btnEight.setBounds(98, 154, 80, 50);
		btnEight.setForeground(new Color(255, 255, 255));
		btnEight.setBackground(new Color(46, 46, 46));
		btnEight.setFont(new Font("Arial", Font.BOLD, 30));
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("8");
			}
		});
		frame.getContentPane().add(btnEight);

		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(8, 154, 80, 50);
		btnSeven.setForeground(new Color(255, 255, 255));
		btnSeven.setBackground(new Color(46, 46, 46));
		btnSeven.setFont(new Font("Arial", Font.BOLD, 30));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("7");
			}
		});
		frame.getContentPane().add(btnSeven);

		JButton btnFour = new JButton("4");
		btnFour.setBounds(8, 215, 80, 50);
		btnFour.setForeground(new Color(255, 255, 255));
		btnFour.setBackground(new Color(46, 46, 46));
		btnFour.setFont(new Font("Arial", Font.BOLD, 30));
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("4");
			}
		});
		frame.getContentPane().add(btnFour);

		JButton btnFive = new JButton("5");
		btnFive.setBounds(98, 215, 80, 50);
		btnFive.setForeground(new Color(255, 255, 255));
		btnFive.setBackground(new Color(46, 46, 46));
		btnFive.setFont(new Font("Arial", Font.BOLD, 30));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("5");
			}
		});
		frame.getContentPane().add(btnFive);

		JButton btnSix = new JButton("6");
		btnSix.setBounds(188, 215, 80, 50);
		btnSix.setForeground(new Color(255, 255, 255));
		btnSix.setBackground(new Color(46, 46, 46));
		btnSix.setFont(new Font("Arial", Font.BOLD, 30));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("6");
			}
		});
		frame.getContentPane().add(btnSix);

		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(278, 215, 80, 50);
		btnMultiply.setForeground(new Color(255, 255, 255));
		btnMultiply.setBackground(new Color(46, 46, 46));
		btnMultiply.setFont(new Font("Arial", Font.BOLD, 30));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorButtonClicked("*");
			}
		});
		frame.getContentPane().add(btnMultiply);

		JButton btnOne = new JButton("1");
		btnOne.setBounds(8, 276, 80, 50);
		btnOne.setForeground(new Color(255, 255, 255));
		btnOne.setBackground(new Color(46, 46, 46));
		btnOne.setFont(new Font("Arial", Font.BOLD, 30));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("1");
			}
		});
		frame.getContentPane().add(btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(98, 276, 80, 50);
		btnTwo.setForeground(new Color(255, 255, 255));
		btnTwo.setBackground(new Color(46, 46, 46));
		btnTwo.setFont(new Font("Arial", Font.BOLD, 30));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("2");
			}
		});
		frame.getContentPane().add(btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.setBounds(188, 276, 80, 50);
		btnThree.setForeground(new Color(255, 255, 255));
		btnThree.setBackground(new Color(46, 46, 46));
		btnThree.setFont(new Font("Arial", Font.BOLD, 30));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("3");
			}
		});
		frame.getContentPane().add(btnThree);

		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(278, 276, 80, 50);
		btnDivide.setForeground(new Color(255, 255, 255));
		btnDivide.setBackground(new Color(46, 46, 46));
		btnDivide.setFont(new Font("Arial", Font.BOLD, 30));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorButtonClicked("/");
			}
		});
		frame.getContentPane().add(btnDivide);

		JButton btnZero = new JButton("0");
		btnZero.setBounds(8, 337, 80, 50);
		btnZero.setForeground(new Color(255, 255, 255));
		btnZero.setBackground(new Color(46, 46, 46));
		btnZero.setFont(new Font("Arial", Font.BOLD, 30));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberButtonClicked("0");
			}
		});
		frame.getContentPane().add(btnZero);

		JButton btnPeriod = new JButton(".");
		btnPeriod.setBounds(98, 337, 80, 50);
		btnPeriod.setForeground(new Color(255, 255, 255));
		btnPeriod.setBackground(new Color(46, 46, 46));
		btnPeriod.setFont(new Font("Arial", Font.BOLD, 30));
		btnPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
				if (!currentText.contains(".")) {
					textField.setText(currentText + ".");
				}
			}
		});
		frame.getContentPane().add(btnPeriod);

		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(188, 337, 170, 50);
		btnEquals.setForeground(new Color(255, 255, 255));
		btnEquals.setBackground(new Color(46, 46, 46));
		btnEquals.setFont(new Font("Arial", Font.BOLD, 30));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateResult();
			}
		});
		frame.getContentPane().add(btnEquals);

		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isON = true;
				btnBackSpace.setEnabled(isON);
				btnC.setEnabled(isON);
				btnPlus.setEnabled(isON);
				btnMinus.setEnabled(isON);
				btnNine.setEnabled(isON);
				btnEight.setEnabled(isON);
				btnSeven.setEnabled(isON);
				btnFour.setEnabled(isON);
				btnFive.setEnabled(isON);
				btnSix.setEnabled(isON);
				btnMultiply.setEnabled(isON);
				btnOne.setEnabled(isON);
				btnTwo.setEnabled(isON);
				btnThree.setEnabled(isON);
				btnDivide.setEnabled(isON);
				btnZero.setEnabled(isON);
				btnPeriod.setEnabled(isON);
				btnEquals.setEnabled(isON);

			}
		});
		rdbtnOn.setBounds(8, 93, 80, 25);
		rdbtnOn.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnOn.setForeground(new Color(255, 255, 255));
		rdbtnOn.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnOn.setBackground(new Color(46, 46, 46));
		frame.getContentPane().add(rdbtnOn);

		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isON = false;
				btnBackSpace.setEnabled(isON);
				btnC.setEnabled(isON);
				btnPlus.setEnabled(isON);
				btnMinus.setEnabled(isON);
				btnNine.setEnabled(isON);
				btnEight.setEnabled(isON);
				btnSeven.setEnabled(isON);
				btnFour.setEnabled(isON);
				btnFive.setEnabled(isON);
				btnSix.setEnabled(isON);
				btnMultiply.setEnabled(isON);
				btnOne.setEnabled(isON);
				btnTwo.setEnabled(isON);
				btnThree.setEnabled(isON);
				btnDivide.setEnabled(isON);
				btnZero.setEnabled(isON);
				btnPeriod.setEnabled(isON);
				btnEquals.setEnabled(isON);
			}
		});
		rdbtnOff.setBounds(8, 118, 80, 25);
		rdbtnOff.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnOff.setForeground(new Color(255, 255, 255));
		rdbtnOff.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnOff.setBackground(new Color(46, 46, 46));
		frame.getContentPane().add(rdbtnOff);

		JLabel lblNewLabel = new JLabel("Mark Adrian N. Macario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(8, 386, 350, 43);
		frame.getContentPane().add(lblNewLabel);

	}

	private void numberButtonClicked(String number) {
		if (isOperatorClicked) {
			textField.setText(number);
			isOperatorClicked = false;
		} else {
			textField.setText(textField.getText() + number);
		}
	}

	private void operatorButtonClicked(String operator) {
		if (!isOperatorClicked) {
			firstNumber = Double.parseDouble(textField.getText());
			this.operator = operator;
			isOperatorClicked = true;
		}
	}

	private void calculateResult() {
		if (!isOperatorClicked) {
			secondNumber = Double.parseDouble(textField.getText());
			double result = 0.0;
			switch (operator) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				result = firstNumber / secondNumber;
				break;
			}
			textField.setText(Double.toString(result));
			isOperatorClicked = true;
		}

	}

}
