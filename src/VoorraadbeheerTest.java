/*
 * Test voorraadbeheer met main.
 */
import java.util.*;

public class VoorraadbeheerTest {
	public static void main(String args[]){
		

        ArrayList<Medicijn> medlist = new ArrayList<Medicijn>();
		
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
        
        int medicijnID = 0; //ID mag eigenlijk gewoon weg, maar staat hier om de constructor juist te kunnen aanroepen
		medlist.add(new Medicijn(medicijnID, merknaam, stofnaam, aantal, gewensteAantal, minimaAantal, fabrikant, prijs, kast, houdbaarheid));
        }
        
		for(int i=0; i<medlist.size();i++){
		System.out.println("MEDICIJN NUMMER "+i+"\n"+"size: " + medlist.size() +  "KastID van medicijn "+medlist.get(i) + " :" + medlist.get(i).kastID);
		//Test methode uit Medicijn
		System.out.println("Result van controleerOpAantal method: "+medlist.get(i).controleerOpAantal());
		}
		
		
	}
}
