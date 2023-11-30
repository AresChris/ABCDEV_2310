package evaluation_30_11_2023;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int position;
		int nb;
		String resultat;
		int nbPrecedent;
		int nbCourant;
		int nbSuivant;
		
		if (quit) {
			System.out.print("Appuyer sur 0 pour quitter);
		}
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Saisir un nombre : ");
		nb = sc.nextInt();
		
		position = 2;
		resultat = "\t0\n\t1";
		nbPrecedent = 0;
		nbCourant = 1;
		
			if (nb > 2) {
				while (position < nb) {
					nbSuivant = nbPrecedent + nbCourant;
					resultat = resultat + "\n\t" + nbSuivant;
					nbPrecedent = nbCourant;
					nbCourant = nbSuivant;
					position +=1;
				}
			} 
				else {
				 nb = 2;
			}
				System.out.println("[La suite de Fibonacci]");
				System.out.println("Les " + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat);
				System.out.print(nb + " nombres affichés");
	}

}
