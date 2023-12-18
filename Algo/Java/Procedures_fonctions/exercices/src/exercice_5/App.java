package exercice_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void dateValide(int annee,int mois,int jour) {
        boolean bissextile = (annee%4 == 0 && annee %100 != 0) || annee% 400 == 0; 	// booléenne bissextile = true
        boolean jourValide = true;
        DecimalFormat formater = new DecimalFormat("00"); // Formater à deux nombres

        //variables et tableaux des mois 30/31
        int[] month1 = {1, 3, 5, 7, 8, 10, 12};
        int[] month2 = {4, 6, 9, 11};
        int saisieUser = 0;
        boolean monthThirty = true;
        boolean monthThirtyOne = true;


        // initialisation de la boooleenne 'jourValide'
        if (jour>=1 && jour<=29 && mois == 2 && bissextile) {
            jourValide = true;
        } else if (jour>=29 && mois == 2 || !bissextile) {
            jourValide = false;
        }

        //initialisation de la booleenne monthThirtyOne (jours à 31) et jourValide
        if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            if (jour <1 || jour > 31 || mois > 12 || mois < 1) {
                monthThirtyOne = false;
                jourValide = false;
            } else if (jour <= 31 && jour>=1 || mois <= 12 && mois >= 1) {
                monthThirtyOne = true;
                jourValide = true;
            }
        }
        //initialisation de la booleenne monthThiry (jours à 30)
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11){
                if(jour>30 || mois>12 || mois<1){
                    monthThirty = false;
                    jourValide = false;
                }
            else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                if(jour <=30 || jour >= 1){
                    monthThirty = true;
                    jourValide = true;
                }
            }
        }
        // début de la condition true/false jourValide
        if (jourValide && (monthThirtyOne || monthThirty)) {
            System.out.print("La date est valide !");
        } else {
            System.out.print("la date du " + formater.format(jour) + "/" + formater.format(mois) +"/"+ annee + " n'est pas valide !");
        }
    }
    public static void main(String[] args) {
        int annee;
        int mois;
        int jour;

        Scanner sc = new Scanner(System.in);

        System.out.print("Inscrivez l'année : ");
        annee = sc.nextInt();
        System.out.print("Inscrivez le mois : ");
        mois = sc.nextInt();
        System.out.print("Inscrivez le jour : ");
        jour = sc.nextInt();

        sc.close();

        dateValide(annee, mois, jour);
    }

}
