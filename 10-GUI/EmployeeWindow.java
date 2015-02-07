 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;


public class EmployeeWindow extends JFrame {
	public JButton calculate;
	public JButton okButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public JButton btnCalculateSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeWindow frame = new EmployeeWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Employee getEmployee(){
		int age = Integer.parseInt(this.textField_3.getText());
		int salary = Integer.parseInt(this.textField_4.getText());
		int phoneNumber = Integer.parseInt(this.textField_2.getText());
		Employee employee = new Employee(this.textField.getText(), this.textField_1.getText(),
													phoneNumber,age,salary);
		return employee;
	}

	/**
	 * Create the frame.
	 */
	public EmployeeWindow() {
		getContentPane().setBackground(new Color(0, 153, 102));
		setBounds(100, 100, 450, 300);
		
		this.okButton = new JButton("\u041E\u041A");
		okButton.setBounds(61, 212, 89, 23);
		okButton.setBackground(SystemColor.activeCaption);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(okButton);

		this.calculate = new JButton("Calculate Age");
		calculate.setBounds(223, 178, 116, 23);
		calculate.setBackground(SystemColor.activeCaption);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(calculate);
		
		textField = new JTextField();
		textField.setBounds(177, 11, 205, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 42, 205, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(177, 73, 205, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(177, 104, 205, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(177, 135, 205, 20);
		getContentPane().add(textField_4);
		

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(61, 14, 89, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(61, 45, 89, 14);
		getContentPane().add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(61, 76, 89, 14);
		getContentPane().add(lblPhoneNumber);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(61, 107, 89, 14);
		getContentPane().add(lblAge);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(61, 138, 89, 14);
		getContentPane().add(lblSalary);
		
		btnCalculateSalary = new JButton("Calculate Salary");
		btnCalculateSalary.setBackground(SystemColor.activeCaption);
		btnCalculateSalary.setBounds(209, 212, 150, 23);
		getContentPane().add(btnCalculateSalary);

	}
}