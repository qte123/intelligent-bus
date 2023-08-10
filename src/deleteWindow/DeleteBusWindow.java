package deleteWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

import attribute.Bus;
import window.DeleteWindow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteBusWindow {

	private JFrame frame;
	private JTextField textField;
	
	private int busCode;
	private String busLicense;
	private String busType;
	private String busStatus;
	private String startTime;
	/**
	 * Launch the application.
	 */
	 
	public DeleteBusWindow() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\bus.png"));
		frame.setTitle("³µÁ¾É¾³ý½çÃæ");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("³µÅÆºÅ£º");
		label.setBounds(135, 114, 60, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(209, 111, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("É¾³ý³µÁ¾");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean k=true;
				DeleteWindow deleteWindow=new DeleteWindow();
				if(textField.getText().equals("")) {
					deleteWindow.NullErrorWindow();
				}
				else {
					busLicense=textField.getText();
					if(k) {
						Bus bus = new Bus(busCode, busLicense, busType, busStatus, startTime);
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
