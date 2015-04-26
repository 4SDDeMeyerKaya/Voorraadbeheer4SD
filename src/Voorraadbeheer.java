/* Voorraadbeheer maakt alle objecten van Medicijn aan.
 * Note: De aangemaakte medicijn objecten hebben geen naam. Ze worden binnen
 * een arraylist aangemaakt, dus we gebruiken steeds de index om een object van Medicijn
 * te benaderen.
 * Het geeft wel vele voordelen zoals bijvoorbeeld iteratief een lijst van objecten
 * te doorlopen.
 */
import java.util.*;

public class Voorraadbeheer {

	ArrayList<Medicijn> medlist = new ArrayList<Medicijn>();
	ArrayList<Bestelling> beslist = new ArrayList<Bestelling>();
	ArrayList<BestelMedicijn> besmedlist = new ArrayList<BestelMedicijn>();
	
	public Voorraadbeheer(){

	}
	
	
	//voegMedicijnToe voegt een nieuw object van Medicijn toe aan de lijst.
	public void voegMedicijnToe(String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimaAantal, String fabrikant, int prijs, int kast, String houdbaarheid){
		this.medlist.add(new Medicijn(merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
	}
	
	//verwijderMedicijn zoekt naar overeenkomstige merknamen (in principe één hit max) en verwijdert dit object.
	public void verwijderMedicijn(String merknaam){ 
		for(int i=0; i<this.medlist.size();i++){
			if (this.medlist.get(i).merknaam.equalsIgnoreCase(merknaam))
				this.medlist.remove(i);
			}
	}
	
	//voegBestellijstToe voegt een nieuw object van Bestelling toe aan de lijst.
	public void voegBestellingToe(){
		this.beslist.add(new Bestelling());
	}
	
	
	
	public static void main(String args[]){
		
		Voorraadbeheer vb = new Voorraadbeheer(); 
		
/*
		Scanner input = new Scanner(System.in);
        System.out.println("HOEVEEL MEDICIJNEN WIL JE TOEVOEGEN?? (Test met 2+): ");
        int testAantal = input.nextInt();
		
        
        for(int k=0;k<testAantal;k++){
        	
        	System.out.println("merknaam: ");
        	String merknaam = input.nextLine();
        	System.out.println("stofnaam: ");
        	String stofnaam = input.nextLine();
        	System.out.println("fabrikant: ");
        	String fabrikant = input.nextLine();
        	System.out.println("houdbaarheid: ");
        	String houdbaarheid = input.nextLine();
        	System.out.println("aantal: ");
        	int aantal = input.nextInt();
        	System.out.println("gewenste aantal: ");
        	int gewensteAantal = input.nextInt();
        	System.out.println("minima aantal: ");
        	int minimaAantal = input.nextInt();
        	System.out.println("prijs: ");
        	int prijs = input.nextInt();
        	System.out.println("kast: ");
        	int kast = input.nextInt();
	}
*/
		
}
}
