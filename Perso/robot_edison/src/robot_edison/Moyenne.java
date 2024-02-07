package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Moyenne {
				// Utiles 
				static Scanner sc = new Scanner(System.in); // Scanner
				static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
				static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
				static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
				static Date date = new Date(); // retourne la date actuelle
				static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
				// Fin de déclaration des utiles
	public boolean moyenne(Robot_Edison edison)
	{
		System.out.println("Combien de notes ?"); // determine la longueur du tableau
		int nbNotes = sc.nextInt();  	// saisie de l'utilisateur
		double[] tabNotes = new double[nbNotes]; // tableau contenant la saisie de l'utilisateur, détermine sa longueur

		double moyenne = 0;
		int supMoyenne = 0;
		double somme = 0;
		
			for(int i = 0; i<tabNotes.length; i++)
			{
				System.out.print("Note " + (i+1) + ":");
				tabNotes[i] = sc.nextInt();
				System.out.print("");
				somme = somme + tabNotes[i];
			}
			moyenne = somme / nbNotes;
			for(int j=0; j<tabNotes.length; j++)
			{
				if(tabNotes[j] > moyenne)
				{
					supMoyenne +=1;
				}
			}
				System.out.println("La moyenne est de " + moyenne); // affiche la moyenne, aide à vérifier l'exactitude du résultat
				System.out.println("Il y à " + supMoyenne + " notes au dessus de la moyenne"); // résultat du nombre de notes au dessus de la moyenne
				
				System.out.println("Afficher le code ? Y/N");
				String affichage = sc.next();
				if(affichage.contains("Y") || affichage.contains("y"))
				{
					System.out.print("\tint nbNotes = sc.nextInt();  	// saisie de l'utilisateur\r\n"
							+ "		double[] tabNotes = new double[nbNotes]; // tableau contenant la saisie de l'utilisateur, détermine sa longueur\r\n"
							+ "\r\n"
							+ "		double moyenne = 0;\r\n"
							+ "		int supMoyenne = 0;\r\n"
							+ "		double somme = 0;\r\n"
							+ "		\r\n"
							+ "			for(int i = 0; i<tabNotes.length; i++)\r\n"
							+ "			{\r\n"
							+ "				System.out.print(\"Note \" + (i+1) + \":\");\r\n"
							+ "				tabNotes[i] = sc.nextInt();\r\n"
							+ "				System.out.print(\"\");\r\n"
							+ "				somme = somme + tabNotes[i];\r\n"
							+ "			}\r\n"
							+ "			moyenne = somme / nbNotes;\r\n"
							+ "			for(int j=0; j<tabNotes.length; j++)\r\n"
							+ "			{\r\n"
							+ "				if(tabNotes[j] > moyenne)\r\n"
							+ "				{\r\n"
							+ "					supMoyenne +=1;\r\n"
							+ "				}\r\n"
							+ "			}\r\n"
							+ "				System.out.println(\"La moyenne est de \" + moyenne); // affiche la moyenne, aide à vérifier l'exactitude du résultat\r\n"
							+ "				System.out.println(\"Il y à \" + supMoyenne + \" notes au dessus de la moyenne\"); // résultat du nombre de notes au dessus de la moyenne");
				}
				
				
					System.out.println("\nR pour retourner au menu principal\n"
							+ "E pour relancer le dernier programme"
							+ "\nB pour revenir au menu précédent"
							+ "\nQ pour quitter"); 
					String choixMenu = sc.next();
					
						if(choixMenu.contains("R") || choixMenu.contains("r"))
							{
							edison.start();
							}
						else if(choixMenu.contains("E") || choixMenu.contains("e"))
							{
							edison.getMoyenne();
							}
						else if(choixMenu.contains("B") || choixMenu.contains("b"))
							{
							edison.menuBoucleFor();
							}
						else if(choixMenu.contains("Q") || choixMenu.contains("q"))
							{
							edison.getEteindre();
							}
						return true;
	}
}
