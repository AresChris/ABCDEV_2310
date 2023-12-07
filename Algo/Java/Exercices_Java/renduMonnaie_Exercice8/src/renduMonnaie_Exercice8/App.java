package renduMonnaie_Exercice8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int facture = 0, prix = 1, rendu = 0, i, b10E = 0, b5E = 0, p1; 
		
		Scanner sc = new Scanner(System.in);
		
			
		
			while (prix != 0) {
				System.out.println("Prix de l'article : ");
				prix = sc.nextInt();
				facture += prix;
			}	if (facture >5) {
				b5E += 1;
				}else if (facture >10) {
				b10E += 1;
			}	else {
				rendu += 1;
			}
				System.out.print("La somme à rendre est de : " );
				System.out.print("Billets de 5€ : " + b5E);
				System.out.print("Nombre de billets de 10€ : " + b10E);
				System.out.print("Pièces de 1€" + rendu);
			
				sc.close();
			
		}

	}
	
			
						
						

			
		
		
			
	