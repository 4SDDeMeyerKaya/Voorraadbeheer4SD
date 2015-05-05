import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.SystemColor;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ListSelectionModel;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.text.ParseException;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


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
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Farmacia1.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(20, 20, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane terminalTitle = new JTextPane();
		terminalTitle.setFont(new Font("Dialog", Font.BOLD, 12));
		terminalTitle.setToolTipText("");
		terminalTitle.setText("                                                             LOG");
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
		kast10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast10 = new JFrame("Inhoud Kast 10");
					kast10.setVisible(true);
					kast10.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane10 = new JScrollPane();
					kast10.add(scrollpane10);
			    }
			}
		});
		kast10.setToolTipText("Kast 10");
		kast10.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast10.setForeground(Color.BLACK);
		kast10.setBackground(Color.WHITE);
		kast10.setBounds(99, 60, 86, 86);
		frame.getContentPane().add(kast10);
		
		JPanel kast11 = new JPanel();
		kast11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast11 = new JFrame("Inhoud Kast 11");
					kast11.setVisible(true);
					kast11.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane11 = new JScrollPane();
					kast11.add(scrollpane11);
			    }
			}
		});
		kast11.setToolTipText("Kast 11");
		kast11.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast11.setBackground(Color.WHITE);
		kast11.setBounds(195, 60, 86, 86);
		frame.getContentPane().add(kast11);
		
		JPanel kast12 = new JPanel();
		kast12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast12 = new JFrame("Inhoud Kast 12");
					kast12.setVisible(true);
					kast12.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane12 = new JScrollPane();
					kast12.add(scrollpane12);
			    }
			}
		});
		kast12.setToolTipText("Kast 12");
		kast12.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast12.setBackground(Color.WHITE);
		kast12.setBounds(291, 60, 86, 86);
		frame.getContentPane().add(kast12);
		
		JPanel kast20 = new JPanel();
		kast20.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast20 = new JFrame("Inhoud Kast 20");
					kast20.setVisible(true);
					kast20.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane20 = new JScrollPane();
					kast20.add(scrollpane20);
			    }
			}
		});
		kast20.setToolTipText("Kast 20");
		kast20.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast20.setBackground(Color.WHITE);
		kast20.setBounds(488, 60, 86, 86);
		frame.getContentPane().add(kast20);
		
		JPanel kast21 = new JPanel();
		kast21.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast21 = new JFrame("Inhoud Kast 21");
					kast21.setVisible(true);
					kast21.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane21 = new JScrollPane();
					kast21.add(scrollpane21);
			    }
			}
		});
		kast21.setToolTipText("Kast 21");
		kast21.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast21.setBackground(Color.WHITE);
		kast21.setBounds(584, 60, 86, 86);
		frame.getContentPane().add(kast21);
		
		JPanel kast22 = new JPanel();
		kast22.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast22 = new JFrame("Inhoud Kast 22");
					kast22.setVisible(true);
					kast22.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane22 = new JScrollPane();
					kast22.add(scrollpane22);
			    }
			}
		});
		kast22.setToolTipText("Kast 22");
		kast22.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast22.setBackground(Color.WHITE);
		kast22.setBounds(680, 60, 86, 86);
		frame.getContentPane().add(kast22);
		
		JPanel kast13 = new JPanel();
		kast13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast13 = new JFrame("Inhoud Kast 13");
					kast13.setVisible(true);
					kast13.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane13 = new JScrollPane();
					kast13.add(scrollpane13);
			    }
			}
		});
		kast13.setToolTipText("Kast 13");
		kast13.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast13.setBackground(Color.WHITE);
		kast13.setBounds(99, 156, 86, 86);
		frame.getContentPane().add(kast13);
		
		JPanel kast14 = new JPanel();
		kast14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast14 = new JFrame("Inhoud Kast 14");
					kast14.setVisible(true);
					kast14.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane14 = new JScrollPane();
					kast14.add(scrollpane14);
			    }
			}
		});
		kast14.setToolTipText("Kast 14");
		kast14.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast14.setBackground(Color.WHITE);
		kast14.setBounds(195, 156, 86, 86);
		frame.getContentPane().add(kast14);
		
		JPanel kast15 = new JPanel();
		kast15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast15 = new JFrame("Inhoud Kast 15");
					kast15.setVisible(true);
					kast15.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane15 = new JScrollPane();
					kast15.add(scrollpane15);
			    }
			}
		});
		kast15.setToolTipText("Kast 15");
		kast15.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast15.setBackground(Color.WHITE);
		kast15.setBounds(291, 156, 86, 86);
		frame.getContentPane().add(kast15);
		
		JPanel kast23 = new JPanel();
		kast23.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast23 = new JFrame("Inhoud Kast 23");
					kast23.setVisible(true);
					kast23.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane23 = new JScrollPane();
					kast23.add(scrollpane23);
			    }
			}
		});
		kast23.setToolTipText("Kast 23");
		kast23.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast23.setBackground(Color.WHITE);
		kast23.setBounds(488, 156, 86, 86);
		frame.getContentPane().add(kast23);
		
		JPanel kast24 = new JPanel();
		kast24.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast24 = new JFrame("Inhoud Kast 24");
					kast24.setVisible(true);
					kast24.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane24 = new JScrollPane();
					kast24.add(scrollpane24);
			    }
			}
		});
		kast24.setToolTipText("Kast 24");
		kast24.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast24.setBackground(Color.WHITE);
		kast24.setBounds(584, 156, 86, 86);
		frame.getContentPane().add(kast24);
		
		JPanel kast25 = new JPanel();
		kast25.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast25 = new JFrame("Inhoud Kast 25");
					kast25.setVisible(true);
					kast25.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane25 = new JScrollPane();
					kast25.add(scrollpane25);
			    }
			}
		});
		kast25.setToolTipText("Kast 25");
		kast25.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast25.setBackground(Color.WHITE);
		kast25.setBounds(680, 156, 86, 86);
		frame.getContentPane().add(kast25);
		
		JPanel kast16 = new JPanel();
		kast16.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast16 = new JFrame("Inhoud Kast 16");
					kast16.setVisible(true);
					kast16.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane16 = new JScrollPane();
					kast16.add(scrollpane16);
			    }
			}
		});
		kast16.setToolTipText("Kast 16");
		kast16.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast16.setBackground(Color.WHITE);
		kast16.setBounds(99, 252, 86, 86);
		frame.getContentPane().add(kast16);
		
		JPanel kast17 = new JPanel();
		kast17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast17 = new JFrame("Inhoud Kast 17");
					kast17.setVisible(true);
					kast17.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane17 = new JScrollPane();
					kast17.add(scrollpane17);
			    }
			}
		});
		kast17.setToolTipText("Kast 17");
		kast17.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast17.setBackground(Color.WHITE);
		kast17.setBounds(195, 252, 86, 86);
		frame.getContentPane().add(kast17);
		
		JPanel kast18 = new JPanel();
		kast18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast18 = new JFrame("Inhoud Kast 18");
					kast18.setVisible(true);
					kast18.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane18 = new JScrollPane();
					kast18.add(scrollpane18);
			    }
			}
		});
		kast18.setToolTipText("Kast 18");
		kast18.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast18.setBackground(Color.WHITE);
		kast18.setBounds(291, 252, 86, 86);
		frame.getContentPane().add(kast18);
		
		JPanel kast26 = new JPanel();
		kast26.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast26 = new JFrame("Inhoud Kast 26");
					kast26.setVisible(true);
					kast26.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane26 = new JScrollPane();
					kast26.add(scrollpane26);
			    }
			}
		});
		kast26.setToolTipText("Kast 26");
		kast26.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast26.setBackground(Color.WHITE);
		kast26.setBounds(488, 252, 86, 86);
		frame.getContentPane().add(kast26);
		
		JPanel kast27 = new JPanel();
		kast27.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast27 = new JFrame("Inhoud Kast 27");
					kast27.setVisible(true);
					kast27.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane27 = new JScrollPane();
					kast27.add(scrollpane27);
			    }
			}
		});
		kast27.setToolTipText("Kast 27");
		kast27.setBorder(new LineBorder(new Color(0, 0, 0)));
		kast27.setBackground(Color.WHITE);
		kast27.setBounds(584, 252, 86, 86);
		frame.getContentPane().add(kast27);
		
		JPanel kast28 = new JPanel();
		kast28.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame kast28 = new JFrame("Inhoud Kast 28");
					kast28.setVisible(true);
					kast28.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane28 = new JScrollPane();
					kast28.add(scrollpane28);
			    }
			}
		});
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
		
		final JButton BestellingControle = new JButton("Bestelling controleren");
		BestellingControle.setForeground(Color.BLACK);
		BestellingControle.setBackground(SystemColor.controlHighlight);
		BestellingControle.setToolTipText("Controle van bestelling");
		BestellingControle.setBounds(666, 400, 200, 25);
		BestellingControle.addActionListener(new ActionBestellingButton());
		frame.getContentPane().add(BestellingControle);
		
		final JButton button = new JButton("Medicijn toevoegen");
		button.setForeground(Color.BLACK);
		button.setBackground(SystemColor.controlHighlight);
		button.setToolTipText("Toevoegen van medicijn");
		button.setBounds(666, 400, 200, 25);
		button.addActionListener(new ActionMedButton());
		frame.getContentPane().add(button);
		
		
		JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP);
		tabPane.setForeground(new Color(0, 0, 0));
		tabPane.setBorder(null);
		tabPane.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 17));
		tabPane.setToolTipText("");
		tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabPane.setBackground(Color.WHITE);
		tabPane.setBounds(0, 400, 866, 290);
		 ChangeListener changeListener = new ChangeListener() {
		      public void stateChanged(ChangeEvent changeEvent) {
		        JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
		        int index = sourceTabbedPane.getSelectedIndex();
		        if(index == 0)
		        {
		        	button.setVisible(false);
		        	BestellingControle.setVisible(true);      	
		        	      	
		        }
		        else if(index == 1)
		        {
		        	BestellingControle.setVisible(false);
		        	button.setVisible(true);
		        }
		      }
		    };
		    tabPane.addChangeListener(changeListener);
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
		System.setOut(printStream);
		System.setErr(printStream);
		
	}
	
	static class ActionMedButton implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			// wat er gebeurd als de knop wordt ingedrukt
			
			final JFrame frame2 = new JFrame("Medicijn toevoegen.");
			frame2.setVisible(true);
			frame2.setSize(300,310);
			String[] labels = {"Merknaam: ", "Stofnaam: ", "Aantal: ", "Gewenste Aantal: ", "Minimum Aantal: ", "Fabrikant: ", "Prijs: ", "Kast ID: ", "Houdbaarheid: "};
			int numPairs = labels.length;

			//Create and populate the panel.
			JPanel p = new JPanel(new SpringLayout());
			frame2.getContentPane().add(p);
			
			// WERKT NIET , Y?
			//for (int i = 0; i < numPairs; i++) {
			    //JLabel li = new JLabel(labels[i], JLabel.TRAILING);
			    //p.add(li);
			    //final JTextField textFieldi = new JTextField(10);
			    //li.setLabelFor(textFieldi);
			    //p.add(textFieldi);
			//}
			
			//Merknaam
			JLabel l0 = new JLabel(labels[0], JLabel.TRAILING);
			p.add(l0);
		    final JTextField textField0 = new JTextField(10);
		    l0.setLabelFor(textField0);
		    p.add(textField0);
		    
		    //Stofnaam
			JLabel l1 = new JLabel(labels[1], JLabel.TRAILING);
			p.add(l1);
		    final JTextField textField1 = new JTextField(10);
		    l1.setLabelFor(textField1);
		    p.add(textField1);
		    
		 	//Aantal
			JLabel l2 = new JLabel(labels[2], JLabel.TRAILING);
			p.add(l2);
		    final JTextField textField2 = new JTextField(10);
		    l2.setLabelFor(textField2);
		    p.add(textField2);
		    
		    //Gewenst Aantal
			JLabel l3 = new JLabel(labels[3], JLabel.TRAILING);
			p.add(l3);
		    final JTextField textField3 = new JTextField(10);
		    l3.setLabelFor(textField3);
		    p.add(textField3);
		    
		    //Minimum aantal
			JLabel l4 = new JLabel(labels[4], JLabel.TRAILING);
			p.add(l4);
		    final JTextField textField4 = new JTextField(10);
		    l4.setLabelFor(textField4);
		    p.add(textField4);		    		    
		    
		    //Fabrikant
			JLabel l5 = new JLabel(labels[5], JLabel.TRAILING);
			p.add(l5);
		    final JTextField textField5 = new JTextField(10);
		    l5.setLabelFor(textField5);
		    p.add(textField5);
		    
		    //Prijs
			JLabel l6 = new JLabel(labels[6], JLabel.TRAILING);
			p.add(l6);
		    final JTextField textField6 = new JTextField(10);
		    l6.setLabelFor(textField6);
		    p.add(textField6);
		    
		    //KastID
			JLabel l7 = new JLabel(labels[7], JLabel.TRAILING);
			p.add(l7);
		    final JTextField textField7 = new JTextField(10);
		    l7.setLabelFor(textField7);
		    p.add(textField7);
		    		    
		    //Houdbaarheid
			JLabel l8 = new JLabel(labels[8], JLabel.TRAILING);
			p.add(l8);
		    final JTextField textField8 = new JTextField(10);
		    l8.setLabelFor(textField8);
		    p.add(textField8);			
			
		    
		    //button
		    JLabel l9 = new JLabel("", JLabel.TRAILING);
		    p.add(l9);
		    final JButton bevestig = new JButton("Bevestig");
			bevestig.setForeground(Color.BLACK);
			bevestig.setBackground(SystemColor.controlHighlight);
			l9.setLabelFor(bevestig);
		    p.add(bevestig);
			bevestig.addActionListener(new ActionListener(){
				 @Override
		            public void actionPerformed(ActionEvent arg0) {

					 String merknaamtemp = textField0.getText();
					    
					    //Stofnaam			
					    String stofnaamtemp = textField1.getText();
					    
					 	//Aantal
					    int tempaantal = 0;
						try{
					    	int aantaltemp = Integer.parseInt(textField2.getText());
					    	tempaantal=aantaltemp;
					    }catch(NumberFormatException ex){
					    	//System.err.println("Illegal input.");
					    }
					    
					    //Gewenst Aantal
						int tempgewaantal=0;
						try{
					    	int gewaantaltemp = Integer.parseInt(textField3.getText());
					    	tempgewaantal=gewaantaltemp;
					    }catch(NumberFormatException ex){
					    	//System.err.println("Illegal input.");
					    }
					    
					    //Minimum aantal
						//Aantal
						int tempminaantal=0;
						try{
					    	int minaantaltemp = Integer.parseInt(textField4.getText());
					    	tempminaantal=minaantaltemp;
					    }catch(NumberFormatException ex){
					    	//System.err.println("Illegal input.");
					    }
					    		    
					    
					    //Fabrikant
						String fabrikanttemp = textField5.getText();
					    
					    //Prijs
						int tempprijs=0;
						try{
						    int prijstemp = Integer.parseInt(textField6.getText());
						    tempprijs=prijstemp;
					    }catch(NumberFormatException ex){
					    	//System.err.println("Illegal input.");
					    }
					    
					    //KastID
						int tempkastid=0;
						try{
						    int kastidtemp = Integer.parseInt(textField7.getText());
						    tempkastid=kastidtemp;
					    }catch(NumberFormatException ex){
					    	//System.err.println("Illegal input.");
					    }
					    
					    //Houdbaarheid
						String houdbaarheidtemp = textField8.getText();
						
						Log.print();
						System.out.println("Medicijn ingegeven met merknaam: " + merknaamtemp);
						Voorraadbeheer.voegMedicijnToe(merknaamtemp, stofnaamtemp, tempaantal, tempgewaantal, tempminaantal, fabrikanttemp, tempprijs, tempkastid, houdbaarheidtemp);
						
						frame2.setVisible(false);
		                frame2.dispose();
						

		            }
		        });
			
			

			//Lay out the panel.
			SpringUtilities.makeCompactGrid(p,
			                                10, 2, //rows, cols
			                                6, 6,        //initX, initY
			                                6, 6);       //xPad, yPad
			
			
			
			
		}
	}
	
	
	
	static class ActionBestellingButton implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			// wat er gebeurd als de knop wordt ingedrukt	
			
		
		try {
			Voorraadbeheer.controleerOpTeBestellen();
		} catch (ParseException e) {
			
		} catch (OrderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}
	
	 

	
}

