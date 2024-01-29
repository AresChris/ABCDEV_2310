package montres1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//String _idMontre, int _minutes, int _heures, boolean _estDejaPortee
		
		Montres swatch = new Montres("Swatch",false);
		Montres rolex = new Montres("Rolex", false);
		//String _idPersonne, boolean _porteUneMontre
		Personnes Pierre = new Personnes("Pierre", false);
		Personnes Paul = new Personnes("Paul", false);
		
		swatch.estPorteePar(Paul); // swatch est portée par Paul
	
		Paul.donnerMontre(swatch, Pierre); // Paul donne la montre Swatch à Pierre
		
		Paul.retirerMontre(swatch); // Paul ne peut pas retirer sa montre, il n'en porte pas
		
		rolex.estPorteePar(Paul); // Rolex est portée par Paul 
		
		Pierre.retirerMontre(swatch); // Pierre retire sa montre Swatch, il n'en porte plus et Swatch n'est plus portée
		
		Pierre.avancerHeure(swatch); // Swatch n'est pas portée, Paul ne porte pas de montre -- return false
	
		swatch.estPorteePar(Pierre); // La montre Swatch est portée par Pierre
		
		Pierre.avancerHeure(swatch); // Scanner : Modifier l'heure ? Y/N ou y/n -- donne les heures et les minutes à la montre

		Paul.demanderHeure(Pierre); //
		
		rolex.clonerMontre(swatch); //cloner la swatch sur la rolex
		Paul.retirerMontre(rolex); // Paul retire la Rolex
		rolex.estPorteePar(Paul); // Paul met la Rolex
		Pierre.donnerMontre(rolex, Paul); // Pierre donne la rolex à Paul 
		// -- false -- "La Rolex est déjà portée par Paul, en plus, Pierre porte la Swatch"
		
	//--------------------------------------------------------------------------------------------
		//tests pour savoir si la montre est portée
		boolean test = swatch.estLibre();
		boolean test2 = rolex.estLibre();
		
		// Tests pour savoir qui porte la montre
		boolean test5 = rolex.quiPorte();
		boolean test6 = swatch.quiPorte();
		
		// Tests pour savoir quelle montre porte une personne
		boolean test7 = Paul.porteQuelleMontre();
		boolean test8 = Pierre.porteQuelleMontre();
		
	}

}