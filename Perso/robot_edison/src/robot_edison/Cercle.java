package robot_edison;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cercle {

	// Utiles 
			static Scanner sc = new Scanner(System.in); // Scanner
			DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
			static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
			static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
			static Date date = new Date(); // retourne la date actuelle
			static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
			public static int batteryLeft;
		// Fin des utiles	
			
	static void cercle()
	{
		double rayon;
		//coordonnees variables du point A
		double xA;
		double yA;
		//coordonnees constantes du point C
		double xC;
		double yC;
		// constante PI
		final double pi = Math.PI;
		double perimetre;
		double diametre;
		
		System.out.print("\tCoordonnées du point"
				+ "\nx = ");
			int coordxA = sc.nextInt();
			xA = coordxA; // xA vaut coordxA pour la formule
			System.out.print("\ny = ");
			int coordyA = sc.nextInt();
			yA = coordyA; // y s'appelera yA pour la formule

		System.out.println("\tCentre du cercle : "
				+ "\nx = ");
			int coordsxC = sc.nextInt();
			xC = coordsxC; // x s'appelera xC pour la formule
			System.out.print("\ny = ");
			int coordsyC = sc.nextInt();
			yC = coordsyC; // y s'appelera yC pour la formule
			System.out.print("\nRayon du cercle = ");
			rayon = sc.nextInt();
			diametre = rayon * 2;
			perimetre = diametre * pi;
			
			double surface = Math.pow(rayon, 2) * pi; // calcul la surface du cercle

			double distance = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2)); // calcul de la distance entre le point et le centre du cercle

			System.out.println("Le point est à environ " + Math.round(distance*100.00)/100.00 + " du centre, le rayon est de " + rayon);
			if(distance == rayon)
			{
				System.out.println("Le point est sur le cercle !");
			}
			else 
			{
				System.out.println("Le point n'est pas sur le cercle :( ");
			}
			System.out.println("\nR pour retourner au menu principal\n"
					+ "E pour relancer le dernier programme"
					+ "\nB pour revenir au menu précédent"
					+ "\nQ pour quitter"); 
			String choixMenu = sc.next();
				if(choixMenu.contains("R"))
				{
					getStart();
				}
				else if(choixMenu.contains("E") || choixMenu.contains("e"))
				{
					cercle();
				}
				else if(choixMenu.contains("B") || choixMenu.contains("b"))
				{
					getMenuCalculs();
				}
				else if(choixMenu.contains("Q") || choixMenu.contains("q"))
				{
					getEteindre();
				}
		}
	// Getters
	static void getStart()
		{
		Robot_Edison.getStart();
		}
	static void getCercle()
		{
		cercle();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.getMenuCalculs();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	
	// Getters
}
