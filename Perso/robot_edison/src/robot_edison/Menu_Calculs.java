package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Menu_Calculs {

	// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		public static int batteryLeft;
	// Fin des utiles	
	public boolean menuCalcul(Robot_Edison edison) // Sous menu des différents calculs
	{
		System.out.println("\tCalculs\n1. Rectangle\n2. Cercle\n3. Convertisseur km/miles\n4. Calculs d'interêts\n5. Table de multiplications"
				+ "\n6. Bissextile\n7. Menu Principal \n8. Triangle\n9. Inversion de valeurs\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : ");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
			{
			edison.getRectangle();
			}
		else if(choixMenu == 2)
			{
			edison.getCercle();
			}
		else if(choixMenu == 3)
			{
			edison.getConvertisseur();
			}
		else if(choixMenu == 4)
			{
			edison.getCalculInteret();
			}
		else if(choixMenu == 5)
			{
			edison.getTableDeMultiplication();
			}
		else if(choixMenu == 6)
			{
			edison.getBissextile();
			}
		else if(choixMenu == 7)
			{
			edison.start();
			}
		else if(choixMenu == 8)
			{
			edison.getTriangle();
			}
		else if(choixMenu == 9)
			{
			edison.getInversion();
			}
		else if(choixMenu == 0)
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
		}
		sc.close();
		return true;
	}	
}

	
