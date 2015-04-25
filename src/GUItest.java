import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;


public class GUItest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUItest window = new GUItest();
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
	public GUItest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JTextPane txtpnIdkTest = new JTextPane();
		txtpnIdkTest.setText("idk test lelelelele terminul");
		txtpnIdkTest.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 13));
		txtpnIdkTest.setForeground(Color.WHITE);
		txtpnIdkTest.setEditable(false);
		txtpnIdkTest.setBackground(Color.BLACK);
		frame.getContentPane().add(txtpnIdkTest, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("Besteloverzicht");
		btnNewButton.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 22));
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
