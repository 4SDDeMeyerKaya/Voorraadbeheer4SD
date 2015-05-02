public class Apotheker {
	
	public Apotheker(){
		
	}
	
	public void verkoopMedicijn(String merknaam){
		for(int j=0;j<Voorraadbeheer.medlist.size();j++){
			if(merknaam.equalsIgnoreCase(Voorraadbeheer.medlist.get(j).geefMerknaam()))
				Voorraadbeheer.medlist.get(j).aantal--;
		}
	}
	
	//Zet boolean isBesteld van een bestelling op true
	public void bevestigBestelling(int beslistIndex){
		Voorraadbeheer.beslist.get(beslistIndex).setBesteld(true);	
	}
	
	/* setAangekomen()
	 * Alle bestelde items van medicijnen in besmedlist gaan we toevoegen aan de aantallen in medlist.
	 * We controleren op merknaam voor overeenkomstige medicijnen.
	 * We zetten ineens ook de boolean isAangekomen van die bestelling op true.
	 */
	public void setAangekomen(int beslistIndex){ 
		Voorraadbeheer.beslist.get(beslistIndex).setAangekomen(true);
		for(int i=0;i<Voorraadbeheer.beslist.get(beslistIndex).besmedlist.size();i++){
			for(int j=0;j<Voorraadbeheer.medlist.size();j++){
				if(Voorraadbeheer.beslist.get(beslistIndex).besmedlist.get(i).geefMerknaam().equalsIgnoreCase(Voorraadbeheer.medlist.get(j).geefMerknaam()))
					Voorraadbeheer.medlist.get(j).aantal=Voorraadbeheer.beslist.get(beslistIndex).besmedlist.get(i).aantal;
			}
		}
	}
	
}

