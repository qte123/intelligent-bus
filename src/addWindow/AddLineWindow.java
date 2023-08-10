package addWindow;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Line;
import window.AddWindow;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddLineWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private int lineCode;
	private String lineName;
	private String status;
	private String startLineTime;
	private String direction;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AddLineWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("线路添加界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("线路编号：");
		label.setBounds(133, 36, 75, 18);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(229, 33, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("线路名称：");
		label_1.setBounds(133, 67, 75, 18);
		frame.getContentPane().add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(229, 64, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("状态");
		lblNewLabel.setBounds(133, 98, 45, 18);
		frame.getContentPane().add(lblNewLabel);
		String str1[] = { "启运", "停运" };
		JComboBox comboBox = new JComboBox(str1);
		comboBox.setBounds(229, 95, 59, 24);
		frame.getContentPane().add(comboBox);

		JLabel label_2 = new JLabel("开线时间：");
		label_2.setBounds(133, 129, 75, 18);
		frame.getContentPane().add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(229, 126, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel label_3 = new JLabel("运行方向：");
		label_3.setBounds(133, 160, 75, 18);
		frame.getContentPane().add(label_3);
		String str2[] = { "上行", "下行" };
		JComboBox comboBox_1 = new JComboBox(str2);
		comboBox_1.setBounds(229, 157, 59, 24);
		frame.getContentPane().add(comboBox_1);

		JButton btnNewButton = new JButton("添加线路");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				AddWindow addWindow=new AddWindow();
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| comboBox.getSelectedItem().toString().equals("")
						|| comboBox_1.getSelectedItem().toString().equals("")) {
					addWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					try {
						lineCode = Integer.parseInt(str);

					} catch (NumberFormatException e1) {
						addWindow.NumberErrorWindow();
						k = false;
					}
					lineName = textField_1.getText();
					status = comboBox.getSelectedItem().toString();
					startLineTime = textField_2.getText();
					direction = comboBox_1.getSelectedItem().toString();
					if (k) {
						Line line = new Line(lineCode, lineName, status, startLineTime, direction);
						addWindow.SuccessWindow();
					}
				}

			}
		});
		btnNewButton.setBounds(173, 213, 93, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

	/*
	 * Initialize the contents of the frame.
	 */

}
