package modifyWindow;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Station;
import window.ModifyWindow;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyStationWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	private int stationCode;
	private String stationName;
	private String longitude;
	private String latitude;
	private String region;
	private String street;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ModifyStationWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("站点修改界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("站点编号：");
		label.setBounds(128, 21, 75, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(217, 18, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("站点名称：");
		label_1.setBounds(128, 52, 75, 18);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 49, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("经度：");
		lblNewLabel.setBounds(128, 83, 45, 18);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 80, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("纬度：");
		lblNewLabel_1.setBounds(128, 114, 45, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(217, 111, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("所在区域：");
		lblNewLabel_2.setBounds(128, 145, 75, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(217, 142, 86, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("所在街道：");
		lblNewLabel_3.setBounds(128, 176, 75, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(217, 173, 86, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("修改站点");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				ModifyWindow modifyWindow=new ModifyWindow();
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_2.getText().equals("") || textField_3.getText().equals("")
						|| textField_4.getText().equals("")||textField_5.getText().equals("")) {
					modifyWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					try {
						stationCode = Integer.parseInt(str);

					} catch (NumberFormatException e1) {
						modifyWindow.NumberErrorWindow();
						k = false;
					}
					stationName = textField_1.getText();
					longitude =textField_2.getText();
					latitude = textField_3.getText();
					region =textField_4.getText();
					street=textField_5.getText();
					if (k) {
						Station station=new Station(stationCode, stationName, longitude, latitude, region,street) ;
						modifyWindow.SuccessWindow();
					}
				}
			}
		});
		btnNewButton.setBounds(173, 213, 93, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

}
