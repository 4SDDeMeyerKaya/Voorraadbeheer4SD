import java.awt.Color;

import com.thehowtotutorial.splashscreen.*;

public class Splash {

	public static void main(String[] args) {
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
