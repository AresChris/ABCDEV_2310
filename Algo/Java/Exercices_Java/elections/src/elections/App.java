package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1;
		int c2;
		int c3;
		int c4;
		int total = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire le score du premier candidat :");
		c1 = sc.nextInt();
		total = total - c1;
		System.out.println("Il reste " + total + " de points possibles.");
		
		System.out.println("Inscrire le score du deuxième candidat :");
		c2 = sc.nextInt();
		total = total - c2;
		System.out.println("Il reste " + total + " de points possibles.");
		
		System.out.println("Inscrire le score du troisième candidat :");
		c3 = sc.nextInt();
		total = total - c3;
		System.out.println(" Il reste " + total + " de points possibles.");
		
		System.out.println("inscrire le score du quatrième candidat :");
		c4 = sc.nextInt();
		total = total - c4;
		System.out.println(" Il reste " + total + " de points possibles.");
		
		boolean won = true;
		boolean beaten = true;
				
				if (c1 >= 50) {
					won = true;
				}
				if (c1 < 12.50) {
					beaten = true;
				}
					do {
					if (c1 > c2 & c1 > c3 && c1 > c4) {
					System.out.print("Le candidat est en tête et participe au second tour !");
				} 	else if (c1 < c2 || c1 < c3 || c1 < c4 && c1 > 12.50) {
					System.out.print("Le candidat n'est pas en tête mais passe au second tour");
				} else if (beaten == true);
					System.out.println("");
				}
			}
				while (beaten = true);
				
				if (won = true) {
				System.out.println("le candidat est élu !");
				} 
			}
		}
	




