package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c1;
		double c2;
		double c3;
		double c4;
		double total = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire le score du premier candidat :");
		c1 = sc.nextDouble();
		total = total - c1;
		System.out.println("Il reste " + total + " de points possibles.");
		
		System.out.println("Inscrire le score du deuxième candidat :");
		c2 = sc.nextDouble();
		total = total - c2;
		System.out.println("Il reste " + total + " de points possibles.");
		
		System.out.println("Inscrire le score du troisième candidat :");
		c3 = sc.nextDouble();
		total = total - c3;
		System.out.println(" Il reste " + total + " de points possibles.");
		
		System.out.println("inscrire le score du quatrième candidat :");
		c4 = sc.nextDouble();
		total = total - c4;
		System.out.println(" Il reste " + total + " de points possibles.");
		
		sc.close();
		
				if (c1 < 12.50) {
					System.out.print("Le candidat est battu!");
				} 	
				else if (c1 >= 50) {
					System.out.print("Le candidat est élu");
				} 	
				else if (c1 > c2 && c1 > c3 && c1 > c4) {
					System.out.println("Le candidat est en tête !");
				} 	
				else if (c1 < c2 || c1 < c3 || c1 < c4 && c1 >= 12.50) {
					System.out.println("Le candidat n'est pas en tête mais passe au second tour");
				}
				}
			}
		
	




