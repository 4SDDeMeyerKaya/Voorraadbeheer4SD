/* Voorraadbeheer maakt alle objecten van Medicijn aan.
 * Note: De aangemaakte medicijn objecten hebben geen naam. Ze worden binnen
 * een arraylist aangemaakt, dus we gebruiken steeds de index om een object van Medicijn
 * te benaderen.
 * Het geeft wel vele voordelen zoals bijvoorbeeld iteratief een lijst van objecten
 * te doorlopen.
 */
import java.util.ArrayList;

public class Voorraadbeheer {

	static ArrayList<Medicijn> medlist = new ArrayList<Medicijn>();
	static ArrayList<Bestelling> beslist = new ArrayList<Bestelling>();
	
	public Voorraadbeheer(){

	}
	
	//voegMedicijnToe voegt een nieuw object van Medicijn toe aan de lijst.
	public void voegMedicijnToe(String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimaAantal, String fabrikant, int prijs, int kast, String houdbaarheid){
		if (medlist.contains(merknaam))
			System.out.println("Let op! Dit medicijn heeft u al eerder toegevoegd.");
		else
			Voorraadbeheer.medlist.add(new Medicijn(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
	}
	
	//verwijderMedicijn zoekt naar overeenkomstige merknamen (in principe één hit max) en verwijdert dit object.
	public void verwijderMedicijn(String merknaam){ 
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).merknaam.equalsIgnoreCase(merknaam))
				Voorraadbeheer.medlist.remove(i);
			}
	}
	
	//voegBestellijstToe voegt een nieuw object van Bestelling toe aan de lijst.
	public void voegBestellingToe(){
		Voorraadbeheer.beslist.add(new Bestelling());
	}
	
	//voegBestelMed
	
	
	
	public static void main(String args[]){
		
		Voorraadbeheer vb = new Voorraadbeheer(); 
		vb.voegBestellingToe();
		beslist.get(0).voegMedicijnToe("Supradyne", 10, 20);
		beslist.get(0).voegMedicijnToe("Aspirine", 11, 21);
		System.out.println("Bestelling ontvangen?: "+beslist.get(0).isBesteld());
		System.out.println("merknaam: " + beslist.get(0).besmedlist.get(0).merknaam  +" aantal: "+ beslist.get(0).besmedlist.get(0).aantal +" prijs: "+ beslist.get(0).besmedlist.get(0).prijs);
		System.out.println("merknaam: " + beslist.get(0).besmedlist.get(1).merknaam  +" aantal: "+ beslist.get(0).besmedlist.get(1).aantal +" prijs: "+ beslist.get(0).besmedlist.get(1).prijs);
		
	}
}
