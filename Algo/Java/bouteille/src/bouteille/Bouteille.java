package bouteille;

public class Bouteille {

	private String nom;
	private double contenu;
	private double capacite;
	private boolean estOuverte = true;
	
	public boolean ouvrir;
	public boolean fermer;
	public boolean remplirTout;
	public boolean remplir;
	public boolean viderTout;
	public boolean vider;
	
					// booleenne ouvrir
			public boolean ouvrir() 
			{
				if(!estOuverte) 
				{
				estOuverte = true;
				return true;
				} 	
				else {
				return false;
				}
			}
					// booleenne fermer
			public boolean fermer()
			{
				if(estOuverte) 
				{
					estOuverte = false;
					return false;
				}
				else 
				{
					return true;
				}
			}
					
			public Bouteille()
			{
				nom = "Karmeliet";
				contenu = 0.75;
				capacite = 1;
				estOuverte = true;
			}
			
			boolean remplir() 
			{
				if(contenu < capacite) 
				{
					remplir = true;
					return true;
				}
				else 
				{
					return false;
				}
			
			}

			public Bouteille(String _nom, double _contenu, double _capacite, boolean _estOuverte) 
			{
				nom = _nom;
				contenu = _contenu;
				capacite = _capacite;
				estOuverte = _estOuverte;
			}	
}
