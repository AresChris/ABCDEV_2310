package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Allumer_Eteindre {
	
	// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
		Robot_Edison edison = new Robot_Edison(false, 0, null);
	

	//-----------------------------------------------------------------------------------
	public static boolean allumer(Robot_Edison edison)
		{
		if(!edison.getIsOn(true))
			{
			System.out.println("Démarrage du robot");
			Start.demarrer(edison);
			return true;
			}
		else
			{
			System.out.println("Le robot était déjà allumé");
			}
		Start.demarrer(edison);
		return true;
		}
	public static boolean eteindre(Robot_Edison edison)
		{
		System.out.println("Extinction du robot...\nPressez A pour allumer");
		String demarrage = sc.next();
		if(demarrage.contains("A") || demarrage.contains("a")) 
			{
			edison.allumer();
			}
		return true;
		}
		 
	}

