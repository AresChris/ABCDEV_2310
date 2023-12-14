package enonce_2;

import java.util.Scanner;

public class App {
	
	
	double p; // périmètre
	double aire; // aire

	public static void calculPeriAire(double a, double b, double c)
	{
		double p = a + b + c; // calcul du périmetre
		double aire; // variable aire
		aire = Math.sqrt(((p/2-a)*(p/2-b)*(p/2-c))); // calcul de l'aire
		System.out.println("L'aire du triangle est de : " + aire); 
		System.out.println("Le périmètre du triangles est de : " + p);
	}	
	public static void main(String[] args) {
		// déclaration des variables
		double a = 20;
		double b = 15;
		double c = 25;

		calculPeriAire(a, b, c); // appel de la fonction
	}

}
 