import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;


public class Main {
	public static void main(String args[]){
		final Voorraadbeheer vb = new Voorraadbeheer(); 
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					Voorraadbeheer.voegBestellingToe();
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Supradyne", 10, 20);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 9001, 9001);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 11, 21);
					Voorraadbeheer.verwijderMedicijn("probeer");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
}
