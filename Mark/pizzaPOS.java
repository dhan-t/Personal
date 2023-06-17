import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.event.*;

public class pizzaPOS {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzaPOS window = new pizzaPOS();
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
	public pizzaPOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public String tomato = "Tomato";
	public String greenp = "Green Pepper";
	public String blacko = "Black Olives";
	public String mushrooms = "Mushrooms";
	public String xtrChz = "Extra Cheese";
	public String pepperoni = "Pepperoni";
	public String Sausage = "Sausage";

	public boolean tomatoB = false;
	public boolean greenpB = false;
	public boolean blackoB = false;
	public boolean mushroomsB = false;
	public boolean xtrChzB = false;
	public boolean pepperoniB = false;
	public boolean SausageB = false;

	public String szSmall = "Small";
	public String szMedium = "Medium";
	public String szLarge = "Large";

	public String crsTh = "Thin Crust";
	public String crsMed = "Medium Crust";
	public String crsPan = "Pan";

	public Double toppingsPrice = 1.50d;
	public Double toppingsPriceMulti = 0.0;
	public Double finalPrice;

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Macario's Pizza");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tall Dark And Handsome", Font.PLAIN, 53));
		lblNewLabel.setBounds(20, 0, 455, 55);
		frame.getContentPane().add(lblNewLabel);

		JPanel ToppingsTab = new JPanel();
		ToppingsTab.setBorder(new LineBorder(new Color(0, 128, 255), 8, true));
		ToppingsTab.setBackground(new Color(255, 255, 255));
		ToppingsTab.setBounds(20, 56, 145, 232);
		frame.getContentPane().add(ToppingsTab);

		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxTomato.setForeground(new Color(0, 128, 255));
		chckbxTomato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tomatoB = true;
			}
		});
		ToppingsTab.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		ToppingsTab.add(panel);

		JLabel lblNewLabel_1 = new JLabel("Toppings ($1.50/pc)");
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTomato.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxTomato);

		JCheckBox chckbxGreenPepper = new JCheckBox("Green Pepper");
		chckbxGreenPepper.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxGreenPepper.setForeground(new Color(0, 128, 255));
		chckbxGreenPepper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				greenpB = true;
			}
		});
		chckbxGreenPepper.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxGreenPepper);

		JCheckBox chckbxBlackOlives = new JCheckBox("Black Olives");
		chckbxBlackOlives.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxBlackOlives.setForeground(new Color(0, 128, 255));
		chckbxBlackOlives.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				blackoB = true;
			}
		});
		chckbxBlackOlives.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxBlackOlives);

		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxMushrooms.setForeground(new Color(0, 128, 255));
		chckbxMushrooms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mushroomsB = true;
			}
		});
		chckbxMushrooms.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxMushrooms);

		JCheckBox chckbxExtraCheese = new JCheckBox("Extra Cheese");
		chckbxExtraCheese.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxExtraCheese.setForeground(new Color(0, 128, 255));
		chckbxExtraCheese.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xtrChzB = true;
			}
		});
		chckbxExtraCheese.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxExtraCheese);

		JCheckBox chckbxPepperoni = new JCheckBox("Pepperoni");
		chckbxPepperoni.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxPepperoni.setForeground(new Color(0, 128, 255));
		chckbxPepperoni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pepperoniB = true;
			}
		});
		chckbxPepperoni.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxPepperoni);

		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.setFont(new Font("Arial", Font.BOLD, 11));
		chckbxSausage.setForeground(new Color(0, 128, 255));
		chckbxSausage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SausageB = true;
			}
		});
		chckbxSausage.setBackground(new Color(255, 255, 255));
		ToppingsTab.add(chckbxSausage);

		JPanel PizzaSizeTab = new JPanel();
		PizzaSizeTab.setBorder(new LineBorder(new Color(0, 128, 255), 8, true));
		PizzaSizeTab.setBackground(new Color(255, 255, 255));
		PizzaSizeTab.setBounds(175, 56, 145, 149);
		frame.getContentPane().add(PizzaSizeTab);
		PizzaSizeTab.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		PizzaSizeTab.add(panel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Pizza Size");
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));

		JRadioButton rdbtnSmall = new JRadioButton("Small ($6.50)");
		rdbtnSmall.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnSmall.setForeground(new Color(0, 128, 255));
		rdbtnSmall.setBackground(new Color(255, 255, 255));
		PizzaSizeTab.add(rdbtnSmall);

		JRadioButton rdbtnMedium = new JRadioButton("Medium ($8.50)");
		rdbtnMedium.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnMedium.setForeground(new Color(0, 128, 255));
		rdbtnMedium.setBackground(new Color(255, 255, 255));
		PizzaSizeTab.add(rdbtnMedium);

		JRadioButton rdbtnLarge = new JRadioButton("Large ($10.00)");
		rdbtnLarge.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnLarge.setForeground(new Color(0, 128, 255));
		rdbtnLarge.setBackground(new Color(255, 255, 255));
		PizzaSizeTab.add(rdbtnLarge);

		JPanel PizzaTab = new JPanel();
		PizzaTab.setBorder(new LineBorder(new Color(0, 128, 255), 8, true));
		PizzaTab.setBackground(new Color(255, 255, 255));
		PizzaTab.setBounds(330, 56, 145, 149);
		frame.getContentPane().add(PizzaTab);
		PizzaTab.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 128, 255));
		PizzaTab.add(panel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Pizza Type");
		panel_1_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));

		JRadioButton rdbtnThinCrust = new JRadioButton("Thin Crust");
		rdbtnThinCrust.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnThinCrust.setForeground(new Color(0, 128, 255));
		rdbtnThinCrust.setBackground(new Color(255, 255, 255));
		PizzaTab.add(rdbtnThinCrust);

		JRadioButton rdbtnMediumCrsut = new JRadioButton("Medium Crust");
		rdbtnMediumCrsut.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnMediumCrsut.setForeground(new Color(0, 128, 255));
		rdbtnMediumCrsut.setBackground(new Color(255, 255, 255));
		PizzaTab.add(rdbtnMediumCrsut);

		JRadioButton rdbtnPan = new JRadioButton("Pan");
		rdbtnPan.setFont(new Font("Arial", Font.BOLD, 11));
		rdbtnPan.setForeground(new Color(0, 128, 255));
		rdbtnPan.setBackground(new Color(255, 255, 255));
		PizzaTab.add(rdbtnPan);

		JPanel TotalTab = new JPanel();
		TotalTab.setBorder(new LineBorder(new Color(0, 128, 255), 6, true));
		TotalTab.setBackground(new Color(255, 255, 255));
		TotalTab.setBounds(20, 339, 455, 137);
		frame.getContentPane().add(TotalTab);
		TotalTab.setLayout(null);

		JLabel lblPIzzaType = new JLabel("Crust: ");
		lblPIzzaType.setForeground(new Color(0, 128, 255));
		lblPIzzaType.setFont(new Font("Arial", Font.BOLD, 12));
		lblPIzzaType.setBounds(10, 40, 435, 27);
		TotalTab.add(lblPIzzaType);

		JLabel lblPizzaSize = new JLabel("Pizza size: ");
		lblPizzaSize.setForeground(new Color(0, 128, 255));
		lblPizzaSize.setFont(new Font("Arial", Font.BOLD, 12));
		lblPizzaSize.setBounds(10, 11, 435, 27);
		TotalTab.add(lblPizzaSize);

		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setForeground(new Color(0, 128, 255));
		lblToppings.setFont(new Font("Arial", Font.BOLD, 12));
		lblToppings.setBounds(10, 65, 445, 27);
		TotalTab.add(lblToppings);

		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setForeground(new Color(0, 128, 255));
		lblTotalPrice.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotalPrice.setBounds(10, 95, 435, 27);
		TotalTab.add(lblTotalPrice);

		JLabel lblNewLabel_2 = new JLabel("Your Order:");
		lblNewLabel_2.setBackground(new Color(159, 0, 0));
		lblNewLabel_2.setForeground(new Color(159, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(20, 313, 241, 24);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setBounds(100, 100, 508, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnPrcsSelection = new JButton("Complete Order");
		btnPrcsSelection.setForeground(new Color(255, 255, 255));
		btnPrcsSelection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSmall.isSelected() || rdbtnMedium.isSelected() || rdbtnLarge.isSelected()) {

					double basePrice = 0.0;

					if (rdbtnSmall.isSelected()) {
						basePrice = 6.50;
					} else if (rdbtnMedium.isSelected()) {
						basePrice = 8.50;
					} else if (rdbtnLarge.isSelected()) {
						basePrice = 10.00;
					}

					int selectedToppingsCount = 0;
					if (tomatoB)
						selectedToppingsCount++;
					if (greenpB)
						selectedToppingsCount++;
					if (blackoB)
						selectedToppingsCount++;
					if (mushroomsB)
						selectedToppingsCount++;
					if (xtrChzB)
						selectedToppingsCount++;
					if (pepperoniB)
						selectedToppingsCount++;
					if (SausageB)
						selectedToppingsCount++;

					toppingsPriceMulti = selectedToppingsCount * toppingsPrice;

					finalPrice = basePrice + toppingsPriceMulti;

					// Prepare the final order label text
					StringBuilder pizzaSize = new StringBuilder();
					pizzaSize.append("Pizza Size: ");
					if (rdbtnSmall.isSelected()) {
						pizzaSize.append(szSmall + "\n");
					} else if (rdbtnMedium.isSelected()) {
						pizzaSize.append(szMedium + "\n");
					} else if (rdbtnLarge.isSelected()) {
						pizzaSize.append(szLarge + "\n");
					}

					StringBuilder crustType = new StringBuilder();
					crustType.append("\nCrust: ");
					if (rdbtnThinCrust.isSelected()) {
						crustType.append(crsTh + "\n");
					} else if (rdbtnMediumCrsut.isSelected()) {
						crustType.append(crsMed + "\n");
					} else if (rdbtnPan.isSelected()) {
						crustType.append(crsPan + "\n");
					}

					StringBuilder topppingsOv = new StringBuilder();
					topppingsOv.append("\nToppings: ");
					if (tomatoB)
						topppingsOv.append(tomato).append(", ");
					if (greenpB)
						topppingsOv.append(greenp).append(", ");
					if (blackoB)
						topppingsOv.append(blacko).append(", ");
					if (mushroomsB)
						topppingsOv.append(mushrooms).append(", ");
					if (xtrChzB)
						topppingsOv.append(xtrChz).append(", ");
					if (pepperoniB)
						topppingsOv.append(pepperoni).append(", ");
					if (SausageB)
						topppingsOv.append(Sausage).append(", ");

					String finalSize = pizzaSize.toString();
					String finalCrust = crustType.toString();
					String finalToppingsOv = topppingsOv.toString();

					lblPIzzaType.setText(finalCrust);
					lblPizzaSize.setText(finalSize);
					lblToppings.setText(finalToppingsOv);
					lblTotalPrice.setText("Total Price: $" + finalPrice);
				} else {
					// No size selected, show an error message
					JOptionPane.showMessageDialog(frame, "Please select a pizza size.");
				}
			}

		});

		btnPrcsSelection.setBackground(new Color(159, 0, 0));
		btnPrcsSelection.setFont(new Font("Arial", Font.BOLD, 15));
		btnPrcsSelection.setBounds(175, 216, 300, 36);
		frame.getContentPane().add(btnPrcsSelection);

	}
}
