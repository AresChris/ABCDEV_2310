package interetBanque;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double interet;
		double somme;
		int annee;
		double interetSimple;
		double interetComposes;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrivez une somme : ");
		somme = sc.nextDouble();
		
		System.out.println("Inscrivez les interêts : ");
		interet = sc.nextDouble();
		
		System.out.println("Inscrivez la durée en année : ");
		annee = sc.nextInt();
				
		interetSimple = somme*(1+annee*interet/100);
		interetComposes = somme*(Math.pow(1+(interet/100),annee));
		
		System.out.println("Pour " + somme + "€ investie, la première année. Avec " + interet + "% d'interet. Le total sera de : " + interetSimple );
		System.out.println("Pour " + somme + "€ investie, avec " + interet + "% d'interet, pendant " + annee + " année(s). Letotal sera de : " + interetComposes );
				
	}

}
