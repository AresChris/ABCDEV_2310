package switch_case;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double nombre1, nombre2;
        String operateur;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le 1er nombre :");
        nombre1 = sc.nextDouble();

        System.out.println("Quel est le 2eme nombre");
        nombre2 = sc.nextDouble();

        System.out.println("Que voulez-vous faire avec " + nombre1 + " et " + nombre2 + " ?");
        System.out.println("Choisir l'opérateur : \n+ \n- \n* \n/");
        operateur = sc.next();

        System.out.println("Votre choix :");
        System.out.println(operateur);

        switch (operateur)
        {
            case "*":
                double resultat = nombre1 *nombre2;
                System.out.print("Le résultat de l'opération est : " + resultat);
                break;
            case "-":
                resultat = nombre1 - nombre2;
                System.out.print("Le résultat de l'opération est : " + resultat);
                break;
            case "+":
                resultat = nombre1 + nombre2;
                System.out.print("Le résultat de l'opération est : " + resultat);
                break;
            case "/":
                resultat = nombre1 / nombre2;
                System.out.print("Le résultat de l'opération est : " + resultat);
                break;
            default:
                System.out.print("Erreur !");
        }
    }
}
