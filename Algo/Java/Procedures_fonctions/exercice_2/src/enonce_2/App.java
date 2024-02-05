package enonce_2;

import java.util.Scanner;

public class App {
	
	
	public static void calculPeriAire()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tCalcul de l'aire et périmètre d'un triangle");
			System.out.print("Saisis les valeurs des trois cotés :\n");
			System.out.println("A :");
			double a = sc.nextInt();
			System.out.println("B : ");
			double b = sc.nextInt();
			System.out.println("C : ");
			double c = sc.nextInt();
			
		double p = a + b + c; // calcul du périmetre
		double aire; // variable aire
		
		aire = Math.sqrt(((p/2-a)*(p/2-b)*(p/2-c))); // calcul de l'aire
		System.out.println("L'aire du triangle est de : " + aire); 
		System.out.println("Le périmètre du triangles est de : " + p);
	}	
	public static void main(String[] args) {
		calculPeriAire(); // appel de la fonction
	}
	static void getTriangle()
	{
		calculPeriAire();
	}

}
 