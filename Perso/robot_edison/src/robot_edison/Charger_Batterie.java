package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Charger_Batterie {
	static // Utiles 
		Scanner sc = new Scanner(System.in); // Scanner
		DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		Date date = new Date(); // retourne la date actuelle
		Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
	
		static int batteryLeft;
	static boolean chargerBatterie()  // Permet de charger la batterie à 100%
	{
		if(batteryLeft == 100)  // Si la batterie est à 100%
		{
			System.out.println("La batterie est déjà chargée à 100%");
			return false;
		}
		else if(batteryLeft > 30)  // Si le niveau de batterie est superieur à 30%
		{
			System.out.println("Le niveau de batterie est actuellement de " + batteryLeft
					+ "%, charger votre appareil maintenant pourrait réduire sa durée de vie."
					+ "\nVoulez-vous tout de même le charger ? Y/N");
			String str = sc.next();
				if(str.contains("Y") || str.contains("y"))
				{
					batteryLeft = 100;   // Le niveau de charge de la batterie pass à 100%
					System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + batteryLeft + "%");
					getStart();
					return true;	
				}
				else
				{
					System.out.println("\n\tLe niveau de charge est inchangé : " + batteryLeft + "%");
					getStart();
					return false;
				}
		}
		else  // Si le niveau de batterie est inferieur à 30%
		{
			batteryLeft = 100;   // Le niveau de charge de la batterie passe à 100%
			System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + batteryLeft + "%");
			getStart();
			return true;
		}
		
	}
	
	static void getCharger()
	{
		chargerBatterie();
	}
	static void getStart()
	{
		Start.start();
	}
	
}
