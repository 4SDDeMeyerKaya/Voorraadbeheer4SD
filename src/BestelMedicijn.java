/*
 * Deze lijst houdt enkel de medicijnen bij die te bestellen zijn.
 * Enkel een beperkt aantal attributen zijn nodig.
 * De objecten blijven maar voor korte duur op deze lijst. Ze verdwijnen na levering van de 
 * bestelling.
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
		this.prijs = prijs;
		this.prijs = prijs;
	}
	
	
	public void vermeerderAantal(){
		aantal++;
	}
	
	public void verminderAantal(){
		aantal--;
	}
	
}
