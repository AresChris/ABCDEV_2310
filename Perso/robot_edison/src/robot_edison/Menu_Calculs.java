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
	public boolean menuCalcul() // Sous menu des différents calculs
	{
		System.out.println("\tCalculs\n1. Rectangle\n2. Cercle\n3. Convertisseur km/miles\n4. Calculs d'interêts\n5. Table de multiplications"
				+ "\n6. Bissextile\n7. Menu Principal \n8. Triangle\n9. Inversion de valeurs\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : ");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
			{
			getRectangle();
			}
		else if(choixMenu == 2)
			{
			getCercle();
			}
		else if(choixMenu == 3)
			{
			getConvertisseur();
			}
		else if(choixMenu == 4)
			{
			getCalculInteret();
			}
		else if(choixMenu == 5)
			{
			getTableDeMultiplication();
			}
		else if(choixMenu == 6)
			{
			getBissextile();
			}
		else if(choixMenu == 7)
			{
			getStart();
			}
		else if(choixMenu == 8)
			{
			getTriangle();
			}
		else if(choixMenu == 9)
			{
			getInversion();
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
	// Getters
	public boolean getMenuCalcul()
		{
		return menuCalcul();
		}
	public boolean getStart()
		{
		return getStart();
		}
	public boolean getRectangle()
		{
		return getRectangle();
		}
	public boolean getConvertisseur()
		{
		return getConvertisseur();
		}
	public boolean getCercle()
		{
		return getCercle();
		}
	public boolean getCalculInteret()
		{
		return getCalculInteret();
		}
	public boolean getTriangle()
		{
		return getTriangle();
		}
	public boolean getInversion()
		{
		return getInversion();
		}
	public int getTableDeMultiplication()
		{
		return getTableDeMultiplication();
		}
	public boolean getBissextile()
		{
		return getBissextile();
		}
	// Fin des getters
	
}

	
