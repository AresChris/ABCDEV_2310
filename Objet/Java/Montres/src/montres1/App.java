package montres1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//String _idMontre, boolean _estDejaPortee
		Montres swatch = new Montres("Swatch",false);
		Montres rolex = new Montres("Rolex", false);
		//String _idPersonne, boolean _porteUneMontre
		Personnes pierre = new Personnes("Pierre", false);
		Personnes paul = new Personnes("Paul", false);
		
		swatch.estPorteePar(paul); // swatch est portée par Paul
	
		paul.donnerMontre(swatch, pierre); // Paul donne la montre Swatch à Pierre
		
		paul.retirerMontre(swatch); // Paul ne peut pas retirer sa montre, il n'en porte pas
		
		rolex.estPorteePar(paul); // Rolex est portée par Paul 
		
		pierre.retirerMontre(swatch); // Pierre retire sa montre Swatch, il n'en porte plus et Swatch n'est plus portée
		
		pierre.modifierHeureDe(swatch); // Swatch n'est pas portée, Paul ne porte pas de montre -- return false
	
		swatch.estPorteePar(pierre); // La montre Swatch est portée par Pierre
		
		pierre.modifierHeureDe(swatch); // Scanner : Modifier l'heure ? Y/N ou y/n -- donne les heures et les minutes à la montre

		paul.demanderHeure(pierre); //
		
		rolex.clonerMontre(swatch); //cloner la swatch sur la rolex
		paul.retirerMontre(rolex); // Paul retire la Rolex
		rolex.estPorteePar(paul); // Paul met la Rolex
		pierre.donnerMontre(rolex, paul); // Pierre donne la rolex à Paul 
		// -- false -- "La Rolex est déjà portée par Paul, en plus, Pierre porte la Swatch"
		
	//--------------------------------------------------------------------------------------------
		//tests pour savoir si la montre est portée
		boolean test = swatch.estLibre();
		boolean test2 = rolex.estLibre();
		
		// Tests pour savoir qui porte la montre
		boolean test5 = rolex.quiPorte();
		boolean test6 = swatch.quiPorte();
		
		// Tests pour savoir quelle montre porte une personne
		boolean test7 = paul.porteQuelleMontre();
		boolean test8 = pierre.porteQuelleMontre();
		
		// Test pour savoir quelle heure est affiché sur la montre
		boolean test9 = rolex.indiqueHeure();
	//--------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}