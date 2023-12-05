package tierce_exercice9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n, p, i, a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inscrivez le nombre de chevaux partants : ");
		n = sc.nextInt();
		
		System.out.print("Inscrivez le nombre de chevaux joués : ");
		p = sc.nextInt();
		
		a = 1;
		b = 1;
		
		for (i = 1; i < p; i++) {
			a = a*(i + n - p);
			b = b * i;
		}
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		 System.out.println("Dans l'ordre : une chance sur " + a + " de gagner");
		 System.out.println("Dans le désordre : une chance sur " + a/b + " de gagner");
		 
		 sc.close();
	}

}
