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
		boolean moisValide = true, fevrier = true, monthThirty = true, jourValide = true;
		
		System.out.print("Jour : ");
		jour = sc.nextInt();
		
		System.out.print("Numéro du mois : ");
		mois = sc.nextInt();
		
		System.out.print("Année : ");
		anneeA = sc.nextInt();
		
		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;  // Initialisation de la booleenne bissextile
		
			// Initialisation des booléens 
		// Initialisation de la booléenne fevrier
		if((mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour <=30 && jour >=1))
		{
			monthThirty = true; // mois à 30 jours
		}
		// Initialisation des booléens jour et mois
			
		// Initialisation de la booléeens qui vérifie que les conditions sont réunies pour que la date soit valide
			
				if((jour>=1 && jour<=30))
				{
					jourValide = true;
				}
			if((mois>=1 && mois<=12))  // Si les booléens date et mois sont true
			{
				moisValide = true;
			}
	// --------------------------------------------
			if(moisValide && jourValide && monthThirty)
			{
				if(bissextile)
					{
						System.out.println("La date du " + jour + "/" + mois + "/" + anneeA + " est dans une année bissextile.");
					
					}else
					{
						System.out.println("La date du " + jour + "/" + mois + "/" + anneeA + " n'est pas dans une année bissextile");
					}
				// sinon date non valide
			}
			else if(moisValide && !monthThirty)
			{
				if(bissextile)
				{
					if(jour <1 || jour > 31)
					{
						System.out.println("La date n'est pas valide");
					}	
					else
					{
						System.out.println("La date du " + jour + "/" + mois + "/" + anneeA + " est dans une année bissextile");
					}
				}
				else
				{
					System.out.println("La date du " + jour + "/" + mois + "/" + anneeA + " est dans une année bissextile");
				}
			}		
	}
	static void bissextile()
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
					+ "		boolean jourValide = true, moisValide = true, dateValide = true, monthThirty = false, monthThirtyOne = false;\n"
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
					+ "		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;  // Initialisation de la booleenne bissextile\n"
					+ "		\n"
					+ "			// Initialisation des booléens en fonction des mois en entier\n"
					+ "		if(mois ==2 || mois == 4 || mois == 6 || mois == 9 || mois == 11)\n"
					+ "		{\n"
					+ "			monthThirty = true;  // mois à 30 jours\n"
					+ "		}\n"
					+ "		if((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12))\n"
					+ "		{\n"
					+ "			monthThirtyOne = true; // mois à 31 jours\n"
					+ "		}\n"
					+ "			// Initialisation des booleennes jour et mois\n"
					+ "		if(jour > 31 || jour <1)\n"
					+ "		{\n"
					+ "			jourValide = false; // jours compris entre 1 et 31\n"
					+ "		}\n"
					+ "		if(mois > 12 || mois < 1)\n"
					+ "		{\n"
					+ "			moisValide = false; // mois compris entre 1 et 12\n"
					+ "		}\n"
					+ "			// Initialisation de la booleenne qui vérifie que les conditions sont réunies pour que la date soit valide\n"
					+ "		if(jourValide && moisValide)  // si mois à 30 jour ET jour entre 1 et 30 ET mois entre 1 et 12\n"
					+ "		{\n"
					+ "			dateValide = true;\n"
					+ "		}\n"
					+ "		// --------------------------------------------\n"
					+ "		if(!bissextile) \n"
					+ "		{\n"
					+ "			if(dateValide)\n"
					+ "			{\n"
					+ "				if (jour == 29 && mois == 2) \n"
					+ "				{\n"
					+ "					System.out.println(\"Il n'y à pas de 29 février dans l'année \" + anneeA + \", et elle n'est pas bissextile !\");\n"
					+ "				} \n"
					+ "				else \n"
					+ "				{\n"
					+ "					System.out.println(\"La date n'est pas valide !\");\n"
					+ "				}\n"
					+ "		}\n"
					+ "			else\n"
					+ "			{\n"
					+ "				System.out.print(\"la date du \\\" + decimalFormat.format(jour) + \\\"/\\\" + formater.format(mois) +\\\"/\\\"+ anneeA + \\\" est dans une année bissextile !\"); //\n"
					+ "			}\n"
					+ "		} \n"
					+ "			else \n"
					+ "			{\n"
					+ "			if (jour == 29 && mois == 2)\n"
					+ "			{\n"
					+ "				if(dateValide)\n"
					+ "				{\n"
					+ "					System.out.println(\"la date du \" + formater.format(jour) + \"/\" + formater.format(mois) +\"/\"+ anneeA + \" est dans une année bissextile !\");\n"
					+ "				}\n"
					+ "				else \n"
					+ "				{\n"
					+ "					System.out.println(\"La date du \" + formater.format(jour) + \"/\" + formater.format(mois) +\"/\"+ anneeA + \" n'est pas dans une année bissextile !\");\n"
					+ "				}\n"
					+ "			} \n"
					+ "			else\n"
					+ "			{\n"
					+ "				System.out.print(\"La date n'est pas valide !\\n\");\n"
					+ "			}\n"
					+ "}\n");
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
					getMenuCalculs();
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
	static void getMonthThirty()
		{
		Mois.getMonthThirty();
		}
	static void getMonthThirtyOne()
		{
		Mois.getMonthThirtyOne();
		}
	static void getFevrier()
		{
		Mois.getFevrier();
		}
	// Fin des Getters
}
