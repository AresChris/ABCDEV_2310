package bissextileVariantes;

import java.text.DecimalFormat;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
	int anneeA;
	int mois;
	int jour;
	
		DecimalFormat formater = new DecimalFormat("00");
		Scanner sc = new Scanner(System.in);

		System.out.print("Inscrire le jour : ");
		jour = sc.nextInt();
		
		System.out.print("Inscrire le numéro du mois : ");
		mois = sc.nextInt();
		
		System.out.print("Inscrire l'année : ");
		anneeA = sc.nextInt();
		
		sc.close();
		
		boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0;
		boolean notBissextile;
		
	
		if (!bissextile) {
			if (jour == 29 && mois == 2) {
				System.out.print("Il n'y à pas de 29 février dans l'année, " + anneeA + " et elle n'est pas bissextile !");
			} else {
				System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
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
	}
	

		
	