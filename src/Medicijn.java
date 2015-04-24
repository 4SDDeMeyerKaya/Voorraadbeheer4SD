//wijzigPlaatsBepaling nog afwerken
import java.util.Date;

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
	static String houdbaarheid;		//String die de datum voorstelt in het formaat "dd-MM-yyyy' zoals sdf.
	
	
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
	
	public static void voegMedicijnToe()
	{
		Medicijn nieuwMedicijn = new Medicijn();
	}
	

	public static int controleerOpAantal()
	{
		//return 0 als er genoeg zijn, en anders hoeveel er te weinig zijn.
		if (aantal =< minimumAantal)
		{
			return gewensteAantal-aantal;
		}
		
		else
		{
			return 0;
		}
		
	}
	
	public static boolean controleerOpHoudbaarheid()
	{
		Date huidig = new Date();
		SimpleDateFormat sdf = new SimpledateFormat("dd-MM-yyyy");
		Date houdbaarheidsDatum = sdf.format(houdbaarheid);
		Date huidigD = sdf.format(huidig)
		
		if (huidigD.after(houdbaarheidsDatum))
		{
			return false;	//niet meer houdbaar als de huidige datum later is dan de houdbaarheidsdatum
		}
		else 	
		{
			return true;	//in alle andere gevallen wel houdbaar
		}
		
	}
	
	public static void wijzigMerknaam(String merknaam)
	{
		this.merknaam = merknaam;	
	}
	
	public static void wijzigStofnaam(String stofnaam)
	{
		this.stofnaam = stofnaam;	
	}
	
	public static void wijzigPlaatsBepaling(int kastID)
	{
		this.kastID = kastID;
	}
	
	public static void wijzigAantal(int aantal)
	{
		this.aantal = aantal;
	}
	
	public static void wijzigGewensteAantal(int aantal)
	{
		gewensteAantal = aantal;
	}
	
	public static void wijzigMinimumAantal(int aantal)
	{
		minimumAantal = aantal;
	}
	
	public static void wijzigFabrikant(String fabrikant)
	{
		this.fabrikant = fabrikant;
	}
	
	public static void wijzigPrijs(int prijs)
	{
		this.prijs = prijs
	}
	
	public static void vermeerderMedicijnAantal(int vermeerder)
	{
		aantal = aantal + vermeerder;
	}
	
}
