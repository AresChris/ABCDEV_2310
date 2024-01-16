package exercice_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int saisie, compteur;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de notes ?"); // determine la longueur du tableau
		saisie = sc.nextInt();  	// saisie de l'utilisateur
		
		int[] tabNotes = new int[saisie]; // tableau contenant la saisie de l'utilisateur, détermine sa longueur

		moyenne = 0;
		compteur = 0;
			for(int i=0; i<=tabNotes.length-1; i++)  // i allant de 0 à la longueur du tableau
			{
				System.out.println("Note " + (i+1) + " :"); // attribut les notes du tableau
				saisie = sc.nextInt();	
				moyenne = (moyenne + saisie) /2;  // calcul de la moyenne des notes
					if(saisie>moyenne) // condition si qui stock le nombre de notes au dessus de la moyenne
					{
						compteur += 1; // ajoute 1 pour chaque note au dessus de la moyenne
					}
			}
				System.out.println("La moyenne est de " + moyenne); // affiche la moyenne, aide à vérifier l'exactitude du résultat
				System.out.println("Il y à " + compteur + " notes au dessus de la moyenne"); // résultat du nombre de notes au dessus de la moyenne
	}

}
