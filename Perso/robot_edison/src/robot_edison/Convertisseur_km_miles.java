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
			
	public boolean convertisseurKmMiles(Robot_Edison edison)
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
				System.out.print("Kilomètres = ");
				kms = sc.nextInt();
				System.out.print("");
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
			} 
			else if(choixConversion.contains("M") || choixConversion.contains("m"))
			{
			System.out.print("Miles = ");
			miles = sc.nextInt();
			System.out.print("");
			kms = miles * 1.609;
			System.out.println(Math.round(miles*100)/100 + "miles = " + Math.round(kms*100)/100 + "kms");
			} 
		System.out.println("Voulez-vous faire une autre conversion ? Y/N");
		answer = sc.next();
		if(answer.contains("Y") || answer.contains("y"))
		{
			System.out.println("K pour convertir des kilomètres en Miles\nM pour convertir des miles en kilomètres");
			choixConversion = sc.next();
		} 
	} while(answer.contains("Y") || answer.contains("y"));
		
		System.out.println("Afficher le code ? Y/N");
		String affichage = sc.next();
		
		if(affichage.contains("Y") || affichage.contains("y"))
		{
			System.out.print("String answer;\n"
					+ "double miles = 0;\n"
					+ "double kms = 0;\n"
					+ "	 System.out.println(\"\\tConvertisseur kilomètres/miles - miles/kms\\n\");\n"
					+ "	 System.out.println(\"K pour convertir des kilomètres en Miles\\nM pour convertir des miles en kilomètres\");\n"
					+ "	 String choixConversion = sc.next();\n"
					+ "		do {\n"
					+ "			if(choixConversion.contains(\"K\") || choixConversion.contains(\"k\"))\n"
					+ "			{\n"
					+ "			System.out.println(\"Kilomètres = \");\n"
					+ "			kms = sc.nextInt();\n"
					+ "				if(kms <0 || kms > 1000000)\n"
					+ "				{\n"
					+ "					System.out.println(\"Hors limite, saisissez un nombre entre 1 et 999 999\");\n"
					+ "					kms = sc.nextInt();\n"
					+ "				}\n"
					+ "				else\n"
					+ "				{\n"
					+ "					miles = kms/1.609;\n"
					+ "					System.out.println(Math.round(kms*100)/100 + \" kms = \" + Math.round(miles*100)/100 + \" miles\");\n"
					+ "				}\n"
					+ "			} \n"
					+ "			else if(choixConversion.contains(\"M\") || choixConversion.contains(\"m\"))\n"
					+ "			{\n"
					+ "			System.out.println(\"Miles = \");\n"
					+ "			miles = sc.nextInt();\n"
					+ "			kms = miles * 1.609;\n"
					+ "			System.out.println(Math.round(miles*100)/100 + \"miles = \" + Math.round(kms*100)/100 + \"kms\");\n"
					+ "			} \n"
					+ "		System.out.println(\"Voulez-vous faire une autre conversion ? Y/N\");\n"
					+ "		answer = sc.next();\n"
					+ "		if(answer.contains(\"Y\") || answer.contains(\"y\"))\n"
					+ "		{\n"
					+ "			System.out.println(\"K pour convertir des kilomètres en Miles\\nM pour convertir des miles en kilomètres\");\n"
					+ "			choixConversion = sc.next();\n"
					+ "		} \n"
					+ "	} while(answer.contains(\"Y\") || answer.contains(\"y\"));\n");
		}
		else 
		{
			System.out.println("\nR pour retourner au menu principal\n"
					+ "E pour relancer le dernier programme"
					+ "\nB pour revenir au menu précédent"
					+ "\nQ pour quitter"); 
			answer = sc.next();
				if(answer.contains("R") || answer.contains("r"))
				{
					edison.start();
				}
				else if(answer.contains("B") || answer.contains("b"))
				{
					edison.getMenuCalcul();
				}
				else if (answer.contains("E") || answer.contains("e"))
				{
					edison.getConvertisseur();
				}
				else
				{
					System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
							+ "\nNous somme le " + dateFormat.format(date) + 
							"\nIl est " + hourFormat.format(calendar.getTime()));
					edison.getAllumer();
				}
		}
		System.out.println("\nR pour retourner au menu principal"
				+ "\nE pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		answer = sc.next();
			if(answer.contains("R") || answer.contains("r"))
			{
				edison.start();
			}
			else if(answer.contains("B") || answer.contains("b"))
			{
				edison.getMenuCalcul();
			}
			else if (answer.contains("E") || answer.contains("e"))
			{
				edison.getConvertisseur();
			}
			else
			{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
						+ "\nNous somme le " + dateFormat.format(date) + 
						"\nIl est " + hourFormat.format(calendar.getTime()));
				edison.getAllumer();
			}
			return true;	
	}
}
