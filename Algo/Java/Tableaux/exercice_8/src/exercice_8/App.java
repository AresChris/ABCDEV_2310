package exercice_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombres, plusGrand = 0;
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le nombre de valeurs du tableau : ");
		nombres = sc.nextInt();
		
		int[] tableau = new int[nombres];
		
		for(int i = 0; i<=tableau.length-1; i++) {
			System.out.println("Entrer une valeur n°" + (i+1));
			tableau[i] = sc.nextInt();
			if(tableau[i] > plusGrand) {
				plusGrand = tableau[i];
			}
			if(tableau[i] > position) {
				position = i;
				position += 1;
			}
		}	

		System.out.print("La valeur la plus grande est " + plusGrand + " et il était en position " + position);
				
		
		sc.close();
			
	

}
}
