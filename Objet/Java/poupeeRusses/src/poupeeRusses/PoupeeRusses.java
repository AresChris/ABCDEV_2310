package poupeeRusses;

import java.util.Comparator;

public class PoupeeRusses {
	
	private int taillePoupee;
	private boolean estOuverte;
	private boolean contientUnePoupee;
	private int poupeeContenue;
	
	public int tailleNouvellePoupee;
	public boolean ouvrir;
	public boolean fermer;
	public boolean insererUnePoupee;
	public boolean retirerUnePoupee;
	
	public PoupeeRusses(int _taille, boolean _estOuverte, boolean _contientUnePoupee, int _poupeeContenue)
	{
	this.taillePoupee = _taille;
	this.estOuverte = _estOuverte;
	this.contientUnePoupee = _contientUnePoupee;
	this.poupeeContenue = _poupeeContenue;
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
		return this.taillePoupee;
	}
	public boolean insererUnePoupee(int tailleNouvellePoupee)
	{
		if(!contientUnePoupee && this.estOuverte && tailleNouvellePoupee < this.taillePoupee) // ne contient pas de poupée et est ouverte
		{
			contientUnePoupee = true;
			poupeeContenue = tailleNouvellePoupee;
			return true;  // insererUnePoupee retourne true
		}
		else
		{
			return false; // si contient une poupée et n'est pas ouverte
		}
	}
	public boolean retirerUnePoupee()
	{
		if(!contientUnePoupee || !estOuverte) // ne contient pas de poupée ou n'est pas ouverte
		{
			contientUnePoupee = false;
			return false; // inserer une poupée retournera false
		}
		else 
		{
			return true; // si ne contient pas de poupée ou est ouverte
		}
	}

}
