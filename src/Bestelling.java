/* Bedenkingen en toevoegingen
 * 
 * bestellingsStatus:
 *  - 1: Nog niet besteld, aanvulbaar
 *  - 2: Besteld
 *  - 3: Ontvangen
 * 
 * Toevoegingen:
 * 	- bestellingsDatum
 *  - 
 */

public class Bestelling {
	
	// Klassevariabele voor het aantal bestellingen geïnstantieerd [bron: 2]
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;
	int bestellingsID;
	int bestellingsStatus=1;
	int[] medicijnID = new int;
	int[] aantal = new int[];
	int[] prijs  = new int[];
	
	// add an instance variable for the object ID
	private int id;
	Medicijn[] medicijnID = new Medicijn[];
	
	
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
