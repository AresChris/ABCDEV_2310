package montres;
import java.util.Scanner;

public class Montres {

	private int heures;
	private int minutes;
	private boolean estDejaPortee;
	
	public boolean avancerHeure;
	public boolean avancerMinutes;
	
	Scanner sc = new Scanner(System.in);
	
	public Montres(int _heures, int _minutes, boolean _estDejaPortee)
	{
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
	}	

