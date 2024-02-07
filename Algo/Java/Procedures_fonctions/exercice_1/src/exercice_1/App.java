package exercice_1;

import java.util.Scanner;

public class App {
	public static void inversion() {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir le premier nombre : ");
		a = sc.nextInt();
		
		System.out.println("Saisir le deuxième nombre : ");
		b = sc.nextInt();
		System.out.println("L'ancienne valeur de a : " + a);
		System.out.println("L'ancienne valeur de b : " + b);
		c = a;
		a = b;
		b = c;
		
		System.out.println("La nouvelle valeur de a : " + a);
		System.out.println("La nouvelle valeur de b : " + b);
	}
	
	public static void main(String[] args) {

		inversion();
				
	}		
}


