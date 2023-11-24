package nombrePremier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nombreN;
		int i;
		int compteur;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrivez un nombre entier : ");
		nombreN = sc.nextInt();
		
		compteur = 0;
		i = 2;
		
		for (i = 1; i <= nombreN-1; i++ ) {
			if (nombreN %i == 0) {
				i = i+1;
				System.out.println(nombreN + "n'est pas premier");
			}
			else if (nombreN %i == 2) {
				i = i++;
				System.out.println(nombreN + "est premier");
			}
			
			sc.close();			
			}
		
			}
		
		}



/*
 * System.out.println(nombreN + " est divisible par : " + i);
 * 
 * 
 */
