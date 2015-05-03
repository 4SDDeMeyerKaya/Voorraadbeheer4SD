import java.awt.EventQueue;


public class Main {
	public static void main(String args[]){
		final Voorraadbeheer vb = new Voorraadbeheer(); 
		
		vb.voegBestellingToe();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Supradyne", 10, 20);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 9001, 9001);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 11, 21);
					vb.verwijderMedicijn("probeer");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
}
