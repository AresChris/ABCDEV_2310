package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Rectangle {

	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			public static int batteryLeft;
		// Fin des utiles	
			
	public boolean rectangle()
	{
		System.out.println("\tCalculs du périmètre et de la surface d'un rectangle "
				+ "\nLongueur en cm :");
		int longueur = sc.nextInt();
		System.out.println("Largeur en cm : ");
		int largeur = sc.nextInt();
		int surface = longueur * largeur;
		int perimetre = (longueur + largeur) * 2;
		System.out.println("\tSurface = " + surface + "cm\n\tPerimètre = " + perimetre + "cm");
		System.out.println("Afficher le code ? Y/N");
		String afficher = sc.next();
		if(afficher.contains("Y") || afficher.contains("y"))
		{
			System.out.println("System.out.println(\"\\tCalculs du périmètre et de la surface d'un rectangle \"\n"
					+ "					+ \"\\nLongueur en cm :\");\n"
					+ "			int longueur = sc.nextInt();\n"
					+ "			System.out.println(\"Largeur en cm : \");\n"
					+ "			int largeur = sc.nextInt();\n"
					+ "			int surface = longueur * largeur;\n"
					+ "			int perimetre = (longueur + largeur) * 2;\n"
					+ "			System.out.println(\"\\tSurface = \" + surface + \"cm\\n\\tPerimètre = \" + perimetre + \"cm\");\n"
					+ "			System.out.println(\"\\nR pour retourner au menu principal\\n\"\n"
					+ "					+ \"E pour relancer le dernier programme\"\n"
					+ "					+ \"\\nB pour revenir au menu précédent\"\n"
					+ "					+ \"\\nQ pour quitter\"); \n"
					+ "			String answer = sc.next();\n"
					+ "			do {\n"
					+ "				if(answer.contains(\"R\") || answer.contains(\"r\"))\n"
					+ "				{\n"
					+ "					this.start();\n"
					+ "				}\n"
					+ "				else if(answer.contains(\"E\") || answer.contains(\"e\"))\n"
					+ "				{\n"
					+ "					rectangle();\n"
					+ "				}\n"
					+ "				else if(answer.contains(\"B\") || answer.contains(\"b\"))\n"
					+ "				{\n"
					+ "					menuCalculs();\n"
					+ "				}\n"
					+ "				else\n"
					+ "				{\n"
					+ "					System.out.println(\"\\n\\n\\tMenu principal\\nLe niveau de batterie est de \" + this.batteryLeft + \"%\"\n"
					+ "							+ \"\\nNous somme le \" + dateFormat.format(date) + \n"
					+ "							\"\\nIl est \" + hourFormat.format(calendar.getTime()));\n"
					+ "				}\n"
					+ "			} while(answer.contains(\"E\") || answer.contains(\"e\"));"
					+ "\n------------------------------------------------------------------");
		}
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
				rectangle();
			}
			else if(choixMenu.contains("b") || choixMenu.contains("Q"))
			{
				getMenuCalcul();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
			return true;
}
	// Getters
	public boolean getRectangle()
		{
		return rectangle();
		}
	public boolean getStart()
		{
		return getStart();
		}
	public boolean getMenuCalcul()
		{
		return getMenuCalcul();
		}
	public boolean getEteindre()
		{
		return getEteindre();
		}
	// Fin des getters
}
