package montres;
import java.util.Scanner;

public class Montres {
	private String identifiantMontre;
	public int heures;
	private int minutes;
	private boolean estDejaPortee;
	private String estPorteePar;
	public boolean avancerHeure;
	public boolean avancerMinutes;
	
	Scanner sc = new Scanner(System.in);
	
	public Montres(String _identifiantMontre, int _heures, int _minutes, boolean _estDejaPortee)
	{
		identifiantMontre = _identifiantMontre;
		heures = _heures;
		minutes = _minutes;
		estDejaPortee = _estDejaPortee;
	}
	public Montres()
	{
		heures = 13;
		minutes = 45;
		estDejaPortee = true;
	}
	public String getId(Montres idMontre)
	{
		return identifiantMontre;
	}
	public boolean estDejaPortee()
	{
		if(!estDejaPortee)
		{
			estDejaPortee = false;
			return false;
		}
		else
		{
			return true;
		}
	}
	 public boolean avancerHeure()
		{
			System.out.println("De combien voulez-vous avancer l'heure ?");
			heures = sc.nextInt();
			heures += 13;
			if(minutes >= 60)
			{
				heures += 1;
			}
			
			System.out.println("De combien voulez-vous avancer les minutes ?");
			minutes = sc.nextInt();
			minutes += 45;
			if(heures >= 24)
			{
				heures -= 24;
			}
			System.out.println("Il est " + heures + ":" + minutes + "h");
			return avancerHeure;
		}
	 public boolean initManuellement(Montres m2)
	 {
		 System.out.println("Voulez-vous initialiser l'heure manuellement ? Y/N");
		 String initManuel = sc.next();
		 	if(initManuel.contains("Y") || initManuel.contains("y"))
		 	{
		 		System.out.println("Indiquez les heures : ");
		 		heures = sc.nextInt();
		 			if(heures > 24)
		 			{
		 				heures -= 24;
		 			}
		 		System.out.println("Indiquez les minutes : ");
		 		minutes = sc.nextInt();
		 			if(minutes >60)
		 			{
		 				heures += 1;
		 			}
		 			System.out.println("Il est " + heures + ":" + minutes + "H");
		 			m2.heures = heures;
				 	m2.minutes = minutes;
		 			return true;
		 	} 
		 	else 
		 	{
		 		System.out.println("L'heure est inchangé, " + heures + ":" + minutes + "H");
		 		return false;
		 	}		
	 }
	
	 public void getInitH(Montres m1)
	 {
		 this.heures = m1.heures;
	 }
	 public void getInitM(Montres m1)
	 {
		 this.minutes = m1.minutes;
	 }
	 public String demanderHeure(Personne p4, String quelleHeure)
		{
			if(!estDejaPortee)
			{
				System.out.println("Je n'ai pas de montre");
				return quelleHeure;
			}
			else 
			{
				System.out.println("Il est " + heures + ":" + minutes + "h");
				return quelleHeure;
			}
		}
	 public void initWatch(Montres m1) // this initialise la montre m1 correspondant à sa propre heure/minute
	 {
		 m1.heures = this.heures;
		 m1.minutes = this.minutes;
		 this.minutes = m1.minutes;
		 this.heures = m1.heures;
		 System.out.println("\n\nL'heure à été copiée \nIl est " + m1.heures + ":" + m1.minutes + "H");
	 }
	 public boolean MontrePorteePar(Personne p2)
	 {
		 if(!p2.porteUneMontre && !this.estDejaPortee)
		 {
			 p2.porteUneMontre = true;
			 this.estPorteePar = p2.getNom(p2);
			 p2.montrePortee = this.getId(null);
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
}	

