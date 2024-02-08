package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Menu_Tableaux {
	
		// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		public static int batteryLeft;
		
	public static void menuTableaux(Robot_Edison edison) 
	{
		System.out.println("\tTableaux\n1. Affichage des valeurs d'un tableau\n2. Trouver la plus grande valeur\n0. Quitter");
		int choixMenu = sc.nextInt();
			if(choixMenu == 1)
				{
				edison.getShowValTab();
				}
			else if(choixMenu == 2)
				{
				edison.petitGrand();
				}
			else if(choixMenu == 0)
				{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + edison.getBatteryLeft() + "%"
						+ "\nNous somme le " + dateFormat.format(date) + 
						"\nIl est " + hourFormat.format(calendar.getTime()));
				System.out.print("Le robot est éteint, pressez A pour allumer");
				String affichage = sc.next();
					if(affichage.contains("A") || affichage.contains("a"))
						{
						edison.demarrer();
						}
				}
	}
}
