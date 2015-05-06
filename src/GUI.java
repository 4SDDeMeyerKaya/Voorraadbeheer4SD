import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.ListSelectionModel;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

import com.thehowtotutorial.splashscreen.JSplash;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;


public class GUI {

	public JFrame frame;
	public static JTable tableMed;
	private JTable tableBest;
	private JTextArea textAreaTerminal;

	/**
	 * Launch the appliccation.
	 *
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

	**
	 * Create the application.
	 */

	
	public GUI() {
		
		frame = new JFrame();
		frame.setTitle("Asclepius -De Meyer, Kaya");
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Farmacia1.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(20, 20, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton clrLogButton = new JButton("Clear");
		clrLogButton.setFont(new Font("Arial", Font.PLAIN, 14));
		clrLogButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
					textAreaTerminal.setText("");
			}
				        
				
			
		});
		
		JButton verkoopButton = new JButton("Verkoop Medicijn");
		verkoopButton.setBackground(SystemColor.controlHighlight);
		verkoopButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final JFrame frameverkoop = new JFrame("Medicijn verkopen");
				frameverkoop.setVisible(true);
				frameverkoop.setSize(500,110);

				//Create and populate the panel.
				JPanel p = new JPanel(new SpringLayout());
				frameverkoop.getContentPane().add(p);
				
				//Merknaam
				JLabel l0 = new JLabel("Merknaam van het verkochte medicijn: ", JLabel.TRAILING);
				p.add(l0);
			    final JTextField textField0 = new JTextField(200);
			    l0.setLabelFor(textField0);
			    p.add(textField0);
			    
			  //button
			    JLabel l1 = new JLabel("", JLabel.TRAILING);
			    p.add(l1);
			    final JButton bevestig = new JButton("Bevestig");
				bevestig.setForeground(Color.BLACK);
				bevestig.setBackground(SystemColor.controlHighlight);
				l1.setLabelFor(bevestig);
			    p.add(bevestig);
				bevestig.addActionListener(new ActionListener(){
					 @Override
			            public void actionPerformed(ActionEvent arg0) {

						 String medicijnnaamtemp = textField0.getText();
						 boolean geldig = false;
						 
						 int i = 0;
					        if (Voorraadbeheer.medlist.size() != 0) {
					            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
					            	if(Voorraadbeheer.medlist.get(i).merknaam.equals(medicijnnaamtemp)){
					            		geldig = true;
					            	}
					            }
					        }		 
												    
					        if(geldig)
							{
								Apotheker.verkoopMedicijn(medicijnnaamtemp);
								frameverkoop.setVisible(false);
							   	frameverkoop.dispose();
							}
						   	else
						   	{
						   		Log.print();
								System.out.println("Onbestaand medicijn ingegeven, probeer opnieuw.");
								frameverkoop.setVisible(false);
							   	frameverkoop.dispose();
							}
								
			            }
			        });		
				

				//Lay out the panel.
				SpringUtilities.makeCompactGrid(p,
				                                2, 2, //rows, cols
				                                6, 6,        //initX, initY
				                                6, 6);       //xPad, yPad
			    
			    
			    
			    
				
				
			}
		});
		verkoopButton.setFont(new Font("Arial", Font.PLAIN, 14));
		verkoopButton.setForeground(Color.BLACK);
		verkoopButton.setBounds(466, 400, 200, 23);
		frame.getContentPane().add(verkoopButton);
		clrLogButton.setForeground(Color.WHITE);
		clrLogButton.setBackground(Color.BLACK);
		clrLogButton.setBounds(1200, 0, 74, 36);
		frame.getContentPane().add(clrLogButton);
		
		JTextPane terminalTitle = new JTextPane();
		terminalTitle.setFont(new Font("Arial", Font.BOLD, 14));
		terminalTitle.setToolTipText("");
		terminalTitle.setText("                                             LOG\n________________________________________________________________________\n");
		terminalTitle.setEditable(false);
		terminalTitle.setForeground(Color.WHITE);
		terminalTitle.setBackground(Color.BLACK);
		terminalTitle.setBounds(866, 0, 414, 39);
		frame.getContentPane().add(terminalTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(866, 38, 414, 675);
		frame.getContentPane().add(scrollPane);
		
		textAreaTerminal = new JTextArea();
		textAreaTerminal.setFont(new Font("Arial", Font.PLAIN, 13));
		scrollPane.setViewportView(textAreaTerminal);
		textAreaTerminal.setEditable(false);
		textAreaTerminal.setForeground(Color.WHITE);
		textAreaTerminal.setBackground(Color.BLACK);
		
		JPanel kast10 = new JPanel();
		kast10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)){
					final JFrame Fkast10 = new JFrame("Inhoud Kast 10");
					Fkast10.setVisible(true);
					Fkast10.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane10 = new JScrollPane();
					Fkast10.getContentPane().add(scrollpane10);
					JTextArea kast10Title = new JTextArea();
					kast10Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast10Title.setToolTipText("");
					kast10Title.setText("               Medicijnen in Kast 10: \n");
			        int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 10){
			            		kast10Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }            
			        kast10Title.setEditable(false);
					kast10Title.setForeground(Color.BLACK);
					kast10Title.setBackground(Color.WHITE);
					kast10Title.setBounds(0, 0, 300, 30);
					Fkast10.getContentPane().add(kast10Title);
					
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
					final JFrame Fkast11 = new JFrame("Inhoud Kast 11");
					Fkast11.setVisible(true);
					Fkast11.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane11 = new JScrollPane();
					Fkast11.getContentPane().add(scrollpane11);
					JTextArea kast11Title = new JTextArea();
					kast11Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast11Title.setToolTipText("");
					kast11Title.setText("               Medicijnen in Kast 11: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 11){
			            		kast11Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        } 
					kast11Title.setEditable(false);
					kast11Title.setForeground(Color.BLACK);
					kast11Title.setBackground(Color.WHITE);
					kast11Title.setBounds(0, 0, 300, 30);
					Fkast11.getContentPane().add(kast11Title);
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
					final JFrame Fkast12 = new JFrame("Inhoud Kast 12");
					Fkast12.setVisible(true);
					Fkast12.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane12 = new JScrollPane();
					Fkast12.getContentPane().add(scrollpane12);
					JTextArea kast12Title = new JTextArea();
					kast12Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast12Title.setToolTipText("");
					kast12Title.setText("               Medicijnen in Kast 12: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 12){
			            		kast12Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        } 
					kast12Title.setEditable(false);
					kast12Title.setForeground(Color.BLACK);
					kast12Title.setBackground(Color.WHITE);
					kast12Title.setBounds(0, 0, 300, 30);
					Fkast12.getContentPane().add(kast12Title);
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
					final JFrame Fkast20 = new JFrame("Inhoud Kast 20");
					Fkast20.setVisible(true);
					Fkast20.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane20 = new JScrollPane();
					Fkast20.getContentPane().add(scrollpane20);
					JTextArea kast20Title = new JTextArea();
					kast20Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast20Title.setToolTipText("");
					kast20Title.setText("               Medicijnen in Kast 20: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 20){
			            		kast20Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast20Title.setEditable(false);
					kast20Title.setForeground(Color.BLACK);
					kast20Title.setBackground(Color.WHITE);
					kast20Title.setBounds(0, 0, 300, 30);
					Fkast20.getContentPane().add(kast20Title);
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
					final JFrame Fkast21 = new JFrame("Inhoud Kast 21");
					Fkast21.setVisible(true);
					Fkast21.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane21 = new JScrollPane();
					Fkast21.getContentPane().add(scrollpane21);
					JTextArea kast21Title = new JTextArea();
					kast21Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast21Title.setToolTipText("");
					kast21Title.setText("               Medicijnen in Kast 21: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 21){
			            		kast21Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast21Title.setEditable(false);
					kast21Title.setForeground(Color.BLACK);
					kast21Title.setBackground(Color.WHITE);
					kast21Title.setBounds(0, 0, 300, 30);
					Fkast21.getContentPane().add(kast21Title);
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
					final JFrame Fkast22 = new JFrame("Inhoud Kast 22");
					Fkast22.setVisible(true);
					Fkast22.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane22 = new JScrollPane();
					Fkast22.getContentPane().add(scrollpane22);
					JTextArea kast22Title = new JTextArea();
					kast22Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast22Title.setToolTipText("");
					kast22Title.setText("               Medicijnen in Kast 22: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 22){
			            		kast22Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast22Title.setEditable(false);
					kast22Title.setForeground(Color.BLACK);
					kast22Title.setBackground(Color.WHITE);
					kast22Title.setBounds(0, 0, 300, 30);
					Fkast22.getContentPane().add(kast22Title);
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
					final JFrame Fkast13 = new JFrame("Inhoud Kast 13");
					Fkast13.setVisible(true);
					Fkast13.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane13 = new JScrollPane();
					Fkast13.getContentPane().add(scrollpane13);
					JTextArea kast13Title = new JTextArea();
					kast13Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast13Title.setToolTipText("");
					kast13Title.setText("               Medicijnen in Kast 13: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 13){
			            		kast13Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast13Title.setEditable(false);
					kast13Title.setForeground(Color.BLACK);
					kast13Title.setBackground(Color.WHITE);
					kast13Title.setBounds(0, 0, 300, 30);
					Fkast13.getContentPane().add(kast13Title);
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
					final JFrame Fkast14 = new JFrame("Inhoud Kast 14");
					Fkast14.setVisible(true);
					Fkast14.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane14 = new JScrollPane();
					Fkast14.getContentPane().add(scrollpane14);
					JTextArea kast14Title = new JTextArea();
					kast14Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast14Title.setToolTipText("");
					kast14Title.setText("               Medicijnen in Kast 14: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 14){
			            		kast14Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast14Title.setEditable(false);
					kast14Title.setForeground(Color.BLACK);
					kast14Title.setBackground(Color.WHITE);
					kast14Title.setBounds(0, 0, 300, 30);
					Fkast14.getContentPane().add(kast14Title);
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
					final JFrame Fkast15 = new JFrame("Inhoud Kast 15");
					Fkast15.setVisible(true);
					Fkast15.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane15 = new JScrollPane();
					Fkast15.getContentPane().add(scrollpane15);
					JTextArea kast15Title = new JTextArea();
					kast15Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast15Title.setToolTipText("");
					kast15Title.setText("               Medicijnen in Kast 15: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 15){
			            		kast15Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast15Title.setEditable(false);
					kast15Title.setForeground(Color.BLACK);
					kast15Title.setBackground(Color.WHITE);
					kast15Title.setBounds(0, 0, 300, 30);
					Fkast15.getContentPane().add(kast15Title);
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
					final JFrame Fkast23 = new JFrame("Inhoud Kast 23");
					Fkast23.setVisible(true);
					Fkast23.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane23 = new JScrollPane();
					Fkast23.getContentPane().add(scrollpane23);
					JTextArea kast23Title = new JTextArea();
					kast23Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast23Title.setToolTipText("");
					kast23Title.setText("               Medicijnen in Kast 23: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 23){
			            		kast23Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast23Title.setEditable(false);
					kast23Title.setForeground(Color.BLACK);
					kast23Title.setBackground(Color.WHITE);
					kast23Title.setBounds(0, 0, 300, 30);
					Fkast23.getContentPane().add(kast23Title);
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
					final JFrame Fkast24 = new JFrame("Inhoud Kast 24");
					Fkast24.setVisible(true);
					Fkast24.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane24 = new JScrollPane();
					Fkast24.getContentPane().add(scrollpane24);
					JTextArea kast24Title = new JTextArea();
					kast24Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast24Title.setToolTipText("");
					kast24Title.setText("               Medicijnen in Kast 24: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 24){
			            		kast24Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast24Title.setEditable(false);
					kast24Title.setForeground(Color.BLACK);
					kast24Title.setBackground(Color.WHITE);
					kast24Title.setBounds(0, 0, 300, 30);
					Fkast24.getContentPane().add(kast24Title);
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
					final JFrame Fkast25 = new JFrame("Inhoud Kast 25");
					Fkast25.setVisible(true);
					Fkast25.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane25 = new JScrollPane();
					Fkast25.getContentPane().add(scrollpane25);
					JTextArea kast25Title = new JTextArea();
					kast25Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast25Title.setToolTipText("");
					kast25Title.setText("               Medicijnen in Kast 25: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 25){
			            		kast25Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast25Title.setEditable(false);
					kast25Title.setForeground(Color.BLACK);
					kast25Title.setBackground(Color.WHITE);
					kast25Title.setBounds(0, 0, 300, 30);
					Fkast25.getContentPane().add(kast25Title);
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
					final JFrame Fkast16 = new JFrame("Inhoud Kast 16");
					Fkast16.setVisible(true);
					Fkast16.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane16 = new JScrollPane();
					Fkast16.getContentPane().add(scrollpane16);
					JTextArea kast16Title = new JTextArea();
					kast16Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast16Title.setToolTipText("");
					kast16Title.setText("               Medicijnen in Kast 16: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 16){
			            		kast16Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast16Title.setEditable(false);
					kast16Title.setForeground(Color.BLACK);
					kast16Title.setBackground(Color.WHITE);
					kast16Title.setBounds(0, 0, 300, 30);
					Fkast16.getContentPane().add(kast16Title);
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
					final JFrame Fkast17 = new JFrame("Inhoud Kast 17");
					Fkast17.setVisible(true);
					Fkast17.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane17 = new JScrollPane();
					Fkast17.getContentPane().add(scrollpane17);
					JTextArea kast17Title = new JTextArea();
					kast17Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast17Title.setToolTipText("");
					kast17Title.setText("               Medicijnen in Kast 17: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 17){
			            		kast17Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast17Title.setEditable(false);
					kast17Title.setForeground(Color.BLACK);
					kast17Title.setBackground(Color.WHITE);
					kast17Title.setBounds(0, 0, 300, 30);
					Fkast17.getContentPane().add(kast17Title);
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
					final JFrame Fkast18 = new JFrame("Inhoud Kast 18");
					Fkast18.setVisible(true);
					Fkast18.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane18 = new JScrollPane();
					Fkast18.getContentPane().add(scrollpane18);
					JTextArea kast18Title = new JTextArea();
					kast18Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast18Title.setToolTipText("");
					kast18Title.setText("               Medicijnen in Kast 18: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 18){
			            		kast18Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast18Title.setEditable(false);
					kast18Title.setForeground(Color.BLACK);
					kast18Title.setBackground(Color.WHITE);
					kast18Title.setBounds(0, 0, 300, 30);
					Fkast18.getContentPane().add(kast18Title);
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
					final JFrame Fkast26 = new JFrame("Inhoud Kast 26");
					Fkast26.setVisible(true);
					Fkast26.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane26 = new JScrollPane();
					Fkast26.getContentPane().add(scrollpane26);
					JTextArea kast26Title = new JTextArea();
					kast26Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast26Title.setToolTipText("");
					kast26Title.setText("               Medicijnen in Kast 26: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 26){
			            		kast26Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast26Title.setEditable(false);
					kast26Title.setForeground(Color.BLACK);
					kast26Title.setBackground(Color.WHITE);
					kast26Title.setBounds(0, 0, 300, 30);
					Fkast26.getContentPane().add(kast26Title);
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
					final JFrame Fkast27 = new JFrame("Inhoud Kast 27");
					Fkast27.setVisible(true);
					Fkast27.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane27 = new JScrollPane();
					Fkast27.getContentPane().add(scrollpane27);
					JTextArea kast27Title = new JTextArea();
					kast27Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast27Title.setToolTipText("");
					kast27Title.setText("               Medicijnen in Kast 27: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 27){
			            		kast27Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast27Title.setEditable(false);
					kast27Title.setForeground(Color.BLACK);
					kast27Title.setBackground(Color.WHITE);
					kast27Title.setBounds(0, 0, 300, 30);
					Fkast27.getContentPane().add(kast27Title);
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
					final JFrame Fkast28 = new JFrame("Inhoud Kast 28");
					Fkast28.setVisible(true);
					Fkast28.setBounds(300, 300, 300, 300);
					JScrollPane scrollpane28 = new JScrollPane();
					Fkast28.getContentPane().add(scrollpane28);
					JTextArea kast28Title = new JTextArea();
					kast28Title.setFont(new Font("Arial", Font.PLAIN, 14));
					kast28Title.setToolTipText("");
					kast28Title.setText("               Medicijnen in Kast 28: \n");
					int i = 0;
			        if (Voorraadbeheer.medlist.size() != 0) {
			            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
			            	if(Voorraadbeheer.medlist.get(i).kastID == 28){
			            		kast28Title.append(Voorraadbeheer.medlist.get(i).merknaam + "\n");
			            	}
			            }
			        }
					kast28Title.setEditable(false);
					kast28Title.setForeground(Color.BLACK);
					kast28Title.setBackground(Color.WHITE);
					kast28Title.setBounds(0, 0, 300, 30);
					Fkast28.getContentPane().add(kast28Title);
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
		BestellingControle.setFont(new Font("Arial", Font.PLAIN, 14));
		BestellingControle.setForeground(Color.BLACK);
		BestellingControle.setBackground(SystemColor.controlHighlight);
		BestellingControle.setToolTipText("Controle van bestelling");
		BestellingControle.setBounds(666, 400, 200, 23);
		BestellingControle.addActionListener(new ActionBestellingButton());
		frame.getContentPane().add(BestellingControle);
		
		final JButton button = new JButton("Medicijn toevoegen");
		button.setFont(new Font("Arial", Font.PLAIN, 14));
		button.setForeground(Color.BLACK);
		button.setBackground(SystemColor.controlHighlight);
		button.setToolTipText("Toevoegen van medicijn");
		button.setBounds(666, 400, 200, 23);
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
				
		tableBest = new JTable(){
			public boolean isCellEditable(int data, int columns){
				return false;
			}
			/*public Component prepareRenderer(TableCellRenderer r, int data, int columns){
				Component c = super.prepareRenderer(r, data, columns);
				
				if (data % 2 == 0) //alternating colours among rows
					c.setBackground(Color.WHITE);
				
				else c.setBackground(Color.LIGHT_GRAY);
				
						
				return c;
			}*/
				
		};
		tableBest.setFont(new Font("Arial", Font.PLAIN, 12));
		tableBest.setCellSelectionEnabled(true);
		tableBest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableBest.setFillsViewportHeight(true);
		JTableHeader thB = tableBest.getTableHeader();
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
		tabPane.setBackgroundAt(1, Color.WHITE);
		medicijnTab.setLayout(null);
				
		JScrollPane scrollPaneMed = new JScrollPane();
		scrollPaneMed.setBounds(0, 0, 866, 260);
		medicijnTab.add(scrollPaneMed);
		
					

		tableMed = new JTable(){
			public boolean isCellEditable(int data, int columns){
					return false;
			}
			public Component prepareRenderer(TableCellRenderer r, int data, int columns){
				Component c = super.prepareRenderer(r, data, columns);
							
				if (data % 2 == 0) //alternating colours among rows
					c.setBackground(Color.WHITE);
							
				else c.setBackground(Color.LIGHT_GRAY);
							
					return c;
				}
						
			};
			JTableHeader thM = tableMed.getTableHeader();
			tableMed.setFont(new Font("Arial", Font.PLAIN, 12));
					
					
					
							
		scrollPaneMed.setViewportView(tableMed);
		thB.setFont(new Font("Dialog", Font.BOLD, 12));

		
        String[] colName = { "Merknaam", "Stofnaam", "Aantal", "GA",
                "MA", "Fabrikant", "Prijs", "Kast ID" ,"Houdbaarheid"};
		thM.setFont(new Font("Dialog", Font.BOLD, 12));

        Object[][] object = new Object[100][100];
        int i = 0;
        if (Voorraadbeheer.medlist.size() != 0) {
            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
                object[i][0] = Voorraadbeheer.medlist.get(i).merknaam;
                object[i][1] = Voorraadbeheer.medlist.get(i).stofnaam;
                object[i][2] = Voorraadbeheer.medlist.get(i).aantal;
                object[i][3] = Voorraadbeheer.medlist.get(i).gewensteAantal;
                object[i][4] = Voorraadbeheer.medlist.get(i).minimumAantal;
                object[i][5] = Voorraadbeheer.medlist.get(i).fabrikant;
                object[i][6] = Voorraadbeheer.medlist.get(i).prijs;
                object[i][7] = Voorraadbeheer.medlist.get(i).kastID;
                object[i][8] = Voorraadbeheer.medlist.get(i).houdbaarheid;
                
                tableMed.setFillsViewportHeight(true);
        		tableMed.setCellSelectionEnabled(false);
        		tableMed.setModel(new DefaultTableModel(object, colName));
        		
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
            }
        }
		
		/*
		JTableHeader thM1 = tableMed.getTableHeader();
		thM1.setFont(new Font("Dialog", Font.BOLD, 12));
		tableMed.setFont(new Font("Arial", Font.PLAIN, 12));
		tableMed.setToolTipText("Lijst van medicijnen");
		//tableMed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableMed.setRowSelectionAllowed(true);
		tableMed.setForeground(Color.BLACK);
		tableMed.setFillsViewportHeight(true);
		tableMed.setCellSelectionEnabled(false);
		tableMed.setModel(new DefaultTableModel(
			new Object[][]  {
				{"merk1", "stof1", "1", "1", "1", "fab1", "100", "12", "22-10-2015"},
			},
			new String[] {
				"Merknaam", "Stofnaam", "Aantal", "GA", "MA", "Fabrikant", "Prijs", "Kast ID", "Houdbaarheid"
			}
		));*/
		
		
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textAreaTerminal));
		System.setOut(printStream);
		System.setErr(printStream);
		
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static class ActionMedButton implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			// wat er gebeurd als de knop wordt ingedrukt	
			
			
			final JFrame frame2 = new JFrame("Medicijn toevoegen.");
			frame2.setVisible(true);
			frame2.setSize(300,310);
			String[] labels = {"Merknaam: ", "Stofnaam: ", "Aantal: ", "Gewenste Aantal: ", "Minimum Aantal: ", "Fabrikant: ", "Prijs: ", "Kast ID: ", "Houdbaarheid: "};

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
					    	Log.print();
					    	System.err.println("Geen geldig aantal opgegeven.");
					    }
					    
					    //Gewenst Aantal
						int tempgewaantal=0;
						try{
					    	int gewaantaltemp = Integer.parseInt(textField3.getText());
					    	tempgewaantal=gewaantaltemp;
					    }catch(NumberFormatException ex){
					    	Log.print();
					    	System.err.println("Geen geldig gewenst aantal opgegeven.");
					    }
					    
					    //Minimum aantal
						//Aantal
						int tempminaantal=0;
						try{
					    	int minaantaltemp = Integer.parseInt(textField4.getText());
					    	tempminaantal=minaantaltemp;
					    }catch(NumberFormatException ex){
					    	Log.print();
					    	System.err.println("Geen geldig minimum aantal opgegeven.");
					    }
					    		    
					    
					    //Fabrikant
						String fabrikanttemp = textField5.getText();
					    
					    //Prijs
						int tempprijs=0;
						try{
						    int prijstemp = Integer.parseInt(textField6.getText());
						    tempprijs=prijstemp;
					    }catch(NumberFormatException ex){
					    	Log.print();
					    	System.err.println("Geen geldige prijs opgegeven.");
					    }
					    
					    //KastID
						int tempkastid=0;
						try{
						    int kastidtemp = Integer.parseInt(textField7.getText());
						    tempkastid=kastidtemp;
					    }catch(NumberFormatException ex){
					    	Log.print();
					    	System.err.println("Geen geldig kast ID opgegeven.");
					    }
					    
					    //Houdbaarheid
						String houdbaarheidtemp = textField8.getText();
						DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						Date huidigdate = new Date();
						Date houdbaarheidsDatumtemp = new Date();
						try {
							houdbaarheidsDatumtemp = sdf.parse(houdbaarheidtemp);
						} catch (ParseException e) {
							Log.print();
							System.err.println("Geen geldige datum opgegeven");							
						}
						
						if(tempaantal != 0 && tempgewaantal != 0 && tempminaantal != 0 && tempprijs != 0 && tempkastid != 0 && huidigdate.before(houdbaarheidsDatumtemp))
						{
							Log.print();
							System.out.println("Medicijn ingegeven met merknaam: " + merknaamtemp);
							Voorraadbeheer.voegMedicijnToe(merknaamtemp, stofnaamtemp, tempaantal, tempgewaantal, tempminaantal, fabrikanttemp, tempprijs, tempkastid, houdbaarheidtemp);
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if(tempaantal == 0)
						{
							Log.print();
							System.out.println("Geen geldig aantal ingegeven");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if(tempgewaantal == 0)
						{
							Log.print();
							System.out.println("Geen geldig gewenst aantal ingegeven");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if(tempminaantal == 0)
						{
							Log.print();
							System.out.println("Geen geldig minimum aantal ingegeven");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if(tempprijs == 0)
						{
							Log.print();
							System.out.println("Geen geldige prijs ingegeven");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if( tempkastid < 10 || tempkastid > 28 || tempkastid == 19)
						{
							Log.print();
							System.out.println("Incorrect kast ID ingegeven.");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						else if(huidigdate.after(houdbaarheidsDatumtemp))
						{
							Log.print();
							System.out.println("Het medicijn is niet meer houdbaar.");
							frame2.setVisible(false);
			                frame2.dispose();
						}
						
						else
						{
							Log.print();
							System.out.println("Incorrecte parameters ingegeven, probeer opnieuw.");
							frame2.setVisible(false);
			                frame2.dispose();
						}
										
						
						
						

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
			
		
		try {
			Voorraadbeheer.controleerOpTeBestellen();
		} catch (ParseException e) {
			
		} catch (OrderException e) {
			e.printStackTrace();
		}
		
	}
		
	}
	
	
	

	
	public JTextArea getTextAreaTerminal() {
		return textAreaTerminal;
	}
	
	public static void updateTabellen(){
		String[] colName = { "Merknaam", "Stofnaam", "Aantal", "GA",
                "MA", "Fabrikant", "Prijs", "Kast ID" ,"Houdbaarheid"};
        JTableHeader thM = tableMed.getTableHeader();
		thM.setFont(new Font("Dialog", Font.BOLD, 12));
		tableMed.setFont(new Font("Arial", Font.PLAIN, 12));

        Object[][] object = new Object[100][100];
        int i = 0;
        if (Voorraadbeheer.medlist.size() != 0) {
            for (i=0;i<Voorraadbeheer.medlist.size();i++) {
                object[i][0] = Voorraadbeheer.medlist.get(i).merknaam;
                object[i][1] = Voorraadbeheer.medlist.get(i).stofnaam;
                object[i][2] = Voorraadbeheer.medlist.get(i).aantal;
                object[i][3] = Voorraadbeheer.medlist.get(i).gewensteAantal;
                object[i][4] = Voorraadbeheer.medlist.get(i).minimumAantal;
                object[i][5] = Voorraadbeheer.medlist.get(i).fabrikant;
                object[i][6] = Voorraadbeheer.medlist.get(i).prijs;
                object[i][7] = Voorraadbeheer.medlist.get(i).kastID;
                object[i][8] = Voorraadbeheer.medlist.get(i).houdbaarheid;
                
                tableMed.setFillsViewportHeight(true);
        		tableMed.setCellSelectionEnabled(false);
        		tableMed.setModel(new DefaultTableModel(object, colName));
        		
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
        		
            }
        }
	}
}



