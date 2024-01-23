package poupeeRusses;

import java.util.Comparator;

public class PoupeeRusses {
	
	private String identifiantPoupee;
	private int taillePoupee;
	private boolean estOuverte;
	private boolean contientUnePoupee;
	private int taillePoupeeContenue;
	private boolean estDansUnePoupee;
	private String nomPoupeeContenue;
	
	public boolean ouvrir;
	public boolean fermer;
	public boolean insererUnePoupee;
	public boolean retirerUnePoupee;
	
	public PoupeeRusses(String _identifiantPoupee, int _taille, boolean _estOuverte, boolean _contientUnePoupee, int _taillePoupeeContenue, String _nomPoupeeContenue, boolean _estDansUnePoupee)
	{
	this.identifiantPoupee =_identifiantPoupee;
	this.taillePoupee = _taille;
	this.estOuverte = _estOuverte;
	this.contientUnePoupee = _contientUnePoupee;
	this.taillePoupeeContenue = _taillePoupeeContenue;
	this.nomPoupeeContenue = _nomPoupeeContenue;
	this.estDansUnePoupee = _estDansUnePoupee;
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
		if(estOuverte)
		{
			estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean getContenu()
	{
		return contientUnePoupee;
	}
	public int getTaille()
	{
		return this.taillePoupee;
	}

	private void setContenir(PoupeeRusses contientUnePoupee, PoupeeRusses poupeeContenue)
	{
		String poupee_A = "poupeeA";
		String poupee_B = "poupeeB";
		String poupee_C = "poupeeC";
		String poupee_D = "poupeeD";
	}
	private void setVider(PoupeeRusses contientUnePoupee, PoupeeRusses poupeeContenue)
	{
		String poupee_A = "poupeeA";
		String poupee_B = "poupeeB";
		String poupee_C = "poupeeC";
		String poupee_D = "poupeeD";
	}
	public boolean insererUnePoupee(int tailleNouvellePoupee)
	{
		if(!contientUnePoupee && this.estOuverte && tailleNouvellePoupee < this.taillePoupee) // ne contient pas de poupée et est ouverte 
		{																					 // et la taille de la nouvelle poupée est inferieur à la poupée qui contient
			contientUnePoupee = true;
			taillePoupeeContenue = tailleNouvellePoupee;
			return true;  // insererUnePoupee retourne true
		}
		else
		{
			return false; // si contient une poupée et n'est pas ouverte
		}
	}
	public boolean getContientUnePoupee()
	{
		if(retirerUnePoupee)
		{
			estDansUnePoupee = false;
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean getRetrait()
	{
		return contientUnePoupee;
	}
	public String getNomPoupeeContenue()
	{
		return nomPoupeeContenue;
	}
	public String getId(PoupeeRusses idPoupeeContenue)
	{
		return identifiantPoupee;
	}
	public int getTaillePoupee()
	{
		return taillePoupee;
	}
	public boolean retirerUnePoupee(PoupeeRusses p2) // p2 est la poupee à retirer
	{
		if(contientUnePoupee && this.estOuverte) // contient une poupée et est ouverte
		{
			contientUnePoupee = false; // Ne pourra pas retirer de poupée
			this.taillePoupeeContenue = 0; // aucune poupée vaudra un taille de 0 pour la poupée contenue
			this.nomPoupeeContenue = "Aucune"; // Aucune poupée affichera "Aucune" en nom de poupée contenue
			this.contientUnePoupee = getContientUnePoupee();
			p2.estDansUnePoupee = false;
			return true; // retirer une poupée retournera true
		}
		else 
		{
			return false; // si ne contient pas de poupée et est fermée
		}
	}
	public boolean inserer(PoupeeRusses p1) // p1 est la poupée à inserer
	{
		// si p1(la poupée à inserer) est plus grande que la taille de la poupée à remplir
		// ET que la poupée à remplir contient un poupée
		if(p1.getTaillePoupee() > this.taillePoupee && this.contientUnePoupee)
		{
			insererUnePoupee = false; // n'insère pas de poupée
			return false;
		}
			else 
			{
				insererUnePoupee = true; // insère une poupée 
				contientUnePoupee = true; // contient une poupée passe true
				this.taillePoupeeContenue = p1.getTaille(); // affiche la taille de la poupée insérée
					if(true) // si la poupée à été insérée
					{
						p1.estDansUnePoupee = true; // Poupée insérée aura true en valeur 'estDansUnePoupée'
						if(contientUnePoupee) // si la poupée en contient une autre
							{
							this.nomPoupeeContenue = p1.getId(p1); // affichage du nom de la poupée contenue
							}
					}
			}
		{
			return contientUnePoupee;
		}
	
	}

}	


