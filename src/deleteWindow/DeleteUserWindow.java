package deleteWindow;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;

import attribute.User;
import window.DeleteWindow;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteUserWindow {

	private JFrame frame;
	private JTextField textField;

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
	public DeleteUserWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("用户删除界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setBounds(139, 105, 60, 18);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(213, 102, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("删除用户");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				DeleteWindow deleteWindow =new DeleteWindow();
				if (textField.getText().equals("")) {
					deleteWindow.NullErrorWindow();
				} else {
					loginName = textField.getText();
					if (k) {
						User user = new User(userCode, loginName, password, name, phone, idCard, role, driving, status);
						deleteWindow.SuccessWindow();
					}
				}
			}
		});
		btnNewButton.setBounds(173, 213, 93, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

}
