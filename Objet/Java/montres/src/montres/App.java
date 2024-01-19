package montres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Montres Or = new Montres(13, 45, true);
		
		Personne Pierre = new Personne("Pierre", true);
		Personne Paul = new Personne("Paul", false);
		Personne Jacques = new Personne("Jacques", true);
		
		//boolean test1 = Or.estDejaPortee();
		
		//boolean test2 = Pierre.enleverMontre();
		//boolean test3 = Paul.enleverMontre();
		//boolean test4 = Jacques.enleverMontre();
		
		//boolean test5 = Or.avancerHeure();
		
		String test6 = Pierre.demanderHeure("");
		String test7 = Paul.demanderHeure("");
		String test8 = Jacques.demanderHeure("");
	}
}
