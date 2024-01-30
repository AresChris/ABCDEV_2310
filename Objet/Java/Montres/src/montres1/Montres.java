package montres1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Montres {

	Scanner sc = new Scanner(System.in);
	DecimalFormat formater = new DecimalFormat("00");
	
	boolean estDejaPortee;
	public String idMontre;
	public int heures;
	public int minutes;
	public String estPorteePar;
	public boolean modifierHeureDe;
	Personnes montrePortee;
	public String answer;
	
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
	//----------------------------------------------------------------------------------------------------------------
	// Booleens tests
			public boolean estLibre()
			{
				if(this.estDejaPortee)
				{
					System.out.println("-Oui, la " + this.idMontre + " est déjà portée par " + this.estPorteePar);
					return true;
				}
				else
				{
					System.out.println("-Non, la " + this.idMontre + " n'est pas portée.");
					return false;
				}
			}
			public boolean quiPorte()
			{
				if(this.estDejaPortee)
				{
					System.out.println("-La montre " + this.idMontre + " est portée par " + this.estPorteePar);
					return true;
				}
				else
				{
					System.out.println("-La montre " + this.idMontre + " n'est pas portée");
					return false;
				}
			}

			public boolean indiqueHeure()
			{
					if(this.modifierHeureDe)
					{
						
						System.out.println("-Il est " + formater.format(this.heures) + ":" + formater.format(this.minutes) + " sur la " + this.idMontre);
						return true;
					}
					else 
					{
						System.out.println("-L'heure de la montre n'à pas été modifié, elle est sur " + formater.format(this.heures) + ":" + formater.format(this.minutes) + "\n-Essaie \" boolean test = " + this.estPorteePar + ".modifierHeuresDe(" + this.idMontre +"); \"");
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
			System.out.println("-" +p1.idPersonne + " mit sa belle " + this.idMontre + ".");
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
		System.out.println("-Copier l'heure de " + m1.idMontre + " sur " + this.idMontre + " ? Y/N");
		answer = sc.next();
		if(answer.contains("Y") || answer.contains("y"))
		{
			this.heures = m1.heures;
			this.minutes = m1.minutes;
			System.out.println("-Il est " + formater.format(m1.heures) + ":" + formater.format(m1.minutes) + " sur " + m1.idMontre + " et sur " + this.idMontre);
			return true;
		}
		else
		{
			System.out.println("-L'heure de la " + this.idMontre + " n'à pas changé, il est " 
									+ formater.format(this.heures)+ ":" + formater.format(this.minutes));
			return false;
		}
		
	}
	private String montrePortee(String idMontre) {
		return idMontre;
	}
	
	
}
