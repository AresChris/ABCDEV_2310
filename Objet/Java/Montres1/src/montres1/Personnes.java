package montres1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Personnes {
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat formater = new DecimalFormat("00");
	
	boolean porteUneMontre;
	String idPersonne;
	
	public boolean enleverUneMontre;
	public boolean donnerUneMontre;
	public boolean demandeHeure;
	String estPorteePar;
	public String mEstPorteePar;
	String montrePortee;
	public String answer;
	public boolean aEteDonnee;
	public boolean avancerHeures;
	public int heures;
	public int minutes;
	
	public Personnes(String _idPersonne, boolean _porteUneMontre)
	{
		idPersonne = _idPersonne;
		porteUneMontre = _porteUneMontre;
	}
	public String getIdMontre(String idMontre)
	{
		return idMontre;
	}
	
	public boolean donnerMontre(Montres m1, Personnes p1) // Paul.donnerMontre(Pierre); // this.Paul.donnerMontre(p1 Pierre)
	{
		if(!p1.porteUneMontre)
		{
			p1.montrePortee = this.montrePortee;
			porteUneMontre = false;
			this.montrePortee = "Aucune";
			p1.porteUneMontre = true;
			m1.estPorteePar = p1.estPorteePar(p1);
			System.out.println("-Le génereux " + this.idPersonne +" donna sa belle " + m1.idMontre + " à " + p1.idPersonne + " !");
			return true;
		}
		else 
		{
			System.out.println("\t\tConversation épique : \n- Tiens " + this.idPersonne + ", dit " +  p1.idPersonne + ", je te donne ma " + m1.idMontre 
								+ "\n- Je porte déjà la " + this.montrePortee + " mais je te remercie !");
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
			System.out.println("-" +this.idPersonne + " ne peut pas retirer sa montre, il n'en porte pas !");
			return false;
		}
		else
		{
			m1.estPorteePar = "Personne";
			m1.estDejaPortee = false;
			montrePortee = "Aucune";
			this.porteUneMontre = false;
			System.out.println("-" +this.idPersonne + " enleva sa belle " + m1.idMontre + ", elle n'est donc plus portée et " + this.idPersonne + " ne porte plus de montre.");
			return true;
		}
	}
	public String getIdPersonne(Personnes p1) {
		return idPersonne;
	}
	public int getHeure()
	{
		return heures;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
	public boolean avancerHeure(Montres m1)
	{
		if(m1.estDejaPortee || this.porteUneMontre)
		{
			System.out.println("-Voulez-vous modifier l'heure ? Y/N" + "\n Elle est actuellement sur " + formater.format(heures) + ":" + formater.format(m1.minutes));
			answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
					{
				if(heures > 24)
				{
					heures -= 24;
				}
				if(minutes > 60)
				{
					heures += 1;
				}
						System.out.println("-Indiquez l'heure actuelle : ");
						heures = sc.nextInt();
						m1.heures = heures;
						System.out.println("-Indiquez les minutes : ");
						minutes = sc.nextInt();
						m1.minutes = minutes;
						System.out.println("-Il est maintenant " + formater.format(heures)  + ":" + formater.format(minutes) + " sur la " + m1.idMontre);
						this.heures = m1.heures;
						this.minutes = m1.minutes;
						return true;
					}
			else
			{
				System.out.println("-L'heure de la montre " + m1.idMontre + " est inchangée : " + formater.format(heures) + ":" + formater.format(minutes));
				return true;
			}
		}
		else
		{
			System.out.println("-La " + m1.idMontre + " n'est pas portée, il le faut pour pouvoir changer l'heure...");
			return false;
		}
	}
	public boolean demanderHeure(Personnes p1)
	{
		if(this.porteUneMontre && !p1.porteUneMontre)
		{
			System.out.println("-" + this.idPersonne + " : Je vois votre montre d'ici...");
			return false;
		}
		else 
		{
				System.out.println(" - " + this.idPersonne + " demanda à " + p1.idPersonne + " : Pourriez-vous me donner l'heure exacte ? Y/N");
				answer = sc.next();
				if(answer.contains("Y") || answer.contains("y"))
				{
					System.out.println(" - " + p1.idPersonne + " : " + formater.format(p1.heures) + ":" + formater.format(p1.minutes));
					System.out.println(" - " + this.idPersonne + " : Déjà " + formater.format(p1.heures) + ":" + formater.format(p1.minutes) + " ? \n - " + p1.idPersonne + " : Et oui, ca file ...");
				}
				else
				{
					System.out.println(" - " + p1.idPersonne + " : Non  ¯\\_(ツ)_/¯");
					System.out.println(" - " + this.idPersonne + " : Pas cool " + "\u2639");
				}
				return true;
		}
	}
	// booleen tests
	public boolean porteQuelleMontre()
	{
		if(this.porteUneMontre)
		{
			System.out.println("-" + this.idPersonne + " porte la montre " + this.montrePortee);
			return true;
		}
		else
		{
			System.out.println("-" + this.idPersonne + " ne porte pas de montre");
			return false;
		}
	}

}
