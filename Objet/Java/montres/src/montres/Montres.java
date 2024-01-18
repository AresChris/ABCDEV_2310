package montres;
import java.util.Scanner;

public class Montres {

	private int heures;
	private int minutes;
	private boolean estDejaPortee;
	
	public int avancerHeure;
	public boolean avancerMinutes;
	
	Scanner sc = new Scanner(System.in);
	
	public Montres(int _heures, int _minutes, boolean _estDejaPortee)
	{
		heures = _heures;
		minutes = _minutes;
		estDejaPortee = _estDejaPortee;
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
	
	
	
	
	
	/*
	 public int avancerHeure()
	{
		
		
		System.out.println("Voulez-vous avancer l'heure ?");
		heures = sc.nextInt();
		if(minutes >= 60)
		{
			heures += 1;
		}
		
		System.out.println("Voulez-vous avancer les minutes ?");
		minutes = sc.nextInt();
		if(heures >= 24)
		{
			heures -= 24;
		}
		return avancerHeure;

	}
	 */
	
}
