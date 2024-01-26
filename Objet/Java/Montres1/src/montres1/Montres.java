package montres1;

public class Montres {

	private int heures;
	private int minutes;
	private boolean estDejaPortee;
	public String idMontre;
	
	public boolean aEteDonnee;
	public String estPorteePar;
	public boolean avancerHeures;
	public boolean avancerMinutes;
	Personnes montrePortee;
	
	public Montres(String _idMontre, int _heures, int _minutes , boolean _estDejaPortee)
	{
		idMontre = _idMontre;
		heures = _heures;
		minutes = _minutes;
		estDejaPortee = _estDejaPortee;
	}
	public Montres getIdMontre(Montres idMontre)
	{
		return idMontre;
	}
	public Personnes getidPersonne(Personnes idPersonne)
	{
		return idPersonne;
	}
	
	public boolean estPorteePar(Personnes p1)
	{
		if(!p1.porteUneMontre)
		{
			p1.porteUneMontre = true;
			p1.montrePortee = this.montrePortee(idMontre);
			estPorteePar = p1.getIdPersonne(p1);
			return true;
		}
		else
		{
			this.estPorteePar = "Personne";
			return false;
		}
	}
	private String montrePortee(String idMontre) {
		return idMontre;
	}
	
	
}
