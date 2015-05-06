import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;


public class Main {
	public static void main(String args[]){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					Voorraadbeheer.voegBestellingToe();
					Voorraadbeheer.medlist.add(new Medicijn("A","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("B","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("C","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("D","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("E","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("F","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("G","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("H","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("I","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("J","a",30,60,31,"a",30,12,"06-06-2015"));
					Voorraadbeheer.medlist.add(new Medicijn("K","a",30,60,31,"a",30,12,"06-06-2015"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
		
		
	}
}
