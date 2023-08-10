package deleteWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Line;
import window.DeleteWindow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteLineWindow {

	private JFrame frame;
	private JTextField textField;

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
	public DeleteLineWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("线路删除界面");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("线路名称：");
		lblNewLabel.setBounds(133, 113, 75, 18);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(222, 110, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("删除线路");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				DeleteWindow deleteWindow=new DeleteWindow();
				if (textField.getText().equals("")) {
					deleteWindow.NullErrorWindow();
				} else {
					lineName = textField.getText();
					if(k) {
						Line line = new Line(lineCode, lineName, status, startLineTime, direction);
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
