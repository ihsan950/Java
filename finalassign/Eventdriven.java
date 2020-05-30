package finalassign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventdriven {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventdriven window = new Eventdriven();
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
	public Eventdriven() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTheUselessButteon = new JLabel("The Useless Butteon");
		lblTheUselessButteon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheUselessButteon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTheUselessButteon.setBounds(104, 44, 216, 25);
		frame.getContentPane().add(lblTheUselessButteon);
		
		JButton btnNewButton = new JButton("Press the button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Boo");
				
			}
		});
		btnNewButton.setBounds(143, 80, 142, 61);
		frame.getContentPane().add(btnNewButton);
	}

}
