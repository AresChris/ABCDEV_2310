package montres1;

public class Personnes {
	
	boolean porteUneMontre;
	private String idPersonne;
	
	public boolean enleverUneMontre;
	public boolean donnerUneMontre;
	public boolean demandeHeure;
	String estPorteePar;
	String montrePortee;
	public boolean aEteDonnee;
	
	public Personnes(String _idPersonne, boolean _porteUneMontre)
	{
		idPersonne = _idPersonne;
		porteUneMontre = _porteUneMontre;
	}
	public String getIdMontre(String idMontre)
	{
		return idMontre;
	}
	
	public boolean donnerMontre(Personnes p1) // Paul.donnerMontre(Pierre); // this.Paul.donnerMontre(p1 Pierre)
	{
		if(!p1.porteUneMontre)
		{
			p1.montrePortee = this.montrePortee;
			porteUneMontre = false;
			this.montrePortee = "Aucune";
			p1.porteUneMontre = true;
			estPorteePar = p1.estPorteePar(p1);
			return true;
		}
		else 
		{
			return false;
		}
	}
	private String estPorteePar(Personnes p1) {
		return idPersonne;
	}
	public boolean retirerMontre(Montres m1)
	{
		if(!this.porteUneMontre)
		{	
			porteUneMontre = false;
			return false;
		}
		else
		{
			montrePortee = "Aucune";
			return true;
		}
	}
	public String getIdPersonne(Personnes p1) {
		return idPersonne;
	}
}
