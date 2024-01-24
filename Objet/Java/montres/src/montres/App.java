package montres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Montres swatch = new Montres("Swatch", 13, 45, false);
		Montres rolex = new Montres("Rolex", 14, 55, false);
		
		Personne Pierre = new Personne("Pierre", true);
		Personne Paul = new Personne("Paul", false);
		Personne Jacques = new Personne("Jacques", true);
		
		boolean test1 = swatch.estDejaPortee();
		boolean test13 = rolex.estDejaPortee();
		Pierre.enleverMontre();
		swatch.MontrePorteePar(Pierre);
		Jacques.enleverMontre();
		rolex.MontrePorteePar(Paul);
		
		//boolean test2 = Pierre.enleverMontre();
		//boolean test3 = Paul.enleverMontre();
		//boolean test4 = Jacques.enleverMontre();
		
		//boolean test5 = Or.avancerHeure();
		swatch.initManuellement(swatch);
		String test6 = Pierre.demanderHeure(Paul, "");
		swatch.initWatch(rolex);
		String test14 = Pierre.demanderHeure(Paul, "");
		//String test7 = Paul.demanderHeure("");
		//String test8 = Jacques.demanderHeure("");
		
		
		//boolean test10 = Pierre.donnerMontre(Paul); // Pierre porte une montre, (paul p1) ne porte pas de montre
		// test10 : Pierre ne porte plus de montre, paul en porte une
		
		//boolean test11 = Paul.donnerMontre(Pierre); // Paul porte une montre, (Pierre p1) n'en porte pas 
		// test11 : Paul ne porte plus de montre, pierre en porte une
		
		//boolean test12 = swatch.initManuellement();
		//montreRolex.initFromWatch(swatch);
		
	}
}
