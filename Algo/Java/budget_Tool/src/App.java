package budgeTool;

import java.util.Scanner;

public class App {

    public static void budget(double food) {
        double repas = 4.15;
        double nbRepas;
        double cafes, prixCafes, patisseries;
        double clopes, nbClopes;
        double totalBudget, totalClopes, totalCafetaria, totalRepas, totalRestant;
        double surCompte, monnaie, surCarte;

        Scanner sc = new Scanner(System.in);
        // Argent restant actuel
        System.out.println("Combien sur le compte ? ");
        surCompte = sc.nextDouble();
        System.out.println("Combien en monnaie ? ");
        monnaie = sc.nextDouble();
        System.out.println("Combien sur la carte CRM ? ");
        surCarte = sc.nextDouble();

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
        // Total restant
        totalRestant = (surCompte + monnaie + surCarte) - (totalRepas + totalCafetaria + totalClopes);
        System.out.println(totalRestant);
        sc.close();
    }
    public static void main(String[] args) {
        budget(0);
    }
}

