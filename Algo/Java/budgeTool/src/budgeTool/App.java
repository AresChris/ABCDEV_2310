package budgeTool;

import java.util.Scanner;

public class App {
	
	public static void budget(double food) {
		double repas = 4.15;
		double nbRepas;
		double cafes, prixCafes, patisseries;
		double clopes, nbClopes;
		double totalBudget, totalClopes, totalCafetaria, totalRepas;
		
		Scanner sc = new Scanner(System.in);
		
		//restauration
		System.out.println("Combien de repas ? ");
		nbRepas = sc.nextDouble();
		totalRepas = repas * nbRepas;
		
		//cafetaria
		System.out.println("Combien de cafés ? ");
		cafes = sc.nextDouble();
		prixCafes = 0.80;
		System.out.println("Patisseries ? ");
		patisseries = sc.nextDouble();
		totalCafetaria = (cafes * prixCafes) + patisseries;

		System.out.println("Prix du paquet de tabac : ");
		clopes = sc.nextDouble();
		System.out.print("Combien de paquets de tabac ? ");
		nbClopes = sc.nextDouble();
		totalClopes = clopes * nbClopes;
		
		totalBudget = totalRepas + totalCafetaria + totalClopes;
		
		System.out.println("Le coût total des repas est de " + totalRepas);
		System.out.println("Le coût total à la cafétaria est de " + totalCafetaria);
		System.out.println("Coût total du tabac : " + totalClopes);
		System.out.println("Total : " + Math.round(totalBudget*100.00)/100.00);
		
		sc.close();
	}
	public static void main(String[] args) {
		budget(0);
	}
}
