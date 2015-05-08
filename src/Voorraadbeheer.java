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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
			if (Voorraadbeheer.medlist.get(i).merknaam.equalsIgnoreCase(merknaam)){
				Log.print();
				System.out.println(merknaam+ " bestaat al en is niet toegevoegd.");
				isAanwezig = true;
				}
		}
		if(isAanwezig==false){
			Voorraadbeheer.medlist.add(new Medicijn(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
			Log.print();
			System.out.println(merknaam + " is toegevoegd aan 'medlist'.");
		}
			
	}
	
	//verwijderMedicijn zoekt naar overeenkomstige merknamen (in principe één hit max) en verwijdert dit object.
	public static void verwijderMedicijn(String merknaam){ 
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
	public static void voegBestellingToe(){
		Voorraadbeheer.beslist.add(new Bestelling());
		Log.print();
		System.out.println("Nieuw open bestelling toegevoegd.");
	}
	
	/*controleerOpTeBestellen zoekt op hoeveel medicijnen er te bestellen zijn en houdt rekening met het aantal dat reeds
	besteld is en zich in een of ander bestellijst bevindt (dat nog niet is aangekomen).
	*/
	
	public static void controleerOpTeBestellen() throws ParseException, OrderException{
		//Controleer al eerst eens of er een geschikt bestellingsobject bestaat om een medicijn in te plaatsen
		//Op deze manier hoeven er geen meerdere bestellingen 'open' te staan.
		if (Voorraadbeheer.controleerOpOpenBestelling()==1337){ //1337 is een arbitrair gekozen nummer. Int is nodig om de juiste bestellingslijstindex door te geven.
				Log.print();
				throw new OrderException("Geen open bestelling beschikbaar.");
		}
		besIndex= Voorraadbeheer.controleerOpOpenBestelling();
		boolean ietsTeBestellen=false;
		int controle=0;
		int i;
		for(i=0; i<Voorraadbeheer.medlist.size();i++){
			controle=Voorraadbeheer.medlist.get(i).controleerOpBeide();
			if(controle>0){
							//we voegen medicijn toe indien attributen het toestaan. Verdere controle in methodes.
				if(medlist.get(i).alGewaarschuwd==false && medlist.get(i).besteld==false){
				ietsTeBestellen=true;
				Voorraadbeheer.beslist.get(besIndex).voegMedicijnToe(besIndex, medlist.get(i).geefMerknaam(), controle, medlist.get(i).prijs);
				medlist.get(i).besteld=true;
				medlist.get(i).alGewaarschuwd=true;
				}
			}
			
		}
		if (ietsTeBestellen==false){
			Log.print();
			System.out.println("Er zijn geen nieuwe bestellingsitems toegevoegd.");
		}	
	}

	public static int controleerOpOpenBestelling() {
		int i=1337;
		for(int j=0; j<Voorraadbeheer.beslist.size();j++){
			if (Voorraadbeheer.beslist.get(j).isBesteld()!=true && Voorraadbeheer.beslist.get(j).isBesteld()!=true)
				i=j;
		}

		return i;
	}
	
	public static void importMedicijnen() throws FileNotFoundException{
		String filename = "medicijnen.txt";

        // Prepare to read from the file, using a Scanner object
        File file = new File(filename);
        Scanner in = new Scanner(file);

	        while (in.hasNextLine())
	        {
	            //1 Person per line
	            String line = in.nextLine();

	            // Make a Scanner object to break up this line into parts
	            Scanner lineBreaker = new Scanner(line);

	            try{
	            	String merknaam = lineBreaker.next();
	            	String stofnaam = lineBreaker.next();
	            	int aantal = lineBreaker.nextInt();
	            	int gewensteAantal = lineBreaker.nextInt();
	            	int minimaAantal = lineBreaker.nextInt();
	            	String fabrikant = lineBreaker.next();
	            	int prijs = lineBreaker.nextInt();
	            	int kast = lineBreaker.nextInt();
	            	String houdbaarheid = lineBreaker.next();
	            	lineBreaker.close();
	            	Voorraadbeheer.voegMedicijnToe(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid);
	            	
	            	
	            }

	            catch (InputMismatchException e){
	                System.out.println("Onjuiste parametertype in medicijnen.txt");
	            }

	            catch (NoSuchElementException e){
	                System.out.println("File not found2");

	            }

	        }
	        in.close();
	}
	
	public static void writeToTXT(){
		String filename= "medicijnen.txt";
		try{
			PrintWriter outputStream = new PrintWriter(filename);
			for (int i =0;i<medlist.size();i++){
				outputStream.print(medlist.get(i).merknaam+" ");
				outputStream.print(medlist.get(i).stofnaam+" ");
				outputStream.print(medlist.get(i).aantal+" ");
				outputStream.print(medlist.get(i).gewensteAantal+" ");
				outputStream.print(medlist.get(i).minimumAantal+" ");
				outputStream.print(medlist.get(i).fabrikant+" ");
				outputStream.print(medlist.get(i).prijs+" ");
				outputStream.print(medlist.get(i).kastID+" ");
				outputStream.println(medlist.get(i).houdbaarheid);

			}
			outputStream.close();
		}catch (FileNotFoundException e){
			
		}

	}

}
