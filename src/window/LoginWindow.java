package window;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class LoginWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public LoginWindow() {
		frame = new JFrame();
		frame.setTitle("错误提示");
		ImageIcon icon=new ImageIcon("F:\\bus.png");  //xxx代表图片存放路径，2.png图片名称及格式
		frame.setIconImage(icon.getImage());
		frame.setBounds(100, 100, 357, 174);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("输入的账号或密码错误！");
		lblNewLabel.setBounds(103, 54, 165, 18);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
