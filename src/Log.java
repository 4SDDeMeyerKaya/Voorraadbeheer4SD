/*
 * Deze klasse dient als middel om in de Terminal steeds [HH:mm:ss] af te printen.
 * We gebruiken dus enkel "Log.print()"
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Log {

	public static void print(){
		Date d1 = new Date();
		
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("GMT+2")); //Houdt blijkbaar geen rekening met zomertijd.
		System.out.print(" ["+df.format(d1)+"] ");
		GUI.updateMedTabellen(); //Aangezien Log.print() toch overal wordt aangeroepen, hoeven we deze methode niet overal apart in te stoppen.
		Voorraadbeheer.writeToTXT();
		//GUI.updateKasten(); //Kleur van de randen van de kasten updaten.
	}
}

