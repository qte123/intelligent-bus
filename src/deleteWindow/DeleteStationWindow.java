package deleteWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Station;
import window.DeleteWindow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStationWindow {

	private JFrame frame;
	private JTextField textField;

	private int stationCode;
	private String stationName;
	private String longitude;
	private String latitude;
	private String region;
	private String street;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public DeleteStationWindow() {
		frame = new JFrame();
		frame.setTitle("站点删除界面");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("站点名称：");
		lblNewLabel.setBounds(129, 112, 75, 18);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(218, 109, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("删除站点");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k = true;
				DeleteWindow deleteWindow =new DeleteWindow();
				if (textField.getText().equals("")) {
					deleteWindow.NullErrorWindow();
				} else {
					stationName = textField.getText();
					if (k) {
						Station station = new Station(stationCode, stationName, longitude, latitude, region, street);
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
