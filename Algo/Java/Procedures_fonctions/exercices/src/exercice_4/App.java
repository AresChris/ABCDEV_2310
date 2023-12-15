package exercice_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void bissextile(int anneeA, int mois, int jour) {

        boolean bissextile = (anneeA%4 == 0 && anneeA %100 != 0) || anneeA% 400 == 0; 	// booléenne bissextile = true

        DecimalFormat formater = new DecimalFormat("00"); // Formater à deux nombres
        // début de la condition true/false
        if (!bissextile) {
            if (jour == 29 && mois == 2) {
                System.out.print("Il n'y à pas de 29 février dans l'année " + anneeA + " et elle n'est pas bissextile !");
            } else {
                System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
            }
        }
        if (bissextile) {
            if (jour == 29 && mois == 2) {
                System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " est dans une année bissextile !");
            }
            else {
                System.out.print("La date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ anneeA + " n'est pas dans une année bissextile !");
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saisissez l'année : ");
        int anneeA = sc.nextInt();

        System.out.print("Saisissez le mois : ");
        int mois = sc.nextInt();

        System.out.print("Saisissez le jour : ");
        int jour = sc.nextInt();

        sc.close();

        bissextile(anneeA, mois, jour);
    }

}
