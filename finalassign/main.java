package finalassign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JTextField lastSem;
	private JTextField totalavg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInTheFollowing = new JLabel("In the following textfield");
		lblInTheFollowing.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInTheFollowing.setBounds(117, 11, 271, 40);
		contentPane.add(lblInTheFollowing);
		
		JLabel lblPleaseEnterThe = new JLabel("please enter the number of semesters");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPleaseEnterThe.setBounds(66, 49, 353, 40);
		contentPane.add(lblPleaseEnterThe);
		
		JLabel lblThatYouWould = new JLabel("that you would like to include in the calculation");
		lblThatYouWould.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThatYouWould.setBounds(42, 86, 432, 40);
		contentPane.add(lblThatYouWould);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt.setBounds(154, 138, 190, 40);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel lblLastSemesterGpa = new JLabel("Last Semester GPA:");
		lblLastSemesterGpa.setBounds(91, 212, 122, 14);
		contentPane.add(lblLastSemesterGpa);
		
		JLabel lblTotalGpa = new JLabel("Total GPA:");
		lblTotalGpa.setBounds(148, 237, 59, 14);
		contentPane.add(lblTotalGpa);
		
		lastSem = new JTextField();
		lastSem.setEditable(false);
		lastSem.setBounds(217, 209, 86, 20);
		contentPane.add(lastSem);
		lastSem.setColumns(10);
		
		totalavg = new JTextField();
		totalavg.setEditable(false);
		totalavg.setBounds(217, 234, 86, 20);
		contentPane.add(totalavg);
		totalavg.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
						
					
					
						double semesters = 0;
					
						semesters = Double.parseDouble(txt.getText());
					
						double sum_sem = 0;
						int y;
						int x;
						double count = 0;
						double sum_full = 0;
						double count_sem = 0;
						double avg_full = 0;
						double avg_sem = 0;
						double lsem = 0;
						
						for(x = 1; x <= semesters; x++)
						{
						
							String subject = JOptionPane.showInputDialog("How many Subjects for semster " + x);
						
							double subject_no = Double.parseDouble(subject);
						
							for(y = 1; y <= subject_no; y++)
							{
								String mark = JOptionPane.showInputDialog("what was the mark for subject " + y);
							
								double markint = Double.parseDouble(mark);
							
							
								sum_sem += markint;
							
								count++;
							}
							
						
						
							avg_sem = sum_sem / count;
							
							avg_sem = Math.round(avg_sem*100.0)/100.0;
						
							JOptionPane.showMessageDialog(null, "Your average for semester number " + x + " = " + avg_sem);
						
						
							sum_full += avg_sem;
						
							count_sem++;
							
							lsem = avg_sem;
						
							avg_sem = 0;
							count = 0;
							sum_sem = 0;
						}
					
						avg_full = sum_full / count_sem;
						
						avg_full = Math.round(avg_full*100.0)/100.0;
					
						JOptionPane.showMessageDialog(null, "Your GPA in total = " + avg_full);
						
						String last_sem = Double.toString(lsem); 
						String total_gpa = Double.toString(avg_full);
						
						lastSem.setText(last_sem);
						totalavg.setText(total_gpa);
						
						
					} 
				catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(180, 310, 145, 40);
		contentPane.add(btnNewButton);
		
		
	}
}
