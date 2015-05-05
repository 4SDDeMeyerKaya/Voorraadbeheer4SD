import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;


public class Main {
	public static void main(String args[]){
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash splash = new Splash();
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
