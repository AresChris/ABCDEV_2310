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
		System.out.println("\tTrouver la plus grande valeur d'un tableau\n");
		System.out.print("Saisissez le nombre de valeurs du tableau : ");
		nombres = sc.nextInt();
		
		int[] tableau = new int[nombres];
		
		for(int i = 0; i<=tableau.length-1; i++) {
			System.out.print("N° " + (i+1) + " :");
			tableau[i] = sc.nextInt();
			System.out.print("");
			if(tableau[i] > plusGrand) {
				plusGrand = tableau[i];
				position = i + 1;
			}
		}	
		System.out.println("Le plus grand nombre est " + plusGrand + " et il était en position " + position);
		System.out.println("Afficher le code ? Y/N");
		String affichage = sc.next();
		if(affichage.contains("Y") || affichage.contains("y"))
		{
			System.out.print("\tint nombres, plusGrand = 0;\n"
					+ "\tint position = 0;\n"
					+ "		\n"
					+ "\tScanner sc = new Scanner(System.in);\n"
					+ "\n"
					+ "\tSystem.out.print(\"Saisissez le nombre de valeurs du tableau : \");\n"
					+ "\tnombres = sc.nextInt();\n"
					+ "\n"
					+ "\tint[] tableau = new int[nombres];\n"
					+ "		\n"
					+ "\tfor(int i = 0; i<=tableau.length-1; i++) "
					+ "\n\t{\n"
					+ "\t System.out.print(\"N° \" + (i+1) + \" :\");\n"
					+ "\t tableau[i] = sc.nextInt();\n"
					+ "\t System.out.print(\"\");\n"
					+ "\t	if(tableau[i] > plusGrand) "
					+ "\n\t\t{\n"
					+ "\t    plusGrand = tableau[i];\n"
					+ "\t    position = i + 1;\n"
					+ "\n\t\t}"
					+ "\n}");
		}
		else
		{
			System.out.println("\nR pour retourner au menu principal\n"
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
					getInteret();
				}
				else if(choixMenu.contains("B") || choixMenu.contains("b"))
				{
					getMenuTableaux();
				}
				else if(choixMenu.contains("Q") || choixMenu.contains("q"))
				{
					getEteindre();
				}
		}
		System.out.println("\nR pour retourner au menu principal\n"
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
				getInteret();
			}
			else if(choixMenu.contains("B") || choixMenu.contains("b"))
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
