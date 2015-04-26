/* 
 * Bestelling onderhoudt een lijst met objecten van BestelMedicijn. Een lijst met objecten van Bestelling wordt
 * hogerop door Voorraadbeheer onderhouden.
 * Op deze manier vermijden we een te complexe structuur binnenin de verschillende klassen.
 */
import java.util.ArrayList;

public class Bestelling {
	
	ArrayList<BestelMedicijn> besmedlist = new ArrayList<BestelMedicijn>();
	private boolean isBesteld;
	private boolean isAangekomen;
	
	public Bestelling(){
		isBesteld=false;
		isAangekomen=false;
    }
	
	//voegMedicijnToe voegt een nieuw object van BestelMedicijn toe aan de lijst.
	public void voegMedicijnToe(String merknaam, int aantal, int prijs){
		boolean isAanwezig=false;
		for(int i=0; i<besmedlist.size();i++){
			if (besmedlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam)){
				System.out.println("Let op! Dit medicijn bevindt zich al in dit bestellingslijst.");
				isAanwezig = true;
				}	
		}
		if(isAanwezig==false)
			besmedlist.add(new BestelMedicijn(merknaam, aantal, prijs));
	}
	
	
	public boolean isBesteld() {
		return isBesteld;
	}

	public void setBesteld(boolean isBesteld) {
		this.isBesteld = isBesteld;
	}

	public boolean isAangekomen() {
		return isAangekomen;
	}

	public void setAangekomen(boolean isAangekomen) {
		this.isAangekomen = isAangekomen;
	}
}
