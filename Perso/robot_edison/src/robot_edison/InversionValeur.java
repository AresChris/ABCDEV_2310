package robot_edison;

import java.util.Scanner;

public class InversionValeur {
	
	public static void inversion() {
		
		System.out.println("\tInverser deux valeurs\n");
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre : ");
		a = sc.nextInt();
		
		System.out.println("Saisir le deuxième nombre : ");
		b = sc.nextInt();
		
		a = c; // a va dans c 
		b = c; //
		b = c; // b va dans a
		

		
		System.out.println("L'ancienne valeur de a : " + a);
		System.out.println("L'ancienne valeur de b : " + b);
		System.out.println("La nouvelle valeur de a : " + a);
		System.out.println("La nouvelle valeur de b : " + b);
	}
	
	static void getInversion()
	{
		inversion();
	}
	
	
	/*
	 *   a = 25
	 *   b = 45
	 *   c = 0
	 *   
	 *   25 a  =  0 c 
	 *    a = 0, c = 25
	 *   0 a  =  45 b
	 *    a = 45, b 
	 */
}
