
public class Apotheker {
	
	
	public static void verkoopMedicijn( medicijnID, aantal, kastID)
	{
		
	}
	
	public static void bevestigBestelling(Bestelling)
	{
		
	}
	
	public void geefKastInhoud(int kastID)
	{
		System.out.println("Items in kast" + kastID + ": \n");
		if (Medicijn.geefKastID() == kastID)
		{
			System.out.println(Medicijn.geefMedicijnID() + "\n")
		}		
		
	}
}

