import java.awt.EventQueue;


public class Main {
	public static void main(String args[]){
		Voorraadbeheer vb = new Voorraadbeheer(); 
		vb.voegBestellingToe();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Supradyne", 10, 20);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 1337, 1337);
					Voorraadbeheer.beslist.get(0).voegMedicijnToe("Aspirine", 11, 21);
					System.out.println("Bestelling ontvangen?: "+Voorraadbeheer.beslist.get(0).isBesteld());
					System.out.println("merknaam: " + Voorraadbeheer.beslist.get(0).besmedlist.get(0).merknaam  +" aantal: "+ Voorraadbeheer.beslist.get(0).besmedlist.get(0).aantal +" prijs: "+ Voorraadbeheer.beslist.get(0).besmedlist.get(0).prijs);
					System.out.println("merknaam: " + Voorraadbeheer.beslist.get(0).besmedlist.get(1).merknaam  +" aantal: "+ Voorraadbeheer.beslist.get(0).besmedlist.get(1).aantal +" prijs: "+ Voorraadbeheer.beslist.get(0).besmedlist.get(1).prijs);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
}
