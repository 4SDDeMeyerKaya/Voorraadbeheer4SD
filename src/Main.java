import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;


public class Main {
	public static void main(String args[]){

		Voorraadbeheer.voegBestellingToe();
		Voorraadbeheer.medlist.add(new Medicijn("a","a",30,60,31,"a",30,12,"06-06-2015"));
		
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
}
