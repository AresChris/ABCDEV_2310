package table_Multiplication_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int choixUtilisateur;
		int i;
		int somme;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		choixUtilisateur = sc.nextInt();
		sc.close();
		
		for (i=0; i <= 10; i++) {
			somme = i*choixUtilisateur;
			System.out.println(i + "*" + choixUtilisateur + " = " + somme);
	}
		
}
}
