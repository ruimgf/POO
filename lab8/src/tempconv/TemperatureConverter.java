package tempconv;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConverter {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConverter window = new TemperatureConverter();
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
	public TemperatureConverter() {
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
		
		JLabel result = new JLabel("Fahrenheit");
		result.setBounds(319, 144, 108, 16);
		frame.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText();
				double frag;
				frag = Integer.parseInt(input) * 1.8 + 32; 
				result.setText(frag + " Fahrenheit");
			}
		});
		btnNewButton.setBounds(168, 135, 108, 37);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(157, 97, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
}
