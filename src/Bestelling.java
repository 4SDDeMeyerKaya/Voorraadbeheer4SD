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
	
	int bestellingsID;
	int bestellingsStatus=1;
	int[] medicijnID = new int;
	int[] aantal = new int[];
	int[] prijs  = new int[];
	Medicijn[] medicijnID = new Medicijn[];
	
	
	public static void maakBestelling()
	{
		
	}

	public static void bevestigBestelling()
	{
		if(bestellingsStatus==2)
			bestellingsStatus=3;
		else
			System.out.println("Bestelling is nog niet besteld. Gelieve uw bestellingen pas na ontvangst te bevestigen.");

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
