
		/*double a = 20;
		double b = 50;
		
		System.out.println("L'ancienne valeur de a est : " + a);
		System.out.println("l'ancienne valeur de b est : " + b);
		
		if (a>b) {
			System.out.println("- Nouvelle valeur de A = " + a);
			System.out.println("- Nouvelle valeur de B = " + b);
		}
			else if (b>a) { 
				System.out.println("- Nouvelle valeur de B = " + b);
				System.out.println("- Nouvelle valeur de A = " + a);
			}
			}
		 * 
		 */

package scanner;

import java.util.Scanner;

public class App {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
				
				double a = 20;
				double b = 50;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Saisir le premier nombre : ");
				a = sc.nextDouble();
				
				System.out.println("Saisir le deuxième nombre : ");
				b = sc.nextDouble();
				
				sc.close();
				
	}

}
