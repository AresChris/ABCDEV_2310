package montres1;

import java.util.Scanner;

public class Montres {

	Scanner sc = new Scanner(System.in);
	
	boolean estDejaPortee;
	public String idMontre;
	
	public int heures;
	public int minutes;
	public boolean aEteDonnee;
	public String estPorteePar;
	public boolean avancerHeures;
	public boolean avancerMinutes;
	Personnes montrePortee;
	public String answer;
	private boolean porteUneMontre;
	
	public Montres(String _idMontre, boolean _estDejaPortee)
	{
		idMontre = _idMontre;
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
	
	// Booleens tests
			public boolean estLibre()
			{
				if(this.estDejaPortee)
				{
					System.out.println("Oui, la " + this.idMontre + " est déjà portée par " + this.estPorteePar);
					return true;
				}
				else
				{
					System.out.println("Non, la " + this.idMontre + " n'est pas portée.");
					return false;
				}
			}
			// booleens tests
			public boolean quiPorte(Montres m1)
			{
				if(m1.estDejaPortee)
				{
					System.out.println("La montre " + m1.idMontre + " est portée par " + m1.estPorteePar);
					return true;
				}
				else
				{
					System.out.println("La montre " + m1.idMontre + " n'est pas portée");
					return false;
				}
			}
	public boolean estPorteePar(Personnes p1)
	{
		if(!p1.porteUneMontre && !this.estDejaPortee)
		{
			p1.porteUneMontre = true;
			this.estDejaPortee = true;
			p1.montrePortee = this.montrePortee(idMontre);
			estPorteePar = p1.getIdPersonne(p1);
			System.out.println(p1.idPersonne + " mit sa belle " + this.idMontre);
			return true;
		}
		else
		{
			this.estPorteePar = "Personne";
			this.estDejaPortee = false;
			return false;
		}
	}
	public boolean clonerMontre(Montres m1)
	{
		System.out.println("Copier l'heure de " + m1.idMontre + " sur " + this.idMontre + " ?");
		answer = sc.next();
		if(answer.contains("Y") || answer.contains("y"))
		{
			System.out.println("Heures : ");
			this.heures = sc.nextInt();
			System.out.println("Minutes : ");
			this.minutes = sc.nextInt();
			m1.heures = this.heures;
			m1.minutes = this.minutes;
			System.out.println("Il est " + m1.heures + ":" + m1.minutes + " sur " + m1.idMontre + " et sur " + this.idMontre);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	private String montrePortee(String idMontre) {
		return idMontre;
	}
	
	
}
