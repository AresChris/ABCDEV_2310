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
