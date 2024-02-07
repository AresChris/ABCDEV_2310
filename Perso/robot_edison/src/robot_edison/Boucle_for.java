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
	public boolean menuBoucleFor()
	{
		System.out.println("\tBoucles for");
		System.out.println("\n\n1. Ajouter 1 à chaque tour de boucle\n2. Afficher les valeurs d'un tableau\n3. Moyenne\n4. Trouver la plus grande valeur\n\n0. Quitter");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
		{
			getPourPlusDix();
		}
		else if(choixMenu == 2)
		{
			getShowValTab();
		}
		else if(choixMenu == 3)
		{
			getMoyenne();
		}
		else if(choixMenu == 4)
		{
			getPetitGrand();
		}
		else if(choixMenu == 0)
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + getBatteryLeft() + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
			System.out.println("Le robot est éteint pressez A pour l'allumer");
			String affichage = sc.next();
				if(affichage.contains("A") || affichage.contains("a"))
				{
					getStart();
				}
				else
				{
					getStart();
				}
		}
		return true;
	}
	// Getters
	public boolean getMenuFor()
		{
		return menuBoucleFor();
		}
	public boolean getPourPlusDix()
		{
		return getPourPlusDix();
		}
	public boolean getPetitGrand()
		{
		return  getPetitGrand();
		}
	public boolean getShowValTab()
		{
		return getShowValTab();
		}
	public boolean getMoyenne()
		{
		return getMoyenne();
		}
	public boolean getStart()
		{
		return getStart();
		}
	public int getBatteryLeft()
		{
		return getBatteryLeft();
		}
	// Fin des getters
}
