import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;


public class TwoNumbers {

	private JFrame frame;
	private JTextField firstNumber;
	private JTextField secondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoNumbers window = new TwoNumbers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void calculate(){
		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);
			
			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int result = 1;
			int max = 1;
			int min = 1;
			int x = 1;
			if (firstNumber > secondNumber) {
				max = firstNumber;
				min = secondNumber;
			} else {
				max = secondNumber;
				min = firstNumber;
			}
			for (int i = 1; i <= min; i++) {
				x = max * i;
				if (x % min == 0) {
					result = x;
					break;
				}
			}

			JOptionPane.showMessageDialog(null, "Резултатът е: " + result);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Възникна грешка при изчислението!","Внимание", 0);
		}
		
	}

	/**
	 * Create the application.
	 */
	public TwoNumbers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 53));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		btnNewButton.setBounds(10, 115, 414, 135);
		frame.getContentPane().add(btnNewButton);
		
		firstNumber = new JTextField();
		firstNumber.setBounds(10, 56, 174, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(194, 59, 15, 14);
		frame.getContentPane().add(lblNewLabel);
		
		secondNumber = new JTextField();
		secondNumber.setBounds(213, 56, 211, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);
		
		JLabel label = new JLabel("\u041F\u044A\u0440\u0432\u043E \u0427\u0438\u0441\u043B\u043E");
		label.setBounds(10, 37, 81, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0412\u0442\u043E\u0440\u043E \u0427\u0438\u0441\u043B\u043E");
		label_1.setBounds(213, 37, 81, 14);
		frame.getContentPane().add(label_1);
	}
}