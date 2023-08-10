package window;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ModifyWindow {

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
	public void NullErrorWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("失败");
		frame.setBounds(100, 100, 347, 164);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("修改失败！");
		label.setBounds(140, 31, 75, 18);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("输入的信息不能为空！");
		label_1.setBounds(107, 62, 150, 18);
		frame.getContentPane().add(label_1);
		frame.setVisible(true);
	}

	public void NumberErrorWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("失败");
		frame.setBounds(100, 100, 347, 164);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("修改失败！");
		label.setBounds(140, 31, 75, 18);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("输入的类型不正确！");
		label_1.setBounds(110, 62, 150, 18);
		frame.getContentPane().add(label_1);
		frame.setVisible(true);
	}

	public void SuccessWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("成功");
		frame.setBounds(100, 100, 347, 164);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel label = new JLabel("修改成功！");
		label.setBounds(140, 50, 75, 18);
		frame.getContentPane().add(label);
		frame.setVisible(true);
	}

}
