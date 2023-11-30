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

			for (i = 0; i > change; i+=1) {
				if (change >=1 && change <5) {
					money = 1;
					System.out.print("Le rendu monnaie est de : " + money);
				} else if (change >= 5 && change <10) {
					money = 5;
					System.out.print("Le rendu monnaie est de : " + money);
				} else if (change >=10) {
					money = 10;	
					System.out.print("Le rendu monnaie est de : " + money);
				}
			}	
			
		}
	}	
			
	