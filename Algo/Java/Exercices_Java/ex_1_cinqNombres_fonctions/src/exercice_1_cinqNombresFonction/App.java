package exercice_1_cinqNombresFonction;

import java.util.Scanner;

public class App {
	public static void calcul(int somme) {
		// variables
		int  nbSaisie, saisie;
		int[] sommeNombres;
		int[] tabNombres;
		Scanner sc = new Scanner(System.in);
		
		// demande à l'utilisateur
				System.out.print("Combien de nombres voulez-vous saisir ?");
				nbSaisie = sc.nextInt();
				tabNombres = new int[nbSaisie];
		
		// début boucle for
		for(int i= 0; i<= tabNombres.length-1; i++) {
			System.out.print("Saisir un nombre :");
			saisie = sc.nextInt();
			somme = somme + saisie;
		}
		System.out.print("Le resultat est " + somme + " !");	// print du résultat
	}
	public static void main(String[] args) {
		// variables
		int  nbSaisie, saisie, somme = 0;
		int[] sommeNombres;
		int[] tabNombres;
		Scanner sc = new Scanner(System.in);

		// appel de la fonction
		calcul(somme);
	}	
}
	
	



