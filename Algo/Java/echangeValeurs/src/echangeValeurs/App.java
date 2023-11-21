package echangeValeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre : ");
		a = sc.nextDouble();
		
		System.out.println("Saisir le deuxième nombre : ");
		b = sc.nextDouble();
		
		sc.close();
		
		System.out.println("L'ancienne valeur du premier nombre est : " + a);
		System.out.println("L'ancienne valeur du deuxième nombre est : " + b);
		
		if (a>b) {
			System.out.println("- Nouvelle valeur du premier nombre = " + a);
			System.out.println("- Nouvelle valeur du deuxième nombre = " + b);
		}
			else if (b>a) { 
				System.out.println("- Nouvelle valeur du deuxième nombre = " + b);
				System.out.println("- Nouvelle valeur du premier nombre = " + a);
			}
			}
		
				
	}


