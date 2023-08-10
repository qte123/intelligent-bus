package anthor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class sssss {

	private JFrame frame;
	private JTable table;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sssss window = new sssss();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sssss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 79, 357, 135);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "Ñ¡Ôñ"
			}
		));
		
		
		
		TableColumn s=table.getColumnModel().getColumn(4);
		String[] str= {"a","b","c"};
		JComboBox comboBox =new JComboBox(str);
		//comboBox.addItem("ad");
		//comboBox.addItem("ss");
		s.setCellEditor(new DefaultCellEditor(comboBox));
		JButton button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object selectValue = table.getModel().getValueAt(0, 4);
		        Object selectValue1 = table.getModel().getValueAt(1, 4);
		        Object selectValue2 = table.getModel().getValueAt(1, 3);
		System.out.println(selectValue);
		System.out.println(selectValue1);
		System.out.println(selectValue2);
		
			}
		});
		
		button.setBounds(79, 30, 113, 27);
		frame.getContentPane().add(button);
		//comboBox.setBounds(126, 13, 37, 24);
	}
}
