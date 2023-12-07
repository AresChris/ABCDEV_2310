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
		
		System.out.print("Depuis combien de temps le conducteur est-il assuré : ");
		assure = sc.nextInt();
		
		boolean bleu = true;
		boolean vert = true;
		boolean orange = true;
		boolean rouge = true;

		if (age <25) {
			if ((permis <2 && sinistres == 0) || (permis >= 2 && sinistres != 0)) {
				rouge = true;
				System.out.print("Tarif rouge");
			}
				else if (permis <2 && sinistres != 0){
					System.out.print("Refusé !");
				}
				else if (permis >=2 && sinistres == 0) {
					orange = true;
					System.out.print("Tarif orange");
				}
			
		
				else if (age >=25) {
					if (permis <2 || permis >=2 && sinistres ==0) {
						orange = true;
						System.out.print("tarif orange");
					}
					else if (permis <2 && sinistres == 1 && sinistres <=2) {
						rouge = true;
						System.out.print("tarif rouge");
					}
					else if (permis >=2 && sinistres >2) {
						System.out.print("Refusé !");
					}
					else {
						vert = true;
						System.out.print("Tarif vert");
					}
				}
						if (assure > 5) {
							if (orange) {
								System.out.print("Tarif vert");
							} else if (rouge) {
								System.out.print("Tarif orange");
							} else if (vert) {
								System.out.print("tarif bleu");					
							}	
			}	
		}
	}	
}	


