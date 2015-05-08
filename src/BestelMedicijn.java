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
	public int bestelIndex;
	
	
	public BestelMedicijn(int bestelIndex, String merknaam, int aantal, int prijs)
	{
		this.bestelIndex=bestelIndex;
		this.merknaam = merknaam;
		this.aantal = aantal;
		this.prijs = prijs;
	}
	
	public int geefIndex(){
		return bestelIndex;
	}
	
	public String geefMerknaam(){
		return merknaam;
	}

	public void wijzigAantal(int aantal)
	{
		this.aantal = aantal;
	}
	
	public void vermeerderAantal(){
		aantal++;
	}
	
	public void verminderAantal(){
		aantal--;
	}
	
}
