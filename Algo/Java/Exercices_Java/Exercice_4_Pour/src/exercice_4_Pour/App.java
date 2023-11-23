package exercice_4_Pour;

import java.util.Scanner;

/*
 * 				if (userChoice == finalCount) {
					System.out.println("Bonne réponse !");
				}
				else {
						System.out.println("Nouvel essai :");
						userChoice = sc.nextInt();
						System.out.println(userChoice);
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userChoice;
		int i;
		String chaine = "nombre";
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choisissez un nombre de départ : ");
		userChoice = sc.nextInt();
		
		i = userChoice;
		
		for (i = 0; i <= 10; i++ ) {
			userChoice = userChoice + 1;
			count = count+1;
			System.out.println(chaine + " " + count +" : " + userChoice);	
			
			sc.close();
		}
	}		
}
		
	
	

	


