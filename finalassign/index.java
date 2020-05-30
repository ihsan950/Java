package finalassign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class index {/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
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

	private JFrame frame;

	
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeThisProgram = new JLabel("This program will");
		lblWelcomeThisProgram.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeThisProgram.setBounds(164, 64, 154, 43);
		frame.getContentPane().add(lblWelcomeThisProgram);
		
		JLabel lblCalculateYourPartial = new JLabel("calculate your partial and full GPA");
		lblCalculateYourPartial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCalculateYourPartial.setBounds(94, 107, 357, 43);
		frame.getContentPane().add(lblCalculateYourPartial);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				main main = new main();
				
				frame.setVisible(false);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(177, 161, 138, 43);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(196, 40, 89, 27);
		frame.getContentPane().add(lblNewLabel);
	}
}
