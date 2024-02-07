package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Nota_Bene {

	 // Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	static void notaBene()
	{
		System.out.println("\tRetravailler\n1. Char[] tableaux\n2. Inverser valeurs dans un tableau\n3. Switch case\n4. Utiliser Enum Class sur le programme 'Semaine'\n"
				+ "5. Tableaux boucle for !!\n6. Finir 'Triangle'"
				+ "\n\n1. Revenir au menu principal\n2. Quitter");
		//int choixMenu = sc.nextInt();
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
		{
			getStart();
		}
		else
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + getBatteryLeft() + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
			getEteindre();
		}
	}
	// Getters
	public boolean getStart()
	{
	return getStart();
	}
	public boolean getEteindre()
	{
	return getEteindre();
	}
	// Fin des getters
}
