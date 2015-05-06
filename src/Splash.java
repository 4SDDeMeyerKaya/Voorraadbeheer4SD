import java.awt.Color;
import java.io.FileNotFoundException;

import com.thehowtotutorial.splashscreen.*;

public class Splash {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		try {
			JSplash splash = new JSplash(Main.class.getResource("pharmacy.jpg"), true, true, false, null, null, Color.RED, Color.BLACK);						
			splash.splashOn();	
			
			//Loading Animashun
//			splash.setProgress(00,"Loading");
//			Thread.sleep(250);
//			splash.setProgress(05,"Loading.");
//			Thread.sleep(250);
//			splash.setProgress(10,"Loading..");
//			Thread.sleep(250);
//			splash.setProgress(15,"Loading...");
//			Thread.sleep(250);
//			splash.setProgress(20,"Loading");
//			Thread.sleep(250);
//			splash.setProgress(25,"Loading.");
//			Thread.sleep(250);
//			splash.setProgress(30,"Loading..");
//			Thread.sleep(250);
//			splash.setProgress(35,"Loading...");
//			Thread.sleep(250);
//			splash.setProgress(40,"Loading");
//			Thread.sleep(250);
//			splash.setProgress(45,"Loading.");
//			Thread.sleep(250);
//			splash.setProgress(50,"Loading..");
//			Thread.sleep(250);
//			splash.setProgress(55,"Loading...");
//			Thread.sleep(250);
//			splash.setProgress(60,"Loading");
//			Thread.sleep(250);
//			splash.setProgress(65,"Loading.");
//			Thread.sleep(250);
//			splash.setProgress(70,"Loading..");
//			Thread.sleep(250);
//			splash.setProgress(75,"Loading...");
//			Thread.sleep(250);
//			splash.setProgress(80,"Loading");
//			Thread.sleep(250);
//			splash.setProgress(85,"Loading.");
//			Thread.sleep(250);
//			splash.setProgress(90,"Loading..");
//			Thread.sleep(250);
//			splash.setProgress(95,"Loading...");
//			Thread.sleep(250);
//			splash.setProgress(100,"COMPLETE");
//			Thread.sleep(500);
			
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
			splash.setProgress(70,"Initialising magic");
			Thread.sleep(500);
			splash.setProgress(80,"Initialising the matrix");
			Thread.sleep(500);
			splash.setProgress(90,"Initialising main window");
			Thread.sleep(500);
			splash.setProgress(100,"COMPLETE");
			Thread.sleep(800);
		
			splash.setProgress(100,"COMPLETE");
			Thread.sleep(500);
			splash.splashOff();			
			GUI window = new GUI();
			window.frame.setVisible(true);			
			Voorraadbeheer.voegBestellingToe();
			Voorraadbeheer.importMedicijnen();
			Thread.sleep(50);
			GUI.updateTabellen();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
