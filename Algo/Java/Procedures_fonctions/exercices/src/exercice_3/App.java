package exercice_3;

import java.util.Scanner;

public class App {
    public static void moyenne(double a,double b) {
        double calculMoyenne = (a + b)/2;
        System.out.print("La moyenne des deux nombres est : " + calculMoyenne);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saisissez une premier nombre : ");
        double a = sc.nextInt();

        System.out.print("Saisissez un deuxième nombre : ");
        double b = sc.nextInt();

        sc.close();

        moyenne(a, b);
    }

}
