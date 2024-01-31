package exercice_1_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valeursTab;
		System.out.println("Combien de valeurs dans le tableau ?");
		int nombres = sc.nextInt();
		int[] tabNombres = new int[nombres];
				
		for(int i = 0; i <= tabNombres.length-1; i++) {
			System.out.println("Valeur du tableau n°" + (i+1) + ": ");
			valeursTab = sc.nextInt();
			tabNombres[i] = valeursTab;
		}
		
		for (int j = 0; j <= tabNombres.length-1; j++) {
			System.out.print(tabNombres[j] + " ");
		}
		
		sc.close();
		
	}

}
