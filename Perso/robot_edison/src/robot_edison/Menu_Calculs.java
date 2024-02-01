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
	public static void menuCalculs() // Sous menu des différents calculs
	{
		System.out.println("\tCalculs\n1. Rectangle\n2. Cercle\n3. Convertisseur km/miles\n4. Calculs d'interêts\n5. Table de multiplications"
				+ "\n6. Menu Principal\n7. Bissextile\n\n0. Quitter\nChoisis en donnant le numéro du programme : ");
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
			getInteret();
		}
		else if(choixMenu == 5)
		{
			getTableMultiplication();
		}
		else if(choixMenu == 6)
		{
			getStart();
		}
		else if(choixMenu == 7)
		{
			
		}
		else if(choixMenu == 0)
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + batteryLeft + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
		}
	}
	
	// Getters
	public void getMenuTableaux() 
		{
		Menu_Tableaux.getMenuTableaux();
		}
	public void getAllumer()
		{
		Allumer_Eteindre.getAllumer();	
		}
	public void getEteindre()
		{
		Allumer_Eteindre.getEteindre();
		}
	public void getChargerBatterie()
		{
		Charger_Batterie.chargerBatterie();
		}
		// Fin des getters
	static void getAfficherHeure()
		{
		Afficher_Heure.getAfficherHeure();
		}
	static void getCellularAutomata()
		{
		Cellular_Automata.cellularAutomata();
		}
	static void getRectangle()
		{
		Rectangle.rectangle();
		}
	static void getMenuCalculs()
		{
		menuCalculs();
		}
	static void getCercle()
		{
		Cercle.cercle();
		}
	static void getConvertisseur()
		{
		Convertisseur_km_miles.convertisseurKmMiles();
		}
	static void getInteret()
		{
		Interet_Banque.calculInteret();
		}
	static void getTableMultiplication()
		{
		Table_Multiplication.tableDeMultiplication();
		}
	static void getStart()
		{
		Robot_Edison.getStart();
		}
	static void getBissextile()
		{
		Bissextile.bissextile();
		}
		// Fin des Getters
}

	
