package robot_edison;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Interet_Banque {

	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			public static int batteryLeft;
		// Fin des utiles	
			
	public boolean calculInteret()
	{
		double interet;
		double somme;
		int annee;
		double interetSimple;
		double interetComposes;

		System.out.println("Inscrivez une somme : ");
		somme = sc.nextDouble();
		
		System.out.println("Inscrivez les interêts : ");
		interet = sc.nextDouble();
		
		System.out.println("Inscrivez la durée en année : ");
		annee = sc.nextInt();
				
		interetSimple = (somme*(interet/100)) + somme;
		interetComposes = somme*(Math.pow(1+(interet/100),annee));
		System.out.println(Math.round(somme*100)/100 + "€ investi à " + interet + "% d'interet\nPendant 1 an : " + Math.round(interetSimple*100)/100);
		System.out.println("Pendant " + annee + " ans : " + Math.round(interetComposes*100)/100);
		System.out.print("Afficher le code ? Y/N");
		String affichage = sc.next();
			if(affichage.contains("Y") || affichage.contains("y"))
			{
				System.out.println("double interet;\r\n"
						+ "		double somme;\r\n"
						+ "		int annee;\r\n"
						+ "		double interetSimple;\r\n"
						+ "		double interetComposes;\r\n"
						+ "\r\n"
						+ "		System.out.println(\"Inscrivez une somme : \");\r\n"
						+ "		somme = sc.nextDouble();\r\n"
						+ "		\r\n"
						+ "		System.out.println(\"Inscrivez les interêts : \");\r\n"
						+ "		interet = sc.nextDouble();\r\n"
						+ "		\r\n"
						+ "		System.out.println(\"Inscrivez la durée en année : \");\r\n"
						+ "		annee = sc.nextInt();\r\n"
						+ "				\r\n"
						+ "		interetSimple = (somme*(interet/100)) + somme;\r\n"
						+ "		interetComposes = somme*(Math.pow(1+(interet/100),annee));\r\n"
						+ "		System.out.println(Math.round(somme*100)/100 + \"€ investi à \" + interet + \"% d'interet\\nPendant 1 an : \" + Math.round(interetSimple*100)/100);\r\n"
						+ "		System.out.println(\"Pendant \" + annee + \" ans : \" + Math.round(interetComposes*100)/100);");
			}
			else
			{
				System.out.println("\nR pour retourner au menu principal\n"
						+ "E pour relancer le dernier programme"
						+ "\nB pour revenir au menu précédent"
						+ "\nQ pour quitter"); 
				String choixMenu = sc.next();
					if(choixMenu.contains("R") || choixMenu.contains("r"))
					{
						getStart();
					}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
					{
						calculInteret();
					}
					else if(choixMenu.contains("B") || choixMenu.contains("b"))
					{
						getMenuCalcul();
					}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
					{
						getEteindre();
					}
			}
		System.out.println("\nR pour retourner au menu principal\n"
				+ "E pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		String choixMenu = sc.next();
			if(choixMenu.contains("R") || choixMenu.contains("r"))
			{
				getStart();
			}
			else if(choixMenu.contains("E") || choixMenu.contains("e"))
			{
				calculInteret();
			}
			else if(choixMenu.contains("B") || choixMenu.contains("b"))
			{
				getMenuCalcul();
			}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
			{
				getEteindre();
			}
			return true;
	}
	// Getters
	public boolean getCalculInteret()
		{
			return calculInteret();
		}
	public boolean getStart()
		{
		return getStart();
		}
	public boolean getEteindre()
		{
		return getEteindre();
		}
	public boolean getMenuCalcul()
		{
		return getMenuCalcul();
		}
	// Fin des getters
}
