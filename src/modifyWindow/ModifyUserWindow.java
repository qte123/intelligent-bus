package modifyWindow;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.User;
import window.ModifyWindow;

public class ModifyUserWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	private int userCode;
	private String loginName;
	private String password;
	private String name;
	private String phone;
	private String idCard;
	private int role;
	private int driving;
	private String status;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ModifyUserWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("用户修改界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("用户编号：");
		label.setBounds(41, 26, 75, 18);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(130, 23, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("登录名：");
		label_1.setBounds(230, 26, 60, 18);
		frame.getContentPane().add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(304, 23, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("登录密码：");
		label_2.setBounds(41, 57, 75, 18);
		frame.getContentPane().add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(130, 54, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("姓名：");
		lblNewLabel.setBounds(230, 57, 45, 18);
		frame.getContentPane().add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setBounds(304, 54, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("手机号：");
		lblNewLabel_1.setBounds(41, 88, 60, 18);
		frame.getContentPane().add(lblNewLabel_1);

		textField_4 = new JTextField();
		textField_4.setBounds(130, 85, 86, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel label_3 = new JLabel("身份证号：");
		label_3.setBounds(230, 88, 75, 18);
		frame.getContentPane().add(label_3);

		textField_5 = new JTextField();
		textField_5.setBounds(304, 85, 86, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel label_4 = new JLabel("角色：");
		label_4.setBounds(41, 119, 72, 18);
		frame.getContentPane().add(label_4);
		String str1[] = { "管理员", "调度员", "驾驶员" };
		JComboBox comboBox = new JComboBox(str1);
		JLabel lblNewLabel_2 = new JLabel("驾龄：");
		lblNewLabel_2.setBounds(230, 119, 45, 18);
		frame.getContentPane().add(lblNewLabel_2);
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(304, 116, 86, 24);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString().equals("驾驶员")) {
					textField_6.setEditable(true);
				}
				else {
					textField_6.setEditable(false);
				}
			}
		});

		comboBox.setBounds(130, 116, 74, 24);
		frame.getContentPane().add(comboBox);

		JLabel label_5 = new JLabel("状态：");
		label_5.setBounds(41, 150, 45, 18);
		frame.getContentPane().add(label_5);
		String str2[] = { "启用", "停用" };
		JComboBox comboBox_1 = new JComboBox(str2);
		comboBox_1.setBounds(130, 147, 59, 24);
		frame.getContentPane().add(comboBox_1);

		JButton btnNewButton = new JButton("修改用户");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				String str1 = null;
				String str2 = null;
				ModifyWindow modifyWindow=new ModifyWindow();
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_2.getText().equals("") || textField_3.getText().equals("")
						|| textField_4.getText().equals("") || textField_5.getText().equals("")
						|| comboBox.getSelectedItem().toString().equals("")
						|| comboBox_1.getSelectedItem().toString().equals("")) {
					modifyWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					str1 = comboBox.getSelectedItem().toString();
					try {
						userCode = Integer.parseInt(str);
						if (str1.equals("管理员")) {
							role = 1;
						}
						if (str1.equals("调度员")) {
							role = 2;
						}
						if (str1.equals("驾驶员")) {
							role = 3;
							str2 = textField_6.getText();
							if (str2.equals("")) {
								str2 = "-1";
							}
							driving = Integer.parseInt(str2);
						}
					} catch (NumberFormatException e1) {
						modifyWindow.NumberErrorWindow();
						k = false;
					}
					loginName = textField_1.getText();
					password = textField_1.getText();
					name = textField_2.getText();
					phone = textField_3.getText();
					idCard = textField_4.getText();
					status = comboBox_1.getSelectedItem().toString();
					if (k) {
						User user = new User(userCode, loginName, password, name, phone, idCard, role, driving, status);
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
