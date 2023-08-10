package addWindow;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Bus;
import window.AddWindow;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBusWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private int busCode;
	private String busLicense;
	private String busType;
	private String busStatus;
	private String startTime;

	/**
	 * Launch the application.
	 * 
	 * @return
	 */
	public AddBusWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("车辆添加界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("车辆编号：");
		label.setBounds(134, 27, 75, 18);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(223, 24, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("车牌号：");
		lblNewLabel.setBounds(134, 58, 60, 18);
		frame.getContentPane().add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(223, 55, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("车型：");
		lblNewLabel_1.setBounds(134, 89, 45, 18);
		frame.getContentPane().add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setBounds(223, 86, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel label_1 = new JLabel("状态：");
		label_1.setBounds(134, 120, 45, 18);
		frame.getContentPane().add(label_1);
		String str[] = { "启运", "停运" };
		JComboBox comboBox = new JComboBox(str);
		comboBox.setBounds(223, 117, 59, 24);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("起运时间：");
		lblNewLabel_2.setBounds(134, 151, 75, 18);
		frame.getContentPane().add(lblNewLabel_2);

		textField_3 = new JTextField();
		textField_3.setBounds(223, 148, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("添加车辆");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				AddWindow addWindow =new AddWindow();
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_2.getText().equals("") || comboBox.getSelectedItem().toString().equals("")) {
					
					addWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					try {
						busCode = Integer.parseInt(str);
			
					} catch (NumberFormatException e1) {
						addWindow.NumberErrorWindow();
						k = false;
					}
					busLicense = textField_1.getText();
					busType = textField_2.getText();
					busStatus = comboBox.getSelectedItem().toString();
					startTime = textField_3.getText();
					if (k) {
						Bus bus = new Bus(busCode, busLicense, busType, busStatus, startTime);
						addWindow.SuccessWindow();
					}
				}

			}
		});
		btnNewButton.setBounds(173, 213, 93, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}
}
