package vingtDemandes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre;
		int newNb;
		int saved;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Inscrivez un nombre !");
		nombre = sc.nextInt();
		
		for (i=0; i < 7; i++) {
			System.out.print("Nouveau nombre : ");
			newNb = sc.nextInt();
			if (newNb > nombre ) {
				nombre = newNb;
			}
			
		} System.out.print("Le plus grand nombre est : " + nombre);
		
			
	}

}
