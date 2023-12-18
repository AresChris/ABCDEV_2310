package exercice_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	public static void month(String longMonth; String shortMonth)
	{
		char[] thirtyOne = ["Janvier", "mars", "mai", "Juillet", "Août", "Octobre","decembre"];
		char[] thirty = ["Avril", "Juin", "Septembre", "Novembre"];
		boolean monthThirty = true;
		boolean monthThirtyOne = true;

		//initialisation de la booleenne monthThirtyOne (jours à 31)
		if(day <=31 || day>=1) {
			monthThirtyOne = true;
		}
		else if (day >31 || day <1)
		{
			monthThirtyOne = false;
		}
			//initialisation de la booleenne monthThiry (jours à 30)
			if (day >30 || day <1){
				monthThirty = false;
			}
			else if (day<=30 || day >=1)
			{
				monthThirty = true;
			}
	}
	public static void dateValide(int annee,int mois,int jour) {
			boolean bissextile = (annee%4 == 0 && annee %100 != 0) || annee% 400 == 0; 	// booléenne bissextile = true
			boolean jourValide = true;
			DecimalFormat formater = new DecimalFormat("00"); // Formater à deux nombres
			
			// initialisation de la boooleenne 'jourValide'
			if (jour>31 || mois>12 || mois<1 || !trueMonth) {
					jourValide = false;
			} else if (jour>=1 && jour<=29 && mois == 2 && bissextile || trueMonth) {
					jourValide = true;
			} else if (jour>=29 && mois == 2 || !bissextile) {
					jourValide = false;
			}
			// début de la condition true/false 31 jours month
		if(monthThirtyOne) {
			jourValide = true;
		} else {
			jourValide=false;
		}
		// début de la condition true/false 30 jours month
			if(monthThirty)
			{
				jourValide = true;
			} else {
				jourValide = false;
			}
			jourvalide = true;

		// début de la condition true/false jourValide
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
