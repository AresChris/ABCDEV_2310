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
	static void moyenne()
	{
		System.out.println("Combien de notes ?"); // determine la longueur du tableau
		int nbNotes = sc.nextInt();  	// saisie de l'utilisateur
		
		int[] tabNotes = new int[nbNotes]; // tableau contenant la saisie de l'utilisateur, détermine sa longueur

		int moyenne = 0;
		int compteur = 0;
					for(int i=0; i<=tabNotes.length-1; i++)  // i allant de 0 à la longueur du tableau
					{
						System.out.println("Note " + (i+1) + " :"); // attribut les notes du tableau
						nbNotes = sc.nextInt();	  // Notes de la classe à la longueur du tableau
							if(nbNotes>moyenne) 	// condition si qui stock le nombre de notes au dessus de la moyenne
							{
								compteur += 1; // ajoute 1 pour chaque note au dessus de la moyenne
							}
							moyenne = nbNotes /2; // calcul de la moyenne des notes
						}	
				System.out.println("La moyenne est de " + moyenne); // affiche la moyenne, aide à vérifier l'exactitude du résultat
				System.out.println("Il y à " + compteur + " notes au dessus de la moyenne"); // résultat du nombre de notes au dessus de la moyenne
				
				System.out.println("\nR pour retourner au menu principal"
						+ "\nE pour relancer le dernier programme"
						+ "\nB pour revenir au menu précédent"
						+ "\nQ pour quitter"); 
				String choixMenu = sc.next();
					if(choixMenu.contains("R"))
					{
						getStart();
					}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
					{
						getShowValTab();
					}
					else if(choixMenu.contains("B") || choixMenu.contains("b"))
					{
						getMenuFor();
					}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
					{
						getEteindre();
					}
	}
	static void getMoyenne()
		{
		moyenne();
		}
	static void getShowValTab()
		{
		Show_Val_Tab.showValTab();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	static void getMenuFor()
		{
		Boucle_for.menuBoucleFor();
		}
}
