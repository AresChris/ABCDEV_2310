package porteDeGarage;

public class PorteDeGarage {

	private boolean estDeverouillee;
	private boolean estOuverte;
	private boolean estPartiellementOuverte;
	private boolean estVerouillee;
	private String nom;
	
	public boolean ouvrir;
	public boolean fermer;
	public boolean verouiller;
	
	public boolean verouiller()
	{
		if(estVerouillee)
		{
			estVerouillee = false;
			return false;
		}
		else 
		{
			return true;
		}
	}
	
		public boolean ouvrir()
		{
			if(estOuverte)
			{
				estOuverte = true;
				return true;
			}
			else {
				return false;
			}
		}
			public boolean fermer()
			{
				if(!estOuverte)
				{
					estOuverte = false;
					return false;
				}
				else 
				{
					return true;
				}
			}
			PorteDeGarage()
			{
				nom = "basculante";
				estDeverouillee = true;
				estOuverte = true;
				estPartiellementOuverte = false;
				estVerouillee = false;
			}
			
			PorteDeGarage(String _nom, boolean _estDeverouillee,boolean _estOuverte,boolean _estPartiellementOuverte,boolean _estVerouillee)
			{
				nom = _nom;
				estDeverouillee = _estDeverouillee;
				estOuverte = _estOuverte;
				estPartiellementOuverte = _estPartiellementOuverte;
				estVerouillee = _estVerouillee;
			}
			
			
}
