package exercice_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	public static void month(int longMonth, int shortMonth)
	{
		int[] thirtyOne = {1, 3, 5, 7, 8, 10,12};
		int[] thirty = {4, 6, 9, 11};
		boolean monthThirty = true;
		boolean monthThirtyOne = true;
		int month = 0;
		Scanner sc = new Scanner(System.in);

		//initialisation de la booleenne monthThirtyOne (jours à 31)
		if(month <=31 || month>=1) {
			monthThirtyOne = true;
		}
		else if (month >31 || month <1)
		{
			monthThirtyOne = false;
		}
			//initialisation de la booleenne monthThiry (jours à 30)
			if (month >30 || month <1){
				monthThirty = false;
			}
			else if (month<=30 || month >=1)
			{
				monthThirty = true;
			}
	}
	public static void dateValide(int annee,int mois,int jour) {
			boolean bissextile = (annee%4 == 0 && annee %100 != 0) || annee% 400 == 0; 	// booléenne bissextile = true
			boolean jourValide = true;
			DecimalFormat formater = new DecimalFormat("00"); // Formater à deux nombres
			month(0, 0);
			
			Scanner sc = new Scanner(System.in);

			// initialisation de la boooleenne 'jourValide'
			if (jour>31 || mois>12 || mois<1 || !jourValide) {
					jourValide = false;
			} else if (jour>=1 && jour<=29 && mois == 2 && bissextile || jourValide) {
					jourValide = true;
			} else if (jour>=29 && mois == 2 || !bissextile) {
					jourValide = false;
			}
			// début de la condition true/false 31 jours month
		if(bissextile) {
			jourValide = true;
		} else {
			jourValide=false;
		}
		// début de la condition true/false 30 jours month
			if(!bissextile)
			{
				jourValide = true;
			} else {
				jourValide = false;
			}
		// début de la condition true/false jourValide
			if (jourValide) {
				System.out.print("La date est valide !");
			} else {
				System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ annee + " n'est pas valide !");
			}
		}
	public static void main(String[] args) {
		int month, jour, annee;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrivez le jour : ");
		jour = sc.nextInt();
		
		System.out.println("Inscrivez le numéro du mois : ");
		month = sc.nextInt(); // attribution d'une valeur à la variable 'month'
		
		System.out.println("Inscrivez l'année");
		annee = sc.nextInt();
		
		month(0,0);
		dateValide(0,0,0);
	}

}
