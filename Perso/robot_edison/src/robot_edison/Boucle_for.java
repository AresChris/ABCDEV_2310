package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Boucle_for {
	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			// Fin de déclaration des utiles
	static void menuBoucleFor()
	{
		System.out.println("\tBoucles for");
		System.out.println("\n\n1. Ajouter 1 à chaque tour de boucle\n2. Afficher les valeurs d'un tableau\n\n0. Quitter");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
		{
			getPourPlusDix();
		}
		else if(choixMenu == 2)
		{
			getShowValTab();
		}
		else if(choixMenu == 0)
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + getBatteryLeft() + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
		}
		/*
		 * 
		 String choixMenu = sc.next();
			if(choixMenu.contains("R"))
			{
				getStart();
			}
			else if(choixMenu.contains("E") || choixMenu.contains("e"))
			{
				calculInteret();
			}
			else if(choixMenu.contains("b") || choixMenu.contains("Q"))
			{
				getMenuCalculs();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
		 */
	}
	static void getMenuFor()
		{
		menuBoucleFor();
		}
	static void getPourPlusDix()
		{
		Pour_Plus_Dix.plusDix();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static int getBatteryLeft()
		{
		return Robot_Edison.batteryLeft;
		}
	static void getShowValTab()
		{
		Show_Val_Tab.showValTab();
		}
}
