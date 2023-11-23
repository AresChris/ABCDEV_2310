package aireSecteurCirculaire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rayon;
		double angle;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire le rayon : ");
		rayon = sc.nextDouble();
		
		System.out.println("Inscrire l'ange : ");
		angle = sc.nextDouble();	
		
		sc.close();
		
		double aireSecteurCirculaire = (Math.PI*Math.pow(rayon, 2)*angle)/360;
		System.out.println("L'aire du secteur circulaire est de : " + aireSecteurCirculaire);
		
		
		
	}

}
