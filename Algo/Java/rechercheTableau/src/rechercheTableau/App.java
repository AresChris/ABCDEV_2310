package rechercheTableau;

import java.util.Scanner;

public class App {
	public static void recherche(int nombre) {
		int[] tab = {1,2,3,4,5}; 
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre");
		nombre = sc.nextInt();
		boolean equal = true;

		for(int i = 0; i<tab.length; i++) {
			if(nombre != tab[i]) {
				equal = false;
			} else if (nombre == tab[i]){
				equal = true;
				position = tab[i];
		}
	} 
		if (equal) {
			System.out.println("Le nombre était en position " + position);
		} else if (!equal) {
			System.out.println("Error 404, not found !");
		}
		sc.close();
	}
	public static void main(String[] args) {
	
		recherche(0);
	} 
}
