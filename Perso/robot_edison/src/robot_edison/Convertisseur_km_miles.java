package robot_edison;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Convertisseur_km_miles {

	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			public static int batteryLeft;
		// Fin des utiles	
			
	static void convertisseurKmMiles()
	{
		String answer;
		double miles = 0;
		double kms = 0;
		System.out.println("\tConvertisseur kilomètres/miles - miles/kms\n");
		System.out.println("K pour convertir des kilomètres en Miles\nM pour convertir des miles en kilomètres");
		String choixConversion = sc.next();
		do {
			if(choixConversion.contains("K") || choixConversion.contains("k"))
			{
				System.out.println("Kilomètres = ");
				kms = sc.nextInt();
				if(kms <0 || kms > 1000000)
				{
					System.out.println("Hors limite, saisissez un nombre entre 1 et 999 999");
					kms = sc.nextInt();
				}
				else
				{
					miles = kms/1.609;
					System.out.println(Math.round(kms*100)/100 + " kms = " + Math.round(miles*100)/100 + " miles");
				}
		} else if(choixConversion.contains("M") || choixConversion.contains("m"))
		{
			System.out.println("Miles = ");
			miles = sc.nextInt();
			kms = miles * 1.609;
			System.out.println(Math.round(miles*100)/100 + "miles = " + Math.round(kms*100)/100 + "kms");
		}
		System.out.println("Voulez-vous faire une autre conversion ? Y/N");
		answer = sc.next();
		if(answer.contains("Y") || answer.contains("y"))
		{
			System.out.println("K pour convertir des kilomètres en Miles\nM pour convertir des miles en kilomètres");
			choixConversion = sc.next();
		} else
		{
			System.out.println("\nR pour retourner au menu principal\n"
					+ "E pour relancer le dernier programme"
					+ "\nB pour revenir au menu précédent"
					+ "\nQ pour quitter"); 
			answer = sc.next();
				if(answer.contains("R") || answer.contains("r"))
				{
					getStart();
				}
				else if(answer.contains("B") || answer.contains("b"))
				{
					getMenuCalculs();
				}
				else if (answer.contains("E") || answer.contains("e"))
				{
					convertisseurKmMiles();
				}
				else
				{
					System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
							+ "\nNous somme le " + dateFormat.format(date) + 
							"\nIl est " + hourFormat.format(calendar.getTime()));
					getAllumer();
				}
		}
	}while(answer.contains("Y") || answer.contains("y"));
	}
	
	// Getters
	static void getConvertisseur()
	{
		convertisseurKmMiles();
	}
	static void getStart()
	{
		Start.start();
	}
	public static void getMenuCalculs()
	{
		Menu_Calculs.getMenuCalculs();
	}
	public static void getAllumer()
	{
		Allumer_Eteindre.allumer();
	}
	static void getEteindre()
	{
		Allumer_Eteindre.eteindre();
	}
	//Fin des getters
}
