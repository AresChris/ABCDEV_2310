package bouteille;

import java.util.Scanner;

public class App {
	
		public static void main(String[] args) {
			
			
			
			
			
			Bouteille evian = new Bouteille("Evian", 1, 1.5, false, false);
			
			boolean test1 = evian.fermer();
			boolean test2 = evian.ouvrir();
			
			evian.remplir(0.5); // rempli la bouteille du paramètre (double)
			evian.remplir(0.5); // tente de remplir la bouteille du paramètre (double) mais déjà pleine // estpleine passe true
		
			evian.vider(0.5); // vide la bouteille du parametre (double)
			evian.vider(0.3);
			
			boolean test3 = evian.remplirTout(); 
			boolean test4 = evian.viderTout();
	
		}
}
 

