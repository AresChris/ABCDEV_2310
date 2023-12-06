package table_multiplication_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int choixUtilisateur;
		int i;
		int somme;
		String suivant = "O";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre entre 1 et 10 : ");
		choixUtilisateur = sc.nextInt();
		for (i=0; i <= 10; i++) {
			somme = i*choixUtilisateur;
			System.out.println(i + "*" + choixUtilisateur + " = " + somme);
			
		}	System.out.print("Souhaitez-vous afficher une autre table ? oui(O), non(N) : ");
			suivant = sc.next();
	
			do { 
			System.out.print("Saisir un nombre entre 1 et 10 : ");
			choixUtilisateur = sc.nextInt();
				for (i=0; i <= 10; i++) {
				somme = i*choixUtilisateur;
				System.out.println(i + "*" + choixUtilisateur + " = " + somme);
			} 		System.out.print("Souhaitez-vous afficher une autre table ? oui(O), non(N) : ");
					suivant = sc.next();
		}	while (suivant == "O");
		 sc.close();
		}
			
		}
		




