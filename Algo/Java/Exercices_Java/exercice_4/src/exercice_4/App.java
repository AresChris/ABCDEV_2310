package exercice_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nbDepart;
		int i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inscrire un nombre de départ");
		nbDepart = sc.nextInt();
		
		
		for (i=1; i<= nbDepart; i++) {
			sum = sum +i;
		}
		System.out.print("La somme est de " + sum);
		
	}
		
		
	}


