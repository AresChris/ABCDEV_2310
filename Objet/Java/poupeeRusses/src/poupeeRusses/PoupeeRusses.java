package poupeeRusses;

public class PoupeeRusses {
	
	private int taille;
	private boolean estOuverte;
	private boolean contientUnePoupee;
	
	public boolean ouvrir;
	public boolean fermer;
	
	
	public PoupeeRusses(int _taille, boolean _estOuverte, boolean _contientUnePoupee)
	{
	taille = _taille;
	estOuverte = _estOuverte;
	contientUnePoupee = _contientUnePoupee;
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
			estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}

}
