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
		frame.setTitle("������ʾ");
		ImageIcon icon=new ImageIcon("F:\\bus.png");  //xxx����ͼƬ���·����2.pngͼƬ���Ƽ���ʽ
		frame.setIconImage(icon.getImage());
		frame.setBounds(100, 100, 357, 174);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("������˺Ż��������");
		lblNewLabel.setBounds(103, 54, 165, 18);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
