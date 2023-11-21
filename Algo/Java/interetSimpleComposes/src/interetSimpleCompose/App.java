package interetSimpleCompose;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double interet;
		double somme;
		double annees;
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Entrez une somme : ");
		somme = sc.nextDouble();
		
		System.out.println("Inscrivez l'interêt : ");
		interet = sc.nextDouble();
		
		System.out.println("Pendant combien de temps ? ");
		annees = sc.nextDouble();
		
		double interetSimple = somme*(1+annees*interet/100);
		double interetComposes = somme*(Math.pow(1+(interet/100), annees));
		
		System.out.println("Pour " + somme + "€ déposés la première année, avec " + interet + "% d'intêret : " + interetSimple);
		System.out.println("Pour " + somme + "€ déposés pendant " + annees + " annnée(s), avec " + interet + "% d'intêret : " + interetComposes + " la " + annees + "eme année");
		
		sc.close();
		
		// Bug à trouver
	}

}
