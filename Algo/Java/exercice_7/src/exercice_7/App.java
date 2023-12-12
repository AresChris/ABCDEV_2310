package exercice_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombres;
		int i, j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Combien de valeurs voulez-vous saisir ?");	
		nombres = sc.nextInt();
	
		
		int[] tableau = new int[nombres];
	
		for (i =0; i<= tableau.length-1; i++) 
		{
			System.out.println("Saisisser un nombre : ");
			tableau[i] = sc.nextInt();
			tableau[i] += 1;
		}
		for(j = 0; j <= tableau.length-1; j++) 
		{
		System.out.print(tableau[j] + " ");
		}
		sc.close();
		
		

}
}
