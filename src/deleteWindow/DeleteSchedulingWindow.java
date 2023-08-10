package deleteWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Scheduling;
import window.DeleteWindow;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteSchedulingWindow {

	private JFrame frame;
	private JTextField textField;

	private int code;
	private int lineCode;
	private String busLicense;
	private String tcNumber;
	private String tcTime;
	private int userCode;
	private int startStation;
	private int endStation;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public DeleteSchedulingWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("≈≈∞‡…æ≥˝ΩÁ√Ê");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("≈≈∞‡±‡∫≈£∫");
		lblNewLabel.setBounds(127, 111, 75, 18);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(216, 108, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("…æ≥˝≈≈∞‡");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				String str = null;
				DeleteWindow deleteWindow=new DeleteWindow();
				if (textField.getText().equals("")) {
					deleteWindow.NullErrorWindow();
				} else {
					str = textField.getText();
					try {
						code = Integer.parseInt(str);
					} catch (NumberFormatException e1) {
						deleteWindow.NumberErrorWindow();
						k = false;
					}
					if (k) {
						Scheduling scheduling = new Scheduling(code, lineCode, busLicense, tcNumber, tcTime, userCode,
								startStation, endStation);
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
