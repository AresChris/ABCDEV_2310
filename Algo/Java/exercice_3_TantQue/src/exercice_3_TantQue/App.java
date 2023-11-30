package exercice_3_TantQue;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nbDepart;
		int compteur;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire un nombre de départ");
		nbDepart = sc.nextInt();
		compteur = nbDepart;
		sc.close();
		
		while (compteur < nbDepart + 10) {
			compteur += 1;
			System.out.println(compteur);
		}

	}

}
