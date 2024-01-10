package arbre;

public class Arbre {
	
	private String famille;
	private String nom;
	private String environnement;
	private boolean estVivant;
	private boolean estFeuillu;
	
	public boolean tailler;
	
	public boolean estVivant()
	{
		if(!estVivant) {
			estVivant = true;
			return true;
		} else {
			return false;
		}
	}
	public boolean estFeuillu() 
	{
		if (!estFeuillu)
		{
			estFeuillu = true;
			return true;
		} else {
			return false;
		}
	}
		Arbre() 
		{
		famille = "conifères";
		nom = "sapin";
		environnement = "montagnes";
		estVivant = true;
		estFeuillu = true;
		}
		
		Arbre(String _famille, String _nom, String _environnement, boolean _estVivant, boolean _estFeuillu)
		{
			famille = _famille;
			nom = _nom;
			environnement = _environnement;
			estVivant = _estVivant;
			estFeuillu = _estFeuillu;
		}
		
}
