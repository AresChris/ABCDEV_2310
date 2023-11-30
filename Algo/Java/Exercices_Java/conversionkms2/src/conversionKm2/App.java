package conversionKm2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String saisieUser;
		String leave = "Q";
		double kms;
		double miles;
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean fermeture_prog = false;
		
		while (!fermeture_prog) {
			System.out.println("Saisissez un nombre de kms");
			saisieUser = sc.next();
			if (saisieUser.equals(leave)); {
			
			fermeture_prog = true;
			}
			else {
			for (i = 0;i < saisieUser.length(); i++);
		}
}
}
}
