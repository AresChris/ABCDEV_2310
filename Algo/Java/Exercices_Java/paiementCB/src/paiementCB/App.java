package paiementCB;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int cb, cheque, virement; // Paiements
		int totalPaiement, totalCB, totalCheque, totalVirement;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de paiements par CB : ");
		cb = sc.nextInt();
		
		System.out.println("Combien de paiements par chèque : ");
		cheque = sc.nextInt();
		
		System.out.println("Combien de paiements par virement : ");
		virement = sc.nextInt();
		
		totalPaiement = cb+cheque+virement;
		totalCB = (cb*100)/totalPaiement;
		totalCheque = (cheque*100)/totalPaiement;
		totalVirement = (virement*100)/totalPaiement;
		
		System.out.println("Le total des paiements : "
				+ "\nCB : " + totalCB + "%"
				+"\nChèques : " + totalCheque + "%\n"
				+ "Virements : " + totalVirement + "%");
		
	}

}
