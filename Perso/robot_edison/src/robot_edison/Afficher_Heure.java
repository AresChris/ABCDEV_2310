package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Afficher_Heure {

	 // Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
		
	public String afficherDateHeure(Robot_Edison edison)
		{
		System.out.println("Date : "+dateFormat.format(date)+"\nHeure : " + hourFormat.format(calendar.getTime()));
		edison.start();
		return null;	
		}
	
	// Getters
	public String getAfficherHeure(Robot_Edison edison)
		{
		return afficherDateHeure(edison);
		}
	public void start()
		{
		start();
		}
	// Fin des getters
}
