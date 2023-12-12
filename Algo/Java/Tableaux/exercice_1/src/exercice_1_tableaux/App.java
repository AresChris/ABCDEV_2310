package exercice_1_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tabNombres = new int[7];
				
		for(int i = 0; i <= tabNombres.length-1; i++) {
			tabNombres[i] = 0;
		}
		
		for (int j = 0; j <= tabNombres.length-1; j++) {
			System.out.print(tabNombres[j] + " ");
		}
		
		sc.close();
		
	}

}
