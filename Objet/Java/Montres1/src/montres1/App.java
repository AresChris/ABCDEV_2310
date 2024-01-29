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
		rolex.estPorteePar(Paul); // Paul porte la Rolex 
		
		Pierre.retirerMontre(swatch); // Pierre retire sa montre Swatch, il n'en porte plus et Swatch n'est plus portée
		
		//Pierre.avancerHeure(swatch); // Swatch n'est pas portée, Paul ne porte pas de montre -- return false
	
		swatch.estPorteePar(Pierre);
		
		//Pierre.avancerHeure(swatch);

		//Paul.demanderHeure(Pierre); 
		
		//rolex.clonerMontre(swatch);
		
		boolean test = swatch.estLibre();
		boolean test2 = swatch.quiPorte(swatch);
		boolean test3 = rolex.quiPorte(rolex);
		Paul.retirerMontre(rolex);
		boolean test4 = rolex.quiPorte(rolex);
	}

}