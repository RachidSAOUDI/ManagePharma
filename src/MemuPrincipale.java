import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MemuPrincipale {

	private JFrame frame;
	private JTextField txtCode;
	private JTextField txtName;
	private JTextField txtPrice;
	private JTextField txtTotal;
	private JTextField txtNetToPay;
	private JTextField txtRest;
	private JTable tableVente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemuPrincipale window = new MemuPrincipale();
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
	public MemuPrincipale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setBounds(100, 100, 591, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 553, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pharmacy Management");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 533, 56);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 100, 553, 243);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Code :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 53, 22);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 59, 53, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 110, 98, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Amount :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 155, 62, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Net to Pay :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(322, 59, 81, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(322, 15, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rest : ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(322, 128, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		txtCode = new JTextField();
		txtCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCode.setBounds(73, 14, 86, 20);
		panel_1.add(txtCode);
		txtCode.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(73, 58, 86, 20);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrice.setBounds(73, 109, 86, 20);
		panel_1.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(new Color(255, 140, 0));
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTotal.setBounds(423, 13, 120, 20);
		panel_1.add(txtTotal);
		txtTotal.setColumns(10);
		
		txtNetToPay = new JTextField();
		txtNetToPay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNetToPay.setBounds(423, 57, 120, 20);
		panel_1.add(txtNetToPay);
		txtNetToPay.setColumns(10);
		
		txtRest = new JTextField();
		txtRest.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRest.setBounds(423, 126, 120, 20);
		panel_1.add(txtRest);
		txtRest.setColumns(10);
		
		JSpinner txtspnAmount = new JSpinner();
		txtspnAmount.setBounds(82, 154, 81, 20);
		panel_1.add(txtspnAmount);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(373, 179, 89, 23);
		panel_1.add(btnSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 406, 459, -51);
		frame.getContentPane().add(scrollPane);
		
		tableVente = new JTable();
		tableVente.setBounds(10, 355, 553, 81);
		frame.getContentPane().add(tableVente);
	}
}
