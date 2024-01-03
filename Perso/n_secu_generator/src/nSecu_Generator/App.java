package nSecu_Generator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int moisNaissance, anneeNaissance,codeCommune;
        String genre = "";
        String departement = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Genre : ");
        genre = sc.next();
        System.out.print("Mois de naissance :");
        moisNaissance = sc.nextInt();
        System.out.println("Année de naissance : ");
        anneeNaissance = sc.nextInt();
        System.out.print("Département de naissance :");
        departement = sc.next();

        sc.close();
    }
}
