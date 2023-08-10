package systemView;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import addWindow.AddBusWindow;
import addWindow.AddLineWindow;
import addWindow.AddSchedulingWindow;
import addWindow.AddStationWindow;
import addWindow.AddUserWindow;
import attribute.Bus;
import deleteWindow.DeleteBusWindow;
import deleteWindow.DeleteLineWindow;
import deleteWindow.DeleteSchedulingWindow;
import deleteWindow.DeleteStationWindow;
import deleteWindow.DeleteUserWindow;
import modifyWindow.ModifyBusWindow;
import modifyWindow.ModifyLineWindow;
import modifyWindow.ModifySchedulingWindow;
import modifyWindow.ModifyStationWindow;
import modifyWindow.ModifyUserWindow;
public class AdminMenu {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public AdminMenu() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("���������ȹ���ƽ̨����Ա��");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 949, 591);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("���������ȹ���ƽ̨����Ա��");
		lblNewLabel.setBounds(296, 35, 338, 30);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(58, 92, 819, 417);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("��ҳ", null, tabbedPane_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_4.addTab("��ӭ����", null, panel_5, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("��������", null, tabbedPane_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("������Ϣ����", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddBusWindow();
			}
		});
		btnNewButton_1.setBounds(10, 5, 63, 27);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ɾ��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteBusWindow();
			}
		});
		btnNewButton_2.setBounds(87, 5, 63, 27);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("�޸�");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifyBusWindow();
			}
		});
		btnNewButton_3.setBounds(165, 5, 63, 27);
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 785, 300);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"�������", "���ƺ�", "����", "״̬", "����ʱ��"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("���ƺţ�");
		lblNewLabel_2.setBounds(426, 9, 60, 18);
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(500, 6, 86, 24);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("״̬��");
		lblNewLabel_3.setBounds(600, 9, 45, 18);
		panel.add(lblNewLabel_3);
		String str[]= {"ȫ��","����","ͣ��"};
		JComboBox comboBox = new JComboBox(str);
		comboBox.setBounds(659, 6, 59, 24);
		panel.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("��ѯ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(732, 5, 63, 27);
		panel.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("վ����Ϣ����", null, panel_2, null);
		
		JButton btnNewButton_5 = new JButton("���");
		btnNewButton_5.setBounds(10, 5, 63, 27);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddStationWindow();
			}
		});
		panel_2.setLayout(null);
		panel_2.add(btnNewButton_5);
		
		JButton button = new JButton("ɾ��");
		button.setBounds(87, 5, 63, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteStationWindow();
			}
		});
		panel_2.add(button);
		
		JButton btnNewButton_6 = new JButton("�޸�");
		btnNewButton_6.setBounds(165, 5, 63, 27);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifyStationWindow();
			}
		});
		panel_2.add(btnNewButton_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 36, 785, 300);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"վ����", "վ������", "����", "γ��", "��������", "���ڽֵ�"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_4 = new JLabel("վ�����ƣ�");
		lblNewLabel_4.setBounds(240, 9, 75, 18);
		panel_2.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(317, 5, 86, 24);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("��������");
		lblNewLabel_5.setBounds(402, 9, 75, 18);
		panel_2.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(477, 6, 86, 24);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("���ڽֵ���");
		lblNewLabel_6.setBounds(563, 10, 75, 18);
		panel_2.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(639, 6, 86, 24);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button_1 = new JButton("��ѯ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(732, 5, 63, 27);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("��·��Ϣ����", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("���");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddLineWindow();
			}
		});
		btnNewButton_7.setBounds(10, 5, 63, 27);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("ɾ��");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteLineWindow();
			}
		});
		btnNewButton_8.setBounds(87, 5, 63, 27);
		panel_3.add(btnNewButton_8);
		
		JButton button_4 = new JButton("�޸�");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifyLineWindow();
			}
		});
		button_4.setBounds(164, 5, 63, 27);
		panel_3.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 36, 785, 300);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"��·���", "��·����", "״̬", "����ʱ��", "���з���"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_7 = new JLabel("��·���ƣ�");
		lblNewLabel_7.setBounds(279, 9, 75, 18);
		panel_3.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(368, 6, 86, 24);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("����");
		lblNewLabel_8.setBounds(468, 9, 45, 18);
		panel_3.add(lblNewLabel_8);
		String str1[]= {"ȫ��","����","����"};
		JComboBox comboBox_1 = new JComboBox(str1);
		comboBox_1.setBounds(527, 6, 59, 24);
		panel_3.add(comboBox_1);
		
		JLabel label_4 = new JLabel("״̬��");
		label_4.setBounds(600, 9, 45, 18);
		panel_3.add(label_4);
		String str2[]= {"ȫ��","����","ͣ��"};
		JComboBox comboBox_2 = new JComboBox(str2);
		comboBox_2.setBounds(659, 6, 59, 24);
		panel_3.add(comboBox_2);
		
		JButton btnNewButton_10 = new JButton("��ѯ");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(732, 5, 63, 27);
		panel_3.add(btnNewButton_10);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("�Ű����", null, tabbedPane_2, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("�Ű���Ϣ����", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("���");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddSchedulingWindow();
			}
		});
		btnNewButton_11.setBounds(10, 5, 63, 27);
		panel_4.add(btnNewButton_11);
		
		JButton button_2 = new JButton("ɾ��");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteSchedulingWindow();
			}
		});
		button_2.setBounds(87, 5, 63, 27);
		panel_4.add(button_2);
		
		JButton button_3 = new JButton("�޸�");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifySchedulingWindow();
			}
		});
		button_3.setBounds(164, 5, 63, 27);
		panel_4.add(button_3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 36, 785, 300);
		panel_4.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"�Ű���", "��·���", "���ƺ�", "�˴�", "ÿ��ʱ��", "˾������", "ʼ��վ��", "�յ�վ��"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JLabel label_5 = new JLabel("���ƺţ�");
		label_5.setBounds(241, 9, 60, 18);
		panel_4.add(label_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(294, 6, 86, 24);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("��·��ţ�");
		lblNewLabel_9.setBounds(382, 9, 75, 18);
		panel_4.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(450, 6, 44, 24);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("ʼ��վ��");
		lblNewLabel_10.setBounds(493, 9, 60, 18);
		panel_4.add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(544, 6, 60, 24);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("�յ�վ��");
		lblNewLabel_11.setBounds(607, 9, 60, 18);
		panel_4.add(lblNewLabel_11);
		
		textField_11 = new JTextField();
		textField_11.setBounds(659, 6, 60, 24);
		panel_4.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("��ѯ");
		btnNewButton_12.setBounds(732, 5, 63, 27);
		panel_4.add(btnNewButton_12);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("�û�����", null, tabbedPane_3, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_3.addTab("Ա����Ϣ����", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("���");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddUserWindow();
			}
		});
		btnNewButton_9.setBounds(10, 5, 63, 27);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_13 = new JButton("ɾ��");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteUserWindow();
			}
		});
		btnNewButton_13.setBounds(87, 5, 63, 27);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("�޸�");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifyUserWindow();
			}
		});
		btnNewButton_14.setBounds(164, 5, 63, 27);
		panel_1.add(btnNewButton_14);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 36, 785, 300);
		panel_1.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				"�û����", "��¼��", "��¼����", "����", "�ֻ���", "���֤", "��ɫ", "����", "״̬"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JLabel label_1 = new JLabel("�û�����");
		label_1.setBounds(279, 9, 60, 18);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(353, 6, 86, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("��ɫ��");
		label_2.setBounds(453, 9, 45, 18);
		panel_1.add(label_2);
		String str3[]= {"ȫ��","����Ա","����Ա","��ʻԱ"};
		JComboBox comboBox_3 = new JComboBox(str3);
		comboBox_3.setBounds(512, 6, 74, 24);
		panel_1.add(comboBox_3);
		
		JLabel label_3 = new JLabel("״̬��");
		label_3.setBounds(600, 9, 45, 18);
		panel_1.add(label_3);
		
		String str4[]= {"ȫ��","����","ͣ��"};
		JComboBox comboBox_4 = new JComboBox(str4);
		comboBox_4.setBounds(659, 6, 59, 24);
		panel_1.add(comboBox_4);
		
		JButton btnNewButton_15 = new JButton("��ѯ");
		btnNewButton_15.setBounds(732, 5, 63, 27);
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton = new JButton("�˳���¼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new LoginMenu();
			}
		});
		btnNewButton.setBounds(784, 76, 93, 27);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("��ӭ��������Ա��");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("����", Font.BOLD, 15));
		label.setBounds(749, 45, 128, 18);
		frame.getContentPane().add(label);
		JLabel lblNewLabel_1 = new JLabel("����");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setLabelFor(tabbedPane);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\blue.jpg"));
		lblNewLabel_1.setBounds(0, 0, 931, 543);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}
}
