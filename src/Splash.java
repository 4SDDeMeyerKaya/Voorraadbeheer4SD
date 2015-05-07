import java.awt.Color;
import java.io.FileNotFoundException;

import com.thehowtotutorial.splashscreen.*;

public class Splash {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		try {
			JSplash splash = new JSplash(Splash.class.getResource("pharmacy.jpg"), true, true, false, null, null, Color.RED, Color.BLACK);						
			splash.splashOn();				
			//random text
			splash.setProgress(0,"Initialising Window");
			Thread.sleep(500);
			splash.setProgress(10,"Initialising Buttons");
			Thread.sleep(500);
			splash.setProgress(20,"Initialising Log");
			Thread.sleep(500);
			splash.setProgress(30,"Initialising Tabs");
			Thread.sleep(500);
			splash.setProgress(40,"Initialising Medicins");
			Thread.sleep(500);
			splash.setProgress(50,"Initialising text file");
			Thread.sleep(500);
			splash.setProgress(60,"Initialising initialisation");
			Thread.sleep(500);
			splash.setProgress(70,"Initialising the matrix");
			Thread.sleep(500);
			splash.setProgress(80,"Initialising red pill");
			Thread.sleep(500);
			splash.setProgress(90,"Initialising blue pill");
			Thread.sleep(500);
			splash.setProgress(100,"COMPLETE");
			Thread.sleep(800);
			splash.splashOff();			
			GUI window = new GUI();
			GUI.frame.setVisible(true);	
			Voorraadbeheer.importMedicijnen();		
			Voorraadbeheer.voegBestellingToe();
			Thread.sleep(50);
			GUI.updateMedTabellen();
			GUI.updateBesTabellen();
			GUI.updateKasten();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
