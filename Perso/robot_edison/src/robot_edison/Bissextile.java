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
	static void verifierValide()
	{
		int mois = 0;
		int jour = 0;
		int anneeA;
		boolean moisValide = true, jourValide = true, bissextile;
		
		System.out.print("Jour : ");
		jour = sc.nextInt();
		
		System.out.print("Numéro du mois : ");
		mois = sc.nextInt();
		
		System.out.print("Année : ");
		anneeA = sc.nextInt();
		
		 
				if((anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0)
				{
					bissextile = true;// Initialisation de la booleenne bissextile
				}
				else
				{
					bissextile = false;
				}
	// Initialisation des booléens jour et mois
				if(jour>=1 && jour<=31)
				{
					jourValide = true;
				}
				else 
				{
					jourValide = false;
				}
			if((mois>=1 && mois<=12))  // Si les booléens date et mois sont true
			{
				moisValide = true;
			}
			else
			{
				moisValide = false;
			}
	//-------------------------------------------------
			if(moisValide && jourValide)
			{
				if(bissextile)
					{
						if (jour > 29 && mois == 2)
						{
							System.out.println("Date non valide");
						}
						else if(jour <= 29 && mois == 2)
						{
							System.out.println("La date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) + "/" + anneeA + " est dans une année bissextile");
						}
						else
						{
							System.out.println("La date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) + "/" + anneeA + " est dans une année bissextile");
						}
					}
				else
					{
						if(jour > 29 && mois == 2)
						{
							System.out.println("Date non valide");
						}
						else if(jour <= 29 && mois == 2)
						{
							System.out.println("La date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) + "/" + anneeA + " n'est pas dans une année bissextile");
						}
						else
						{
							System.out.println("La date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) + "/" + anneeA + " n'est pas dans une année bissextile");
						}
					}
			}
			else
				{
					System.out.println("Date non valide");
				}
	}
	public boolean bissextile()
	{
		System.out.println("\t\tBiisextile\n\tVérifie si une date est valide\n\t et si l'année est bissextile\n\t------------------------------\n");
		verifierValide();
		
		System.out.print("Afficher le code ? Y/N");
		String affichage = sc.next();
		if(affichage.contains("Y") || affichage.contains("y"))
		{
			System.out.println("\tint mois = 0;\n"
					+ "		int jour = 0;\n"
					+ "		int anneeA;\n"
					+ "		boolean moisValide = true, jourValide = true, bissextile;\n"
					+ "		\n"
					+ "		System.out.print(\"Jour : \");\n"
					+ "		jour = sc.nextInt();\n"
					+ "		\n"
					+ "		System.out.print(\"Numéro du mois : \");\n"
					+ "		mois = sc.nextInt();\n"
					+ "		\n"
					+ "		System.out.print(\"Année : \");\n"
					+ "		anneeA = sc.nextInt();\n"
					+ "		\n"
					+ "		 \n"
					+ "				if((anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0)\n"
					+ "				{\n"
					+ "					bissextile = true;// Initialisation de la booleenne bissextile\n"
					+ "				}\n"
					+ "				else\n"
					+ "				{\n"
					+ "					bissextile = false;\n"
					+ "				}\n"
					+ "	// Initialisation des booléens jour et mois\n"
					+ "				if(jour>=1 && jour<=31)\n"
					+ "				{\n"
					+ "					jourValide = true;\n"
					+ "				}\n"
					+ "				else \n"
					+ "				{\n"
					+ "					jourValide = false;\n"
					+ "				}\n"
					+ "			if((mois>=1 && mois<=12))  // Si les booléens date et mois sont true\n"
					+ "			{\n"
					+ "				moisValide = true;\n"
					+ "			}\n"
					+ "			else\n"
					+ "			{\n"
					+ "				moisValide = false;\n"
					+ "			}\n"
					+ "	//-------------------------------------------------\n"
					+ "			if(moisValide && jourValide)\n"
					+ "			{\n"
					+ "				if(bissextile)\n"
					+ "					{\n"
					+ "						if (jour > 29 && mois == 2)\n"
					+ "						{\n"
					+ "							System.out.println(\"Date non valide\");\n"
					+ "						}\n"
					+ "						else if(jour <= 29 && mois == 2)\n"
					+ "						{\n"
					+ "							System.out.println(\"La date du \" + decimalFormat.format(jour) + \"/\" + decimalFormat.format(mois) + \"/\" + anneeA + \" est dans une année bissextile\");\n"
					+ "						}\n"
					+ "						else\n"
					+ "						{\n"
					+ "							System.out.println(\"La date du \" + decimalFormat.format(jour) + \"/\" + decimalFormat.format(mois) + \"/\" + anneeA + \" est dans une année bissextile\");\n"
					+ "						}\n"
					+ "					}\n"
					+ "				else\n"
					+ "					{\n"
					+ "						if(jour > 29 && mois == 2)\n"
					+ "						{\n"
					+ "							System.out.println(\"Date non valide\");\n"
					+ "						}\n"
					+ "						else if(jour <= 29 && mois == 2)\n"
					+ "						{\n"
					+ "							System.out.println(\"La date du \" + decimalFormat.format(jour) + \"/\" + decimalFormat.format(mois) + \"/\" + anneeA + \" n'est pas dans une année bissextile\");\n"
					+ "						}\n"
					+ "						else\n"
					+ "						{\n"
					+ "							System.out.println(\"La date du \" + decimalFormat.format(jour) + \"/\" + decimalFormat.format(mois) + \"/\" + anneeA + \" n'est pas dans une année bissextile\");\n"
					+ "						}\n"
					+ "					}\n"
					+ "			}\n"
					+ "			else\n"
					+ "				{\n"
					+ "					System.out.println(\"Date non valide\");\n"
					+ "				}");
		}
		else
		{
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
					getMenuCalcul();
				}
				else if(choixMenu.contains("Q") || choixMenu.contains("q"))
				{
					getEteindre();
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
				getMenuCalcul();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
		 
		sc.close();
		return true;
	}
	
	// Getters
	public boolean getBissextile()
		{
		return bissextile();
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
	// Fin des Getters
}
