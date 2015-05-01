/* Voorraadbeheer maakt alle objecten van Medicijn aan.
 * Note: De aangemaakte medicijn objecten hebben geen naam. Ze worden binnen
 * een arraylist aangemaakt, dus we gebruiken steeds de index om een object van Medicijn
 * te benaderen.
 * Het geeft wel vele voordelen zoals bijvoorbeeld iteratief een lijst van objecten
 * te doorlopen.
 * 
 * Voorraadbeheer houdt ook een lijst van bestellingen bij. De lijst met te bestellen medicijnen wordt
 * voor ieder nieuw object van Bestelling aangemaakt. Dit maakt het eenvoudiger om de medicijnen te men
 * bestelt te groeperen en bewerkingen op uit te voeren.
 * 
 * Zie commentaar bij methodes voor details daarvan.
 */

import java.text.ParseException;
import java.util.ArrayList;

public class Voorraadbeheer {

	static ArrayList<Medicijn> medlist = new ArrayList<Medicijn>();
	static ArrayList<Bestelling> beslist = new ArrayList<Bestelling>();
	
	public Voorraadbeheer(){

	}
	
	//voegMedicijnToe voegt een nieuw object van Medicijn toe aan de lijst.
	public void voegMedicijnToe(String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimaAantal, String fabrikant, int prijs, int kast, String houdbaarheid){
		boolean isAanwezig=false;
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam)){
				System.out.println("Let op! Dit medicijn heeft u al eerder toegevoegd.");
				isAanwezig = true;
				}
		}
		if(isAanwezig==false)
			Voorraadbeheer.medlist.add(new Medicijn(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
	}
	
	//verwijderMedicijn zoekt naar overeenkomstige merknamen (in principe één hit max) en verwijdert dit object.
	public void verwijderMedicijn(String merknaam){ 
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam))
				Voorraadbeheer.medlist.remove(i);
			}
	}
	
	//voegBestellijstToe voegt een nieuw object van Bestelling toe aan de lijst.
	public void voegBestellingToe(){
		Voorraadbeheer.beslist.add(new Bestelling());
	}
	
	/*controleerOpTeBestellen zoekt op hoeveel medicijnen er te bestellen zijn en houdt rekening met het aantal dat reeds
	besteld is en zich in een of ander bestellijst bevindt (dat nog niet is aangekomen).
	*/
	
	public void controleerOpTeBestellen() throws ParseException{
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).controleerOpBeide()>0){ 			//Controleer of men dit medicijn moet bestellen
																				//Indien ja
				for(int j=0; j<Voorraadbeheer.beslist.size();j++){				
					if(Voorraadbeheer.beslist.get(j).isAangekomen()==false){	//Enkel in niet aangekomen bestellingen zoeken
						
						for(int k=0; k<Voorraadbeheer.beslist.get(j).besmedlist.size();k++){	//in ieder bestelmed. lijst
							//VERGELIJK NAAM!
							if (Voorraadbeheer.beslist.get(j).besmedlist.get(k).geefMerknaam().equalsIgnoreCase(Voorraadbeheer.medlist.get(i).geefMerknaam()))	
									System.out.println(Voorraadbeheer.medlist.get(i).geefMerknaam()+" is reeds aanwezig in een niet aangekomen bestellingslijst.");
							else
								//<< HIER VOLGT >>
								//VOEG TOE AAN EEN BESTELLING! Het dient nog besteld te worden EN is niet reeds aanwezig.
								//MAAK EEN EXCEPTION KLASSE AAN OM HET GEVAL WAARBIJ GEEN BESCHIKBARE BESTELLING AANWEZIG IS
								//OP TE VANGEN.
								//VOEG TRY-CATCH TOE
								;
							
						}
					}
				}
			}
		}//PS: Ik durf hiervan geen BIG-O-notatie neerpennen.
	}
	
	
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
