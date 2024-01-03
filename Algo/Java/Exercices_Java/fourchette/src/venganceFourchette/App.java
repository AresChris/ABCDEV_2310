package venganceFourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int userChoice;
		int min = 0;
		int max = 100;
		int n = 0 + (int)(Math.random() * ((max - min) + 1));
		int computerChoice = (int)(Math.random() * ((max - min) + 1));
		int compteur = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre entier de départ : ");
		userChoice = sc.nextInt();

		while (userChoice != n && computerChoice != n) {
			if (userChoice < n) {
				n = 0 + (int)(Math.random() * ((max - min) + 1));
				computerChoice = (int)(Math.random() * ((max - min) + 1));
				System.out.println("L'ordi : " + computerChoice);
				min = userChoice;
				System.out.println("Le nombre est compris entre " + min + " et " + max + ", plus haut : " );
				userChoice = sc.nextInt();
				compteur +=1;
			}
			else if (userChoice > n) {
					n = 0 + (int)(Math.random() * ((max - min) + 1));
					computerChoice = (int)(Math.random() * ((max - min) + 1));
					System.out.println("L'ordi : " + computerChoice);
					max = userChoice;
					System.out.println("Le nombre est compris entre " + min + " et " + max + ", plus bas : " );
					userChoice = sc.nextInt();
					compteur +=1;
				} else if (computerChoice == n) {
					System.out.println("L'ordinateur à trouvé en " + compteur + "essais");
				}
		} System.out.print("Bravo, vous avez trouvé en " + compteur + " essais");
		sc.close();
	}
}
