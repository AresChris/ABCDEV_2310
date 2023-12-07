package saisie0_Exercice_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre;
		int newNb=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Inscrivez un nombre : ");
		nombre = sc.nextInt();
		
		while (nombre != 0) {
			System.out.println("Inscrivez un nouveau nombre : ");
			nombre = sc.nextInt();
				
			if (nombre > newNb)
					newNb = nombre;
		}
		System.out.print("Le chiffre le plus haut est " + newNb);
		
		
		sc.close();
			
		}	
			
		}		 
		
	
		
		
			
				
	

	


