package categorieEnfants;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageA;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inscrivez l'âge de l'enfant : ");
		ageA = sc.nextInt();
		
		if (ageA>=6 && ageA <= 7) {
			System.out.println("Catégorie Poussin.");
		}
		else if (ageA>=8 && ageA<=9) {
			System.out.println("Catégorie Pupille.");
		}
		else if (ageA>=10 && ageA<=11) {
			System.out.println("Catégorie Minime.");
		}
		else if (ageA<6) {
			System.out.println("Inscription impossible, l'enfant est trop jeune");
		}
		else {
			System.out.println("Catégorie Cadet.");
			
			sc.close();
		}
	}
}


