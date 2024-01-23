package bouteille;

public class Bouteille {

	private String nom;
	private double contenu;
	private double capacite;
	private boolean estPleine;
	private boolean estOuverte = true;
	
	public boolean ouvrir;
	public boolean fermer;
	public boolean remplirTout;
	public boolean remplir;
	public boolean viderTout;
	public boolean vider;
	public double ajout;
	public double retrait;
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
					return true;
				}
				else 
				{
					return false;
				}
			}	
			// getters		
				// getter quantité à ajouter selon le paramètre p1
			public double getAjout()
			{
				return ajout;
			}
				// getter quantité à retirer selon le paramètre p2
			public double getRetrait()
			{
				return retrait;
			}
			public Bouteille(String _nom, double _contenu, double _capacite, boolean _estPleine, boolean _estOuverte) 
			{
				this.nom = _nom;
				this.contenu = _contenu;
				this.capacite = _capacite;
				this.estOuverte = _estOuverte;
			}	
			public boolean remplir(double ajout)
			{
				if(this.estOuverte) // verifie si elle est ouverte
				{
					if (this.contenu >= this.capacite) // vérifie si elle est pleine
					{
						this.estPleine = true; // booleen estPleine passe true
						this.remplir = false; // remplissage impossible
						return false; 
					} else if (contenu < capacite) // verifie si il manque dans la bouteille
					{
						this.contenu = ajout + this.contenu; // quantité actuelle dans la bouteille + quantité à ajouter
						estPleine = true; // si condition fausse, n'est pas pleine
						remplir = true; // remplissage possible
						return true;
					} if(!estPleine) // si n'est pas pleine
					{
						contenu = capacite; // bouteille pleine, mais pas plus
					}
				} return true;	
			}
			public boolean vider(double retrait)
			{
				if(this.estOuverte)
				{
					if(this.contenu >= 0)
					{
						this.contenu = this.contenu - retrait;
						return true;
					} else
					{
						return false;
					}
				} return vider;
			}
			public boolean remplirTout()
			{
				if(contenu <= capacite) // si contenu inferieur à la capacité
				{
					contenu = capacite; // contenu vaudra la capacité // bouteille pleine
					return true;
				}
				else
				{
					return false;
				}
			}
			public boolean viderTout()
			{
				if(contenu >= 0)
				{
					contenu = 0;
					return true;
				}
				else
				{
					return false;
				}
		}
}