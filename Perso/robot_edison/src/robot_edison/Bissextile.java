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
		System.out.print("Inscrire le jour : ");
		int jour = sc.nextInt();
		
		System.out.print("Inscrire le numéro du mois : ");
		int mois = sc.nextInt();
		
		System.out.print("Inscrire l'année : ");
		int anneeA = sc.nextInt();
		
		sc.close();
		
		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;

		
	
		if (!bissextile) {
			if (jour == 29 && mois == 2) {
				System.out.print("Il n'y à pas de 29 février dans l'année, " + anneeA + " et elle n'est pas bissextile !");
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
	}
	static void getBissextile()
	{
		bissextile();
	}
}
