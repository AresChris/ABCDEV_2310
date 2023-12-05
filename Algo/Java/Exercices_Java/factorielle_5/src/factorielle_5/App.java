package factorielle_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nbDepart;
		int factorielle = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inscrire un nombre de départ");
		nbDepart = sc.nextInt();
		
		
		for (int i=2 ; i <= nbDepart; i++) {
			factorielle = factorielle * i;
		}
		System.out.print("La factorielle de " + nbDepart + "est de " + factorielle);

		sc.close();
	}

}
