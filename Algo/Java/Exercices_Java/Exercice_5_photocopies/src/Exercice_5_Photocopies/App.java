package Exercice_5_Photocopies;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double firstTen = 0.10;
		double nextTwenty = 0.09;
		double above = 0.08;
		double thirtySum = 20;
		double aboveSum = 30;
		double total;
		double bill;
		int userChoice;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formater = new DecimalFormat("00");
		
		System.out.println("Combien de photocopies ?");
		userChoice = sc.nextInt();

		if (userChoice >=0 && userChoice<10) {
			bill = userChoice * firstTen;
			System.out.print("La facture est de :" + bill);
		}
		else if (userChoice >=10 && userChoice<=30) {	
			total = userChoice - 10;
			bill = ((10 * firstTen) + (total * nextTwenty)); 						  
			System.out.print("La facture est de :" + bill);
		}
		else if (userChoice > 30) {
			total = userChoice - 30;
			bill = (10 * firstTen) + (20*nextTwenty)+ (total * above);
			System.out.print("La facture est de :" + formater.format(bill));
		}
		}
}		
	
		


