import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import java.io.PrintStream;
import javax.swing.JButton;


public class GUI {

	public JFrame frame;
	private JTable tableMed;
	private JTable tableBest;

	/**
	 * Launch the appliccation.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					System.out.println("Random print test");
					System.out.println("m");
					System.out.println("a");
					System.out.println("t");
					System.out.println("s");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/mats/git/Voorraadbeheer4SD/Farmacia1.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane terminalTitle = new JTextPane();
		terminalTitle.setFont(new Font("Dialog", Font.BOLD, 12));
		terminalTitle.setToolTipText("");
		terminalTitle.setText("                                                           TERMINAL");
		terminalTitle.setEditable(false);
		terminalTitle.setForeground(Color.WHITE);
		terminalTitle.setBackground(Color.BLACK);
		terminalTitle.setBounds(866, 0, 414, 18);
		frame.getContentPane().add(terminalTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(866, 17, 414, 675);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textAreaTerminal = new JTextArea();
		scrollPane.setViewportView(textAreaTerminal);
		textAreaTerminal.setText("------------------------------------------------------------------------------------------------------\n");
		textAreaTerminal.setEditable(false);
		textAreaTerminal.setForeground(Color.WHITE);
		textAreaTerminal.setBackground(Color.BLACK);
		
		JPanel kast10 = new JPanel();
		kast10.setToolTipText("Kast10");
		kast10.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast10.setForeground(Color.BLACK);
		kast10.setBackground(Color.WHITE);
		kast10.setBounds(99, 60, 86, 86);
		frame.getContentPane().add(kast10);
		
		JPanel kast11 = new JPanel();
		kast11.setToolTipText("Kast 11");
		kast11.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast11.setBackground(Color.WHITE);
		kast11.setBounds(195, 60, 86, 86);
		frame.getContentPane().add(kast11);
		
		JPanel kast12 = new JPanel();
		kast12.setToolTipText("Kast 12");
		kast12.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast12.setBackground(Color.WHITE);
		kast12.setBounds(291, 60, 86, 86);
		frame.getContentPane().add(kast12);
		
		JPanel kast20 = new JPanel();
		kast20.setToolTipText("Kast 20");
		kast20.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast20.setBackground(Color.WHITE);
		kast20.setBounds(488, 60, 86, 86);
		frame.getContentPane().add(kast20);
		
		JPanel kast21 = new JPanel();
		kast21.setToolTipText("Kast 21");
		kast21.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast21.setBackground(Color.WHITE);
		kast21.setBounds(584, 60, 86, 86);
		frame.getContentPane().add(kast21);
		
		JPanel kast22 = new JPanel();
		kast22.setToolTipText("Kast 22");
		kast22.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast22.setBackground(Color.WHITE);
		kast22.setBounds(680, 60, 86, 86);
		frame.getContentPane().add(kast22);
		
		JPanel kast13 = new JPanel();
		kast13.setToolTipText("Kast 13");
		kast13.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast13.setBackground(Color.WHITE);
		kast13.setBounds(99, 156, 86, 86);
		frame.getContentPane().add(kast13);
		
		JPanel kast14 = new JPanel();
		kast14.setToolTipText("Kast 14");
		kast14.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast14.setBackground(Color.WHITE);
		kast14.setBounds(195, 156, 86, 86);
		frame.getContentPane().add(kast14);
		
		JPanel kast15 = new JPanel();
		kast15.setToolTipText("Kast 15");
		kast15.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast15.setBackground(Color.WHITE);
		kast15.setBounds(291, 156, 86, 86);
		frame.getContentPane().add(kast15);
		
		JPanel kast23 = new JPanel();
		kast23.setToolTipText("Kast 23");
		kast23.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast23.setBackground(Color.WHITE);
		kast23.setBounds(488, 156, 86, 86);
		frame.getContentPane().add(kast23);
		
		JPanel kast24 = new JPanel();
		kast24.setToolTipText("Kast 24");
		kast24.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast24.setBackground(Color.WHITE);
		kast24.setBounds(584, 156, 86, 86);
		frame.getContentPane().add(kast24);
		
		JPanel kast25 = new JPanel();
		kast25.setToolTipText("Kast 25");
		kast25.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast25.setBackground(Color.WHITE);
		kast25.setBounds(680, 156, 86, 86);
		frame.getContentPane().add(kast25);
		
		JPanel kast16 = new JPanel();
		kast16.setToolTipText("Kast 16");
		kast16.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast16.setBackground(Color.WHITE);
		kast16.setBounds(99, 252, 86, 86);
		frame.getContentPane().add(kast16);
		
		JPanel kast17 = new JPanel();
		kast17.setToolTipText("Kast 17");
		kast17.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast17.setBackground(Color.WHITE);
		kast17.setBounds(195, 252, 86, 86);
		frame.getContentPane().add(kast17);
		
		JPanel kast18 = new JPanel();
		kast18.setToolTipText("Kast 18");
		kast18.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast18.setBackground(Color.WHITE);
		kast18.setBounds(291, 252, 86, 86);
		frame.getContentPane().add(kast18);
		
		JPanel kast26 = new JPanel();
		kast26.setToolTipText("Kast 26");
		kast26.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast26.setBackground(Color.WHITE);
		kast26.setBounds(488, 252, 86, 86);
		frame.getContentPane().add(kast26);
		
		JPanel kast27 = new JPanel();
		kast27.setToolTipText("Kast 27");
		kast27.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast27.setBackground(Color.WHITE);
		kast27.setBounds(584, 252, 86, 86);
		frame.getContentPane().add(kast27);
		
		JPanel kast28 = new JPanel();
		kast28.setToolTipText("Kast 28");
		kast28.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast28.setBackground(Color.WHITE);
		kast28.setBounds(680, 252, 86, 86);
		frame.getContentPane().add(kast28);
		
		JPanel kast1 = new JPanel();
		kast1.setToolTipText("Kast 1");
		kast1.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast1.setBackground(SystemColor.controlHighlight);
		kast1.setBounds(89, 50, 300, 300);
		frame.getContentPane().add(kast1);
		
		JPanel kast2 = new JPanel();
		kast2.setToolTipText("Kast 2");
		kast2.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast2.setBackground(SystemColor.controlHighlight);
		kast2.setBounds(478, 50, 300, 300);
		frame.getContentPane().add(kast2);
		
		
		JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP);
		tabPane.setForeground(new Color(0, 0, 0));
		tabPane.setBorder(null);
		tabPane.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 17));
		tabPane.setToolTipText("");
		tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabPane.setBackground(Color.WHITE);
		tabPane.setBounds(0, 400, 866, 290);
		frame.getContentPane().add(tabPane);
		
		JPanel bestellingTab = new JPanel();
		bestellingTab.setToolTipText("Controle van bestellingen");
		bestellingTab.setBackground(Color.WHITE);
		tabPane.addTab("BESTELLING", null, bestellingTab, null);
		bestellingTab.setLayout(null);
		
		JScrollPane scrollPaneBest = new JScrollPane();
		scrollPaneBest.setBounds(0, 0, 866, 260);
		bestellingTab.add(scrollPaneBest);
		
		tableBest = new JTable();
		tableBest.setCellSelectionEnabled(true);
		tableBest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableBest.setFillsViewportHeight(true);
		JTableHeader thB = tableBest.getTableHeader();
		thB.setFont(new Font("Dialog", Font.BOLD, 12));
		tableBest.setModel(new DefaultTableModel(
			new Object[][] {
				{"merk1test", "1", "10000"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Merknaam", "Aantal (klik cel om aan te passen)", "Prijs"
			}
		));
		tableBest.setForeground(Color.BLACK);
		scrollPaneBest.setViewportView(tableBest);
		
		JPanel medicijnTab = new JPanel();
		medicijnTab.setToolTipText("Controle van medicijnen");
		medicijnTab.setBackground(Color.WHITE);
		tabPane.addTab("MEDICIJN", null, medicijnTab, null);
		medicijnTab.setLayout(null);
		
		JScrollPane scrollPaneMed = new JScrollPane();
		scrollPaneMed.setBounds(0, 0, 866, 260);
		medicijnTab.add(scrollPaneMed);
		
		tableMed = new JTable();
		JTableHeader thM = tableMed.getTableHeader();
		thM.setFont(new Font("Dialog", Font.BOLD, 12));
		tableMed.setFont(new Font("Dialog", Font.PLAIN, 12));
		tableMed.setToolTipText("Lijst van medicijnen");
		tableMed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableMed.setRowSelectionAllowed(false);
		tableMed.setForeground(Color.BLACK);
		tableMed.setFillsViewportHeight(true);
		tableMed.setCellSelectionEnabled(true);
		tableMed.setModel(new DefaultTableModel(
			new Object[][] {
				{"merk1", "stof1", "1", "1", "1", "fab1", "100", "12", "22-10-2015"},
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
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Merknaam", "Stofnaam", "Aantal", "GA", "MA", "Fabrikant", "Prijs", "Kast ID", "Houdbaarheid"
			}
		));
		tableMed.getColumnModel().getColumn(0).setPreferredWidth(160);
		tableMed.getColumnModel().getColumn(0).setMinWidth(160);
		tableMed.getColumnModel().getColumn(1).setPreferredWidth(110);
		tableMed.getColumnModel().getColumn(1).setMinWidth(110);
		tableMed.getColumnModel().getColumn(2).setPreferredWidth(90);
		tableMed.getColumnModel().getColumn(2).setMinWidth(90);
		tableMed.getColumnModel().getColumn(3).setPreferredWidth(63);
		tableMed.getColumnModel().getColumn(3).setMinWidth(63);
		tableMed.getColumnModel().getColumn(4).setPreferredWidth(63);
		tableMed.getColumnModel().getColumn(4).setMinWidth(63);
		tableMed.getColumnModel().getColumn(5).setPreferredWidth(111);
		tableMed.getColumnModel().getColumn(5).setMinWidth(111);
		tableMed.getColumnModel().getColumn(6).setPreferredWidth(80);
		tableMed.getColumnModel().getColumn(6).setMinWidth(80);
		tableMed.getColumnModel().getColumn(7).setPreferredWidth(60);
		tableMed.getColumnModel().getColumn(7).setMinWidth(60);
		tableMed.getColumnModel().getColumn(8).setPreferredWidth(120);
		tableMed.getColumnModel().getColumn(8).setMinWidth(111);
		scrollPaneMed.setViewportView(tableMed);
		tabPane.setBackgroundAt(1, Color.WHITE);
		
		
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textAreaTerminal));
		
		JButton BestellingControle = new JButton("Bestelling controleren");
		BestellingControle.setBounds(466, 400, 200, 25);
		frame.getContentPane().add(BestellingControle);
		
		JButton button = new JButton("Medicijn toevoegen");
		button.setBounds(666, 400, 200, 25);
		frame.getContentPane().add(button);
		System.setOut(printStream);
		System.setErr(printStream);
		
	}

	
}

