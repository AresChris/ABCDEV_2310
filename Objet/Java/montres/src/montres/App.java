package montres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Montres Or = new Montres(13, 45, true);
		Personne Pierre = new Personne("Pierre", true);
		
		boolean test1 = Or.estDejaPortee();
		boolean test2 = Pierre.enleverMontre();
	}
}
