/* Bestelling
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bestelling {
	
	// Klassevariabele voor het aantal bestellingen geinstantieerd [bron: 2]
	// refereren hiernaar gebeurt met de klassenaam als referentie: Bestelling.aantalBestellingen
	
    private static int aantalBestellingen = 0; 	//aantal objecten 
	private int bestellingsStatus=1;
	private int[] aantalTeBestellen; 			//aantal te bestellen van een item
	private int itemNummer; 					//nummer van het item binnen een bestellingsObject
	private int[] prijs;
	private Medicijn medicijnNaam;
	private int id;
	static Scanner reader = new Scanner(System.in);
	
	
	public Bestelling(){
        bestellingsStatus=1;
        itemNummer=0;
        //test change
    }
	
	public void voegItemToe(){
		itemNummer=itemNummer+1;
		aantalTeBestellen[itemNummer]=nieuwAantalTeBestellen;
		prijs[itemNummer]=nieuwPrijs;
		
	}
	
	public void bestelBestelling()
	{
		if(bestellingsStatus==1)
			bestellingsStatus=2;
		if(bestellingsStatus==2)
			System.out.println("Bestelling is reeds gemaakt.");
		if(bestellingsStatus==3)
			System.out.println("Bestelling is al bevestigd.");
	}

	public void bevestigBestelling()
	{
		if(bestellingsStatus==2)
			bestellingsStatus=3;
		if(bestellingsStatus==1)
			System.out.println("Bestelling is nog niet besteld. Gelieve uw bestellingen pas na ontvangst te bevestigen.");
		if(bestellingsStatus==3)
			System.out.println("Bestelling is al bevestigd.");
	}
	
	public static void vermeerderMedicijnAantal(Medicijn medicijnID)
	{
		
	}
	
	public static void bestellingLogWrite(String logLines)
	{
		
	}
	
	public static void controleerOpAantal(Medicijn BestellingsID)
	{
		
	}
	
	// new method to return the ID instance variable
    public int getID() {
        return id;
    }
}
