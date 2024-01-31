package table_multiplication_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int choixUtilisateur;
		int i;
		int somme;
		String suivant;
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Souhaitez-vous afficher une autre table ? oui(O), non(N) : ");
			suivant = sc.next();
	

			System.out.println("\tTables de multiplication");
			//int nombre = sc.nextInt();
			do { 
				System.out.print("Saisir un nombre entre 1 et 10 : ");
				int nombre = sc.nextInt();
					for (int i=0; i <= 10; i++) {
					int somme = i*nombre;
					System.out.println(i + "*" + nombre + " = " + somme);
				} 		System.out.print("Souhaitez-vous afficher une autre table ? Y/N : ");
						suivant = sc.next();
			}	while (suivant.contains("Y") || suivant.contains("y"));
		 sc.close();
		}
			
}
		




