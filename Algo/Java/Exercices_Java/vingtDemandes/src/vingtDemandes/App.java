package vingtDemandes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre;
		int newNb;
		int position = 0;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Inscrivez un nombre :");
		nombre = sc.nextInt();
		
		for (i=0; i < 20; i++) {
			System.out.print("Nouveau nombre : ");
			newNb = sc.nextInt();
			if (newNb > nombre ) {
				nombre = newNb;
				position = i;
			}
			
		} System.out.print("Le plus grand nombre est : " + nombre + " en position " + i);
		
			
	}

}
