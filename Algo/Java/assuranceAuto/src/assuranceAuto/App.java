package assuranceAuto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int assure;
		int sinistres;
		int age;
		int permis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quel est l'âge de l'assuré ?");
		age = sc.nextInt();
		
		System.out.print("Combien de sinistres à-t-il eu ?");
		sinistres = sc.nextInt();
		
		System.out.print("Combien d'année(s) de permis ?");
		permis = sc.nextInt();
		
		boolean bleu = true;
		boolean vert = true;
		boolean orange = true;
		boolean rouge = true;
		
		/*
		 - 25 ans 
    permis de moins de 2 ans 
        pas de sinistres
            tarif rouge
        sinistres 
            refusé
    plus de 2 ans
        pas de sinistre
            tarif orange
        sinistres
            tarif rouge
		 */
		
		if (age <25) {
			if (permis <2 && sinistres == 0) {
				System.out.print("Tarif rouge");
			}
				else if (permis <2 && sinistres != 0){
					System.out.print("Refusé !");
				}
				else if (permis >=2 && sinistres == 0) {
					System.out.print("Tarif orange");
				}
				else if (permis >=2 && sinistres !=0) {
					System.out.print("Tarif rouge");
				}
		}
		
		/*
		 + 25 ans
    permis de moins de 2 ans
        pas de sinistres
            tarif orange
        sinistres
            tarif rouge
    permis depuis plus de 2 ans
        sinistres 
            tarif orange
        deux sinistres  
            rouge
        plus de deux sinistres
            refusé
        pas de sinistre
            tarif vert   
		 */
		
		if (age >=25) {
			if (permis <2 || permis >=2 && sinistres ==0) {
				System.out.print("tarif orange");
			}
			else if (permis <2 && sinistres == 1 && sinistres <=2) {
				System.out.print("tarif rouge");
			}
			else if (permis >=2 && sinistres >2) {
				System.out.print("Refusé !");
			}
			else {
				System.out.print("Tarif vert");
			}
		}
		
		}
	}


