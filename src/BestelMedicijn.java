/*
 * Deze lijst houdt enkel de medicijnen bij die te bestellen zijn.
 * Enkel een beperkt aantal attributen zijn nodig.
 * De objecten blijven maar voor korte duur op een lijst. Ze verdwijnen nadat de Apotheker een aangekomen bestelling
 * wenst te verwijderen. Het heeft verder ook bijzonder weinig nut, behalve voor misschien een esthetische meerwaarde.
 * 
 * Dat is dus ook het geval met objecten van de klasse Bestelling. Eens de apotheker
 * doorgeeft dat de bestelling is geleverd verdwijnt het object van de Bestellingslijst
 */

public class BestelMedicijn {
	
	String merknaam;
	int aantal;
	int prijs;
	
	
	public BestelMedicijn(String merknaam, int aantal, int prijs)
	{
		this.merknaam = merknaam;
		this.aantal = aantal;
		this.prijs = prijs;
	}
	
	public String geefMerknaam(){
		return merknaam;
	}
	
	public void vermeerderAantal(){
		aantal++;
	}
	
	public void verminderAantal(){
		aantal--;
	}
	
}
