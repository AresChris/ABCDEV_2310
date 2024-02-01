package robot_edison;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Table_Multiplication {

	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			public static int batteryLeft;
		// Fin des utiles	
			
	static void tableDeMultiplication()
	{
		String suivant = "";
		System.out.println("\tTables de multiplication");
		//int nombre = sc.nextInt();
		do { 
			System.out.print("Saisir un nombre entre 1 et 10 : ");
			int nombre = sc.nextInt();
				for (int i=0; i <= 10; i++) 
				{
				int somme = i*nombre;
				System.out.println(i + "*" + nombre + " = " + somme);
				} 		
				System.out.print("Souhaitez-vous afficher une autre table ? Y/N : ");
					suivant = sc.next();
		}	while (suivant.contains("Y") || suivant.contains("y"));
		System.out.println("\nR pour retourner au menu principal\n"
				+ "E pour relancer le dernier programme"
				+ "\nB pour revenir au menu précédent"
				+ "\nQ pour quitter"); 
		String answer = sc.next();
			if(answer.contains("R") || answer.contains("r"))
			{
				getStart();
			}
			else if(answer.contains("B") || answer.contains("b"))
			{
				getMenuCalculs();
			}
			else if(answer.contains("E") || answer.contains("e"))
			{
				tableDeMultiplication();
			}
			else
			{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
						+ "\nNous somme le " + dateFormat.format(date) + 
						"\nIl est " + hourFormat.format(calendar.getTime()));
			}
	}
	static void getTableMultiplication()
	{
		tableDeMultiplication();
	}
	static void getStart()
	{
		Start.start();
	}
	public static void getMenuCalculs()
	{
		Menu_Calculs.getMenuCalculs();
	}
}
