package poupeeRusses;

public class PoupeeRusses {
	
	private int taille;
	private boolean estOuverte;
	private boolean contientUnePoupee;
	
	public boolean ouvrir;
	public boolean fermer;
	public boolean insererUnePoupee;
	public boolean retirerUnePoupee;
	
	public PoupeeRusses(int _taille, boolean _estOuverte, boolean _contientUnePoupee)
	{
	this.taille = _taille;
	this.estOuverte = _estOuverte;
	this.contientUnePoupee = _contientUnePoupee;
	}
	public boolean ouvrir()
	{
		if(!estOuverte)
		{
			estOuverte = true;
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean fermer()
	{
		if(!estOuverte)
		{
			estOuverte = true;
			return false;
		}
		else
		{
			return true;
		}
	}
	public int getTaille()
	{
		return this.taille;
	}
	public int bonneTaille(int plusPetit)
	{
		return plusPetit;
	}
	public boolean insererUnePoupee()
	{
		if(!contientUnePoupee && this.estOuverte) // ne contient pas de poupée et est ouverte
		{
			contientUnePoupee = false;
			return true;  // insererUnePoupee retourne true
		}
		else
		{
			return false; // si contient une poupée et n'est pas ouverte
		}	
	}
	public boolean retirerUnePoupee()
	{
		if(!contientUnePoupee || !estOuverte) // contient une poupée et n'est pas ouverte
		{
			contientUnePoupee = false;
			return false; // inserer une poupée retournera false
		}
		else
		{
			return true; // si ne contient pas de poupée et est ouverte
		}
	}

}
