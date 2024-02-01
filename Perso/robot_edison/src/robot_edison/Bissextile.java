package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bissextile {

	// Utiles 
				static Scanner sc = new Scanner(System.in); // Scanner
				static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
				static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
				static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
				static Date date = new Date(); // retourne la date actuelle
				static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
				static DecimalFormat formater = new DecimalFormat("00");
				// Fin de déclaration des utiles
			
	static void bissextile()
	{
		System.out.println("\t\tBiisextile\n\tVérifie si une date est valide\n\t et si l'année est bissextile\n\t------------------------------\n");
		System.out.print("Jour : ");
		int jour = sc.nextInt();
		
		System.out.print("Numéro du mois : ");
		int mois = sc.nextInt();
		
		System.out.print("Année : ");
		int anneeA = sc.nextInt();
		

		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;

		if (!bissextile) {
			if (jour == 29 && mois == 2) {
				System.out.print("Il n'y à pas de 29 février dans l'année " + anneeA + ", et elle n'est pas bissextile !");
			} else {
				System.out.print("la date du " + decimalFormat.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
			}
		}
		if (bissextile) {
				if (jour == 29 && mois == 2) 
				{
					System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
				}
				else 
				{
					System.out.print("La date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " n'est pas dans une année bissextile !");
				}
			} 
		  System.out.println("\n\n\nR pour retourner au menu principal\n"
				+ "E pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		String choixMenu = sc.next();
			if(choixMenu.contains("R") || choixMenu.contains("r"))
			{
				getStart();
			}
			else if(choixMenu.contains("E") || choixMenu.contains("e"))
			{
				getBissextile();
			}
			else if(choixMenu.contains("B") || choixMenu.contains("b"))
			{
				getMenuCalculs();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
		 
		sc.close();
	}
	
	// Getters
	static void getBissextile()
		{
		bissextile();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getInteret()
		{
		Interet_Banque.calculInteret();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.getMenuCalculs();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	// Fin des Getters
}
