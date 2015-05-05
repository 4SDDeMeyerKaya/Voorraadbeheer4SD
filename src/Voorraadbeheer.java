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
 * Zie commentaar bij methodes voor details.
 */

import java.awt.EventQueue;
import java.text.ParseException;
import java.util.ArrayList;

public class Voorraadbeheer {

	static ArrayList<Medicijn> medlist = new ArrayList<Medicijn>();
	static ArrayList<Bestelling> beslist = new ArrayList<Bestelling>();
	static int besIndex; //In welk bestellingsobject binnen 'beslist' moet het volgend medicijn komen?
	static Apotheker ap;
	
	public Voorraadbeheer(){

	}
	
	//voegMedicijnToe voegt een nieuw object van Medicijn toe aan de lijst.
	public static void voegMedicijnToe(String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimaAantal, String fabrikant, int prijs, int kast, String houdbaarheid){
		boolean isAanwezig=false;
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam)){
				Log.print();
				System.out.println("Let op! Dit medicijn heeft u al eerder toegevoegd.");
				isAanwezig = true;
				}
		}
		if(isAanwezig==false){
			Voorraadbeheer.medlist.add(new Medicijn(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
			Log.print();
			System.out.println(merknaam + " is toegevoegd als aan 'medlist'.");
		}
			
	}
	
	//verwijderMedicijn zoekt naar overeenkomstige merknamen (in principe één hit max) en verwijdert dit object.
	public void verwijderMedicijn(String merknaam){ 
		boolean gevonden=false;
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).geefMerknaam().equalsIgnoreCase(merknaam))
				Voorraadbeheer.medlist.remove(i);
				gevonden=true;
			}
			if (gevonden==false)
				Log.print();
				System.out.println("Te verwijderen medicijn niet gevonden.");
	}
	
	//voegBestellingToe voegt een nieuw object van Bestelling toe aan de lijst.
	public void voegBestellingToe(){
		Voorraadbeheer.beslist.add(new Bestelling());
	}
	
	/*controleerOpTeBestellen zoekt op hoeveel medicijnen er te bestellen zijn en houdt rekening met het aantal dat reeds
	besteld is en zich in een of ander bestellijst bevindt (dat nog niet is aangekomen).
	*/
	
	public void controleerOpTeBestellen() throws ParseException, OrderException{
		//Controleer al eerst eens of er een geschikt bestellingsobject bestaat om een medicijn in te plaatsen
		//Op deze manier hoeven er geen meerdere bestellingen 'open' te staan.
		if (Voorraadbeheer.controleerOpOpenBestelling()==1337)
				throw new OrderException("Geen open bestellingen gevonden.");
		besIndex= Voorraadbeheer.controleerOpOpenBestelling();
		for(int i=0; i<Voorraadbeheer.medlist.size();i++){
			if (Voorraadbeheer.medlist.get(i).controleerOpBeide()>0){ 			//Controleer of men dit medicijn moet bestellen
																				//Indien ja
				for(int j=0; j<Voorraadbeheer.beslist.size();j++){				
					if(Voorraadbeheer.beslist.get(j).isAangekomen()==false){	//Enkel in niet aangekomen bestellingen zoeken
						
						for(int k=0; k<Voorraadbeheer.beslist.get(j).besmedlist.size();k++){	//in ieder bestelmed. lijst dat tot hier toeaan de
																								//voorwaarden voldoet gaan we de merknamen vergelijken
							if (Voorraadbeheer.beslist.get(j).besmedlist.get(k).geefMerknaam().equalsIgnoreCase(Voorraadbeheer.medlist.get(i).geefMerknaam()))	
									System.out.println(Voorraadbeheer.medlist.get(i).geefMerknaam()+" is reeds aanwezig in een niet aangekomen bestellingslijst.");
							else{ 
								Voorraadbeheer.beslist.get(besIndex).besmedlist.add(new BestelMedicijn(medlist.get(i).merknaam, medlist.get(i).controleerOpBeide(), medlist.get(i).prijs));
								Log.print();
								System.out.println(Voorraadbeheer.medlist.get(i).geefMerknaam()+" is toegevoegd aan een bestelling."+" (Aantal: " +Voorraadbeheer.medlist.get(i).controleerOpBeide()+")");
							}
						}
					}	
				}
			}
		}//PS: Ik durf hiervan geen BIG-O-notatie neerpennen.
	}
	
	

	private static int controleerOpOpenBestelling() {
		int i=1337;
		for(int j=0; j<Voorraadbeheer.beslist.size();j++){
			if (Voorraadbeheer.beslist.get(j).isBesteld()==false)
					i=j;
		}
		return i;
	}

}
