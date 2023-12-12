package exercice_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombres, nbPositif = 0, nbNegatif = 0;
		int i, j;
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Combien de valeurs voulez-vous saisir ?");	
		nombres = sc.nextInt();
		int[] tableau = new int[nombres];
		sc.close();
		
		for (i =0; i<= tableau.length-1; i++) {
			System.out.println("Saisisser un nombre : ");
			tableau[i] = sc.nextInt();
			
			if (nombres >0) {
				nbPositif += 1;
			} 
			else {
				nbNegatif += 1;
			}
			
		} for (j=0; j <= tableau.length-1 ;j++) {
			System.out.println(tableau[j] + " ");
		}
		System.out.println("Le nombre de valeurs positives est de " + nbPositif);
		System.out.println("le nombre de valeurs négatives est de " + nbNegatif);
		
		
	}

}
