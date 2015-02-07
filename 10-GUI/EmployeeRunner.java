import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EmployeeRunner {
	private ArrayList<Employee> list = new ArrayList<Employee>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRunner window = new EmployeeRunner();
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
	public EmployeeRunner() {
		initialize();
	}
	
	public void showPersonWindow(){
		EmployeeWindow employee = new EmployeeWindow();
		employee.setVisible(true);
	
		employee.okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employee currentEmployee = employee.getEmployee();
				list.add(currentEmployee);
				employee.setVisible(false);
				JOptionPane.showMessageDialog(null, "Готово!");
				
			
			}
		});
		employee.calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int oldest = 0;
				int youngest =Integer.MAX_VALUE;
				
			       for (int i = 0; i < list.size(); i++) {
			            if (list.get(i).getAge() > oldest) {
			                oldest = list.get(i).getAge();
			            } else if (list.get(i).getAge() < youngest) {
			                youngest = list.get(i).getAge();
			            }
			        }

				 JOptionPane.showMessageDialog(null, "Най-младият е на: "+youngest);
				 JOptionPane.showMessageDialog(null, "Най-възрастният е на: "+oldest);
				 employee.setVisible(false);
			
			}
		});
		
		employee.btnCalculateSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int sum = 0;
				    for (int i = 0; i < list.size(); i++){
				      sum = sum + list.get(i).getSalary();
				    }
				
				    double average = sum /list.size();

				 JOptionPane.showMessageDialog(null, "Средната залата на тези служители е : "+average);
			
				 employee.setVisible(false);
			
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddPerson = new JButton("Add Employee or Calculate");
		btnAddPerson.setForeground(SystemColor.activeCaptionText);
		btnAddPerson.setBackground(SystemColor.textHighlight);
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPersonWindow();
			}
		});
		btnAddPerson.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 33));
		btnAddPerson.setBounds(10, 122, 414, 109);
		frame.getContentPane().add(btnAddPerson);
	}

}