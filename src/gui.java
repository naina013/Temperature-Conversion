import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatureConvertor = new JLabel("TEMPERATURE CONVERTOR");
		lblTemperatureConvertor.setBounds(128, 22, 194, 13);
		contentPane.add(lblTemperatureConvertor);
		
		JLabel lblTemperatureInCelsius = new JLabel("TEMPERATURE IN CELSIUS");
		lblTemperatureInCelsius.setBounds(10, 115, 199, 13);
		contentPane.add(lblTemperatureInCelsius);
		
		JLabel lblTemperatureInFahrenheit = new JLabel("TEMPERATURE IN FAHRENHEIT");
		lblTemperatureInFahrenheit.setBounds(10, 152, 199, 13);
		contentPane.add(lblTemperatureInFahrenheit);
		
		textField = new JTextField();
		textField.setBounds(302, 112, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(302, 149, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JRadioButton rdbtnCelsiusToFahrenheit = new JRadioButton("CELSIUS TO FAHRENHEIT");
		rdbtnCelsiusToFahrenheit.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnCelsiusToFahrenheit.isSelected()) {
					textField_1.setEditable(false);
				}
				else {
					textField_1.setEditable(true);
				}
			}
		});
		rdbtnCelsiusToFahrenheit.setBounds(10, 53, 199, 21);
		contentPane.add(rdbtnCelsiusToFahrenheit);
		
		JRadioButton rdbtnFahrenheitToCelsius = new JRadioButton("FAHRENHEIT TO CELSIUS");
		rdbtnFahrenheitToCelsius.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnFahrenheitToCelsius.isSelected()) {
					textField.setEditable(false);
				}
				else {
					textField.setEditable(true);
				}
			}
		});
		rdbtnFahrenheitToCelsius.setBounds(229, 53, 201, 21);
		contentPane.add(rdbtnFahrenheitToCelsius);

	JButton btnConvert = new JButton("CONVERT");
	btnConvert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			conversionValidate cc = new conversionValidate() ;
			
			
				if(rdbtnCelsiusToFahrenheit.isSelected()) {
					if(!cc.Validateempty(textField.getText())) {
						JOptionPane.showMessageDialog(null, "empty");
						
					}
					else if (!cc.Validateinput(textField.getText())) {
						JOptionPane.showMessageDialog(null, "invalid");
						
					}
					else if(!cc.ValidatenC(textField.getText()))
					{
						JOptionPane.showMessageDialog(null, "range is not valid");
					}
					else {
					double tC = Integer.parseInt(textField.getText()); 
					DaoImpl d = new DaoImpl();
					String t = String.valueOf(d.CtoF(tC));
					textField_1.setText(t);
					}
				}
				else if(rdbtnFahrenheitToCelsius.isSelected()) {
					if(!cc.Validateempty(textField_1.getText())) {
						JOptionPane.showMessageDialog(null, "empty");
						
					}
					else if (!cc.Validateinput(textField_1.getText())) {
						JOptionPane.showMessageDialog(null, "invalid");
						
					}
					else if(!cc.ValidatenF(textField_1.getText()))
					{
						JOptionPane.showMessageDialog(null, "range is not valid");
					}
					else {
					
					double tF = Integer.parseInt(textField_1.getText());
					DaoImpl d = new DaoImpl();
					String t = String.valueOf(d.FtoC(tF));
					textField.setText(t);
				}
				}
				
			
		}
	});
	btnConvert.setBounds(135, 207, 144, 21);
	contentPane.add(btnConvert);
	}
}
