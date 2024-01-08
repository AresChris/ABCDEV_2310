package rechercheCaractere;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//déclaration des variables
		String saisie = "", lettre = "a";
		int saved = 0;
		char[] tabSaisie; //saisie va dans le tableau tabSaisie
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//attribution de valeur par l'utilisateur
		System.out.println("Saisissez quelque chose : ");
		saisie = sc.next();
		tabSaisie = saisie.toCharArray();
		
		boolean chaine = true;
		
			// i part de 0 jusqu'à la longueur du tableau -1
			for(int i=0; i<= tabSaisie.length-1; i++) {
				if(saisie.equals("a") == tabSaisie.equals(i)) {
					saved = i;
					chaine = true;
				} else if (saisie == ".") {
					System.out.println("La phrase est vide");
				} else if (saisie.equals("") != tabSaisie.equals(saisie)) {
					System.out.println("la lettre n'est pas présente");
					chaine = false;
				}
			}
			if(chaine) {
				System.out.println("La lettre est présente " + saved + " fois.");
			} else if (!chaine) {
				System.out.println("La lettre n'est pas présente !");
			} else {
				System.out.println("La phrase est vide !");
			}
			
		sc.close();
		

	}

}
