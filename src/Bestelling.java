/* Bestelling
 */

public class Bestelling {
	
	// Klassevariabele voor het aantal bestellingen geïnstantieerd [bron: 2]
	// refereren hiernaar gebeurt met de klassenaam als referentie: Bestelling.aantalBestellingen
    private static int aantalBestellingen = 0; //aantal objecten 
	private int bestellingsStatus=1;
	private int[] medicijnID;
	private int[] aantalTeBestellen; //aantal medicijnen van één soort in bestelling
	private int bestelAantal; //aantal medicijnen van verschillende soort in bestelling
	private int[] prijs;
	private String[] medicijnNaam;
	
	// add an instance variable for the object ID
	private int id;
	Medicijn[] medicijnID = new Medicijn[];
	
	public Bestelling(){
        id = ++aantalBestellingen;
        bestellingsStatus=1;
        bestelAantal=0;
    }
	
	public void voegBestellingsitemToe(int[] nieuwMedicijnID, int[] nieuwAantalTeBestellen, int[] nieuwPrijs, String[] medicijnNaam){
		bestelAantal=bestelAantal+1;
		medicijnID[bestelAantal]=nieuwMedicijnID;
		aantalTeBestellen[bestelAaantal]=nieuwAantalTeBestellen;
		prijs[bestelAantal]=nieuwPrijs;
		
	}
	
	public static void maakBestelling()
	{
		if(bestellingsStatus==1)
			bestellingsStatus=2;
		if(bestellingsStatus==2)
			System.out.println("Bestelling is reeds gemaakt.");
		if(bestellingsStatus==3)
			System.out.println("Bestelling is al bevestigd.")
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
	
	// new method to return the ID instance variable
    public int getID() {
        return id;
    }
}
