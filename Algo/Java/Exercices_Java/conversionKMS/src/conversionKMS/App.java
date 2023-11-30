package conversionKMS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saisieUser;
		String leave = "Q";
		double kms;
		double miles;
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formater = new DecimalFormat("00");
		
		boolean fin_prog = true;
		
		System.out.println("Enter a kms number : ");
		saisieUser = sc.nextDouble();
		formater.format(saisieUser);
		
		double miles = saisieUser/1.609;
		formater.format(miles);
		
		do {
			System.out.println(formater.format(saisieUser) + " kms is equal to approx. " + formater.format(miles) + " miles.");
			System.out.println("Nouveau nombre de kms :");
			saisieUser = sc.nextDouble();
		}
		while (); 
		
		do {
			System.out.println("Out of limits, enter another number : ");
			saisieUser = sc.nextDouble();
		}
		while (saisieUser < 0.01 && saisieUser > 1000000);
			
			}
		}
	

		
		//	System.out.println("Enter a kms number : ");
		//	saisieUser = sc.nextDouble();
		//	formater.format(saisieUser);
		//	
	



	
			
