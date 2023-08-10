package addWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Scheduling;
import attribute.Station;
import window.AddWindow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSchedulingWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	private int code;
	private int lineCode;
	private String busLicense;
	private String tcNumber;
	private String tcTime;
	private int userCode;
	private int startStation;
	private int endStation;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AddSchedulingWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("排班添加界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("排班编号：");
		label.setBounds(30, 62, 75, 18);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(119, 59, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("线路编号：");
		label_1.setBounds(219, 62, 75, 18);
		frame.getContentPane().add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(308, 59, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("车牌号：");
		lblNewLabel.setBounds(30, 93, 60, 18);
		frame.getContentPane().add(lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setBounds(119, 90, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel label_2 = new JLabel("趟次：");
		label_2.setBounds(219, 93, 45, 18);
		frame.getContentPane().add(label_2);

		textField_3 = new JTextField();
		textField_3.setBounds(308, 90, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel label_3 = new JLabel("每趟时间：");
		label_3.setBounds(30, 124, 75, 18);
		frame.getContentPane().add(label_3);

		textField_4 = new JTextField();
		textField_4.setBounds(119, 121, 86, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel label_4 = new JLabel("司机姓名：");
		label_4.setBounds(219, 124, 75, 18);
		frame.getContentPane().add(label_4);

		textField_5 = new JTextField();
		textField_5.setBounds(308, 121, 86, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel label_5 = new JLabel("始发站点：");
		label_5.setBounds(30, 155, 75, 18);
		frame.getContentPane().add(label_5);

		textField_6 = new JTextField();
		textField_6.setBounds(119, 152, 86, 24);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel label_6 = new JLabel("终点站点：");
		label_6.setBounds(219, 155, 75, 18);
		frame.getContentPane().add(label_6);

		textField_7 = new JTextField();
		textField_7.setBounds(308, 152, 86, 24);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JButton btnNewButton = new JButton("添加排班");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				String str1 = null;
				String str2 = null;
				String str3 = null;
				String str4 = null;
				AddWindow addWindow = new AddWindow();
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_2.getText().equals("") || textField_3.getText().equals("")
						|| textField_4.getText().equals("") || textField_5.getText().equals("")
						|| textField_6.getText().equals("") || textField_7.getText().equals("")) {
					addWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					str1 = textField_1.getText();
					str2 = textField_5.getText();
					str3 = textField_6.getText();
					str4 = textField_7.getText();
					try {
						code = Integer.parseInt(str);
						lineCode = Integer.parseInt(str1);
						userCode = Integer.parseInt(str2);
						startStation = Integer.parseInt(str3);
						endStation = Integer.parseInt(str4);

					} catch (NumberFormatException e1) {
						addWindow.NumberErrorWindow();
						k = false;
					}
					busLicense = textField_2.getText();
					tcNumber = textField_3.getText();
					tcTime = textField_4.getText();

					if (k) {
						Scheduling scheduling = new Scheduling(code, lineCode, busLicense, tcNumber, tcTime, userCode,
								startStation, endStation);
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
