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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
}
