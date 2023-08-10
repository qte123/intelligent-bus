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
		frame.setTitle("�ǻ۹���ϵͳ��ʻԱ����");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 949, 591);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("���������ȹ���ƽ̨��ʻԱ��");
		lblNewLabel.setBounds(296, 35, 338, 30);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(58, 92, 819, 417);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("��ҳ", null, tabbedPane_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("��ӭ����", null, panel_1, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("�û�����", null, tabbedPane_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("Ա����Ϣ��ѯ", null, panel, null);
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
					"�û����", "��¼��", "��¼����", "����", "�ֻ���", "���֤", "��ɫ", "����", "����"
				}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_1 = new JLabel("�û�����");
		label_1.setBounds(279, 9, 60, 18);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(353, 6, 86, 24);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("��ɫ��");
		label_2.setBounds(453, 9, 45, 18);
		panel.add(label_2);
		String str1[]= {"ȫ��","����Ա","����Ա","��ʻԱ"};
		JComboBox comboBox_3 = new JComboBox(str1);
		comboBox_3.setBounds(512, 6, 74, 24);
		panel.add(comboBox_3);
		
		JLabel label_3 = new JLabel("״̬��");
		label_3.setBounds(600, 9, 45, 18);
		panel.add(label_3);
		String str2[]= {"ȫ��","����","����"};
		JComboBox comboBox_4 = new JComboBox(str2);
		comboBox_4.setBounds(659, 6, 59, 24);
		panel.add(comboBox_4);
		
		JButton btnNewButton = new JButton("��ѯ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(732, 5, 63, 27);
		panel.add(btnNewButton);
		
		JButton button = new JButton("�˳���¼");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new LoginMenu();
			}
		});
		button.setBounds(784, 76, 93, 27);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("��ӭ������ʻԱ��");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("����", Font.BOLD, 15));
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

