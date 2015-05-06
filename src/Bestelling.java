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
	public void voegMedicijnToe(int bestelIndex, String merknaam, int aantal, int prijs){
		boolean isAanwezig=false;
		for(int i=0; i<besmedlist.size();i++){
			if (besmedlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam)){
				Log.print();
				System.out.println(merknaam + " is reeds besteld.");
				isAanwezig = true;
				}	
		}
		if(isAanwezig==false){
			besmedlist.add(new BestelMedicijn(bestelIndex, merknaam, aantal, prijs));
			Log.print();
			System.out.println(merknaam + " is besteld. (Aantal: "+aantal+")");
			}
	}
	
	public String getStatus(){
		if (isBesteld()==false){
			return "Nog niet besteld";
		}
		else{
			if(isAangekomen()==false){
				return "Besteld";
			}
			else
				return "Reeds aangekomen";
		}
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
		if (isAangekomen==true){
			for(int i=0; i<besmedlist.size();i++){
				for(int j=0; j<Voorraadbeheer.medlist.size();j++){
					if(besmedlist.get(i).merknaam.equalsIgnoreCase(Voorraadbeheer.medlist.get(j).geefMerknaam())){
						Voorraadbeheer.medlist.get(j).alGewaarschuwd=false;
						Voorraadbeheer.medlist.get(j).besteld=false;
					}
				}
			}
		}
	}
}
