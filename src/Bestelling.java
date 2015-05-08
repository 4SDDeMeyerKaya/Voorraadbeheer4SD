/* 
 * Bestelling onderhoudt een lijst met objecten van BestelMedicijn. Een lijst met objecten van Bestelling wordt
 * hogerop door Voorraadbeheer onderhouden.
 * Op deze manier vermijden we een te complexe structuur binnenin de verschillende klassen.
 */
import java.text.ParseException;
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
	public void voegMedicijnToe(int bestelIndex, String merknaam, int aantal, int prijs, int besIndex){
		boolean isAanwezig=false;
		for(int i=0; i<besmedlist.size();i++){
			if (besmedlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam)){
				Log.print();
				System.out.println(merknaam + " is reeds besteld.");
				isAanwezig = true;
				}	
		}
		if(isAanwezig==false){
			Voorraadbeheer.beslist.get(besIndex).besmedlist.add(new BestelMedicijn(bestelIndex, merknaam, aantal, prijs));
			Log.print();
			System.out.println(merknaam + " is besteld. (Aantal: "+aantal+")");
			}
	}
	
	public String getStatus(){
		if (isBesteld()==false && isAangekomen()==false){
			return "Nog niet bevestigd";
		}
		else{
			if(isBesteld()==true){
				return "Besteld";
			}
			else
				return "Aangekomen";
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

	public void setAangekomen(boolean isAangekomen) throws ParseException {
		this.isAangekomen = isAangekomen;
		this.isBesteld=false;
		if (isAangekomen==true){
			for(int i=0; i<besmedlist.size();i++){
				for(int j=0; j<Voorraadbeheer.medlist.size();j++){
					if(besmedlist.get(i).merknaam.equalsIgnoreCase(Voorraadbeheer.medlist.get(j).merknaam)){
						if(Voorraadbeheer.medlist.get(j).gewensteAantal==besmedlist.get(i).aantal){
							Voorraadbeheer.medlist.get(j).houdbaarheid="08-05-2016";
						}
						Voorraadbeheer.medlist.get(j).aantal+=besmedlist.get(i).aantal;						
						Voorraadbeheer.medlist.get(j).alGewaarschuwd=false;
						Voorraadbeheer.medlist.get(j).besteld=false;
						Log.print();
                        System.out.println(Voorraadbeheer.medlist.get(j).merknaam+" is bijgevuld. +("+besmedlist.get(i).aantal+")" );
						
					}
				}
			}
			
		}
	}
}
