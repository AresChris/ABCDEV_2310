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
		final double pi = Math.round(Math.PI*100.00)/100.00;
		double perimetre;
		double diametre;
		
		System.out.println("\tCoordonnées du point");
			System.out.print("x = ");
			int coordxA = sc.nextInt();
			System.out.print("");
			xA = coordxA; // xA vaut coordxA pour la formule
			System.out.print("y = ");
			int coordyA = sc.nextInt();
			System.out.print("");
			yA = coordyA; // y s'appelera yA pour la formule

		System.out.println("\tCentre du cercle : ");
			System.out.print("x = ");
			int coordsxC = sc.nextInt();
			xC = coordsxC; // x s'appelera xC pour la formule
			System.out.print("y = ");
			int coordsyC = sc.nextInt();
			System.out.print("");
			yC = coordsyC; // y s'appelera yC pour la formule
			System.out.print("Rayon du cercle = ");
			rayon = sc.nextInt();
			System.out.print("\n");
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
				System.out.println("Le point n'est pas sur le cercle");
			}
			System.out.print("Afficher le code ? Y/N");
			String affichage = sc.next();
			if(affichage.contains("Y") || affichage.contains("y"))
			{
				System.out.print("double rayon;\n"
						+ "		//coordonnees variables du point A\n"
						+ "		double xA;\n"
						+ "		double yA;\n"
						+ "		//coordonnees constantes du point C\n"
						+ "		double xC;\n"
						+ "		double yC;\n"
						+ "		// constante PI\n"
						+ "		final double pi = Math.PI;\n"
						+ "		double perimetre;\n"
						+ "		double diametre;\n"
						+ "		\n"
						+ "		System.out.println(\"\\tCoordonnées du point\");\n"
						+ "			System.out.print(\"x = \");\n"
						+ "			int coordxA = sc.nextInt();\n"
						+ "			System.out.print(\"\");\n"
						+ "			xA = coordxA; // xA vaut coordxA pour la formule\n"
						+ "			System.out.print(\"y = \");\n"
						+ "			int coordyA = sc.nextInt();\n"
						+ "			System.out.print(\"\");\n"
						+ "			yA = coordyA; // y s'appelera yA pour la formule\n"
						+ "\n"
						+ "		System.out.println(\"\\tCentre du cercle : \");\n"
						+ "			System.out.print(\"x = \");\n"
						+ "			int coordsxC = sc.nextInt();\n"
						+ "			xC = coordsxC; // x s'appelera xC pour la formule\n"
						+ "			System.out.print(\"y = \");\n"
						+ "			int coordsyC = sc.nextInt();\n"
						+ "			System.out.print(\"\");\n"
						+ "			yC = coordsyC; // y s'appelera yC pour la formule\n"
						+ "			System.out.print(\"Rayon du cercle = \");\n"
						+ "			rayon = sc.nextInt();\n"
						+ "			System.out.print(\"\\n\");\n"
						+ "			diametre = rayon * 2;\n"
						+ "			perimetre = diametre * pi;\n"
						+ "			\n"
						+ "			double surface = Math.pow(rayon, 2) * pi; // calcul la surface du cercle\n"
						+ "\n"
						+ "			double distance = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2)); // calcul de la distance entre le point et le centre du cercle\n"
						+ "\n"
						+ "			System.out.println(\"Le point est à environ \" + Math.round(distance*100.00)/100.00 + \" du centre, le rayon est de \" + rayon);\n"
						+ "			if(distance == rayon)\n"
						+ "			{\n"
						+ "				System.out.println(\"Le point est sur le cercle !\");\n"
						+ "			}\n"
						+ "			else \n"
						+ "			{\n"
						+ "				System.out.println(\"Le point n'est pas sur le cercle\");\n"
						+ "			}");
			}
			else
			{
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
