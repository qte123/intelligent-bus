package systemView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import window.LoginWindow;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class LoginMenu {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField txtDd;

	/**
	 * Launch the application.
	

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */

	
	
        public LoginMenu() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("智慧公交系统登录界面");
		label.setBounds(141, 60, 286, 30);
		label.setFont(new Font("宋体", Font.BOLD, 25));
		label.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(label);

		JLabel lblNewLabel_1 = new JLabel("账号：");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(181, 156, 48, 18);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("密码：");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(181, 187, 48, 18);
		frame.getContentPane().add(lblNewLabel_2);

		txtDd = new JTextField();
		txtDd.setBounds(220, 150, 148, 24);
		frame.getContentPane().add(txtDd);
		txtDd.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(220, 184, 148, 24);
		frame.getContentPane().add(passwordField);
	    String[] str= {"管理员","调度员","驾驶员"};
		JComboBox comboBox =new JComboBox(str);
		comboBox.setBounds(276, 110, 74, 24);
		JButton btnNewButton = new JButton("登录");
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Account=txtDd.getText();
				String account="admin";
				String password="123456";
				String Password=new String(passwordField.getPassword());
				if(Account.equals(account)&&Password.equals(password)&&comboBox.getSelectedItem().toString().equals("管理员")) {
					frame.dispose();
					new AdminMenu();
				}
				else if(Account.equals(account)&&Password.equals(password)&&comboBox.getSelectedItem().toString().equals("调度员")) {
					frame.dispose();
					new DispatcherMenu();
				}
				else if(Account.equals(account)&&Password.equals(password)&&comboBox.getSelectedItem().toString().equals("驾驶员")) {
					frame.dispose();
					new DriverMenu();
				}
				else {
					new LoginWindow();
				}
			}
		});
		btnNewButton.setBounds(181, 218, 193, 27);
		frame.getContentPane().add(btnNewButton);
	
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("账户类型：");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel.setBounds(189, 115, 85, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("背景图");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\timg.jpg"));
		lblNewLabel_3.setBounds(-56, -51, 755, 455);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setTitle("智慧公交系统登录界面");
		ImageIcon icon=new ImageIcon("F:\\bus.png");  //xxx代表图片存放路径，2.png图片名称及格式
		frame.setIconImage(icon.getImage());
		frame.setBounds(100, 100, 579, 370);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);	
	}
}
