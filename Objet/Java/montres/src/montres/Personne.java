package montres;

public class Personne {

	private String nom;
	public boolean porteUneMontre;
	public String montrePortee;
	public boolean peutDonnerHeure;
	public boolean enleverMontre;
	public boolean donnerMontre;
	public boolean demanderheure;

	
	public Personne(String _nom, boolean _porteUneMontre)
	{
		this.nom = _nom;
		this.porteUneMontre = _porteUneMontre;
	}
	public Personne()
	{
		nom = "Pierre";
		porteUneMontre = true;
	}
	public String getNom(Personne p3)
	{
		return this.nom;
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
	public String demanderHeure(Personne p4, String quelleHeure)
	{
		int heures = 13;
		int minutes = 45;
		if(!porteUneMontre)
		{
			quelleHeure = "Je n'ai pas de montre";
			return quelleHeure;
		}
		else 
		{
			quelleHeure = "Il est " + heures + ":" + minutes + "h";
			return quelleHeure;
		}
	}
	 
	public boolean donnerMontre(Personne p1)
	{
		if(!p1.porteUneMontre && this.porteUneMontre) // si p1 ne porte pas de montre && personne porte une montre
		{
			porteUneMontre = false; // porte une montre retournera false
			p1.porteUneMontre = true; // p1 porte une montre et this n'en porte plus
			return true; // donner une montre retournera true
		}
		else
		{
			return false;
		}
	}
	
}
