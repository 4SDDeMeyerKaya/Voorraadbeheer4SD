import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class Medicijn {
	
	int medicijnID;
	String merknaam;
	String stofnaam;
	int aantal;
	int gewensteAantal;
	int minimumAantal;
	String fabrikant;
	int prijs;
	int kastID;	
	String houdbaarheid;		//String die de datum voorstelt in het formaat "dd-MM-yyyy' zoals sdf.
	
	
	
	public Medicijn(int medicijnID, String merknaam, String stofnaam, int aantal, int gewensteAantal, int minimumAantal, String fabrikant, int prijs, int kastID, String houdbaarheid)
	{
		this.medicijnID = medicijnID;
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
	
	public boolean controleerOpHoudbaarheid() throws ParseException
	{	
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date huidig = new Date();
		Date houdbaarheidsDatum = sdf.parse(houdbaarheid); //zet String om naar Date om deze de kunnen vergelijken met huidig.
				
		if (huidig.after(houdbaarheidsDatum))
		{
			return false;	//niet meer houdbaar als de huidige datum later is dan de houdbaarheidsdatum
		}
		else 	
		{
			return true;	//in alle andere gevallen wel houdbaar
		}
		
	}
	
	public int geefMedicijnID()
	{
		return medicijnID;
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
