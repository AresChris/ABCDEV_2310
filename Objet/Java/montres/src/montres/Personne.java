package montres;

public class Personne {

	private String nom;
	public boolean porteUneMontre;
	
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
	Personne Pierre = new Personne("Pierre", true);
	Personne Paul = new Personne("Paul", false);
	Personne Jacques = new Personne("Jacques", true);
	
	Personne getPierre()
	{
		return Pierre;
	}
	Personne getPaul()
	{
		return Paul;
	}
	Personne getJacques()
	{
		return Jacques;
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
	/*
	 public boolean peutDemanderHeure()
	{
		if(Pierre == this.porteUneMontre)
		{
			
			return true;
		}
	}
	 */
	
	public String demanderHeure(String quelleHeure)
	{
		int heures = 13;
		int minutes = 45;

		if(!porteUneMontre)
		{
			System.out.println("Je n'ai pas de montre");
			return quelleHeure;
		}
		else 
		{
			System.out.println("Il est " + heures + ":" + minutes + "h");
			return quelleHeure;
		}
	}
	
}
