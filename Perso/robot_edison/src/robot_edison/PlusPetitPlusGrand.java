package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PlusPetitPlusGrand {
	
		// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	static void petitGrand()
	{
		int nombres, plusGrand = 0;
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le nombre de valeurs du tableau : ");
		nombres = sc.nextInt();
		
		int[] tableau = new int[nombres];
		
		for(int i = 0; i<=tableau.length-1; i++) {
			System.out.println("N° " + (i+1) + " :");
			tableau[i] = sc.nextInt();
			if(tableau[i] > plusGrand) {
				plusGrand = tableau[i];
				position = i + 1;
			}
		}	
		System.out.print("Le plus grand nombre est " + plusGrand + " et il était en position " + position);
		System.out.println("\nR pour retourner au menu principal\n"
				+ "E pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		String choixMenu = sc.next();
			if(choixMenu.contains("R"))
			{
				getStart();
			}
			else if(choixMenu.contains("E") || choixMenu.contains("e"))
			{
				getInteret();
			}
			else if(choixMenu.contains("b") || choixMenu.contains("Q"))
			{
				getMenuTableaux();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
			sc.close();
	}
	static void getPetitGrand()
		{
		petitGrand();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getInteret()
		{
		Interet_Banque.calculInteret();
		}
	static void getMenuTableaux() 
		{
		Menu_Tableaux.getMenuTableaux();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
}
