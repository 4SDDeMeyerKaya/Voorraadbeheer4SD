/* 
 * Bestelling onderhoudt een lijst met objecten van BestelMedicijn. Een lijst met objecten van Bestelling wordt
 * hogerop door Voorraadbeheer onderhouden.
 * Op deze manier vermijden we een te complexe structuur binnenin de verschillende klassen.
 */
import java.util.ArrayList;

public class Bestelling {
	
	ArrayList<BestelMedicijn> besmedlist = new ArrayList<BestelMedicijn>();
	private boolean isBesteld;
	
	public Bestelling(){
		isBesteld=false;
    }
	
	//voegMedicijnToe voegt een nieuw object van BestelMedicijn toe aan de lijst.
	public void voegMedicijnToe(String merknaam, int aantal, int prijs){
		if (besmedlist.contains(merknaam))
			System.out.println("Let op! Dit medicijn heeft u al eerder toegevoegd.");
		else
			this.besmedlist.add(new BestelMedicijn(merknaam, aantal, prijs));
	}
	

	public boolean isBesteld() {
		return isBesteld;
	}

	public void setBesteld(boolean isBesteld) {
		this.isBesteld = isBesteld;
	}
}
