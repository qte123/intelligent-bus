package systemView;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DriverMenu {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public DriverMenu() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("智慧公交系统驾驶员界面");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 949, 591);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("公交车调度管理平台驾驶员端");
		lblNewLabel.setBounds(296, 35, 338, 30);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(58, 92, 819, 417);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("首页", null, tabbedPane_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("欢迎界面", null, panel_1, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("用户管理", null, tabbedPane_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("员工信息查询", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 785, 300);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"用户编号", "登录名", "登录密码", "姓名", "手机号", "身份证", "角色", "驾龄", "驾龄"
				}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_1 = new JLabel("用户名：");
		label_1.setBounds(279, 9, 60, 18);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(353, 6, 86, 24);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("角色：");
		label_2.setBounds(453, 9, 45, 18);
		panel.add(label_2);
		String str1[]= {"全部","管理员","调度员","驾驶员"};
		JComboBox comboBox_3 = new JComboBox(str1);
		comboBox_3.setBounds(512, 6, 74, 24);
		panel.add(comboBox_3);
		
		JLabel label_3 = new JLabel("状态：");
		label_3.setBounds(600, 9, 45, 18);
		panel.add(label_3);
		String str2[]= {"全部","启用","禁用"};
		JComboBox comboBox_4 = new JComboBox(str2);
		comboBox_4.setBounds(659, 6, 59, 24);
		panel.add(comboBox_4);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(732, 5, 63, 27);
		panel.add(btnNewButton);
		
		JButton button = new JButton("退出登录");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new LoginMenu();
			}
		});
		button.setBounds(784, 76, 93, 27);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("欢迎您，驾驶员！");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("黑体", Font.BOLD, 15));
		label.setBounds(749, 45, 128, 18);
		frame.getContentPane().add(label);
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\blue.jpg"));
		lblNewLabel_1.setBounds(0, 0, 931, 543);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}
}

