package ordonnerDeuxValeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 60;
		double b = 50;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Inscrivez un premier nombre : ");
		a = sc.nextDouble();
		
		System.out.println("Inscrivez un deuxième nombre : ");
		b = sc.nextDouble();
		
		if (a < b) {
			System.out.println("1) A = " + a);
			System.out.println("2) B = " + b);
		}
		else if (b < a) {
			System.out.println("1) B = " + b);
			System.out.println("2) A = " + a);
		
		sc.close();
		}
	}

}
