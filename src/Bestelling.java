/* Bestelling
 * 
 */

public class Bestelling {
	
	// Klassevariabele voor het aantal bestellingen geïnstantieerd [bron: 2]
	// refereren hiernaar gebeurt met de klassenaam als referentie: Bestelling.aantalBestellingen
    private static int aantalBestellingen = 0;
	int bestellingsID;
	int bestellingsStatus=1;
	int[] medicijnID;
	int[] aantal;
	int[] prijs;
	String[] medicijnNaam;
	// add an instance variable for the object ID
	private int id;
	Medicijn[] medicijnID = new Medicijn[];
	
	public Bestelling(int bestellingsID, int , int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }
	public static void maakBestelling()
	{
		
	}

	public static void bevestigBestelling()
	{
		if(bestellingsStatus==2)
			bestellingsStatus=3;
		if(bestellingsStatus==1)
			System.out.println("Bestelling is nog niet besteld. Gelieve uw bestellingen pas na ontvangst te bevestigen.");
		if(bestellingsStatus==3)
			System.out.println("Bestelling is al bevestigd.")
	}
	
	public static void vermeerderMedicijnAantal(medicijnID*[]: Medicijn)
	{
		
	}
	
	public static void bestellingLogWrite(logLines: String*[])
	{
		
	}
	
	public static void controleerOpAantal(bestellingsID, medicijnID*[]: Medicijn)
	{
		
	}
}
