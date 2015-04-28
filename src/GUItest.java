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
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
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
		
		JTextPane terminalPanel = new JTextPane();
		terminalPanel.setText("TERMINAL test tjoiezfpkmorithejgzkflmzjgreeijfosqkzmlekr");
		terminalPanel.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 13));
		terminalPanel.setForeground(Color.WHITE);
		terminalPanel.setBackground(Color.BLACK);
		terminalPanel.setBounds(1000, 0, 270, 700);
		frame.getContentPane().add(terminalPanel);
		
		JPanel kast10 = new JPanel();
		kast10.setToolTipText("Kast10");
		kast10.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast10.setForeground(Color.BLACK);
		kast10.setBackground(Color.WHITE);
		kast10.setBounds(143, 60, 86, 86);
		frame.getContentPane().add(kast10);
		
		JPanel kast11 = new JPanel();
		kast11.setToolTipText("Kast 11");
		kast11.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast11.setBackground(Color.WHITE);
		kast11.setBounds(239, 60, 86, 86);
		frame.getContentPane().add(kast11);
		
		JPanel kast12 = new JPanel();
		kast12.setToolTipText("Kast 12");
		kast12.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast12.setBackground(Color.WHITE);
		kast12.setBounds(336, 60, 86, 86);
		frame.getContentPane().add(kast12);
		
		JPanel kast20 = new JPanel();
		kast20.setToolTipText("Kast 20");
		kast20.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast20.setBackground(Color.WHITE);
		kast20.setBounds(576, 60, 86, 86);
		frame.getContentPane().add(kast20);
		
		JPanel kast21 = new JPanel();
		kast21.setToolTipText("Kast 21");
		kast21.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast21.setBackground(Color.WHITE);
		kast21.setBounds(672, 60, 86, 86);
		frame.getContentPane().add(kast21);
		
		JPanel kast22 = new JPanel();
		kast22.setToolTipText("Kast 22");
		kast22.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast22.setBackground(Color.WHITE);
		kast22.setBounds(768, 60, 86, 86);
		frame.getContentPane().add(kast22);
		
		JPanel kast13 = new JPanel();
		kast13.setToolTipText("Kast 13");
		kast13.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast13.setBackground(Color.WHITE);
		kast13.setBounds(143, 156, 86, 86);
		frame.getContentPane().add(kast13);
		
		JPanel kast14 = new JPanel();
		kast14.setToolTipText("Kast 14");
		kast14.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast14.setBackground(Color.WHITE);
		kast14.setBounds(239, 156, 86, 86);
		frame.getContentPane().add(kast14);
		
		JPanel kast15 = new JPanel();
		kast15.setToolTipText("Kast 15");
		kast15.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast15.setBackground(Color.WHITE);
		kast15.setBounds(336, 156, 86, 86);
		frame.getContentPane().add(kast15);
		
		JPanel kast23 = new JPanel();
		kast23.setToolTipText("Kast 23");
		kast23.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast23.setBackground(Color.WHITE);
		kast23.setBounds(576, 156, 86, 86);
		frame.getContentPane().add(kast23);
		
		JPanel kast24 = new JPanel();
		kast24.setToolTipText("Kast 24");
		kast24.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast24.setBackground(Color.WHITE);
		kast24.setBounds(672, 156, 86, 86);
		frame.getContentPane().add(kast24);
		
		JPanel kast25 = new JPanel();
		kast25.setToolTipText("Kast 25");
		kast25.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast25.setBackground(Color.WHITE);
		kast25.setBounds(768, 156, 86, 86);
		frame.getContentPane().add(kast25);
		
		JPanel kast16 = new JPanel();
		kast16.setToolTipText("Kast 16");
		kast16.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast16.setBackground(Color.WHITE);
		kast16.setBounds(143, 252, 86, 86);
		frame.getContentPane().add(kast16);
		
		JPanel kast17 = new JPanel();
		kast17.setToolTipText("Kast 17");
		kast17.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast17.setBackground(Color.WHITE);
		kast17.setBounds(239, 252, 86, 86);
		frame.getContentPane().add(kast17);
		
		JPanel kast18 = new JPanel();
		kast18.setToolTipText("Kast 18");
		kast18.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast18.setBackground(Color.WHITE);
		kast18.setBounds(336, 252, 86, 86);
		frame.getContentPane().add(kast18);
		
		JPanel kast26 = new JPanel();
		kast26.setToolTipText("Kast 26");
		kast26.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast26.setBackground(Color.WHITE);
		kast26.setBounds(576, 252, 86, 86);
		frame.getContentPane().add(kast26);
		
		JPanel kast27 = new JPanel();
		kast27.setToolTipText("Kast 27");
		kast27.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast27.setBackground(Color.WHITE);
		kast27.setBounds(672, 252, 86, 86);
		frame.getContentPane().add(kast27);
		
		JPanel kast28 = new JPanel();
		kast28.setToolTipText("Kast 28");
		kast28.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast28.setBackground(Color.WHITE);
		kast28.setBounds(768, 252, 86, 86);
		frame.getContentPane().add(kast28);
		
		JPanel kast1 = new JPanel();
		kast1.setToolTipText("Kast 1");
		kast1.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast1.setBackground(SystemColor.controlHighlight);
		kast1.setBounds(133, 50, 300, 300);
		frame.getContentPane().add(kast1);
		
		JPanel kast2 = new JPanel();
		kast2.setToolTipText("Kast 2");
		kast2.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast2.setBackground(SystemColor.controlHighlight);
		kast2.setBounds(566, 50, 300, 300);
		frame.getContentPane().add(kast2);
		
		
		JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP);
		tabPane.setForeground(new Color(0, 0, 0));
		tabPane.setBorder(null);
		tabPane.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 17));
		tabPane.setToolTipText("");
		tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabPane.setBackground(Color.WHITE);
		tabPane.setBounds(0, 400, 1000, 281);
		frame.getContentPane().add(tabPane);
		
		JPanel bestellingTab = new JPanel();
		bestellingTab.setToolTipText("Controle van bestellingen");
		bestellingTab.setBackground(Color.WHITE);
		tabPane.addTab("BESTELLING", null, bestellingTab, null);
		
		JPanel medicijnTab = new JPanel();
		medicijnTab.setToolTipText("Controle van medicijnen");
		medicijnTab.setBackground(Color.WHITE);
		tabPane.addTab("MEDICIJN", null, medicijnTab, null);
		tabPane.setBackgroundAt(1, Color.WHITE);
		
		
		
		
	}
}
