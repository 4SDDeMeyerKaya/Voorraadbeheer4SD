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
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
//GUItest

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
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton besteloverzichtButton = new JButton("Besteloverzicht");
		besteloverzichtButton.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 22));
		besteloverzichtButton.setBounds(400, 573, 200, 40);
		frame.getContentPane().add(besteloverzichtButton);
		
		JTextPane terminalPanel = new JTextPane();
		terminalPanel.setText("TERMINAL test tjoiezfpkmorithejgzkflmzjgreeijfosqkzmlekr");
		terminalPanel.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 13));
		terminalPanel.setForeground(Color.WHITE);
		terminalPanel.setBackground(Color.BLACK);
		terminalPanel.setBounds(1000, 0, 270, 673);
		frame.getContentPane().add(terminalPanel);
		
		JPanel kast10 = new JPanel();
		kast10.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast10.setForeground(Color.BLACK);
		kast10.setBackground(Color.WHITE);
		kast10.setBounds(76, 110, 120, 120);
		frame.getContentPane().add(kast10);
		
		JPanel kast11 = new JPanel();
		kast11.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast11.setBackground(Color.WHITE);
		kast11.setBounds(206, 110, 120, 120);
		frame.getContentPane().add(kast11);
		
		JPanel kast12 = new JPanel();
		kast12.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast12.setBackground(Color.WHITE);
		kast12.setBounds(336, 110, 120, 120);
		frame.getContentPane().add(kast12);
		
		JPanel kast20 = new JPanel();
		kast20.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast20.setBackground(Color.WHITE);
		kast20.setBounds(542, 110, 120, 120);
		frame.getContentPane().add(kast20);
		
		JPanel kast21 = new JPanel();
		kast21.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast21.setBackground(Color.WHITE);
		kast21.setBounds(672, 110, 120, 120);
		frame.getContentPane().add(kast21);
		
		JPanel kast22 = new JPanel();
		kast22.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast22.setBackground(Color.WHITE);
		kast22.setBounds(802, 110, 120, 120);
		frame.getContentPane().add(kast22);
		
		JPanel kast13 = new JPanel();
		kast13.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast13.setBackground(Color.WHITE);
		kast13.setBounds(76, 240, 120, 120);
		frame.getContentPane().add(kast13);
		
		JPanel kast14 = new JPanel();
		kast14.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast14.setBackground(Color.WHITE);
		kast14.setBounds(206, 240, 120, 120);
		frame.getContentPane().add(kast14);
		
		JPanel kast15 = new JPanel();
		kast15.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast15.setBackground(Color.WHITE);
		kast15.setBounds(336, 240, 120, 120);
		frame.getContentPane().add(kast15);
		
		JPanel kast23 = new JPanel();
		kast23.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast23.setBackground(Color.WHITE);
		kast23.setBounds(542, 240, 120, 120);
		frame.getContentPane().add(kast23);
		
		JPanel kast24 = new JPanel();
		kast24.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast24.setBackground(Color.WHITE);
		kast24.setBounds(672, 240, 120, 120);
		frame.getContentPane().add(kast24);
		
		JPanel kast25 = new JPanel();
		kast25.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast25.setBackground(Color.WHITE);
		kast25.setBounds(802, 240, 120, 120);
		frame.getContentPane().add(kast25);
		
		JPanel kast16 = new JPanel();
		kast16.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast16.setBackground(Color.WHITE);
		kast16.setBounds(76, 370, 120, 120);
		frame.getContentPane().add(kast16);
		
		JPanel kast17 = new JPanel();
		kast17.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast17.setBackground(Color.WHITE);
		kast17.setBounds(206, 370, 120, 120);
		frame.getContentPane().add(kast17);
		
		JPanel kast18 = new JPanel();
		kast18.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast18.setBackground(Color.WHITE);
		kast18.setBounds(336, 370, 120, 120);
		frame.getContentPane().add(kast18);
		
		JPanel kast26 = new JPanel();
		kast26.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast26.setBackground(Color.WHITE);
		kast26.setBounds(542, 370, 120, 120);
		frame.getContentPane().add(kast26);
		
		JPanel kast27 = new JPanel();
		kast27.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast27.setBackground(Color.WHITE);
		kast27.setBounds(672, 370, 120, 120);
		frame.getContentPane().add(kast27);
		
		JPanel kast28 = new JPanel();
		kast28.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast28.setBackground(Color.WHITE);
		kast28.setBounds(802, 370, 120, 120);
		frame.getContentPane().add(kast28);
		
		JPanel kast1 = new JPanel();
		kast1.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast1.setBackground(SystemColor.control);
		kast1.setBounds(66, 100, 400, 400);
		frame.getContentPane().add(kast1);
		
		JPanel kast2 = new JPanel();
		kast2.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast2.setBackground(SystemColor.menu);
		kast2.setBounds(532, 100, 400, 400);
		frame.getContentPane().add(kast2);
	}
}
