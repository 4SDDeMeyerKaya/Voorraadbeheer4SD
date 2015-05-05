import java.awt.Color;

import com.thehowtotutorial.splashscreen.*;

public class Splash {

	public Splash() {
		// TODO Auto-generated method stub
		
		try {
			JSplash splash = new JSplash(Splash.class.getResource("pharmacy.jpg"), true, true, false, "V1", null, Color.RED, Color.BLACK);
			splash.splashOn();
			splash.setProgress(20,"idk");
			Thread.sleep(1000);
			splash.setProgress(40,"idk2");
			Thread.sleep(1000);
			splash.setProgress(60,"idk3");
			Thread.sleep(1000);
			splash.setProgress(80,"idk4");
			Thread.sleep(1000);
			splash.splashOff();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
