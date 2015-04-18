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
	String houdbaarheid;		//String die de datum voorstelt in het formaat "dd-MM-yyyy' zoals sdf.
	

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
	
	public static void wijzigMerknaam(String newMerknaam)
	{
		merknaam = newMerknaam;	
	}
	
	public static void wijzigStofnaam(String newStofnaam)
	{
		stofnaam = newStofnaam;	
	}
	
	public static void wijzigPlaatsBepaling(kastID: Kast)
	{
		
	}
	
	public static void wijzigAantal(int newAantal)
	{
		aantal = newAantal;
	}
	
	public static void wijzigGewensteAantal(int newAantal)
	{
		gewensteAantal = newAantal;
	}
	
	public static void wijzigMinimumAantal(int newAantal)
	{
		minimumAantal = newAantal;
	}
	
	public static void wijzigFabrikant(String newFabrikant)
	{
		fabrikant = newFabrikant;
	}
	
	public static void wijzigPrijs(int newPrijs)
	{
		prijs = newPrijs
	}
	
	public static void vermeerderMedicijnAantal(int vermeerder)
	{
		aantal = aantal + vermeerder;
	}
	
}
