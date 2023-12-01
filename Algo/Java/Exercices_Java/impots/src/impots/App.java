package impots;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 EXERCICE 6

Variables
	genre est une chaine de caracteres
	age est un entier
	condition1 est un booleen
	condition2 est un booleen
Debut du programme
	Ecrire "Saisir le genre (M/F) : "
	Lire genre
	Ecrire "Saisir l'age : "
	Lire age
	condition1 <-- genre = "M" ET age > 20
	condition2 <-- genre = "F" ET (age > 18 ET age < 35)
Debut Si
	Si condition1 = vrai OU condition2 = vrai
	Alors Ecrire "Imposable"
	Sinon Ecrire "Non Imposable"
Fin Si
Fin du programme
		 */
		
		String genre;
		int age;
		boolean condition1;
		boolean condition2;
		
		
		Scanner sc = new Scanner(System.in);
		
		//Saisies utilisateur
		System.out.println("Saisir le genree");
		genre = sc.next();
		
		System.out.println("Saisir l'âge");
		age = sc.nextInt();
		
		condition1 = genre;
		
		while () {
			
		}
		
	}

}
