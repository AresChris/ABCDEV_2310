package renduMonnaie_Exercice8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int bill = 65;
		int paid;
		int money;
		int change;
		int total;
		int i=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("La somme à payer est de " + bill + "€");
		
		System.out.println("Quelle somme a été donnée ?");
			paid = sc.nextInt();
		
			change = paid - bill;


				while (change % i == 0) {
					if (change >= 1 && change <= 5) {
						for (i=1; i >= change; i++) {
							money = 1;
							total = change / money;
							System.out.println("Le rendu monnaie est de : " + change);
				} 
			}
					else if (change >= 5 && change <10) {
						for (i=5; i <= change; i++) {
							money = 5;
							total = change / money;
							System.out.println("Le rendu monnaie est de : " + change);
						}
					} 
					else if (change >=10) {
								for (i=10; i<=change; i++) {
								money = 10;
								total = change / money;
								change = money * total;
								System.out.println("Le rendu monnaie est de : " + total);
						}
					}
				}
			}
		}		
			
		
		
			
	