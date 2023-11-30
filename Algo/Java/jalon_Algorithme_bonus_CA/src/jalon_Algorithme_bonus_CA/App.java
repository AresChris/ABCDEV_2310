package jalon_Algorithme_bonus_CA;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int position;
		int nb;
		String resultat;
		int nbPrecedent;
		int nbCourant;
		int nbSuivant;
		int leave;
		
		boolean quit = true;
		
		
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
			do { 
				System.out.println("[La suite de Fibonacci]");
				System.out.println("Les " + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat);
				System.out.println("Combien de nombres de la suite de Fibonacci souhaitez-vous afficher :");
				nb = sc.nextInt();
				System.out.println("Appuyez sur la touche 0 pour quitter le programme");
				leave = sc.nextInt();
				System.out.println(nb + " nombres affichés");
				
				System.out.println(nb + " nombres affichés");

			} while (leave != 0);
			
			
				
	}

}

/*
 * Jalon_Algorithme_30/11/2023_CA

Variables 
    position est un entier
    nb est un entier
    nbPrecedent est un entier
    nbCourant est un entier
    nbSuivant est un entier
    resultat est une chanine de caractères
Début du programme
    Ecrire "Saisir un nombre : "
    lire nb
    positon <-- 2
    resultat <-- "\t0\n\t1"
    nbPrecedent <-- 0
    nbCourant <-- 1
    Début Si
        Si (nb > 2) alors
            Début Tant_Que (position < nb) faire
                nbSuivant <-- nbPrcedent + nbCourant
                resultat <-- resultat ,"\n\t" ,nbSuivant 
                nbPrecedent <-- nbCourant
                nbCourant <-- nbSuivant
                position <-- position +1
            Fin Tant_Que
        Sinon
            nb <-- 2
        Fin Si
    Fin Sinon
        Ecrire "[La suite de Fibonacci]"
        Ecrire "Combien de nombres de la suite de Fibonacci souhaitez-vous affiché :"
        Ecrire ""Les " ,nb ," premiers nombres de la suite de Fibonacci sont \n" ,resultat
        Ecrire ,nb ," nombres affichés");
Fin du programme

 * 
 */
