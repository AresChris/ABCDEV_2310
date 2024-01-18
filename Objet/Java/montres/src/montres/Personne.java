package montres;

public class Personne {

	private String nom;
	private boolean porteUneMontre;
	
	public boolean enleverMontre;
	public boolean donnerMontre;
	public boolean demanderheure;
	
	public Personne(String _nom, boolean _porteUneMontre)
	{
		nom = _nom;
		porteUneMontre = _porteUneMontre;
	}
	public Personne()
	{
		nom = "Pierre";
		porteUneMontre = true;
	}
	public boolean enleverMontre()
	{
		if(!porteUneMontre) // Si ne porte pas de montre
		{
			enleverMontre = false; 
			return false; // enlever montre retournera false
		}
		else {
			enleverMontre = true;
			porteUneMontre = false;
			return true;
		}
	}
	
	
}
