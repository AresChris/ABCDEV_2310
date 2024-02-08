package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Show_Val_Tab {
	
	 // Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	public static boolean showValTab(Robot_Edison edison)
	{
		System.out.println("\tAffichage des valeurs d'un tableau\n");
		System.out.println("Combien de valeurs dans le tableau ?");
		int valeursTab = sc.nextInt();
		int[] tab = new int[valeursTab];
		
		for(int i=0; i<=tab.length-1; i++)
			{
			System.out.println("Nombre " + (i+1) + " :");
			tab[i] = sc.nextInt();
			}
		for(int j=0; j<tab.length; j++)
			{
			System.out.println("#" + (j+1 + " : ") + tab[j] + " ");
			}
		System.out.println("Afficher le code ? Y/N");
		String affichage = sc.next();
			if(affichage.contains("Y") || affichage.contains("y"))
				{
				System.out.println("\tSystem.out.println(\"Combien de valeurs dans le tableau ?\");\r\n"
						+ "		int valeursTab = sc.nextInt();\r\n"
						+ "		int[] tab = new int[valeursTab];\r\n"
						+ "		\r\n"
						+ "		for(int i=0; i<=tab.length-1; i++)\r\n"
						+ "		{\r\n"
						+ "			System.out.println(\"Nombre \" + (i+1) + \" :\");\r\n"
						+ "			tab[i] = sc.nextInt();\r\n"
						+ "		}\r\n"
						+ "		for(int j=0; j<tab.length; j++)\r\n"
						+ "		{\r\n"
						+ "			System.out.println(\"#\" + (j+1 + \" : \") + tab[j] + \" \");\r\n"
						+ "		}");
				}
			else
				{
				System.out.println("\nR pour retourner au menu principal"
						+ "\nE pour relancer le dernier programme"
						+ "\nB pour revenir au menu précédent"
						+ "\nQ pour quitter"); 
				String choixMenu = sc.next();
					if(choixMenu.contains("R"))
						{
						Start.demarrer(edison);
						}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
						{
						edison.getShowValTab();
						}
					else if(choixMenu.contains("B") || choixMenu.contains("b"))
						{
						edison.getMenuTableaux();
						}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
						{
						edison.getEteindre();
						}
				}
		System.out.println("\nR pour retourner au menu principal"
				+ "\nE pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		String choixMenu = sc.next();
			if(choixMenu.contains("R"))
				{
				Start.demarrer(edison);
				}
			else if(choixMenu.contains("E") || choixMenu.contains("e"))
				{
				edison.getShowValTab();
				}
			else if(choixMenu.contains("B") || choixMenu.contains("b"))
				{
				edison.getMenuTableaux();
				}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
				{
				edison.getEteindre();
				}
			return false;
	}
}
