package renduMonnaie_Exercice8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int bill, paid, difference, change = 0;
		int i;
		boolean one, five, ten;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quelle somme a été donnée ?");
			paid = sc.nextInt();
		System.out.println("Quelle est la facture ?");
			bill = sc.nextInt();
			
		
			
		difference = paid - bill;
		System.out.println("La somme à rendre est de " + difference + "€");
		
		one = difference <=5;	
		five = difference >5 && difference <10;
		ten = difference >10;
		
		for (i = 0; i < difference; i++) {
			if (one) {
				i = difference * i;
				change = 1 * i;
			} else if (five) {
				i = difference * i;
				change = 5 * i;
			} else if (ten) {
				change = 5 * i;
			}
			
			System.out.println("Le rendu monnaie est de " + i + " €");
			
		}

		
			
						
						
	}
}
			
		
		
			
	