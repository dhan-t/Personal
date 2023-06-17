import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class POS {

	private JFrame frame;
	private JPasswordField passwordField;
	private JComboBox<String> comboBox;
	private int loginAttempts;

	private String[] usernames = { "CASHIER 1", "CASHIER 2", "CASHIER 3" };
	private String[] passwords = { "password1", "password2", "password3" };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POS window = new POS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public POS() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 46, 46));
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(55, 65, 311, 116);
		panel.setBackground(new Color(116, 116, 116));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblPword = new JLabel("Password:");
		lblPword.setBounds(0, 64, 120, 25);
		panel.add(lblPword);
		lblPword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPword.setFont(new Font("Arial", Font.BOLD, 11));
		lblPword.setForeground(new Color(255, 255, 255));

		JLabel lblUser = new JLabel("Cashier Username:");
		lblUser.setBounds(0, 23, 120, 25);
		panel.add(lblUser);
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Arial", Font.BOLD, 11));

		comboBox = new JComboBox<String>();
		comboBox.setBounds(130, 23, 150, 25);
		panel.add(comboBox);
		comboBox.setBackground(new Color(255, 255, 255));

		JRadioButton rdbtnShowPass = new JRadioButton("Show Password");
		rdbtnShowPass.setBounds(280, 64, 22, 25);
		panel.add(rdbtnShowPass);
		rdbtnShowPass.setBackground(new Color(116, 116, 116));
		rdbtnShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar(rdbtnShowPass.isSelected() ? '\u0000' : '\u2022');
			}
		});
		rdbtnShowPass.setHorizontalAlignment(SwingConstants.LEFT);

		passwordField = new JPasswordField();
		passwordField.setBounds(130, 64, 150, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = (String) comboBox.getSelectedItem();
				char[] password = passwordField.getPassword();
				String enteredPassword = new String(password);

				if (authenticate(username, enteredPassword)) {
					JOptionPane.showMessageDialog(frame, "Login successful!");
					pizzaPOS pizzaWindow = new pizzaPOS();
					pizzaWindow.frame.setVisible(true);
					frame.dispose();
					// Perform actions after successful login
				} else {
					loginAttempts++;
					if (loginAttempts >= 3) {
						JOptionPane.showMessageDialog(frame,
								"Account blocked! \nPlease contact your system administrator.");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(frame,
								"Invalid password. Attempts remaining: " + (3 - loginAttempts));
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(252, 192, 114, 30);
		frame.getContentPane().add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(77, 77, 77));
		btnCancel.setFont(new Font("Arial", Font.BOLD, 13));
		btnCancel.setBounds(55, 192, 114, 30);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel_1 = new JLabel("Cashier Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(55, 28, 311, 35);
		frame.getContentPane().add(lblNewLabel_1);

		for (String username : usernames) {
			comboBox.addItem(username);
		}

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private boolean authenticate(String username, String password) {
		int index = comboBox.getSelectedIndex();
		if (index >= 0 && index < usernames.length) {
			String storedUsername = usernames[index];
			String storedPassword = passwords[index];
			return username.equals(storedUsername) && password.equals(storedPassword);
		}
		return false;
	}
}
