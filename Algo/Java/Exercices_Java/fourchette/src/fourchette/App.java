package fourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	

		
		int userChoice;
		int min = 0;
		int max = 100;
		int n = 0 + (int)(Math.random() * ((max - min) + 1));
		int compteur = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre entier de départ : ");
		userChoice = sc.nextInt();
		
		boolean above = userChoice > n;
		boolean under = userChoice < n;
		
		
		while (userChoice != n) {
			if (userChoice < n) {
				min = userChoice;
				System.out.print("Le nombre est compris entre " + min + " et " + max + ", plus haut : " );
				userChoice = sc.nextInt();
				compteur +=1;
			}
		else if (userChoice > n) {
				max = userChoice;
				System.out.print("Le nombre est compris entre " + min + " et " + max + ", plus bas : " );
				userChoice = sc.nextInt();
				compteur +=1;
			}
				
		} System.out.print("Bravo, vous avez trouvé en " + compteur + " essais");
		sc.close();
	}
		

	
}
