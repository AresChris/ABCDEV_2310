package bissextileVariantes;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class App {

	public static void main(String[] args) {
		
	int anneeA;
	String mois;
	int jour;
	
	
		Scanner sc = new Scanner(System.in);

		Calendar calendar = new GregorianCalendar();
		
		
		System.out.print("Inscrire le jour : ");
		jour = sc.nextInt();
		
		System.out.print("Inscrire le mois : ");
		mois = sc.next();
		
		System.out.print("Inscrire l'année : ");
		anneeA = sc.nextInt();
		
		sc.close();
		
		boolean february = mois.contains("fevrier");
		boolean day = true;
		boolean bissextileDay = true;
		boolean notBissextile = true;
		if (jour == 29) {
			day = true;
		}
		if (mois != "fevrier") {
			february = false;
		}
		if (anneeA%4 == 0 && anneeA %100 != 0 || anneeA% 400 == 0) {
			bissextileDay = true;
		}
		if (bissextileDay) {
			notBissextile = true;
		}
		
		if (february && day && bissextileDay) {
			System.out.printf("Le 29 Février indique une année bissextile, donc le " + jour + " " + mois + " " + anneeA + " est dans un année bissextile.");
		}	else if (!bissextileDay) {
			System.out.printf("Le " + jour + " " + mois + " " + anneeA + " est dans un année bissextile.");
		} 	else if (notBissextile){
			System.out.printf("Le " + jour + " " + mois + " " + anneeA + " n'est pas dans une année bissextile.");	
		}	else if (february && day && notBissextile){ 
			System.out.printf("Le 29 Février n'existe pas dans l'année " + anneeA + " mais elle n'est pas bissextile.");
		}
			
		
	}
	
}		

		
	