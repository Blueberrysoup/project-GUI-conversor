/***
* MainFrame - GUI for Conversor application
* @author: Carina Ekström
* @version: 1.0
**/

package gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import otherclasses.Conversor;

public class MainFrame {

	private JFrame frmConversor;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnConvertToDegrees = new JButton();
	private JButton btnConvertToRadians = new JButton();
	private NumberFormat df = new DecimalFormat("#.#########");
	private Conversor conversor = new Conversor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Calls Conversor class to convert degrees to radians. Displays result in radian's text field.
	 * @param degrees Value to convert
	 */
	private void onClickToRadiansButton(String degrees){
		double res = conversor.toRadians(Double.parseDouble(degrees));
		String resStr = df.format(res);
		textField_1.setText(resStr.replace(',', '.'));
	}
	
	/**
	 * Calls Conversor class to convert radians to degrees. Displays result in degrees's text field.
	 * @param radians Value to convert
	 */
	private void onClickToDegreesButton(String radians){
		double res = conversor.toDegrees(Double.parseDouble(radians));
		String resStr = df.format(res);
		textField.setText(resStr.replace(',', '.'));
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.getContentPane().setBackground(Color.GRAY);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblEnterTheValues = new JLabel("Value in degrees:");
		lblEnterTheValues.setForeground(Color.WHITE);
		lblEnterTheValues.setBounds(131, 91, 230, 15);
		frmConversor.getContentPane().add(lblEnterTheValues);
		
		JLabel lblEnterTheValues_1 = new JLabel("Value in radians:");
		lblEnterTheValues_1.setForeground(Color.WHITE);
		lblEnterTheValues_1.setBounds(131, 132, 230, 15);
		frmConversor.getContentPane().add(lblEnterTheValues_1);
		
		textField = new JTextField();
		textField.setBounds(291, 87, 114, 19);
		frmConversor.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(291, 128, 114, 19);
		frmConversor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnConvertToRadians.setText("Convert to radians");
		btnConvertToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickToRadiansButton(textField.getText());
			}
		});
		btnConvertToRadians.setToolTipText("Enter value in degrees and press here to convert to radians");
		btnConvertToRadians.setBounds(461, 84, 175, 25);
		frmConversor.getContentPane().add(btnConvertToRadians);
		
		btnConvertToDegrees.setText("Convert to degrees");
		btnConvertToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickToDegreesButton(textField_1.getText());
			}
		});
		btnConvertToDegrees.setToolTipText("Enter value in radians and press here to convert to degrees");
		btnConvertToDegrees.setBounds(461, 127, 175, 25);
		frmConversor.getContentPane().add(btnConvertToDegrees);
		frmConversor.setBackground(Color.WHITE);
		frmConversor.setTitle("Convertor");
		frmConversor.setBounds(100, 100, 804, 310);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
