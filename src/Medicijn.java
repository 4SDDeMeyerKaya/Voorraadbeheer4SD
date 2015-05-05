import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class Medicijn {
	
	String merknaam;
	String stofnaam;
	int aantal;
	int gewensteAantal;
	int minimumAantal;
	String fabrikant;
	int prijs;
	int kastID;	
	String houdbaarheid;//String die de datum voorstelt in het formaat "dd-MM-yyyy' zoals sdf.
	
	
	public Medicijn(String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimumAantal, String fabrikant, int prijs, int kastID, String houdbaarheid)
	{
		this.merknaam = merknaam;
		this.stofnaam = stofnaam;
		this.aantal = aantal;
		this.gewensteAantal = gewensteAantal;
		this.minimumAantal = minimumAantal;
		this.fabrikant = fabrikant;
		this.prijs = prijs;
		this.kastID = kastID;
		this.houdbaarheid = houdbaarheid;
	}
	
	public int controleerOpAantal()
	{
		//return 0 als er genoeg zijn, en anders hoeveel er te weinig zijn.
		if (aantal <= minimumAantal)
		{
			return gewensteAantal-aantal;
		}
		
		else
		{
			return 0;
		}
		
	}
	
	public int controleerOpBeide() throws ParseException{
		int hoogste = 0;
		if(controleerOpHoudbaarheid()>controleerOpAantal()) 
			hoogste = controleerOpHoudbaarheid();
		else
			hoogste=controleerOpAantal();
		return hoogste;
	}
	
	public int controleerOpHoudbaarheid() throws ParseException
	{	
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date huidig = new Date();
		Date houdbaarheidsDatum = sdf.parse(houdbaarheid); //zet String om naar Date om deze de kunnen vergelijken met huidig.
				
		if (huidig.after(houdbaarheidsDatum))
		{
			wijzigAantal(0);		//indien niet meer houdbaar, moet het eruit en dient het programma
									//de apotheker hiervan op de hoogte te houden.
			System.out.println("Gelieve alle huidige "+geefMerknaam()+" uit kast "+geefKastID()+" te halen. [Houdb.datum]");
			return gewensteAantal;	//Voorraadbeheer zal het gewensteAantal doorgeven in "besmedlist" om te bestellen.
		}
		else 	
		{
			return 0;	//in alle andere gevallen wel houdbaar
		}
		
	}
	
	
	public String geefMerknaam(){
		return merknaam;
	}
	
	public int geefKastID()
	{
		return kastID;
	}
	
	public void wijzigMerknaam(String merknaam)
	{
		this.merknaam = merknaam;	
	}
	
	public void wijzigStofnaam(String stofnaam)
	{
		this.stofnaam = stofnaam;	
	}
	
	public void wijzigPlaatsBepaling(int kastID)
	{
		this.kastID = kastID;
	}
	
	public void wijzigAantal(int aantal)
	{
		this.aantal = aantal;
	}
	
	public void wijzigGewensteAantal(int aantal)
	{
		gewensteAantal = aantal;
	}
	
	public void wijzigMinimumAantal(int aantal)
	{
		minimumAantal = aantal;
	}
	
	public void wijzigFabrikant(String fabrikant)
	{
		this.fabrikant = fabrikant;
	}
	
	public void wijzigPrijs(int prijs)
	{
		this.prijs = prijs;
	}
	
	public void vermeerderMedicijnAantal(int vermeerder)
	{
		aantal = aantal + vermeerder;
	}
	
}
