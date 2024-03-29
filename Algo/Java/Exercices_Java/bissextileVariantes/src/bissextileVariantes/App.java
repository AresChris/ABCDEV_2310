package bissextileVariantes;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class App {

		// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			// Fin de déclaration des utiles
			
	public static void main(String[] args) {
		
	int anneeA;
	int mois;
	int jour;
	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Inscrire le jour : ");
		jour = sc.nextInt();
		
		System.out.print("Inscrire le numéro du mois : ");
		mois = sc.nextInt();
		
		System.out.print("Inscrire l'année : ");
		anneeA = sc.nextInt();
		
		sc.close();
		
		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;

		if (!bissextile) {
			if (jour == 29 && mois == 2) {
				System.out.print("Il n'y à pas de 29 février dans l'année, " + anneeA + " et elle n'est pas bissextile !");
			} else {
				System.out.print("la date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
			}
		}
		if (bissextile) {
				if (jour == 29 && mois == 2) 
				{
					System.out.print("la date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
				}
				else 
				{
					System.out.print("La date du " + decimalFormat.format(jour) + "/" + decimalFormat.format(mois) +"/"+ anneeA + " n'est pas dans une année bissextile !");
				}
			} 
		}	
	}
	

		
	