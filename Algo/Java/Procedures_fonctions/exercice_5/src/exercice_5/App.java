package exercice_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	public static void dateValide(int annee,int mois,int jour) {
			boolean bissextile = (annee%4 == 0 && annee %100 != 0) || annee% 400 == 0; 	// booléenne bissextile = true
			boolean jourValide = true;
			DecimalFormat formater = new DecimalFormat("00"); // Formater à deux nombres
			
			// initialisation de la boooleenne 'jourValide'
			if (jour>31 || mois>12 || mois<1) {
					jourValide = false;
			} else if (jour>=1 && jour<=29 && mois == 2 && bissextile) {
					jourValide = true;
			} else if (jour>29 && mois == 2 || !bissextile) {
					jourValide = false;
			}
		// début de la condition true/false
		if (jourValide) {
				System.out.print("La date est valide !");
			} else {
				System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ annee + " n'est pas valide !");
			}
		}
	public static void main(String[] args) {
		int annee;
		int mois;
		int jour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inscrivez l'année : ");
		annee = sc.nextInt();
		System.out.print("Inscrivez le mois : ");
		mois = sc.nextInt();
		System.out.print("Inscrivez le jour : ");
		jour = sc.nextInt();
		
		sc.close();
		
		dateValide(annee, mois, jour);
	}

}
